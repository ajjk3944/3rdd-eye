package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class j2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f19555a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f19556b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f19557c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f19558d;

    /* renamed from: e, reason: collision with root package name */
    protected String f19559e;

    /* renamed from: f, reason: collision with root package name */
    protected String f19560f;

    /* renamed from: g, reason: collision with root package name */
    protected int f19561g;

    /* renamed from: h, reason: collision with root package name */
    protected int f19562h;
    protected int i;

    /* renamed from: j, reason: collision with root package name */
    protected int f19563j;

    /* renamed from: k, reason: collision with root package name */
    protected int f19564k;

    /* renamed from: l, reason: collision with root package name */
    protected int f19565l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f19566m;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f19567a;

        /* renamed from: b, reason: collision with root package name */
        boolean f19568b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f19569c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f19570d;

        /* renamed from: e, reason: collision with root package name */
        String f19571e;

        /* renamed from: f, reason: collision with root package name */
        String f19572f;

        /* renamed from: g, reason: collision with root package name */
        int f19573g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f19574h = 0;
        int i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f19575j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f19576k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f19577l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f19578m;

        public b(c cVar) {
            this.f19567a = cVar;
        }

        public b a(boolean z10) {
            this.f19568b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f19569c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f19570d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f19571e = str;
            return this;
        }

        public b a(String str) {
            this.f19572f = str;
            return this;
        }

        public b b(int i) {
            this.f19577l = i;
            return this;
        }

        public b c(int i) {
            this.f19575j = i;
            return this;
        }

        public b d(int i) {
            this.i = i;
            return this;
        }

        public b a(int i) {
            this.f19574h = i;
            return this;
        }

        public b b(boolean z10) {
            this.f19578m = z10;
            return this;
        }

        public b a(Context context) {
            this.f19574h = R.drawable.applovin_ic_disclosure_arrow;
            this.f19577l = AbstractC2124i0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public j2 a() {
            return new j2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f19586a;

        c(int i) {
            this.f19586a = i;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f19586a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f19560f;
    }

    public String c() {
        return this.f19559e;
    }

    public int d() {
        return this.f19562h;
    }

    public int e() {
        return this.f19565l;
    }

    public SpannedString f() {
        return this.f19558d;
    }

    public int g() {
        return this.f19563j;
    }

    public int h() {
        return this.f19561g;
    }

    public int i() {
        return this.f19564k;
    }

    public int j() {
        return this.f19555a.b();
    }

    public SpannedString k() {
        return this.f19557c;
    }

    public int l() {
        return this.i;
    }

    public int m() {
        return this.f19555a.c();
    }

    public boolean o() {
        return this.f19556b;
    }

    public boolean p() {
        return this.f19566m;
    }

    public j2(c cVar) {
        this.f19561g = 0;
        this.f19562h = 0;
        this.i = -16777216;
        this.f19563j = -16777216;
        this.f19564k = 0;
        this.f19565l = 0;
        this.f19555a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private j2(b bVar) {
        this.f19561g = 0;
        this.f19562h = 0;
        this.i = -16777216;
        this.f19563j = -16777216;
        this.f19564k = 0;
        this.f19565l = 0;
        this.f19555a = bVar.f19567a;
        this.f19556b = bVar.f19568b;
        this.f19557c = bVar.f19569c;
        this.f19558d = bVar.f19570d;
        this.f19559e = bVar.f19571e;
        this.f19560f = bVar.f19572f;
        this.f19561g = bVar.f19573g;
        this.f19562h = bVar.f19574h;
        this.i = bVar.i;
        this.f19563j = bVar.f19575j;
        this.f19564k = bVar.f19576k;
        this.f19565l = bVar.f19577l;
        this.f19566m = bVar.f19578m;
    }
}
