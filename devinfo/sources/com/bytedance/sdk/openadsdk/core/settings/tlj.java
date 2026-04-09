package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.settings.fkw;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.mwh;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class tlj implements fkw {

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8448cf;
    private final String pno;
    private final ouw tlj;

    /* renamed from: lh, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f8450lh = new ConcurrentHashMap<>();
    private final Object yu = new Object();

    /* renamed from: le, reason: collision with root package name */
    private final Object f8449le = new Object();
    private final CountDownLatch ra = new CountDownLatch(1);
    private Properties bly = new Properties();
    public volatile boolean fkw = false;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();

        void vt();
    }

    public tlj(String str, ouw ouwVar) {
        this.pno = str;
        this.tlj = ouwVar;
        bs.ouw(new com.bytedance.sdk.component.pno.pno("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.tlj.1
            @Override // java.lang.Runnable
            public final void run() {
                tlj.this.ouw(false);
            }
        });
    }

    private File fkw() {
        Context contextOuw = zih.ouw();
        if (contextOuw != null) {
            return new File(contextOuw.getFilesDir(), this.pno);
        }
        return null;
    }

    public static /* synthetic */ boolean lh(tlj tljVar) {
        tljVar.f8448cf = false;
        return false;
    }

    private void yu() throws InterruptedException {
        if (this.f8448cf && zih.ouw() != null) {
            ouw(true);
        }
        if (this.fkw) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.ra.await(bs.le() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            qbp.ouw("SdkSettings.Prop", "awaitLoadedLocked: ", e2);
        }
    }

    public final void lh() {
        ouw ouwVar = this.tlj;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    public final String ouw(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        yu();
        return this.bly.getProperty(str, str2);
    }

    public final void vt() {
        File fileFkw = fkw();
        if (fileFkw == null || !fileFkw.exists()) {
            return;
        }
        fileFkw.delete();
    }

    public final int ouw(String str, int i4) {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Integer.parseInt(this.bly.getProperty(str, String.valueOf(i4)));
            } catch (NumberFormatException e2) {
                qbp.ouw("SdkSettings.Prop", "", e2);
            }
        }
        return i4;
    }

    public final long ouw(String str, long j) {
        if (str.isEmpty()) {
            return j;
        }
        yu();
        try {
            return Long.parseLong(this.bly.getProperty(str, String.valueOf(j)));
        } catch (NumberFormatException e2) {
            qbp.ouw("SdkSettings.Prop", "", e2);
            return j;
        }
    }

    public final float ouw(String str) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Float.parseFloat(this.bly.getProperty(str, "1.0"));
            } catch (NumberFormatException e2) {
                qbp.ouw("SdkSettings.Prop", "", e2);
            }
        }
        return 1.0f;
    }

    public final boolean ouw(String str, boolean z3) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            yu();
            try {
                return Boolean.parseBoolean(this.bly.getProperty(str, String.valueOf(z3)));
            } catch (Exception e2) {
                qbp.ouw("SdkSettings.Prop", "", e2);
            }
        }
        return z3;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class vt implements fkw.ouw {
        private final Map<String, Object> vt = new HashMap();

        /* renamed from: lh, reason: collision with root package name */
        private final Object f8451lh = new Object();

        public vt() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final void ouw() {
            Object obj;
            boolean z3 = false;
            ko.ouw("SdkSettings.Prop", "commit: ", this.vt);
            Properties properties = new Properties();
            synchronized (this.f8451lh) {
                try {
                    properties.putAll(tlj.this.bly);
                    for (Map.Entry<String, Object> entry : this.vt.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z3 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z3 = true;
                        }
                    }
                    this.vt.clear();
                    if (z3) {
                        tlj.ouw(tlj.this, properties);
                        tlj.this.bly = properties;
                        tlj.this.f8450lh.clear();
                        tlj.lh(tlj.this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, String str2) {
            synchronized (this.f8451lh) {
                this.vt.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, int i4) {
            synchronized (this.f8451lh) {
                this.vt.put(str, Integer.valueOf(i4));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, long j) {
            synchronized (this.f8451lh) {
                this.vt.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str) {
            synchronized (this.f8451lh) {
                this.vt.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, float f10) {
            synchronized (this.f8451lh) {
                this.vt.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.ouw
        public final fkw.ouw ouw(String str, boolean z3) {
            synchronized (this.f8451lh) {
                this.vt.put(str, Boolean.valueOf(z3));
            }
            return this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0127 A[Catch: all -> 0x0012, TryCatch #2 {all -> 0x0012, blocks: (B:4:0x0003, B:7:0x0009, B:8:0x0010, B:12:0x0015, B:14:0x001c, B:16:0x0025, B:18:0x002b, B:27:0x0075, B:28:0x0078, B:44:0x009f, B:69:0x0123, B:71:0x0127, B:73:0x012b, B:74:0x012e, B:75:0x0135, B:34:0x0087, B:46:0x00a6, B:47:0x00a9, B:48:0x00ae, B:43:0x009b, B:49:0x00af, B:51:0x00b9, B:53:0x00c3, B:55:0x00d7, B:56:0x00e7, B:58:0x00ed, B:60:0x00ff, B:63:0x0107, B:65:0x0112, B:66:0x0115, B:68:0x0121, B:32:0x007e, B:41:0x0092), top: B:83:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.tlj.ouw(boolean):void");
    }

    public final fkw.ouw ouw() {
        return new vt();
    }

    public final <T> T ouw(String str, T t10, fkw.vt<T> vtVar) throws InterruptedException {
        T tOuw;
        if (!str.isEmpty()) {
            T t11 = (T) this.f8450lh.get(str);
            if (t11 != null) {
                return t11;
            }
            yu();
            String property = this.bly.getProperty(str, null);
            if (property != null && vtVar != null && (tOuw = vtVar.ouw(property)) != null) {
                this.f8450lh.put(str, tOuw);
                return tOuw;
            }
        }
        return t10;
    }

    public static /* synthetic */ void ouw(tlj tljVar, Properties properties) {
        synchronized (tljVar.f8449le) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(tljVar.fkw());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        mwh.ouw(fileOutputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        qbp.ouw("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            mwh.ouw(fileOutputStream);
                        }
                        cf.ouw();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            mwh.ouw(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        cf.ouw();
    }
}
