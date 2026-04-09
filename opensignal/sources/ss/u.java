package ss;

/* loaded from: classes.dex */
public enum u {
    PLAIN { // from class: ss.u.b
        @Override // ss.u
        public String escape(String str) {
            br.l.e(str, "string");
            return str;
        }
    },
    HTML { // from class: ss.u.a
        @Override // ss.u
        public String escape(String str) {
            br.l.e(str, "string");
            return tt.s.l0(tt.s.l0(str, "<", "&lt;"), ">", "&gt;");
        }
    };

    /* synthetic */ u(br.g gVar) {
        this();
    }

    public abstract String escape(String str);
}
