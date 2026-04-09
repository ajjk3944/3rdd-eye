package j2;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g2 implements androidx.lifecycle.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.d f27163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f27164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0.s1 f27165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nk.u f27166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f27167e;

    public g2(cl.d dVar, l0 l0Var, u0.s1 s1Var, nk.u uVar, View view) {
        this.f27163a = dVar;
        this.f27164b = l0Var;
        this.f27165c = s1Var;
        this.f27166d = uVar;
        this.f27167e = view;
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        switch (f2.f27142a[rVar.ordinal()]) {
            case 1:
                xk.x.v(this.f27163a, null, xk.w.f37247d, new a0.g0(this.f27166d, this.f27165c, a0Var, this, this.f27167e, (ck.c) null, 4), 1);
                return;
            case 2:
                l0 l0Var = this.f27164b;
                if (l0Var != null) {
                    b5.i0 i0Var = (b5.i0) l0Var.f27220c;
                    synchronized (i0Var.f1822c) {
                        try {
                            if (!i0Var.e()) {
                                ArrayList arrayList = (ArrayList) i0Var.f1821b;
                                i0Var.f1821b = (ArrayList) i0Var.f1823d;
                                i0Var.f1823d = arrayList;
                                i0Var.f1820a = true;
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((ck.c) arrayList.get(i4)).resumeWith(yj.u.f37649a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f27165c.S();
                return;
            case 3:
                this.f27165c.K();
                return;
            case 4:
                this.f27165c.C();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new ac.m();
        }
    }
}
