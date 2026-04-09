package B;

import C.C0626m;
import com.applovin.impl.y3;
import io.appmetrica.analytics.impl.C4766lc;
import o0.b;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f315d;

    public /* synthetic */ e(Object obj, boolean z10, int i) {
        this.f313b = i;
        this.f315d = obj;
        this.f314c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f313b) {
            case 0:
                g gVar = (g) this.f315d;
                boolean z10 = gVar.f318a;
                boolean z11 = this.f314c;
                if (z10 != z11) {
                    gVar.f318a = z11;
                    if (!z11) {
                        C0626m c0626m = new C0626m("The camera control has became inactive.");
                        b.a<Void> aVar = gVar.f324g;
                        if (aVar != null) {
                            aVar.d(c0626m);
                            gVar.f324g = null;
                            break;
                        }
                    } else if (gVar.f319b) {
                        C5658m c5658m = gVar.f320c;
                        c5658m.getClass();
                        I.j.f(o0.b.a(new D7.c(c5658m, 20))).addListener(new b(gVar, 0), gVar.f321d);
                        gVar.f319b = false;
                        break;
                    }
                }
                break;
            case 1:
                ((y3) this.f315d).a(this.f314c);
                break;
            default:
                C4766lc.a((C4766lc) this.f315d, this.f314c);
                break;
        }
    }
}
