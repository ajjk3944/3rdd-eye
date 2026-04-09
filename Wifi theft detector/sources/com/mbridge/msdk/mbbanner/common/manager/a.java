package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f15759g = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f15760h;

    /* renamed from: a, reason: collision with root package name */
    private Context f15761a = com.mbridge.msdk.foundation.controller.c.n().d();

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f15762b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f15763c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f15764d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f15765e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f15766f = new ConcurrentHashMap();

    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    public class C0274a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f15767a;

        public C0274a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f15767a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f15767a.a("");
                a.this.f15764d.put(str, Boolean.FALSE);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15769a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBridgeIds f15770b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f15771c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f15772d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f15773e;

        public b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f15769a = str;
            this.f15770b = mBridgeIds;
            this.f15771c = bVar;
            this.f15772d = str2;
            this.f15773e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f15764d == null || !a.this.f15764d.containsKey(this.f15769a) || (bool = (Boolean) a.this.f15764d.get(this.f15769a)) == null || !bool.booleanValue()) {
                if (a.this.f15766f.containsKey(this.f15769a)) {
                    Integer num = (Integer) a.this.f15766f.get(this.f15769a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        q0.b(a.f15759g, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + this.f15769a);
                        if (a.this.f15762b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f15770b);
                            a.this.f15762b.a(this.f15771c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f15772d, this.f15769a, this.f15773e, this.f15771c);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (f15760h == null) {
            synchronized (a.class) {
                try {
                    if (f15760h == null) {
                        f15760h = new a();
                    }
                } finally {
                }
            }
        }
        return f15760h;
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f15763c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f15764d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f15765e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f15765e.clear();
        }
        Map<String, Integer> map4 = this.f15766f;
        if (map4 != null) {
            map4.clear();
        }
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f15763c.containsKey(str)) {
            return this.f15763c.get(str);
        }
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        if (lVarE == null) {
            lVarE = l.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, lVarE.y());
        this.f15763c.put(str, bVar);
        return bVar;
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (e) null);
        if (this.f15761a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f15762b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f15762b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f15764d;
        if (map != null && map.containsKey(str2) && (bool = this.f15764d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f15762b.a(bVar, bVar4);
            return;
        }
        this.f15764d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f15761a, bVarA, bVar, this.f15762b).a(str, str2, aVar, new C0274a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (e) null);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar != null && aVar.d() > 0) {
            if (TextUtils.isEmpty(aVar.b())) {
                aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
            }
            if (this.f15765e.containsKey(str2)) {
                handler = this.f15765e.get(str2);
            } else {
                handler = new Handler();
                this.f15765e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar2, aVar.d());
                return;
            }
            return;
        }
        q0.b(f15759g, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f15766f.containsKey(str2) || (num = this.f15766f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f15765e.containsKey(str2) && (handler = this.f15765e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f15766f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f15765e.containsKey(str2) && (handler2 = this.f15765e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f15766f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f15766f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f15766f.put(str2, 0);
            return;
        }
        if (this.f15765e.containsKey(str2) && (handler3 = this.f15765e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f15766f.put(str2, Integer.valueOf(i10));
    }

    public void b(String str) {
        if (this.f15765e.containsKey(str)) {
            Handler handler = this.f15765e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f15765e.remove(str);
        }
    }
}
