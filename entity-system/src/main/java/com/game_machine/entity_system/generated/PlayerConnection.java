
package com.game_machine.entity_system.generated;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;

import java.io.ByteArrayOutputStream;
import com.dyuproject.protostuff.JsonIOUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.game_machine.entity_system.Entities;
import com.game_machine.entity_system.generated.Entity;
import com.game_machine.entity_system.Component;

import com.dyuproject.protostuff.Pipe;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class PlayerConnection extends com.game_machine.entity_system.Component implements Externalizable, Message<PlayerConnection>, Schema<PlayerConnection>
{




    public static Schema<PlayerConnection> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static PlayerConnection getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final PlayerConnection DEFAULT_INSTANCE = new PlayerConnection();



    private String id;



    private Player player;



    private String authorizationToken;



    private Integer entityId;


    

    public PlayerConnection()
    {
        
    }




	public String getId() {
		return id;
	}
	
	public PlayerConnection setId(String id) {
		this.id = id;
		return this;
	}




	public Player getPlayer() {
		return player;
	}
	
	public PlayerConnection setPlayer(Player player) {
		this.player = player;
		return this;
	}




	public String getAuthorizationToken() {
		return authorizationToken;
	}
	
	public PlayerConnection setAuthorizationToken(String authorizationToken) {
		this.authorizationToken = authorizationToken;
		return this;
	}




	public Integer getEntityId() {
		return entityId;
	}
	
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
		
	}



  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<PlayerConnection> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public PlayerConnection newMessage()
    {
        return new PlayerConnection();
    }

    public Class<PlayerConnection> typeClass()
    {
        return PlayerConnection.class;
    }

    public String messageName()
    {
        return PlayerConnection.class.getSimpleName();
    }

    public String messageFullName()
    {
        return PlayerConnection.class.getName();
    }

    public boolean isInitialized(PlayerConnection message)
    {
        return true;
    }

    public void mergeFrom(Input input, PlayerConnection message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;

            	case 1:


                	message.id = input.readString();
                	break;

                	


            	case 2:


                	message.player = input.mergeObject(message.player, Player.getSchema());
                    break;

                	


            	case 3:


                	message.authorizationToken = input.readString();
                	break;

                	


            	case 4:


                	message.entityId = input.readInt32();
                	break;

                	


            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, PlayerConnection message) throws IOException
    {

    	

    	if(message.id == null)
            throw new UninitializedMessageException(message);

    	


    	if(message.id != null)
            output.writeString(1, message.id, false);

    	


    	

    	if(message.player == null)
            throw new UninitializedMessageException(message);

    	


    	if(message.player != null)
    		output.writeObject(2, message.player, Player.getSchema(), false);

    	


    	

    	


    	if(message.authorizationToken != null)
            output.writeString(3, message.authorizationToken, false);

    	


    	

    	


    	if(message.entityId != null)
            output.writeInt32(4, message.entityId, false);

    	


    	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {

        	case 1: return "id";

        	case 2: return "player";

        	case 3: return "authorizationToken";

        	case 4: return "entityId";

            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {

    	__fieldMap.put("id", 1);

    	__fieldMap.put("player", 2);

    	__fieldMap.put("authorizationToken", 3);

    	__fieldMap.put("entityId", 4);

    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = PlayerConnection.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static PlayerConnection parseFrom(byte[] bytes) {
	PlayerConnection message = new PlayerConnection();
	ProtobufIOUtil.mergeFrom(bytes, message, RuntimeSchema.getSchema(PlayerConnection.class));
	return message;
}

public PlayerConnection clone() {
	byte[] bytes = this.toByteArray();
	PlayerConnection playerConnection = PlayerConnection.parseFrom(bytes);
	playerConnection.setEntityId(null);
	return playerConnection;
}
	
public byte[] toByteArray() {
	if (Entities.encoding.equals("protobuf")) {
		return toProtobuf();
	} else if (Entities.encoding.equals("json")) {
		return toJson();
	} else {
		throw new RuntimeException("No encoding specified");
	}
}

public byte[] toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, PlayerConnection.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	return out.toByteArray();
}
		
public byte[] toProtobuf() {
	LinkedBuffer buffer = LinkedBuffer.allocate(1024);
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, RuntimeSchema.getSchema(PlayerConnection.class), buffer);
		buffer.clear();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

 
    

}
