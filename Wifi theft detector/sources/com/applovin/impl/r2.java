package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f7421a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f7422b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f7423c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f7424d;

    /* renamed from: e, reason: collision with root package name */
    protected String f7425e;

    /* renamed from: f, reason: collision with root package name */
    protected String f7426f;

    /* renamed from: g, reason: collision with root package name */
    protected int f7427g;

    /* renamed from: h, reason: collision with root package name */
    protected int f7428h;

    /* renamed from: i, reason: collision with root package name */
    protected int f7429i;

    /* renamed from: j, reason: collision with root package name */
    protected int f7430j;

    /* renamed from: k, reason: collision with root package name */
    protected int f7431k;

    /* renamed from: l, reason: collision with root package name */
    protected int f7432l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f7433m;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f7434a;

        /* renamed from: b, reason: collision with root package name */
        boolean f7435b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f7436c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f7437d;

        /* renamed from: e, reason: collision with root package name */
        String f7438e;

        /* renamed from: f, reason: collision with root package name */
        String f7439f;

        /* renamed from: g, reason: collision with root package name */
        int f7440g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f7441h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f7442i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f7443j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f7444k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f7445l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f7446m;

        public b(c cVar) {
            this.f7434a = cVar;
        }

        public b a(boolean z10) {
            this.f7435b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f7436c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f7437d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f7438e = str;
            return this;
        }

        public b a(String str) {
            this.f7439f = str;
            return this;
        }

        public b b(int i10) {
            this.f7445l = i10;
            return this;
        }

        public b c(int i10) {
            this.f7443j = i10;
            return this;
        }

        public b d(int i10) {
            this.f7442i = i10;
            return this;
        }

        public b a(int i10) {
            this.f7441h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f7446m = z10;
            return this;
        }

        public b a(Context context) {
            this.f7441h = R.drawable.applovin_ic_disclosure_arrow;
            this.f7445l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
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
        private final int f7454a;

        c(int i10) {
            this.f7454a = i10;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f7454a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f7426f;
    }

    public String c() {
        return this.f7425e;
    }

    public int d() {
        return this.f7428h;
    }

    public int e() {
        return this.f7432l;
    }

    public SpannedString f() {
        return this.f7424d;
    }

    public int g() {
        return this.f7430j;
    }

    public int h() {
        return this.f7427g;
    }

    public int i() {
        return this.f7431k;
    }

    public int j() {
        return this.f7421a.b();
    }

    public SpannedString k() {
        return this.f7423c;
    }

    public int l() {
        return this.f7429i;
    }

    public int m() {
        return this.f7421a.c();
    }

    public boolean o() {
        return this.f7422b;
    }

    public boolean p() {
        return this.f7433m;
    }

    public r2(c cVar) {
        this.f7427g = 0;
        this.f7428h = 0;
        this.f7429i = -16777216;
        this.f7430j = -16777216;
        this.f7431k = 0;
        this.f7432l = 0;
        this.f7421a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private r2(b bVar) {
        this.f7427g = 0;
        this.f7428h = 0;
        this.f7429i = -16777216;
        this.f7430j = -16777216;
        this.f7431k = 0;
        this.f7432l = 0;
        this.f7421a = bVar.f7434a;
        this.f7422b = bVar.f7435b;
        this.f7423c = bVar.f7436c;
        this.f7424d = bVar.f7437d;
        this.f7425e = bVar.f7438e;
        this.f7426f = bVar.f7439f;
        this.f7427g = bVar.f7440g;
        this.f7428h = bVar.f7441h;
        this.f7429i = bVar.f7442i;
        this.f7430j = bVar.f7443j;
        this.f7431k = bVar.f7444k;
        this.f7432l = bVar.f7445l;
        this.f7433m = bVar.f7446m;
    }
}
