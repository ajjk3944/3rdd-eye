package qi;

import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.bn;
import pa.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends n.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f32436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ViewGroup viewGroup, int i4) {
        super(viewGroup);
        this.f32435d = i4;
        this.f32436e = viewGroup;
    }

    @Override // n.a
    public final void c() {
        switch (this.f32435d) {
            case 0:
                ((i) this.f32436e).a();
                break;
            default:
                bn bnVar = ((eb.e) this.f32436e).f22531b;
                if (bnVar != null) {
                    try {
                        bnVar.c();
                        break;
                    } catch (RemoteException e2) {
                        za.i.f("Unable to destroy native ad view", e2);
                    }
                }
                break;
        }
    }
}
