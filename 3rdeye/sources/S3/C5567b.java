package s3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.i0;
import com.vungle.ads.j0;
import kotlin.jvm.internal.l;

/* compiled from: VungleRtbBannerAd.java */
/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5567b implements a.InterfaceC0332a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSize f46020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f46021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f46022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f46023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C5568c f46024g;

    public C5567b(C5568c c5568c, Context context, String str, AdSize adSize, i0 i0Var, String str2, String str3) {
        this.f46024g = c5568c;
        this.f46018a = context;
        this.f46019b = str;
        this.f46020c = adSize;
        this.f46021d = i0Var;
        this.f46022e = str2;
        this.f46023f = str3;
    }

    @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f46024g.f46025b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
    public final void onInitializeSuccess() {
        C5568c c5568c = this.f46024g;
        c5568c.getClass();
        Context context = this.f46018a;
        c5568c.f46028e = new RelativeLayout(context);
        AdSize adSize = this.f46020c;
        int heightInPixels = adSize.getHeightInPixels(context);
        i0 adSize2 = this.f46021d;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(adSize2.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        c5568c.f46028e.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        c5568c.f46029f.getClass();
        l.f(context, "context");
        String placementId = this.f46019b;
        l.f(placementId, "placementId");
        l.f(adSize2, "adSize");
        j0 j0Var = new j0(context, placementId, adSize2);
        c5568c.f46027d = j0Var;
        j0Var.setAdListener(c5568c);
        String str = this.f46023f;
        if (!TextUtils.isEmpty(str)) {
            c5568c.f46027d.getAdConfig().setWatermark(str);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        c5568c.f46028e.addView(c5568c.f46027d, layoutParams);
        c5568c.f46027d.load(this.f46022e);
    }
}
