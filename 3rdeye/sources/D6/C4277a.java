package d6;

import C.E;
import com.vungle.ads.internal.util.c;
import com.vungle.ads.internal.util.f;
import com.vungle.ads.internal.util.l;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g;

/* compiled from: FilePreferences.kt */
/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4277a {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final C0439a Companion = new C0439a(null);
    private static final ConcurrentHashMap<String, C4277a> filePreferenceMap = new ConcurrentHashMap<>();

    /* compiled from: FilePreferences.kt */
    /* renamed from: d6.a$a, reason: collision with other inner class name */
    public static final class C0439a {
        public /* synthetic */ C0439a(g gVar) {
            this();
        }

        public static /* synthetic */ C4277a get$default(C0439a c0439a, Executor executor, l lVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = C4277a.FILENAME;
            }
            return c0439a.get(executor, lVar, str);
        }

        public final synchronized C4277a get(Executor ioExecutor, l pathProvider, String filename) {
            Object c4277a;
            Object objPutIfAbsent;
            try {
                kotlin.jvm.internal.l.f(ioExecutor, "ioExecutor");
                kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
                kotlin.jvm.internal.l.f(filename, "filename");
                ConcurrentHashMap concurrentHashMap = C4277a.filePreferenceMap;
                c4277a = concurrentHashMap.get(filename);
                if (c4277a == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (c4277a = new C4277a(ioExecutor, pathProvider, filename, null)))) != null) {
                    c4277a = objPutIfAbsent;
                }
            } catch (Throwable th) {
                throw th;
            }
            return (C4277a) c4277a;
        }

        private C0439a() {
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }

    public /* synthetic */ C4277a(Executor executor, l lVar, String str, g gVar) {
        this(executor, lVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m135apply$lambda0(C4277a this$0, Serializable serializable) throws Throwable {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(serializable, "$serializable");
        f.writeSerializable(this$0.file, serializable);
    }

    public static final synchronized C4277a get(Executor executor, l lVar, String str) {
        return Companion.get(executor, lVar, str);
    }

    public final void apply() {
        this.ioExecutor.execute(new E(20, this, new HashMap(this.values)));
    }

    public final boolean getBoolean(String key, boolean z10) {
        kotlin.jvm.internal.l.f(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final int getInt(String key, int i) {
        kotlin.jvm.internal.l.f(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }

    public final long getLong(String key, long j4) {
        kotlin.jvm.internal.l.f(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j4;
    }

    public final String getString(String key, String defaultValue) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? c.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final C4277a put(String key, boolean z10) {
        kotlin.jvm.internal.l.f(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    public final C4277a remove(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private C4277a(Executor executor, l lVar, String str) throws Throwable {
        this.ioExecutor = executor;
        File file = new File(lVar.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = f.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public final C4277a put(String key, String value) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final C4277a put(String key, int i) {
        kotlin.jvm.internal.l.f(key, "key");
        this.values.put(key, Integer.valueOf(i));
        return this;
    }

    public final C4277a put(String key, HashSet<String> hashSet) {
        kotlin.jvm.internal.l.f(key, "key");
        this.values.put(key, c.getNewHashSet(hashSet));
        return this;
    }

    public final C4277a put(String key, long j4) {
        kotlin.jvm.internal.l.f(key, "key");
        this.values.put(key, Long.valueOf(j4));
        return this;
    }

    public /* synthetic */ C4277a(Executor executor, l lVar, String str, int i, g gVar) {
        this(executor, lVar, (i & 4) != 0 ? FILENAME : str);
    }
}
