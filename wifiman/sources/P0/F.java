package p0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final a f57350a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f57351b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return F.f57351b;
        }

        private a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f57351b = AbstractC6492s.d(lowerCase, "robolectric");
    }
}
