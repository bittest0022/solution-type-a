package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute(String function) {
		if(function.equals("통화")) {
			System.out.println(call());
		}else if(function.equals("음악")) {
			System.out.println(playMusic());
		}else if(function.equals("앱")) {
			System.out.println(runApp());
		}
	}
	
	public String playMusic() {
		return "스트리밍";
	}
	
	public String runApp() {
		return "앱실행";
	}
}