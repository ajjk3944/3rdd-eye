package y9;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import bb.a0;
import bb.t;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j6.i;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends a0 {

    /* renamed from: r, reason: collision with root package name */
    public final bb.e f37379r;

    /* renamed from: s, reason: collision with root package name */
    public NativeAdBase f37380s;

    /* renamed from: t, reason: collision with root package name */
    public t f37381t;

    /* renamed from: u, reason: collision with root package name */
    public MediaView f37382u;

    /* renamed from: v, reason: collision with root package name */
    public final i f37383v;

    public e(bb.e eVar, i iVar) {
        this.f37379r = eVar;
        this.f37383v = iVar;
    }

    @Override // bb.a0
    public final void a(View view, HashMap map) {
        this.f2108q = true;
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get("3003");
        NativeAdBase nativeAdBase = this.f37380s;
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (!(nativeAdBase instanceof NativeAd)) {
                Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            }
            NativeAd nativeAd = (NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.f37382u, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
                nativeAd.registerViewForInteraction(view, this.f37382u, arrayList);
                return;
            }
        }
        if (view2 == null) {
            Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        if (view2 instanceof ImageView) {
            ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            return;
        }
        Log.w(FacebookMediationAdapter.TAG, "Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: " + view2.getClass() + ".");
    }

    @Override // bb.a0
    public final void b() {
        NativeAdBase nativeAdBase = this.f37380s;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
    }
}
