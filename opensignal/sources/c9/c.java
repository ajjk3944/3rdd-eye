package c9;

import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3391a = io.sentry.internal.debugmeta.c.v("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3392b = io.sentry.internal.debugmeta.c.v("k");

    public static void a(y8.b bVar, r8.h hVar) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) bVar.f1504d;
        if (list.isEmpty()) {
            list.add(new f9.a(hVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(hVar.f21333m)));
        } else if (((f9.a) list.get(0)).f8705b == null) {
            list.set(0, new f9.a(hVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(hVar.f21333m)));
        }
    }

    public static boolean b(y8.b bVar) {
        if (bVar != null) {
            return bVar.Q0() && ((Float) ((f9.a) ((List) bVar.f1504d).get(0)).f8705b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y8.d c(d9.c r27, r8.h r28) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.c.c(d9.c, r8.h):y8.d");
    }
}
