package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f21520a;

    /* renamed from: b, reason: collision with root package name */
    private final b f21521b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f21522c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f21523d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f21521b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f21520a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f21489b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f21520a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f21520a == null) {
                        f21520a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f21520a.f21523d = pglSSConfig.getCallBack();
                            f21520a.f21521b.a(pglSSConfig.getCustomInfo());
                            f21520a.f21521b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21520a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f21521b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f21521b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f21523d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f21521b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f21521b.a(str);
            int i4 = this.f21522c;
            b bVar = this.f21521b;
            if (i4 % bVar.f21504p == 0) {
                bVar.a(str, map);
            }
            this.f21522c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f21521b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f21521b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f21521b.d(str);
        }
    }
}
