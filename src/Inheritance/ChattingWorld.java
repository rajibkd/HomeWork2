package Inheritance;

public class ChattingWorld {

	public static void main(String[] args) {
		
		TextChatting TC=new TextChatting();
		VideoChatting VC=new VideoChatting();
		
		System.out.println(TC.maxChatters);
		TC.mircChat();
		
		System.out.println(VC.maxChatters);
		System.out.println(VC.skypeChatting);
		VC.mircChat();
		VC.SkypeChat();

	}

}
