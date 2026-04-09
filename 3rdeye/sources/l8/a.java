package l8;

import java.util.Map;
import kotlin.jvm.internal.l;

/* compiled from: ConfigRepository.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ConfigRepository.kt */
    /* renamed from: l8.a$a, reason: collision with other inner class name */
    public static final class C0491a {
        public static boolean a(a aVar, String key, boolean z10) {
            l.f(key, "key");
            return ((Boolean) aVar.a(aVar, key, Boolean.valueOf(z10))).booleanValue();
        }
    }

    <T> T a(a aVar, String str, T t10);

    boolean b(String str);

    boolean c(String str, boolean z10);

    String d();

    Map<String, String> e();
}
