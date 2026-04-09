package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f15293a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f15294b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f15295c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f15296d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Long> f15297e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f15298f;

    /* renamed from: g, reason: collision with root package name */
    private String f15299g;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f15300h;

    /* renamed from: i, reason: collision with root package name */
    private String f15301i;

    /* renamed from: j, reason: collision with root package name */
    private int f15302j;

    /* renamed from: k, reason: collision with root package name */
    private String f15303k;

    /* renamed from: l, reason: collision with root package name */
    private String f15304l;

    /* renamed from: m, reason: collision with root package name */
    private String f15305m;

    /* renamed from: n, reason: collision with root package name */
    private String f15306n;

    /* renamed from: o, reason: collision with root package name */
    private String f15307o;

    /* renamed from: p, reason: collision with root package name */
    private String f15308p;

    /* renamed from: q, reason: collision with root package name */
    private String f15309q;

    /* renamed from: r, reason: collision with root package name */
    private String f15310r;

    /* renamed from: s, reason: collision with root package name */
    private int f15311s;

    /* renamed from: t, reason: collision with root package name */
    private int f15312t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15313u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15314v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15315w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15316x;

    /* renamed from: y, reason: collision with root package name */
    private int f15317y;

    /* renamed from: z, reason: collision with root package name */
    private int f15318z;

    public c() {
        this.f15293a = false;
        this.f15294b = new HashMap();
        this.f15295c = new HashMap();
        this.f15296d = new HashMap();
        this.f15297e = new HashMap();
        this.f15299g = "";
        this.f15300h = new CopyOnWriteArrayList<>();
        this.f15311s = -1;
        this.f15313u = false;
        this.f15315w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f15301i)) {
            return this.f15301i;
        }
        try {
            if (TextUtils.isEmpty(this.f15301i)) {
                String str = this.f15299g + this.f15310r;
                Map<String, Map<String, String>> map2 = this.f15294b;
                if (map2 != null && map2.containsKey(str) && (map = this.f15294b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f15301i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f15301i;
    }

    public String C() {
        return this.f15306n;
    }

    public boolean D() {
        return this.f15313u;
    }

    public boolean E() {
        return this.f15315w;
    }

    public boolean F() {
        return this.f15314v;
    }

    public boolean G() {
        return this.f15293a;
    }

    public void a(boolean z10) {
        this.f15313u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f15310r = str;
            eVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f15302j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f15278a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f15302j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a("content_type", Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.f15297e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f15297e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f15311s = i10;
    }

    public void f(String str) {
        this.f15309q = str;
    }

    public int g() {
        return this.f15302j;
    }

    public void h(String str) {
        this.f15308p = str;
    }

    public void i(String str) {
        this.f15299g = str;
    }

    public void j(String str) {
        this.f15310r = str;
    }

    public void k(String str) {
        this.f15304l = str;
    }

    public String l() {
        return this.f15303k;
    }

    public List<CampaignEx> m() {
        return this.f15300h;
    }

    public CampaignEx n() {
        return this.C;
    }

    public List<CampaignEx> o() {
        return this.D;
    }

    public int p() {
        return this.A;
    }

    public int q() {
        return this.f15311s;
    }

    public int r() {
        return this.f15312t;
    }

    public String s() {
        return this.f15308p;
    }

    public String t() {
        return this.f15299g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f15298f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f15296d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f15294b;
    }

    public String x() {
        return this.f15304l;
    }

    public String y() {
        return this.f15307o;
    }

    public String z() {
        return this.f15305m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f15300h.isEmpty()) {
                    this.f15300h.clear();
                }
                this.f15300h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f15299g + str;
            Map<String, Map<String, String>> map = this.f15294b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f15294b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f15312t = i10;
    }

    public void g(String str) {
        this.f15303k = str;
    }

    public int i() {
        return this.f15317y;
    }

    public String j() {
        return this.f15309q;
    }

    public int k() {
        return this.f15318z;
    }

    public void l(String str) {
        this.f15307o = str;
    }

    public void m(String str) {
        this.f15305m = str;
    }

    public void n(String str) {
        this.f15301i = str;
    }

    public void o(String str) {
        this.f15306n = str;
    }

    public void d(boolean z10) {
        this.f15316x = z10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f15299g + str;
            Map<String, Map<String, String>> map2 = this.f15295c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f15295c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f15295c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.D.size()) {
                        break;
                    }
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                    i10++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f15300h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f15300h.size(); i11++) {
                if (this.f15300h.get(i11) != null && this.f15300h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f15300h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f15293a = false;
        this.f15294b = new HashMap();
        this.f15295c = new HashMap();
        this.f15296d = new HashMap();
        this.f15297e = new HashMap();
        this.f15299g = "";
        this.f15300h = new CopyOnWriteArrayList<>();
        this.f15311s = -1;
        this.f15313u = false;
        this.f15315w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f15293a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f15297e) != null && map.containsKey(str)) {
                Long l10 = this.f15297e.get(str);
                return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i10) {
        this.f15302j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f15295c.containsKey(str) ? this.f15295c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f15315w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f15299g + str;
            Map<String, Map<String, String>> map2 = this.f15294b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f15294b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f15294b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f15317y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f15310r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f15298f = bVar;
    }

    public void c(boolean z10) {
        this.f15314v = z10;
    }

    public void c(int i10) {
        this.f15318z = i10;
    }
}
