package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		this.buffer = new String[capacity];
		this.top = -1;
	}

	public void push(String s) {
		if(top == buffer.length - 1)
		{
			String[] subBuffer = new String[buffer.length * 2];
			System.arraycopy(buffer, 0, subBuffer, 0, buffer.length);
			buffer = subBuffer;
		}
		
		top += 1;
		buffer[top] = s;
	}

	public String pop() throws MyStackException {
		
		if(top == -1) {
			throw new MyStackException("stack is empty");
	    }
		
		top -= 1;
		return buffer[top+1];

	}

	public boolean isEmpty() {
		return top == -1;
	}
}