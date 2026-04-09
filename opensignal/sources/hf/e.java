package hf;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 hf.e, still in use, count: 1, list:
  (r0v0 hf.e) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 hf.e) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class e {
    X86_32,
    X86_64,
    ARM_UNKNOWN,
    PPC,
    PPC64,
    ARMV6,
    ARMV7,
    UNKNOWN,
    ARMV7S,
    ARM64;

    private static final Map<String, e> matcher;

    static {
        HashMap map = new HashMap(4);
        matcher = map;
        map.put("armeabi-v7a", new e());
        map.put("armeabi", new e());
        map.put("arm64-v8a", new e());
        map.put("x86", new e());
    }

    private e() {
    }

    public static e getValue() {
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str)) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return UNKNOWN;
        }
        e eVar = matcher.get(str.toLowerCase(Locale.US));
        return eVar == null ? UNKNOWN : eVar;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
