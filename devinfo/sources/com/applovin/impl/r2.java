package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f5188a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f5189b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f5190c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f5191d;

    /* renamed from: e, reason: collision with root package name */
    protected String f5192e;

    /* renamed from: f, reason: collision with root package name */
    protected String f5193f;
    protected int g;

    /* renamed from: h, reason: collision with root package name */
    protected int f5194h;

    /* renamed from: i, reason: collision with root package name */
    protected int f5195i;
    protected int j;

    /* renamed from: k, reason: collision with root package name */
    protected int f5196k;

    /* renamed from: l, reason: collision with root package name */
    protected int f5197l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f5198m;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f5199a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5200b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f5201c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f5202d;

        /* renamed from: e, reason: collision with root package name */
        String f5203e;

        /* renamed from: f, reason: collision with root package name */
        String f5204f;
        int g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f5205h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f5206i = -16777216;
        int j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f5207k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f5208l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f5209m;

        public b(c cVar) {
            this.f5199a = cVar;
        }

        public b a(boolean z3) {
            this.f5200b = z3;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f5201c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f5202d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f5203e = str;
            return this;
        }

        public b a(String str) {
            this.f5204f = str;
            return this;
        }

        public b b(int i4) {
            this.f5208l = i4;
            return this;
        }

        public b c(int i4) {
            this.j = i4;
            return this;
        }

        public b d(int i4) {
            this.f5206i = i4;
            return this;
        }

        public b a(int i4) {
            this.f5205h = i4;
            return this;
        }

        public b b(boolean z3) {
            this.f5209m = z3;
            return this;
        }

        public b a(Context context) {
            this.f5205h = R.drawable.applovin_ic_disclosure_arrow;
            this.f5208l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f5216a;

        c(int i4) {
            this.f5216a = i4;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f5216a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f5193f;
    }

    public String c() {
        return this.f5192e;
    }

    public int d() {
        return this.f5194h;
    }

    public int e() {
        return this.f5197l;
    }

    public SpannedString f() {
        return this.f5191d;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.f5196k;
    }

    public int j() {
        return this.f5188a.b();
    }

    public SpannedString k() {
        return this.f5190c;
    }

    public int l() {
        return this.f5195i;
    }

    public int m() {
        return this.f5188a.c();
    }

    public boolean o() {
        return this.f5189b;
    }

    public boolean p() {
        return this.f5198m;
    }

    public r2(c cVar) {
        this.g = 0;
        this.f5194h = 0;
        this.f5195i = -16777216;
        this.j = -16777216;
        this.f5196k = 0;
        this.f5197l = 0;
        this.f5188a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private r2(b bVar) {
        this.g = 0;
        this.f5194h = 0;
        this.f5195i = -16777216;
        this.j = -16777216;
        this.f5196k = 0;
        this.f5197l = 0;
        this.f5188a = bVar.f5199a;
        this.f5189b = bVar.f5200b;
        this.f5190c = bVar.f5201c;
        this.f5191d = bVar.f5202d;
        this.f5192e = bVar.f5203e;
        this.f5193f = bVar.f5204f;
        this.g = bVar.g;
        this.f5194h = bVar.f5205h;
        this.f5195i = bVar.f5206i;
        this.j = bVar.j;
        this.f5196k = bVar.f5207k;
        this.f5197l = bVar.f5208l;
        this.f5198m = bVar.f5209m;
    }
}
