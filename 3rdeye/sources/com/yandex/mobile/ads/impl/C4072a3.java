package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c82;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4072a3 {

    /* renamed from: a, reason: collision with root package name */
    private final ns f24396a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f24397b;

    /* renamed from: c, reason: collision with root package name */
    private final oq f24398c;

    /* renamed from: d, reason: collision with root package name */
    private final o9 f24399d;

    /* renamed from: e, reason: collision with root package name */
    private final wy1 f24400e;

    /* renamed from: f, reason: collision with root package name */
    private h7 f24401f;

    /* renamed from: g, reason: collision with root package name */
    private u91 f24402g;

    /* renamed from: h, reason: collision with root package name */
    private r91 f24403h;
    private c82.a i;

    /* renamed from: j, reason: collision with root package name */
    private String f24404j;

    /* renamed from: k, reason: collision with root package name */
    private String f24405k;

    /* renamed from: l, reason: collision with root package name */
    private String f24406l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f24407m;

    /* renamed from: n, reason: collision with root package name */
    private zy0 f24408n;

    /* renamed from: o, reason: collision with root package name */
    private String f24409o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24410p;

    /* renamed from: q, reason: collision with root package name */
    private int f24411q;

    /* renamed from: r, reason: collision with root package name */
    private int f24412r;

    public /* synthetic */ C4072a3(ns nsVar, vu1 vu1Var) {
        this(nsVar, vu1Var, new oq(), new o9(), new wy1());
    }

    public final h7 a() {
        return this.f24401f;
    }

    public final ns b() {
        return this.f24396a;
    }

    public final String c() {
        return this.f24399d.a();
    }

    public final Integer d() {
        return this.f24407m;
    }

    public final cc e() {
        return this.f24398c.a();
    }

    public final String f() {
        return this.f24404j;
    }

    public final oq g() {
        return this.f24398c;
    }

    public final int h() {
        return this.f24412r;
    }

    public final zy0 i() {
        return this.f24408n;
    }

    public final String j() {
        return this.f24409o;
    }

    public final j50 k() {
        return this.f24398c.b();
    }

    public final String l() {
        return this.f24405k;
    }

    public final List<String> m() {
        return this.f24398c.c();
    }

    public final String n() {
        return this.f24406l;
    }

    public final int o() {
        return this.f24411q;
    }

    public final r91 p() {
        return this.f24403h;
    }

    public final vu1 q() {
        return this.f24397b;
    }

    public final vy1 r() {
        return this.f24400e.a();
    }

    public final u91 s() {
        return this.f24402g;
    }

    public final c82.a t() {
        return this.i;
    }

    public final boolean u() {
        return this.f24410p;
    }

    public final void a(h7 h7Var) {
        this.f24401f = h7Var;
    }

    public final void b(String str) {
        this.f24404j = str;
    }

    public final void c(String str) {
        this.f24409o = str;
    }

    public final void d(String str) {
        this.f24405k = str;
    }

    public final void e(String str) {
        this.f24406l = str;
    }

    public final void a(String str) {
        this.f24399d.a(str);
    }

    public final void a(Integer num) {
        this.f24407m = num;
    }

    public C4072a3(ns adType, vu1 sdkEnvironmentModule, oq commonAdRequestConfiguration, o9 adUnitIdConfigurator, wy1 sizeInfoConfigurator) {
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(commonAdRequestConfiguration, "commonAdRequestConfiguration");
        kotlin.jvm.internal.l.f(adUnitIdConfigurator, "adUnitIdConfigurator");
        kotlin.jvm.internal.l.f(sizeInfoConfigurator, "sizeInfoConfigurator");
        this.f24396a = adType;
        this.f24397b = sdkEnvironmentModule;
        this.f24398c = commonAdRequestConfiguration;
        this.f24399d = adUnitIdConfigurator;
        this.f24400e = sizeInfoConfigurator;
        this.f24410p = true;
        this.f24412r = lh0.f29998b;
    }

    public final void a(cc configuration) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        this.f24398c.a(configuration);
    }

    public final void a(zy0 zy0Var) {
        this.f24408n = zy0Var;
    }

    public final void a(j50 configuration) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        this.f24398c.a(configuration);
    }

    public final void a(int i) {
        this.f24411q = i;
    }

    public final void a(r91 r91Var) {
        this.f24403h = r91Var;
    }

    public final void a(boolean z10) {
        this.f24410p = z10;
    }

    public final void a(vy1 vy1Var) {
        this.f24400e.a(vy1Var);
    }

    public final void a(u91 u91Var) {
        this.f24402g = u91Var;
    }

    public final void a(c82.a aVar) {
        this.i = aVar;
    }
}
