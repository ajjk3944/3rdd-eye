package qi;

import com.google.android.gms.internal.ads.c2;
import com.google.android.gms.internal.measurement.d5;
import pa.n;
import pi.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi.a f32430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f32431c;

    public /* synthetic */ c(pi.a aVar, g gVar, int i4) {
        this.f32429a = i4;
        this.f32430b = aVar;
        this.f32431c = gVar;
    }

    @Override // pa.n
    public final void b(c2 c2Var) {
        switch (this.f32429a) {
            case 0:
                this.f32431c.x(d5.y(c2Var, this.f32430b, "appOpenAd"));
                break;
            case 1:
                this.f32431c.x(d5.y(c2Var, this.f32430b, "banner"));
                break;
            case 2:
                this.f32431c.x(d5.y(c2Var, this.f32430b, "interAd"));
                break;
            default:
                this.f32431c.x(d5.y(c2Var, this.f32430b, "interAd"));
                break;
        }
    }
}
