package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.U;
import c5.C0412i;
import h.AbstractActivityC2349g;

/* renamed from: c.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388m extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0388m(AbstractActivityC2349g abstractActivityC2349g, int i) {
        super(0);
        this.f5847b = i;
        this.f5848c = abstractActivityC2349g;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f5847b) {
            case 0:
                AbstractActivityC2349g abstractActivityC2349g = this.f5848c;
                return new U(abstractActivityC2349g.getApplication(), abstractActivityC2349g, abstractActivityC2349g.getIntent() != null ? abstractActivityC2349g.getIntent().getExtras() : null);
            case 1:
                this.f5848c.reportFullyDrawn();
                return C0412i.f5929a;
            case 2:
                AbstractActivityC2349g abstractActivityC2349g2 = this.f5848c;
                return new v(abstractActivityC2349g2.f5859f, new C0388m(abstractActivityC2349g2, 1));
            default:
                AbstractActivityC2349g abstractActivityC2349g3 = this.f5848c;
                C0371K c0371k = new C0371K(new RunnableC0379d(abstractActivityC2349g3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (q5.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC2349g3.f1476a.a(new C0383h(c0371k, 0, abstractActivityC2349g3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new C0.A(abstractActivityC2349g3, 5, c0371k));
                    }
                }
                return c0371k;
        }
    }
}
