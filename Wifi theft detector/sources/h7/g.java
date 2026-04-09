package h7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* loaded from: classes3.dex */
public class g extends a implements d7.a {
    public g(Context context, g7.a aVar, d7.c cVar, com.unity3d.scar.adapter.common.c cVar2, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f21419e = new h(hVar, this);
    }

    @Override // h7.a
    public void b(AdRequest adRequest, d7.b bVar) {
        RewardedAd.load(this.f21416b, this.f21417c.b(), adRequest, ((h) this.f21419e).e());
    }

    @Override // d7.a
    public void show(Activity activity) {
        Object obj = this.f21415a;
        if (obj != null) {
            ((RewardedAd) obj).show(activity, ((h) this.f21419e).f());
        } else {
            this.f21420f.handleError(com.unity3d.scar.adapter.common.b.a(this.f21417c));
        }
    }
}
