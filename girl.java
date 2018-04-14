import java.util.Map;
public class girl{

	private int id;
	private Map<Integer,Integer> pref;
	private boy curr;


	public girl(int id){
		this.id = id;
		this.pref = null;
		this.curr = null;
	}

	public boy getCurr(){
		return this.curr;
	}
	public void setCurr(boy b){
		this.curr = b;
	}

	public Map<Integer, Integer> getPref(){
		return this.pref;
	}

	public void setPref(Map<Integer,Integer> pref) {
		this.pref = pref;
	}

	public int findBetter(boy b){
		if (this.curr == null){
			return 1;
		}
		int curr_pref = pref.get(curr.id);
		int new_pref = pref.get(b.id);
		if (curr_pref < new_pref) {
			return 0;
		} else {
			return 1;
		}
	}
}
