package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.b1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f21581b;

    public /* synthetic */ c(j jVar, int i4) {
        this.f21580a = i4;
        this.f21581b = jVar;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f21580a) {
            case 0:
                this.f21581b.reportFullyDrawn();
                return yj.u.f37649a;
            case 1:
                j jVar = this.f21581b;
                return new t(jVar.f21608f, new c(jVar, 0));
            case 2:
                k5.a aVar = new k5.a();
                this.f21581b.o().f21583b.i(aVar);
                return aVar;
            case 3:
                j jVar2 = this.f21581b;
                return new b1(jVar2.getApplication(), jVar2, jVar2.getIntent() != null ? jVar2.getIntent().getExtras() : null);
            default:
                j jVar3 = this.f21581b;
                c0 c0Var = new c0(new b(jVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (nk.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        jVar3.f32744a.a(new d(c0Var, jVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new aj.d(11, jVar3, c0Var));
                    }
                }
                return c0Var;
        }
    }
}
