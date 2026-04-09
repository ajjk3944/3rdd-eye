package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gx {
    public static final fx a = fx.a;

    public static fx a(iw iwVar) {
        while (iwVar != null) {
            if (iwVar.x != null && iwVar.p) {
                iwVar.k();
            }
            iwVar = iwVar.z;
        }
        return a;
    }

    public static void b(p71 p71Var) {
        if (xw.F(3)) {
            p71Var.f.getClass();
        }
    }

    public static final void c(iw iwVar, String str) {
        i30.m(str, "previousFragmentId");
        b(new cx(iwVar, "Attempting to reuse fragment " + iwVar + " with previous ID " + str));
        a(iwVar).getClass();
    }
}
