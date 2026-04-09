package Ni;

/* renamed from: Ni.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3409k {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final Ii.J b(Ii.J j10, String str) {
        return str != null ? new u(j10, str) : j10;
    }
}
