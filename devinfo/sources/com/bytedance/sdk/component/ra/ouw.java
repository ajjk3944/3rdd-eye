package com.bytedance.sdk.component.ra;

import com.bytedance.sdk.component.ra.vt.yu;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw.fkw;
import com.bytedance.sdk.component.vt.ouw.pno;
import d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static fkw ouw;
    public cf vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.ra.ouw$ouw, reason: collision with other inner class name */
    public static final class C0059ouw {
        public final List<pno> yu = new ArrayList();
        public int ouw = 10000;
        public int vt = 10000;

        /* renamed from: lh, reason: collision with root package name */
        public int f7623lh = 10000;

        public static int ouw(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(h.s(str, " < 0"));
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(h.s(str, " too large."));
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(h.s(str, " too small."));
        }
    }

    public /* synthetic */ ouw(C0059ouw c0059ouw, byte b10) {
        this(c0059ouw);
    }

    public static boolean yu() {
        fkw fkwVar = ouw;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.ouw();
    }

    public final cf fkw() {
        return this.vt;
    }

    public final com.bytedance.sdk.component.ra.vt.ouw lh() {
        return new com.bytedance.sdk.component.ra.vt.ouw(this.vt);
    }

    public final yu ouw() {
        return new yu(this.vt);
    }

    public final com.bytedance.sdk.component.ra.vt.vt vt() {
        return new com.bytedance.sdk.component.ra.vt.vt(this.vt);
    }

    private ouw(C0059ouw c0059ouw) {
        cf.ouw ouwVar = new cf.ouw();
        long j = c0059ouw.ouw;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cf.ouw ouwVarVt = ouwVar.ouw(j, timeUnit).lh(c0059ouw.f7623lh, timeUnit).vt(c0059ouw.vt, timeUnit);
        List<pno> list = c0059ouw.yu;
        if (list != null && list.size() > 0) {
            Iterator<pno> it = c0059ouw.yu.iterator();
            while (it.hasNext()) {
                ouwVarVt.ouw.add(it.next());
            }
        }
        this.vt = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVarVt);
    }
}
