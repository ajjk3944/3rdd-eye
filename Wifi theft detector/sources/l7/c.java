package l7;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f23188g;

    /* renamed from: h, reason: collision with root package name */
    public int f23189h;

    /* renamed from: i, reason: collision with root package name */
    public int f23190i;

    /* renamed from: j, reason: collision with root package name */
    public AdView f23191j;

    public c(Context context, RelativeLayout relativeLayout, k7.a aVar, d7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.c cVar2, com.unity3d.scar.adapter.common.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f23188g = relativeLayout;
        this.f23189h = i10;
        this.f23190i = i11;
        this.f23191j = new AdView(this.f23182b);
        this.f23185e = new d(fVar, this);
    }

    @Override // l7.a
    public void b(AdRequest adRequest, d7.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f23188g;
        if (relativeLayout == null || (adView = this.f23191j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f23191j.setAdSize(new AdSize(this.f23189h, this.f23190i));
        this.f23191j.setAdUnitId(this.f23183c.b());
        this.f23191j.setAdListener(((d) this.f23185e).d());
        this.f23191j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f23188g;
        if (relativeLayout == null || (adView = this.f23191j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
