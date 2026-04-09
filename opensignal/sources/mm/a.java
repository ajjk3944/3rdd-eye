package mm;

import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16873d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ VideoResultActivity f16874g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(VideoResultActivity videoResultActivity, int i10) {
        super(0);
        this.f16873d = i10;
        this.f16874g = videoResultActivity;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f16873d) {
            case 0:
                return e5.y(this.f16874g).f13863a.b().a(null, x.f2918a.b(kn.d.class), null);
            default:
                return e5.y(this.f16874g).f13863a.b().a(null, x.f2918a.b(el.b.class), null);
        }
    }
}
