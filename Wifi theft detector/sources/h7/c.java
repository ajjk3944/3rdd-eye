package h7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f21422g;

    /* renamed from: h, reason: collision with root package name */
    public int f21423h;

    /* renamed from: i, reason: collision with root package name */
    public int f21424i;

    /* renamed from: j, reason: collision with root package name */
    public AdView f21425j;

    public c(Context context, RelativeLayout relativeLayout, g7.a aVar, d7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.c cVar2, com.unity3d.scar.adapter.common.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f21422g = relativeLayout;
        this.f21423h = i10;
        this.f21424i = i11;
        this.f21425j = new AdView(this.f21416b);
        this.f21419e = new d(fVar, this);
    }

    @Override // h7.a
    public void b(AdRequest adRequest, d7.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f21422g;
        if (relativeLayout == null || (adView = this.f21425j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f21425j.setAdSize(new AdSize(this.f21423h, this.f21424i));
        this.f21425j.setAdUnitId(this.f21417c.b());
        this.f21425j.setAdListener(((d) this.f21419e).d());
        this.f21425j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f21422g;
        if (relativeLayout == null || (adView = this.f21425j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
