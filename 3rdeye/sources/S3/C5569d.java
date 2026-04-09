package s3;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.C4045c;
import com.vungle.ads.D;
import kotlin.jvm.internal.l;

/* compiled from: VungleRtbInterstitialAd.java */
/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5569d implements a.InterfaceC0332a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4045c f46032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C5570e f46034e;

    public C5569d(C5570e c5570e, Context context, String str, C4045c c4045c, String str2) {
        this.f46034e = c5570e;
        this.f46030a = context;
        this.f46031b = str;
        this.f46032c = c4045c;
        this.f46033d = str2;
    }

    @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f46034e.f46035b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
    public final void onInitializeSuccess() {
        C5570e c5570e = this.f46034e;
        C4045c c4045c = this.f46032c;
        c5570e.f46038e.getClass();
        Context context = this.f46030a;
        l.f(context, "context");
        String placementId = this.f46031b;
        l.f(placementId, "placementId");
        D d10 = new D(context, placementId, c4045c);
        c5570e.f46037d = d10;
        d10.setAdListener(c5570e);
        c5570e.f46037d.load(this.f46033d);
    }
}
