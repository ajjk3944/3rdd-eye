package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2129l extends k2 {

    /* renamed from: e, reason: collision with root package name */
    private final C2131m f19662e;

    /* renamed from: f, reason: collision with root package name */
    private final C2134n f19663f;

    /* renamed from: g, reason: collision with root package name */
    private final v7 f19664g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19665h;
    private final List i;

    /* renamed from: j, reason: collision with root package name */
    private final List f19666j;

    /* renamed from: k, reason: collision with root package name */
    private final List f19667k;

    /* renamed from: com.applovin.impl.l$a */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* renamed from: com.applovin.impl.l$b */
    public class b extends o3 {

        /* renamed from: p, reason: collision with root package name */
        private final v7 f19673p;

        public b(v7 v7Var, String str, boolean z10) {
            super(v7Var.b().d(), C2129l.this.f19645a);
            this.f19673p = v7Var;
            this.f19557c = StringUtils.createSpannedString(v7Var.b().a(), -16777216, 18, 1);
            this.f19558d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f19556b = z10;
        }

        @Override // com.applovin.impl.j2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.o3, com.applovin.impl.j2
        public boolean o() {
            return this.f19556b;
        }

        public v7 v() {
            return this.f19673p;
        }
    }

    public C2129l(C2131m c2131m, C2134n c2134n, v7 v7Var, Context context) {
        super(context);
        this.f19662e = c2131m;
        this.f19664g = v7Var;
        this.f19663f = c2134n != null ? c2134n : c2131m.f();
        this.f19665h = c2134n != null ? c2134n.c() : c2131m.d();
        this.i = h();
        this.f19666j = e();
        this.f19667k = l();
        notifyDataSetChanged();
    }

    private j2 f() {
        return j2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private j2 g() {
        return j2.a().d("ID").c(this.f19662e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f19663f.b() != null) {
            arrayList.add(f());
        }
        if (this.f19664g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private j2 i() {
        return j2.a().d("Selected Network").c(this.f19664g.b().a()).a();
    }

    private List l() {
        v7 v7Var = this.f19664g;
        if (v7Var != null && v7Var.d()) {
            return new ArrayList();
        }
        List<v7> listE = this.f19663f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (v7 v7Var2 : listE) {
            v7 v7Var3 = this.f19664g;
            if (v7Var3 == null || v7Var3.b().c().equals(v7Var2.b().c())) {
                arrayList.add(new b(v7Var2, null, this.f19664g == null));
                for (p3 p3Var : v7Var2.c()) {
                    arrayList.add(j2.a().d(p3Var.a()).c(p3Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.k2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    public List c(int i) {
        return i == a.INFO.ordinal() ? this.i : i == a.BIDDERS.ordinal() ? this.f19666j : this.f19667k;
    }

    @Override // com.applovin.impl.k2
    public int d(int i) {
        return i == a.INFO.ordinal() ? this.i.size() : i == a.BIDDERS.ordinal() ? this.f19666j.size() : this.f19667k.size();
    }

    @Override // com.applovin.impl.k2
    public j2 e(int i) {
        return i == a.INFO.ordinal() ? new j4("INFO") : i == a.BIDDERS.ordinal() ? new j4("BIDDERS") : new j4("WATERFALL");
    }

    public C2134n j() {
        return this.f19663f;
    }

    public String k() {
        return this.f19665h;
    }

    private j2 d() {
        return j2.a().d("Ad Format").c(this.f19662e.b()).a();
    }

    private List e() {
        v7 v7Var = this.f19664g;
        if (v7Var != null && !v7Var.d()) {
            return new ArrayList();
        }
        List<v7> listA = this.f19663f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (v7 v7Var2 : listA) {
            v7 v7Var3 = this.f19664g;
            if (v7Var3 == null || v7Var3.b().c().equals(v7Var2.b().c())) {
                arrayList.add(new b(v7Var2, v7Var2.a() != null ? v7Var2.a().a() : "", this.f19664g == null));
            }
        }
        return arrayList;
    }
}
