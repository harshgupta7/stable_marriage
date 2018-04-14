import java.util.HashMap;
import java.util.Map;

public class runner{
	public static void main(String[] args) {

		boy b1 = new boy(1);
		boy b2 = new boy(2);
		boy b3 = new boy(3);
		girl g1 = new girl(1);
		girl g2 = new girl(2);
		girl g3 = new girl(3);

		girl[] b1pref = new girl[3];
		b1pref[0] = g1;
		b1pref[1] = g2;
		b1pref[2] = g3;

		girl[] b2pref = new girl[3];
		b2pref[0] = g1;
		b2pref[1] = g2;
		b2pref[2] = g3;


		girl[] b3pref = new girl[3];
		b3pref[0] = g3;
		b3pref[1] = g1;
		b3pref[2] = g2; 

		b1.pref = b1pref;
		b2.pref = b2pref;
		b3.pref = b3pref;

		Map<Integer, Integer> t = new HashMap<Integer,Integer>();
		t.put(1,2);
		t.put(2,1);
		t.put(3,3);

		Map<Integer, Integer> tr = new HashMap<Integer,Integer>();
		tr.put(1,2);
		tr.put(2,1);
		tr.put(3,3);

		Map<Integer, Integer> ts = new HashMap<Integer,Integer>();
		ts.put(1,2);
		ts.put(2,1);
		ts.put(3,3);

		g1.setPref(t);
		g2.setPref(tr);
		g3.setPref(ts);

		boy[] runarray = new boy[3];
		runarray[0] = b1;
		runarray[1] = b2;
		runarray[2] = b3;
		int tm = 0;
		while(tm==0){
			for (boy b:runarray){
				try{
					b.findNext();
				} catch (Exception e){
					int ss = 0;
				}
			}

			if (b1.hasPartner && b2.hasPartner && b3.hasPartner) {
				tm=1;
			}

		}
	}
}