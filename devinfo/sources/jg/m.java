package jg;

import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.ads.e80;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27678f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i4, Object obj) {
        super(1);
        this.f27678f = i4;
        this.g = obj;
    }

    @Override // pi.e, cm.g
    public void B(String str) {
        switch (this.f27678f) {
            case 1:
                ((zf.g) this.g).f38272f = false;
                break;
            default:
                super.B(str);
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void D(n.a aVar) {
        n.a aVar2;
        switch (this.f27678f) {
            case 0:
                StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.g;
                if (storageCleanActivity.isFinishing() || storageCleanActivity.isDestroyed()) {
                    aVar.b();
                    return;
                }
                n.a aVar3 = storageCleanActivity.J;
                if (aVar3 != null && !aVar3.equals(aVar) && (aVar2 = storageCleanActivity.J) != null) {
                    aVar2.b();
                }
                storageCleanActivity.J = aVar;
                storageCleanActivity.I = true;
                e80 e80Var = storageCleanActivity.E;
                if (e80Var == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((CardView) e80Var.f10730b).addView(aVar.a());
                if (storageCleanActivity.H) {
                    e80 e80Var2 = storageCleanActivity.E;
                    if (e80Var2 != null) {
                        ((CardView) e80Var2.f10730b).post(new h(storageCleanActivity, 1));
                        return;
                    } else {
                        nk.k.k("binding");
                        throw null;
                    }
                }
                return;
            default:
                zf.g gVar = (zf.g) this.g;
                Objects.toString(gVar.f38270d);
                gVar.f38270d = aVar;
                gVar.f38271e = System.currentTimeMillis();
                gVar.f38272f = false;
                return;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f27678f) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            default:
                cg.a.f2848b.d(bVar);
                break;
        }
    }
}
