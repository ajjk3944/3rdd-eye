package s2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SingularParamsBase;
import i2.C4444d;
import i2.EnumC4441a;
import t2.AbstractC5601b;
import u2.C5628g;
import u2.C5629h;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f46002a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5601b.a f46003b = AbstractC5601b.a.a("t", "s", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "o", SingularParamsBase.Constants.PACKAGE_NAME_KEY, "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC5601b.a f46004c = AbstractC5601b.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator interpolatorB;
        pointF.x = C5628g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = C5628g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C5628g.b(pointF2.x, -1.0f, 1.0f);
        float fB = C5628g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        C5629h.a aVar = C5629h.f46557a;
        EnumC4441a enumC4441a = C4444d.f38338a;
        try {
            interpolatorB = N0.a.b(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e4) {
            interpolatorB = "The Path cannot loop back on itself.".equals(e4.getMessage()) ? N0.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        EnumC4441a enumC4441a2 = C4444d.f38338a;
        return interpolatorB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> v2.C5673a<T> b(t2.AbstractC5601b r24, i2.C4448h r25, float r26, s2.K<T> r27, boolean r28, boolean r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.s.b(t2.b, i2.h, float, s2.K, boolean, boolean):v2.a");
    }
}
