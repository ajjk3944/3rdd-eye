package k8;

import com.ubnt.usurvey.R;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* loaded from: classes3.dex */
public abstract class n {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51333a;

        static {
            int[] iArr = new int[S8.h.values().length];
            try {
                iArr[S8.h.STATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.h.ACCESS_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.h.REPEATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51333a = iArr;
        }
    }

    public static final s9.d a(S8.h hVar) {
        AbstractC6492s.i(hVar, "<this>");
        int i10 = a.f51333a[hVar.ordinal()];
        if (i10 == 1) {
            return new d.b(R.string.wifi_mode_station);
        }
        if (i10 == 2) {
            return new d.b(R.string.wifi_mode_access_point);
        }
        if (i10 != 3) {
            return null;
        }
        return new d.b(R.string.wifi_mode_repeater);
    }
}
