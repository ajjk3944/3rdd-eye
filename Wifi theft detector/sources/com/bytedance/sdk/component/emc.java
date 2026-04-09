package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class emc {
    protected static InterfaceC0118emc emc = null;

    @GuardedBy("TTPropHelper.class")
    private static ArrayMap<String, File> sup = null;
    private static ArrayMap<File, emc> sz = null;
    private static boolean ypw = false;

    @GuardedBy("mLoadLock")
    private Properties bw;
    private final Object dg;
    private final File gbl;

    @GuardedBy("this")
    private long msw;
    private final File ru;

    @GuardedBy("mLoadLock")
    private int uym;
    private final Object xq;
    private volatile boolean ycc;

    @GuardedBy("mWriteLock")
    private long zz;

    /* renamed from: com.bytedance.sdk.component.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0118emc {
        HandlerThread emc(String str, int i10);

        ExecutorService emc();
    }

    public static class ypw {
        boolean bw;

        @GuardedBy("mWritingToDiskLock")
        volatile boolean dg;
        final long emc;
        final CountDownLatch xq;
        final Properties ypw;

        public void emc(boolean z10, boolean z11) {
            this.bw = z10;
            this.dg = z11;
            this.xq.countDown();
        }

        private ypw(long j10, Properties properties) {
            this.xq = new CountDownLatch(1);
            this.dg = false;
            this.bw = false;
            this.emc = j10;
            this.ypw = properties;
        }
    }

    private emc(File file) {
        Object obj = new Object();
        this.xq = obj;
        this.dg = new Object();
        this.bw = new Properties();
        this.ycc = false;
        this.uym = 0;
        this.ru = file;
        this.gbl = emc(file);
        synchronized (obj) {
            this.ycc = false;
        }
        InterfaceC0118emc interfaceC0118emc = emc;
        if (interfaceC0118emc == null || interfaceC0118emc.emc() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.emc.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    emc.this.emc();
                }
            }.start();
        } else {
            emc.emc().execute(new Runnable() { // from class: com.bytedance.sdk.component.emc.2
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.emc();
                }
            });
        }
    }

    public static /* synthetic */ int bw(emc emcVar) {
        int i10 = emcVar.uym;
        emcVar.uym = i10 + 1;
        return i10;
    }

    public static /* synthetic */ long ycc(emc emcVar) {
        long j10 = emcVar.msw;
        emcVar.msw = 1 + j10;
        return j10;
    }

    public static /* synthetic */ int zz(emc emcVar) {
        int i10 = emcVar.uym;
        emcVar.uym = i10 - 1;
        return i10;
    }

    private void dg() throws InterruptedException {
        while (!this.ycc) {
            try {
                this.xq.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public xq ypw() {
        return new xq();
    }

    public class xq implements SharedPreferences.Editor {
        private final Object ypw = new Object();

        @GuardedBy("mEditorLock")
        private final Map<String, Object> xq = new HashMap();

        @GuardedBy("mEditorLock")
        private boolean dg = false;

        public xq() {
        }

        private ypw ypw() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (emc.this.xq) {
                try {
                    if (emc.this.uym > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(emc.this.bw);
                        emc.this.bw = properties2;
                    }
                    properties = emc.this.bw;
                    emc.bw(emc.this);
                    synchronized (this.ypw) {
                        try {
                            boolean z11 = false;
                            if (this.dg) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.dg = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.xq.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.xq.clear();
                            if (z11) {
                                emc.ycc(emc.this);
                            }
                            j10 = emc.this.msw;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new ypw(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            emc.this.emc(ypw(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = emc.ypw ? System.currentTimeMillis() : 0L;
            ypw ypwVarYpw = ypw();
            emc.this.emc(ypwVarYpw, true);
            try {
                ypwVarYpw.xq.await();
                if (emc.ypw) {
                    Log.d("TTPropHelper", emc.this.ru.getName() + ":" + ypwVarYpw.emc + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return ypwVarYpw.dg;
            } catch (InterruptedException unused) {
                if (!emc.ypw) {
                    return false;
                }
                Log.d("TTPropHelper", emc.this.ru.getName() + ":" + ypwVarYpw.emc + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (emc.ypw) {
                    Log.d("TTPropHelper", emc.this.ru.getName() + ":" + ypwVarYpw.emc + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        public xq emc(String str, Set<String> set) {
            synchronized (this.ypw) {
                this.xq.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return emc(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq putInt(String str, int i10) {
            synchronized (this.ypw) {
                this.xq.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq putLong(String str, long j10) {
            synchronized (this.ypw) {
                this.xq.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq putFloat(String str, float f10) {
            synchronized (this.ypw) {
                this.xq.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq putString(String str, String str2) {
            synchronized (this.ypw) {
                this.xq.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq putBoolean(String str, boolean z10) {
            synchronized (this.ypw) {
                this.xq.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq remove(String str) {
            synchronized (this.ypw) {
                this.xq.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public xq clear() {
            synchronized (this.ypw) {
                this.dg = true;
            }
            return this;
        }
    }

    public static void emc(@NotNull InterfaceC0118emc interfaceC0118emc) {
        emc = interfaceC0118emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    @androidx.annotation.GuardedBy("mWriteLock")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ypw(com.bytedance.sdk.component.emc.ypw r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.emc.ypw(com.bytedance.sdk.component.emc$ypw, boolean):void");
    }

    @RequiresApi(api = 19)
    public static emc emc(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (emc.class) {
            try {
                if (sup == null) {
                    sup = new ArrayMap<>();
                }
                File file = sup.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    sup.put(str, file);
                }
                if (sz == null) {
                    sz = new ArrayMap<>();
                }
                emc emcVar = sz.get(file);
                if (emcVar != null) {
                    return emcVar;
                }
                emc emcVar2 = new emc(file);
                sz.put(file, emcVar2);
                return emcVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File emc(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.emc.emc():void");
    }

    public String emc(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.xq) {
            dg();
            property = this.bw.getProperty(str, str2);
        }
        return property;
    }

    public int emc(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.xq) {
                try {
                    try {
                        dg();
                        i11 = Integer.parseInt(this.bw.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i11;
        }
        return i10;
    }

    public long emc(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.xq) {
                try {
                    try {
                        dg();
                        j11 = Long.parseLong(this.bw.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j11;
        }
        return j10;
    }

    public float emc(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.xq) {
                try {
                    try {
                        dg();
                        f11 = Float.parseFloat(this.bw.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean emc(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.xq) {
                try {
                    try {
                        dg();
                        z11 = Boolean.parseBoolean(this.bw.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z11;
        }
        return z10;
    }

    public boolean emc(String str) {
        boolean zContainsKey;
        synchronized (this.xq) {
            try {
                try {
                    dg();
                    zContainsKey = this.bw.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final ypw ypwVar, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.emc.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (emc.this.dg) {
                    try {
                        emc.this.ypw(ypwVar, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (emc.this.xq) {
                    emc.zz(emc.this);
                }
            }
        };
        if (z10) {
            synchronized (this.xq) {
                z11 = this.uym == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.ypw.emc(runnable, true ^ z10);
    }
}
