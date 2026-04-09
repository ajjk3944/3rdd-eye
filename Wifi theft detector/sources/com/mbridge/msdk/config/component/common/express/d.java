package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.config.component.common.express.operator.r;
import com.mbridge.msdk.config.component.common.express.operator.s;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f13122a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.c f13123b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f13124c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.f f13125d;

    /* renamed from: e, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f13126e;

    /* renamed from: f, reason: collision with root package name */
    private final q f13127f;

    /* renamed from: g, reason: collision with root package name */
    private final s f13128g;

    /* renamed from: h, reason: collision with root package name */
    private final o f13129h;

    /* renamed from: i, reason: collision with root package name */
    private final m f13130i;

    /* renamed from: j, reason: collision with root package name */
    private final l f13131j;

    /* renamed from: k, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.a f13132k;

    /* renamed from: l, reason: collision with root package name */
    private final i f13133l;

    /* renamed from: m, reason: collision with root package name */
    private final k f13134m;

    /* renamed from: n, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.b f13135n;

    /* renamed from: o, reason: collision with root package name */
    private final r f13136o;

    /* renamed from: p, reason: collision with root package name */
    private final j f13137p;

    /* renamed from: q, reason: collision with root package name */
    private final p f13138q;

    /* renamed from: r, reason: collision with root package name */
    private final n f13139r;

    /* renamed from: s, reason: collision with root package name */
    private final h f13140s;

    /* renamed from: t, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.g f13141t;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f13122a = cVar;
        this.f13123b = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.f13124c = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f13125d = new com.mbridge.msdk.config.component.common.express.operator.f(cVar);
        this.f13126e = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f13127f = new q(cVar);
        this.f13128g = new s(cVar);
        this.f13129h = new o(cVar);
        this.f13130i = new m(cVar);
        this.f13131j = new l(cVar);
        this.f13132k = new com.mbridge.msdk.config.component.common.express.operator.a(cVar);
        this.f13133l = new i(cVar);
        this.f13134m = new k(cVar);
        this.f13135n = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.f13136o = new r(cVar);
        this.f13137p = new j();
        this.f13138q = new p(cVar);
        this.f13139r = new n(cVar);
        this.f13140s = new h(cVar);
        this.f13141t = new com.mbridge.msdk.config.component.common.express.operator.g(cVar);
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f13139r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f13126e.a(strB, objA, listC);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f13125d.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f13124c.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f13127f.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f13134m.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f13130i.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f13128g.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f13129h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f13131j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f13132k.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f13136o.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f13138q.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f13137p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f13123b.a(strB, objA, listC);
            if (aVarA11.b()) {
                return aVarA11.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA12 = this.f13140s.a(strB, objA, listC);
            if (aVarA12.b()) {
                return aVarA12.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA13 = this.f13141t.a(strB, objA, listC);
            return aVarA13.b() ? aVarA13.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
