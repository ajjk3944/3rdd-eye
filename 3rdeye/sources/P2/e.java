package P2;

import N2.m;
import N2.u;
import android.annotation.SuppressLint;
import h3.i;

/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public final class e extends i<L2.f, u<?>> {

    /* renamed from: d, reason: collision with root package name */
    public m f10572d;

    @Override // h3.i
    public final int b(u<?> uVar) {
        u<?> uVar2 = uVar;
        if (uVar2 == null) {
            return 1;
        }
        return uVar2.getSize();
    }

    @Override // h3.i
    public final void c(L2.f fVar, u<?> uVar) {
        u<?> uVar2 = uVar;
        m mVar = this.f10572d;
        if (mVar == null || uVar2 == null) {
            return;
        }
        mVar.f4558e.a(uVar2, true);
    }

    @SuppressLint({"InlinedApi"})
    public final void f(int i) {
        long j4;
        if (i >= 40) {
            e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j4 = this.f38209b;
            }
            e(j4 / 2);
        }
    }
}
