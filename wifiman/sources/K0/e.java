package k0;

/* loaded from: classes.dex */
public interface e {
    static /* synthetic */ void c(e eVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        eVar.r(z10);
    }

    boolean k(int i10);

    void r(boolean z10);
}
