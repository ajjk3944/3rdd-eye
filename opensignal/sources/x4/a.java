package x4;

import androidx.lifecycle.s0;
import o4.k0;
import u.j0;

/* loaded from: classes.dex */
public class a extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f25017c = new k0(1);

    /* renamed from: b, reason: collision with root package name */
    public final j0 f25018b = new j0(0);

    @Override // androidx.lifecycle.s0
    public final void b() {
        j0 j0Var = this.f25018b;
        int i10 = j0Var.f23085g;
        if (i10 > 0) {
            j0Var.e(0).getClass();
            throw new ClassCastException();
        }
        Object[] objArr = j0Var.f23084d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        j0Var.f23085g = 0;
    }
}
