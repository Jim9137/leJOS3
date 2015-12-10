package legorobotti;

public class AudioThread extends Thread {
		private static int command = 0;
		private Audio audio = new Audio();
		public static  void giveCommand(int c) {
			AudioThread.command = c;
		}
		public void run() {
			switch (AudioThread.command) {
				default: audio.playMusic();
			}
			
		}
}
