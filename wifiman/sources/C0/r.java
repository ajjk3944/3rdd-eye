package C0;

import l0.C6533i;

/* loaded from: classes.dex */
public interface r {
    static /* synthetic */ C6533i c0(r rVar, r rVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return rVar.J(rVar2, z10);
    }

    long A(long j10);

    C6533i J(r rVar, boolean z10);

    boolean M();

    void O(float[] fArr);

    long V(r rVar, long j10, boolean z10);

    long W(long j10);

    r a0();

    long b0(r rVar, long j10);

    long h();

    long o0(long j10);

    long r(long j10);

    void z(r rVar, float[] fArr);
}
