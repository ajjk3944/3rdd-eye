package androidx.media3.common;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class o0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final p f1731a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        a5.a.i(!false);
        new p(sparseBooleanArray);
        int i10 = a5.d0.f105a;
        Integer.toString(0, 36);
    }

    public o0(p pVar) {
        this.f1731a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return this.f1731a.equals(((o0) obj).f1731a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1731a.hashCode();
    }
}
