package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    private static ArrayMap<File, vt> mwh = null;
    protected static ouw ouw = null;
    private static ArrayMap<String, File> ryl = null;
    private static boolean vt = false;
    private long bly;

    /* renamed from: cf, reason: collision with root package name */
    private final File f7641cf;
    private Properties fkw;

    /* renamed from: le, reason: collision with root package name */
    private volatile boolean f7642le;

    /* renamed from: lh, reason: collision with root package name */
    private final Object f7643lh;
    private long pno;
    private int ra;
    private final File tlj;
    private final Object yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        HandlerThread ouw(String str);

        ExecutorService ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.vt$vt, reason: collision with other inner class name */
    public static class C0064vt {
        boolean fkw;

        /* renamed from: lh, reason: collision with root package name */
        final CountDownLatch f7674lh;
        final long ouw;
        final Properties vt;
        volatile boolean yu;

        public /* synthetic */ C0064vt(long j, Properties properties, byte b10) {
            this(j, properties);
        }

        public final void ouw(boolean z3, boolean z10) {
            this.fkw = z3;
            this.yu = z10;
            this.f7674lh.countDown();
        }

        private C0064vt(long j, Properties properties) {
            this.f7674lh = new CountDownLatch(1);
            this.yu = false;
            this.fkw = false;
            this.ouw = j;
            this.vt = properties;
        }
    }

    private vt(File file) {
        Object obj = new Object();
        this.f7643lh = obj;
        this.yu = new Object();
        this.fkw = new Properties();
        this.f7642le = false;
        this.ra = 0;
        this.tlj = file;
        this.f7641cf = new File(file.getPath() + ".bak");
        synchronized (obj) {
            this.f7642le = false;
        }
        ouw ouwVar = ouw;
        if (ouwVar == null || ouwVar.ouw() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.vt.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            }.start();
        } else {
            ouw.ouw().execute(new Runnable() { // from class: com.bytedance.sdk.component.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw();
                }
            });
        }
    }

    public static /* synthetic */ int bly(vt vtVar) {
        int i4 = vtVar.ra;
        vtVar.ra = i4 - 1;
        return i4;
    }

    public static /* synthetic */ int fkw(vt vtVar) {
        int i4 = vtVar.ra;
        vtVar.ra = i4 + 1;
        return i4;
    }

    public static /* synthetic */ long le(vt vtVar) {
        long j = vtVar.pno;
        vtVar.pno = 1 + j;
        return j;
    }

    private void yu() throws InterruptedException {
        while (!this.f7642le) {
            try {
                this.f7643lh.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final boolean vt(String str) {
        boolean zContainsKey;
        synchronized (this.f7643lh) {
            try {
                try {
                    yu();
                    zContainsKey = this.fkw.containsKey(str);
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    public static void ouw(ouw ouwVar) {
        ouw = ouwVar;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class lh implements SharedPreferences.Editor {
        private final Object vt = new Object();

        /* renamed from: lh, reason: collision with root package name */
        private final Map<String, Object> f7645lh = new HashMap();
        private boolean yu = false;

        public lh() {
        }

        private lh ouw(String str, Set<String> set) {
            synchronized (this.vt) {
                this.f7645lh.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        private C0064vt vt() {
            Properties properties;
            byte b10;
            boolean z3;
            long j;
            Object obj;
            synchronized (vt.this.f7643lh) {
                try {
                    if (vt.this.ra > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(vt.this.fkw);
                        vt.this.fkw = properties2;
                    }
                    properties = vt.this.fkw;
                    vt.fkw(vt.this);
                    synchronized (this.vt) {
                        try {
                            b10 = 0;
                            if (this.yu) {
                                if (properties.isEmpty()) {
                                    z3 = false;
                                } else {
                                    properties.clear();
                                    z3 = true;
                                }
                                this.yu = false;
                            } else {
                                z3 = false;
                            }
                            for (Map.Entry<String, Object> entry : this.f7645lh.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z3 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z3 = true;
                                }
                            }
                            this.f7645lh.clear();
                            if (z3) {
                                vt.le(vt.this);
                            }
                            j = vt.this.pno;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new C0064vt(j, properties, b10);
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            vt.ouw(vt.this, vt(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            long jCurrentTimeMillis = vt.vt ? System.currentTimeMillis() : 0L;
            C0064vt c0064vtVt = vt();
            vt.ouw(vt.this, c0064vtVt, true);
            try {
                c0064vtVt.f7674lh.await();
                if (vt.vt) {
                    Log.d("TTPropHelper", vt.this.tlj.getName() + ":" + c0064vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return c0064vtVt.yu;
            } catch (InterruptedException unused) {
                if (!vt.vt) {
                    return false;
                }
                Log.d("TTPropHelper", vt.this.tlj.getName() + ":" + c0064vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th2) {
                if (vt.vt) {
                    Log.d("TTPropHelper", vt.this.tlj.getName() + ":" + c0064vtVt.ouw + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th2;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return ouw(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putInt(String str, int i4) {
            synchronized (this.vt) {
                this.f7645lh.put(str, Integer.valueOf(i4));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putLong(String str, long j) {
            synchronized (this.vt) {
                this.f7645lh.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putFloat(String str, float f10) {
            synchronized (this.vt) {
                this.f7645lh.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putString(String str, String str2) {
            synchronized (this.vt) {
                this.f7645lh.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh putBoolean(String str, boolean z3) {
            synchronized (this.vt) {
                this.f7645lh.put(str, Boolean.valueOf(z3));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh remove(String str) {
            synchronized (this.vt) {
                this.f7645lh.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final lh clear() {
            synchronized (this.vt) {
                this.yu = true;
            }
            return this;
        }
    }

    public static vt ouw(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (vt.class) {
            try {
                if (ryl == null) {
                    ryl = new ArrayMap<>();
                }
                File file = ryl.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    ryl.put(str, file);
                }
                if (mwh == null) {
                    mwh = new ArrayMap<>();
                }
                vt vtVar = mwh.get(file);
                if (vtVar != null) {
                    return vtVar;
                }
                vt vtVar2 = new vt(file);
                mwh.put(file, vtVar2);
                return vtVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final lh vt() {
        return new lh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134 A[Catch: all -> 0x0127, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #6 {all -> 0x0127, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x011e, B:80:0x0122, B:84:0x012b, B:86:0x0134, B:88:0x013c, B:90:0x0148, B:98:0x0193, B:99:0x0194, B:59:0x00f0, B:77:0x011d, B:63:0x00f7, B:97:0x0192, B:96:0x0189), top: B:118:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void vt(com.bytedance.sdk.component.vt r17, com.bytedance.sdk.component.vt.C0064vt r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.vt(com.bytedance.sdk.component.vt, com.bytedance.sdk.component.vt$vt, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw():void");
    }

    public final String ouw(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f7643lh) {
            yu();
            property = this.fkw.getProperty(str, str2);
        }
        return property;
    }

    public final int ouw(String str, int i4) {
        int i10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7643lh) {
                try {
                    try {
                        yu();
                        i10 = Integer.parseInt(this.fkw.getProperty(str, String.valueOf(i4)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }
        return i4;
    }

    public final long ouw(String str, long j) {
        long j8;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7643lh) {
                try {
                    try {
                        yu();
                        j8 = Long.parseLong(this.fkw.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j8;
        }
        return j;
    }

    public final float ouw(String str) {
        float f10;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        synchronized (this.f7643lh) {
            try {
                try {
                    yu();
                    f10 = Float.parseFloat(this.fkw.getProperty(str, "0.0"));
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return 0.0f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10;
    }

    public final boolean ouw(String str, boolean z3) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f7643lh) {
                try {
                    try {
                        yu();
                        z10 = Boolean.parseBoolean(this.fkw.getProperty(str, String.valueOf(z3)));
                    } catch (NumberFormatException e2) {
                        Log.e("TTPropHelper", e2.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }
        return z3;
    }

    public static /* synthetic */ void ouw(vt vtVar, final C0064vt c0064vt, final boolean z3) {
        boolean z10;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (vt.this.yu) {
                    try {
                        vt.vt(vt.this, c0064vt, z3);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (vt.this.f7643lh) {
                    vt.bly(vt.this);
                }
            }
        };
        if (z3) {
            synchronized (vtVar.f7643lh) {
                z10 = vtVar.ra == 1;
            }
            if (z10) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.lh.ouw(runnable, !z3);
    }
}
