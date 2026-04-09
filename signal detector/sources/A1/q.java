package A1;

import A2.L;
import com.google.android.gms.internal.ads.C0468Dd;
import com.google.android.gms.internal.ads.C1009cp;
import com.google.android.gms.internal.ads.C1278hm;
import com.google.android.gms.internal.ads.NN;
import com.google.android.gms.internal.ads.UN;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.ZJ;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f119c;

    public /* synthetic */ q(Object obj, boolean z6, int i) {
        this.f117a = i;
        this.f119c = obj;
        this.f118b = z6;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f117a;
        boolean z6 = this.f118b;
        Object obj = this.f119c;
        switch (i) {
            case 0:
                H1.p.a();
                s sVar = (s) ((r) obj).f121b;
                boolean z7 = sVar.f122a;
                sVar.f122a = z6;
                if (z7 != z6) {
                    ((o) sVar.f123b).a(z6);
                    break;
                }
                break;
            case 1:
                ((v) obj).f132b.a(z6);
                break;
            case 2:
                ((L) obj).d(z6, false);
                break;
            case 3:
                ((C0468Dd) obj).F(z6);
                break;
            case 4:
                C1278hm c1278hm = (C1278hm) obj;
                ?? r02 = c1278hm.f14577w;
                if (r02 != 0) {
                    c1278hm.f14568n.n(null, r02.N1(), c1278hm.f14577w.h(), c1278hm.f14577w.k(), this.f118b, c1278hm.p(), 0);
                    break;
                } else {
                    u2.k.c("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    break;
                }
            case 5:
                Vu vu = (Vu) obj;
                vu.getClass();
                String str = Vt.f12096a;
                UN un = ((NN) vu.f12106b).f9997a;
                if (un.f11680h0 != z6) {
                    un.f11680h0 = z6;
                    C1009cp c1009cp = un.f11690n;
                    c1009cp.c(23, new ZJ(z6));
                    c1009cp.d();
                    break;
                }
                break;
            default:
                p2.e eVar = (p2.e) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    p2.e.p(eVar.f22764j, eVar.f22766l, z6, eVar.f22767m).k();
                    break;
                } catch (NullPointerException e6) {
                    eVar.f22763h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e6);
                }
        }
    }
}
