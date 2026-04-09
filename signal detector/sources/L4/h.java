package L4;

import H0.j;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.db.SquatterRoom_Impl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SquatterRoom_Impl f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2615b;

    public h(SquatterRoom_Impl squatterRoom_Impl) {
        this.f2614a = squatterRoom_Impl;
        this.f2615b = new b(squatterRoom_Impl, 3);
        new c(squatterRoom_Impl, 1);
    }

    public final void a(SquatterBean squatterBean) {
        SquatterRoom_Impl squatterRoom_Impl = this.f2614a;
        squatterRoom_Impl.b();
        squatterRoom_Impl.c();
        try {
            b bVar = this.f2615b;
            j jVarA = bVar.a();
            try {
                bVar.e(jVarA, squatterBean);
                jVarA.a();
                bVar.c(jVarA);
                squatterRoom_Impl.m();
            } catch (Throwable th) {
                bVar.c(jVarA);
                throw th;
            }
        } finally {
            squatterRoom_Impl.j();
        }
    }
}
