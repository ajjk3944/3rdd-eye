package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements vh0 {

    /* renamed from: a, reason: collision with root package name */
    public String f16012a;

    /* renamed from: b, reason: collision with root package name */
    public int f16013b;

    /* renamed from: c, reason: collision with root package name */
    public int f16014c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f16015d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f16016e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16017f;
    public final Object g;

    public /* synthetic */ sh0(String str, String str2, String str3, int i4, WebView webView, String str4, int i10) {
        this.f16012a = str;
        this.f16015d = str2;
        this.f16016e = str3;
        this.f16013b = i4;
        this.g = webView;
        this.f16017f = str4;
        this.f16014c = i10;
    }

    public void a(de.i iVar) {
        if (((HashSet) this.f16015d).contains(iVar.f22210a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f16016e).add(iVar);
    }

    @Override // com.google.android.gms.internal.ads.vh0
    public Object b() {
        String str = this.f16012a;
        String str2 = (String) this.f16015d;
        String str3 = (String) this.f16016e;
        int i4 = this.f16013b;
        WebView webView = (WebView) this.g;
        String str4 = (String) this.f16017f;
        int i10 = this.f16014c;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        u70 u70Var = new u70(str, str2);
        au0 au0VarO = h80.o("javascript");
        au0 au0VarO2 = h80.o(str3);
        wt0 wt0VarQ = h80.q(d7.h(i4));
        au0 au0Var = au0.NONE;
        if (au0VarO == au0Var) {
            za.i.h("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (wt0VarQ == null) {
            za.i.h("Omid js session error; Unable to parse creative type: ".concat(d7.A(i4)));
            return null;
        }
        if (wt0VarQ == wt0.VIDEO && au0VarO2 == au0Var) {
            za.i.h("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str3)));
            return null;
        }
        b7 b7Var = new b7(u70Var, webView, str4, "", ut0.JAVASCRIPT);
        aw0 aw0VarA = aw0.a(wt0VarQ, h80.p(d7.i(i10)), au0VarO, au0VarO2, true);
        if (jz.f12903z.f15871b) {
            return new xh0(new vt0(aw0VarA, b7Var, UUID.randomUUID().toString()), b7Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public de.a c() {
        if (((de.d) this.f16017f) != null) {
            return new de.a(this.f16012a, new HashSet((HashSet) this.f16015d), new HashSet((HashSet) this.f16016e), this.f16013b, this.f16014c, (de.d) this.f16017f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void d() {
        if (!(this.f16013b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f16013b = 2;
    }

    public sh0(Class cls, Class[] clsArr) {
        this.f16012a = null;
        HashSet hashSet = new HashSet();
        this.f16015d = hashSet;
        this.f16016e = new HashSet();
        this.f16013b = 0;
        this.f16014c = 0;
        this.g = new HashSet();
        hashSet.add(de.q.a(cls));
        for (Class cls2 : clsArr) {
            wb.e.f(cls2, "Null interface");
            ((HashSet) this.f16015d).add(de.q.a(cls2));
        }
    }

    public sh0(de.q qVar, de.q[] qVarArr) {
        this.f16012a = null;
        HashSet hashSet = new HashSet();
        this.f16015d = hashSet;
        this.f16016e = new HashSet();
        this.f16013b = 0;
        this.f16014c = 0;
        this.g = new HashSet();
        hashSet.add(qVar);
        for (de.q qVar2 : qVarArr) {
            wb.e.f(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f16015d, qVarArr);
    }
}
