package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class m extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final n f4459e;

    /* renamed from: f, reason: collision with root package name */
    private final o f4460f;
    private final i8 g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4461h;

    /* renamed from: i, reason: collision with root package name */
    private final List f4462i;
    private final List j;

    /* renamed from: k, reason: collision with root package name */
    private final List f4463k;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends z3 {

        /* renamed from: p, reason: collision with root package name */
        private final i8 f4469p;

        public b(i8 i8Var, String str, boolean z3) {
            super(i8Var.b().d(), m.this.f5283a);
            this.f4469p = i8Var;
            this.f5190c = StringUtils.createSpannedString(i8Var.b().a(), -16777216, 18, 1);
            this.f5191d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f5189b = z3;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f5189b;
        }

        public i8 v() {
            return this.f4469p;
        }
    }

    public m(n nVar, o oVar, i8 i8Var, Context context) {
        super(context);
        this.f4459e = nVar;
        this.g = i8Var;
        this.f4460f = oVar != null ? oVar : nVar.f();
        this.f4461h = oVar != null ? oVar.c() : nVar.d();
        this.f4462i = h();
        this.j = e();
        this.f4463k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f4459e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f4460f.b() != null) {
            arrayList.add(f());
        }
        if (this.g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.g.b().a()).a();
    }

    private List l() {
        i8 i8Var = this.g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f4460f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i4) {
        return i4 == a.INFO.ordinal() ? this.f4462i : i4 == a.BIDDERS.ordinal() ? this.j : this.f4463k;
    }

    @Override // com.applovin.impl.s2
    public int d(int i4) {
        return i4 == a.INFO.ordinal() ? this.f4462i.size() : i4 == a.BIDDERS.ordinal() ? this.j.size() : this.f4463k.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i4) {
        return i4 == a.INFO.ordinal() ? new v4("INFO") : i4 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    public o j() {
        return this.f4460f;
    }

    public String k() {
        return this.f4461h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f4459e.b()).a();
    }

    private List e() {
        i8 i8Var = this.g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f4460f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.g == null));
            }
        }
        return arrayList;
    }
}
