package H2;

import android.app.NotificationChannel;
import dalvik.system.InMemoryDexClassLoader;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ InMemoryDexClassLoader g(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return MethodHandles.Lookup.class;
    }
}
