package cn.tju.tiei.model;

public class userException extends RuntimeException{

	private static final long serialVersionUID = 8758879304098644451L;
	public userException(){
		super();
	}
	
	public userException(String message, Throwable cause,
			boolean enableSupression, boolean writableStackTrace){
		super(message, cause, enableSupression, writableStackTrace);
	}
	
	public userException(String message, Throwable cause){
		super(message, cause);
	}
	public userException(String message){
		super(message);
	}
	public userException(Throwable cause){
		super(cause);
	}
}
