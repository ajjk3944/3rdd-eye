package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import d.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class od {

    /* renamed from: le, reason: collision with root package name */
    private static od f8376le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.ouw.lh.vt f8377lh;
    public com.bytedance.sdk.openadsdk.ouw.fkw.ouw vt;
    public com.bytedance.sdk.openadsdk.ouw.yu.vt yu;
    private final AtomicInteger ra = new AtomicInteger(0);
    public Map<Integer, com.bytedance.sdk.openadsdk.core.model.ouw> ouw = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, ouw<?>> pno = new ConcurrentHashMap<>();
    public final Map<String, vt> fkw = new HashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw<T> {

        /* renamed from: lh, reason: collision with root package name */
        public final long f8378lh = System.currentTimeMillis();
        public final T ouw;
        public final String vt;

        public ouw(T t10, String str) {
            this.ouw = t10;
            this.vt = str;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw();
    }

    private od() {
    }

    public final <T> void ouw(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.pno.put(str, new ouw<>(t10, str));
    }

    public final void vt() {
        this.vt = null;
        this.f8377lh = null;
        this.yu = null;
    }

    public final <T> T ouw(String str, Class<T> cls) {
        ouw<?> ouwVar;
        if (TextUtils.isEmpty(str) || (ouwVar = this.pno.get(str)) == null || !cls.isInstance(ouwVar.ouw)) {
            return null;
        }
        return cls.cast(ouwVar.ouw);
    }

    public final void vt(int i4) {
        this.ouw.remove(Integer.valueOf(i4));
    }

    public static String vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        String strUx = vppVar.ux();
        return TextUtils.isEmpty(strUx) ? String.valueOf(vppVar.hashCode()) : strUx;
    }

    private ouw<?> ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.pno.remove(str);
    }

    public static od ouw() {
        if (f8376le == null) {
            f8376le = new od();
        }
        return f8376le;
    }

    public final com.bytedance.sdk.openadsdk.core.model.vpp ouw(int i4) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarRemove = this.ouw.remove(Integer.valueOf(i4));
        if (ouwVarRemove != null) {
            return ouwVarRemove.fkw;
        }
        return null;
    }

    public final int ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.ouw();
        ouwVar.fkw = vppVar;
        return ouw(ouwVar);
    }

    public final int ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        int iIncrementAndGet = this.ra.incrementAndGet();
        this.ouw.put(Integer.valueOf(iIncrementAndGet), ouwVar);
        return iIncrementAndGet;
    }

    public static int ouw(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public final void ouw(String str, boolean z3, boolean z10) {
        boolean z11 = z3 || !z10;
        boolean zJg = bly.ouw().jg();
        if (zJg) {
            com.bytedance.sdk.component.utils.qbp.ouw("BVA", "cleanListener: isFinish = " + z3 + ",isConfigChange = " + z10);
        }
        if (z11) {
            ouw(str, zJg);
        } else if (z3 || !z10) {
            ouw(str, zJg);
        }
    }

    private void ouw(String str, boolean z3) {
        ouw<?> ouwVarOuw = ouw(str);
        if (z3) {
            if (ouwVarOuw == null) {
                com.bytedance.sdk.component.utils.qbp.ouw("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            StringBuilder sbA = h.A("cleanListener: removeCallback success,listenerKey=", str, ",callback=");
            sbA.append(ouwVarOuw.ouw);
            com.bytedance.sdk.component.utils.qbp.ouw("BVA", sbA.toString());
        }
    }
}
