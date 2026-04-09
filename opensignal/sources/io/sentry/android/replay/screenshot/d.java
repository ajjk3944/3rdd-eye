package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Paint;
import br.l;
import br.n;

/* loaded from: classes.dex */
public final class d extends n implements ar.a {

    /* renamed from: g, reason: collision with root package name */
    public static final d f11972g;

    /* renamed from: r, reason: collision with root package name */
    public static final d f11973r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11974d;

    static {
        int i10 = 0;
        f11972g = new d(i10, 0);
        f11973r = new d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f11974d = i11;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f11974d) {
            case 0:
                return new Paint();
            default:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                l.d(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
        }
    }
}
