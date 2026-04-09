package l7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* loaded from: classes3.dex */
public class e extends a implements d7.a {
    public e(Context context, k7.a aVar, d7.c cVar, com.unity3d.scar.adapter.common.c cVar2, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, cVar2);
        this.f23185e = new f(gVar, this);
    }

    @Override // l7.a
    public void b(AdRequest adRequest, d7.b bVar) {
        InterstitialAd.load(this.f23182b, this.f23183c.b(), adRequest, ((f) this.f23185e).e());
    }

    @Override // d7.a
    public void show(Activity activity) {
        Object obj = this.f23181a;
        if (obj != null) {
            ((InterstitialAd) obj).show(activity);
        } else {
            this.f23186f.handleError(com.unity3d.scar.adapter.common.b.a(this.f23183c));
        }
    }
}
