package l7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* loaded from: classes3.dex */
public class g extends a implements d7.a {
    public g(Context context, k7.a aVar, d7.c cVar, com.unity3d.scar.adapter.common.c cVar2, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f23185e = new h(hVar, this);
    }

    @Override // l7.a
    public void b(AdRequest adRequest, d7.b bVar) {
        RewardedAd.load(this.f23182b, this.f23183c.b(), adRequest, ((h) this.f23185e).e());
    }

    @Override // d7.a
    public void show(Activity activity) {
        Object obj = this.f23181a;
        if (obj != null) {
            ((RewardedAd) obj).show(activity, ((h) this.f23185e).f());
        } else {
            this.f23186f.handleError(com.unity3d.scar.adapter.common.b.a(this.f23183c));
        }
    }
}
