package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* loaded from: classes3.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f19908a;

    /* renamed from: b, reason: collision with root package name */
    private final b f19909b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f19910c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f19911d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f19909b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f19908a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f19875b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f19908a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f19908a == null) {
                        f19908a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f19908a.f19911d = pglSSConfig.getCallBack();
                            f19908a.f19909b.a(pglSSConfig.getCustomInfo());
                            f19908a.f19909b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19908a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f19909b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f19909b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f19911d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f19909b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f19909b.a(str);
            int i10 = this.f19910c;
            b bVar = this.f19909b;
            if (i10 % bVar.f19892p == 0) {
                bVar.a(str, map);
            }
            this.f19910c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f19909b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f19909b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f19909b.d(str);
        }
    }
}
