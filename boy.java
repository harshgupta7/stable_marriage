public class boy {

	public int id; 
	public girl[] pref; //array of preference ordered from high to low
	public int currptr; //pointer in array pointing to current partner or current traverse point
	public boolean hasPartner; //whether or not the object currently has partner

	public boy(int id) {

		this.id = id;
		this.currptr = -2;
		this.pref = null;
		this.hasPartner = false;

	}

	public void findNext() throws Exception {

		// method to find next available highest preference partner for the boy.

		if (this.pref == null) {
			throw new Exception("Preference must be set for this person before running algorithm");
		}

		if (this.hasPartner == true) {
			return;
		}

		if (this.currptr == -2) {
			this.currptr = -1;
		}
		else if (this.currptr == this.pref.length - 1){
			throw new Exception("Error in execution! Reached end of preference list without partner");
		}

		this.currptr += 1;
		girl g = pref[this.currptr];
		if (g.getCurr() == null) {
			this.hasPartner = true;
			g.setCurr(this);
			return;
		} else {
			int res = g.findBetter(this);
			if (res == 0) {
				this.findNext();
			} else {
				g.getCurr().hasPartner = false;
				g.setCurr(this);
				this.hasPartner = true;
				return;
			}
		}
	}
}