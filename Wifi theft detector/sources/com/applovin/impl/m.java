package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class m extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final n f6441e;

    /* renamed from: f, reason: collision with root package name */
    private final o f6442f;

    /* renamed from: g, reason: collision with root package name */
    private final i8 f6443g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6444h;

    /* renamed from: i, reason: collision with root package name */
    private final List f6445i;

    /* renamed from: j, reason: collision with root package name */
    private final List f6446j;

    /* renamed from: k, reason: collision with root package name */
    private final List f6447k;

    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public class b extends z3 {

        /* renamed from: p, reason: collision with root package name */
        private final i8 f6453p;

        public b(i8 i8Var, String str, boolean z10) {
            super(i8Var.b().d(), m.this.f7531a);
            this.f6453p = i8Var;
            this.f7423c = StringUtils.createSpannedString(i8Var.b().a(), -16777216, 18, 1);
            this.f7424d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f7422b = z10;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f7422b;
        }

        public i8 v() {
            return this.f6453p;
        }
    }

    public m(n nVar, o oVar, i8 i8Var, Context context) {
        super(context);
        this.f6441e = nVar;
        this.f6443g = i8Var;
        this.f6442f = oVar != null ? oVar : nVar.f();
        this.f6444h = oVar != null ? oVar.c() : nVar.d();
        this.f6445i = h();
        this.f6446j = e();
        this.f6447k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f6441e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f6442f.b() != null) {
            arrayList.add(f());
        }
        if (this.f6443g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.f6443g.b().a()).a();
    }

    private List l() {
        i8 i8Var = this.f6443g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f6442f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.f6443g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.f6443g == null));
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
    public List c(int i10) {
        return i10 == a.INFO.ordinal() ? this.f6445i : i10 == a.BIDDERS.ordinal() ? this.f6446j : this.f6447k;
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        return i10 == a.INFO.ordinal() ? this.f6445i.size() : i10 == a.BIDDERS.ordinal() ? this.f6446j.size() : this.f6447k.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        return i10 == a.INFO.ordinal() ? new v4("INFO") : i10 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    public o j() {
        return this.f6442f;
    }

    public String k() {
        return this.f6444h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f6441e.b()).a();
    }

    private List e() {
        i8 i8Var = this.f6443g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f6442f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.f6443g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.f6443g == null));
            }
        }
        return arrayList;
    }
}
