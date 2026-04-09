package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.settings.bw;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.sz;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ru implements bw {
    private boolean gbl;
    private final emc ru;
    private final String uym;
    private final ConcurrentHashMap<String, Object> xq = new ConcurrentHashMap<>();
    private final Object dg = new Object();
    private final Object bw = new Object();
    private final CountDownLatch ycc = new CountDownLatch(1);
    private Properties msw = new Properties();
    private volatile boolean zz = false;

    public interface emc {
        void emc();

        void ypw();
    }

    public ru(String str, emc emcVar) {
        this.uym = str;
        this.ru = emcVar;
        iyl.emc(new com.bytedance.sdk.component.msw.msw("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.ru.1
            @Override // java.lang.Runnable
            public void run() {
                ru.this.emc(false);
            }
        });
    }

    private void bw() throws InterruptedException {
        if (this.gbl && aa.emc() != null) {
            emc(true);
        }
        if (this.zz) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.ycc.await(iyl.ycc() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            ul.emc("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    @Nullable
    private File ycc() {
        Context contextEmc = aa.emc();
        if (contextEmc != null) {
            return new File(contextEmc.getFilesDir(), this.uym);
        }
        return null;
    }

    public void dg() {
        emc emcVar = this.ru;
        if (emcVar != null) {
            emcVar.ypw();
        }
    }

    public void xq() {
        File fileYcc = ycc();
        if (fileYcc == null || !fileYcc.exists()) {
            return;
        }
        fileYcc.delete();
    }

    public boolean ypw() {
        return this.zz;
    }

    public String emc(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        bw();
        return this.msw.getProperty(str, str2);
    }

    public int emc(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            bw();
            try {
                return Integer.parseInt(this.msw.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                ul.emc("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long emc(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            bw();
            try {
                return Long.parseLong(this.msw.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                ul.emc("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float emc(String str, float f10) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            bw();
            try {
                return Float.parseFloat(this.msw.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                ul.emc("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    public class ypw implements bw.emc {
        private final Map<String, Object> ypw = new HashMap();
        private final Object xq = new Object();

        public ypw() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public void emc() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.xq) {
                try {
                    properties.putAll(ru.this.msw);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.ypw.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z10 = true;
                        }
                    }
                    this.ypw.clear();
                    if (z10) {
                        ru.this.emc(properties);
                        ru.this.msw = properties;
                        ru.this.xq.clear();
                        ru.this.gbl = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str, String str2) {
            synchronized (this.xq) {
                this.ypw.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str, int i10) {
            synchronized (this.xq) {
                this.ypw.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str, long j10) {
            synchronized (this.xq) {
                this.ypw.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str) {
            synchronized (this.xq) {
                this.ypw.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str, float f10) {
            synchronized (this.xq) {
                this.ypw.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.bw.emc
        public bw.emc emc(String str, boolean z10) {
            synchronized (this.xq) {
                this.ypw.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean emc(String str, boolean z10) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            bw();
            try {
                return Boolean.parseBoolean(this.msw.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                ul.emc("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0110 A[Catch: all -> 0x000b, TryCatch #6 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:11:0x000e, B:13:0x0015, B:15:0x001e, B:17:0x0024, B:26:0x0054, B:27:0x0059, B:69:0x0105, B:71:0x0110, B:73:0x0114, B:74:0x0117, B:33:0x006a, B:34:0x006d, B:46:0x0088, B:47:0x008b, B:48:0x0090, B:43:0x0080, B:44:0x0083, B:49:0x0091, B:51:0x009b, B:53:0x00a5, B:55:0x00b9, B:56:0x00c9, B:58:0x00cf, B:60:0x00e1, B:63:0x00e9, B:65:0x00f4, B:66:0x00f7, B:68:0x0103, B:31:0x0061, B:41:0x0077, B:38:0x0072), top: B:85:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(boolean r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.ru.emc(boolean):void");
    }

    public bw.emc emc() {
        return new ypw();
    }

    public <T> T emc(String str, T t10, bw.ypw<T> ypwVar) throws InterruptedException {
        T tYpw;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.xq.get(str);
            if (t11 != null) {
                return t11;
            }
            bw();
            String property = this.msw.getProperty(str, null);
            if (property != null && ypwVar != null && (tYpw = ypwVar.ypw(property)) != null) {
                this.xq.put(str, tYpw);
                return tYpw;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(Properties properties) {
        synchronized (this.bw) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(ycc());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        sz.emc(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        ul.emc("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            sz.emc(fileOutputStream);
                        }
                        gbl.ypw();
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            sz.emc(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        gbl.ypw();
    }
}
