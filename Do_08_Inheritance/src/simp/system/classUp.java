package simp.system;

import simp.user.*;

public class classUp {
	public static High h(Novice n) {
			High h = new High(n.getName(), n.getLv());
			return h;
	}
	
	public static Master m(High h) {
			Master m = new Master(h.getName(), h.getLv());
			return m;
	}
}
