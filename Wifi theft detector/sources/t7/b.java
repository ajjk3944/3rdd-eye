package t7;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.e;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final String FILENAME = "settings_vungle";

    @NotNull
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";

    @NotNull
    private final File file;

    @NotNull
    private final Executor ioExecutor;

    @NotNull
    private final ConcurrentHashMap<String, Object> values;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final ConcurrentHashMap<String, b> filePreferenceMap = new ConcurrentHashMap<>();

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ b get$default(a aVar, Executor executor, q qVar, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = b.FILENAME;
            }
            return aVar.get(executor, qVar, str);
        }

        @JvmStatic
        @NotNull
        public final synchronized b get(@NotNull Executor ioExecutor, @NotNull q pathProvider, @NotNull String filename) {
            Object bVar;
            Object objPutIfAbsent;
            try {
                p.e(ioExecutor, "ioExecutor");
                p.e(pathProvider, "pathProvider");
                p.e(filename, "filename");
                ConcurrentHashMap concurrentHashMap = b.filePreferenceMap;
                bVar = concurrentHashMap.get(filename);
                if (bVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (bVar = new b(ioExecutor, pathProvider, filename, null)))) != null) {
                    bVar = objPutIfAbsent;
                }
                p.d(bVar, "filePreferenceMap.getOrP…, filename)\n            }");
            } catch (Throwable th) {
                throw th;
            }
            return (b) bVar;
        }

        private a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }

    public /* synthetic */ b(Executor executor, q qVar, String str, i iVar) {
        this(executor, qVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m623apply$lambda0(b this$0, Serializable serializable) throws Throwable {
        p.e(this$0, "this$0");
        p.e(serializable, "$serializable");
        com.vungle.ads.internal.util.i.writeSerializable(this$0.file, serializable);
    }

    @JvmStatic
    @NotNull
    public static final synchronized b get(@NotNull Executor executor, @NotNull q qVar, @NotNull String str) {
        return Companion.get(executor, qVar, str);
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: t7.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                b.m623apply$lambda0(this.f24407a, map);
            }
        });
    }

    public final boolean getBoolean(@NotNull String key, boolean z10) {
        p.e(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final int getInt(@NotNull String key, int i10) {
        p.e(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i10;
    }

    public final long getLong(@NotNull String key, long j10) {
        p.e(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j10;
    }

    @NotNull
    public final String getString(@NotNull String key, @NotNull String defaultValue) {
        p.e(key, "key");
        p.e(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    @NotNull
    public final HashSet<String> getStringSet(@NotNull String key, @NotNull HashSet<String> defaultValue) {
        p.e(key, "key");
        p.e(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? e.getNewHashSet((HashSet) obj) : defaultValue;
    }

    @NotNull
    public final b put(@NotNull String key, boolean z10) {
        p.e(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    @NotNull
    public final b remove(@NotNull String key) {
        p.e(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private b(Executor executor, q qVar, String str) throws Throwable {
        this.ioExecutor = executor;
        File file = new File(qVar.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = com.vungle.ads.internal.util.i.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    @NotNull
    public final b put(@NotNull String key, @NotNull String value) {
        p.e(key, "key");
        p.e(value, "value");
        this.values.put(key, value);
        return this;
    }

    @Nullable
    public final Boolean getBoolean(@NotNull String key) {
        p.e(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @Nullable
    public final String getString(@NotNull String key) {
        p.e(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @NotNull
    public final b put(@NotNull String key, int i10) {
        p.e(key, "key");
        this.values.put(key, Integer.valueOf(i10));
        return this;
    }

    @NotNull
    public final b put(@NotNull String key, @Nullable HashSet<String> hashSet) {
        p.e(key, "key");
        this.values.put(key, e.getNewHashSet(hashSet));
        return this;
    }

    @NotNull
    public final b put(@NotNull String key, long j10) {
        p.e(key, "key");
        this.values.put(key, Long.valueOf(j10));
        return this;
    }

    public /* synthetic */ b(Executor executor, q qVar, String str, int i10, i iVar) {
        this(executor, qVar, (i10 & 4) != 0 ? FILENAME : str);
    }
}
