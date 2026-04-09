package A2;

import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.C1271hf;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2069wN;

/* loaded from: classes.dex */
public final class v implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f338a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f339b;

    public /* synthetic */ v(InterfaceC2069wN interfaceC2069wN, int i) {
        this.f338a = i;
        this.f339b = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f338a) {
            case 0:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new u(c0623Mf, ((C1271hf) this.f339b).a());
            default:
                return new Q((C0852Zn) this.f339b.c());
        }
    }
}
