package tugas2;

/**
 * Tugas Relationship is-a
 * @author Wili Akbar Nugraha
 *
 */

class AOV{
	private String nickname;
	private int level;
	private String job;
	
	public String getNickname(){
		return nickname;
	}
	public void setNickname( String baruNickname ){
		nickname = baruNickname;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel( int newLevel){
		level = newLevel;
	}
	public String getJob(){
		return job;
	}
	
	public void setJob( String newJob){
		job = newJob;
	}
	
	public void tampilData(){
		System.out.println("=====AOV=====");
		System.out.println("Nickname : " + nickname);
		System.out.println("Level    : " + level);
		System.out.println("job      : " + job);
	}
}

class ML{
	private String nickname;
	private String role;
	
	public String getNickname(){
		return nickname;
	}
	public void setNickname( String newNickname ){
		nickname = newNickname;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole( String newRole ){
		role = newRole;
	}
	
	public void tampilData(){
		System.out.println("=====ML=====");
		System.out.println("Nickname : "+nickname);
		System.out.println("Role     : "+role);
		System.out.println();
	}
}
public class Tugas2 {
	public static void main(String[] args){
		AOV nakroth = new AOV();
		ML will = new ML();
		
		nakroth.setNickname("Batman");
		nakroth.setLevel(15);
		nakroth.setJob("Dark Knight Sword");
		nakroth.tampilData();
		
		will.setNickname("will.-");
		will.setRole("Jungler");
		will.tampilData();
	}

}
