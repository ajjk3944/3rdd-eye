package n1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23528a = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23529a = new a();

        @DoNotInline
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f23529a.a();
        }
        return 0;
    }
}
