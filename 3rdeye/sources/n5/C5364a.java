package n5;

import c5.C2065a;
import java.io.IOException;
import o5.C5422a;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5364a implements Z4.d<C5422a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5364a f44316a = new C5364a();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f44317b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f44318c;

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f44319d;

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f44320e;

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f44321f;

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f44322g;

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f44323h;
    public static final Z4.c i;

    /* renamed from: j, reason: collision with root package name */
    public static final Z4.c f44324j;

    /* renamed from: k, reason: collision with root package name */
    public static final Z4.c f44325k;

    /* renamed from: l, reason: collision with root package name */
    public static final Z4.c f44326l;

    /* renamed from: m, reason: collision with root package name */
    public static final Z4.c f44327m;

    /* renamed from: n, reason: collision with root package name */
    public static final Z4.c f44328n;

    /* renamed from: o, reason: collision with root package name */
    public static final Z4.c f44329o;

    /* renamed from: p, reason: collision with root package name */
    public static final Z4.c f44330p;

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f44317b = new Z4.c("projectNumber", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f44318c = new Z4.c("messageId", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB2.a())));
        C2065a c2065aB3 = C2065a.b();
        c2065aB3.f18486a = 3;
        f44319d = new Z4.c("instanceId", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB3.a())));
        C2065a c2065aB4 = C2065a.b();
        c2065aB4.f18486a = 4;
        f44320e = new Z4.c("messageType", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB4.a())));
        C2065a c2065aB5 = C2065a.b();
        c2065aB5.f18486a = 5;
        f44321f = new Z4.c("sdkPlatform", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB5.a())));
        C2065a c2065aB6 = C2065a.b();
        c2065aB6.f18486a = 6;
        f44322g = new Z4.c("packageName", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB6.a())));
        C2065a c2065aB7 = C2065a.b();
        c2065aB7.f18486a = 7;
        f44323h = new Z4.c("collapseKey", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB7.a())));
        C2065a c2065aB8 = C2065a.b();
        c2065aB8.f18486a = 8;
        i = new Z4.c("priority", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB8.a())));
        C2065a c2065aB9 = C2065a.b();
        c2065aB9.f18486a = 9;
        f44324j = new Z4.c("ttl", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB9.a())));
        C2065a c2065aB10 = C2065a.b();
        c2065aB10.f18486a = 10;
        f44325k = new Z4.c("topic", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB10.a())));
        C2065a c2065aB11 = C2065a.b();
        c2065aB11.f18486a = 11;
        f44326l = new Z4.c("bulkId", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB11.a())));
        C2065a c2065aB12 = C2065a.b();
        c2065aB12.f18486a = 12;
        f44327m = new Z4.c("event", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB12.a())));
        C2065a c2065aB13 = C2065a.b();
        c2065aB13.f18486a = 13;
        f44328n = new Z4.c("analyticsLabel", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB13.a())));
        C2065a c2065aB14 = C2065a.b();
        c2065aB14.f18486a = 14;
        f44329o = new Z4.c("campaignId", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB14.a())));
        C2065a c2065aB15 = C2065a.b();
        c2065aB15.f18486a = 15;
        f44330p = new Z4.c("composerLabel", androidx.work.s.k(com.google.android.gms.measurement.internal.a.h(c5.d.class, c2065aB15.a())));
    }

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C5422a c5422a = (C5422a) obj;
        Z4.e eVar2 = eVar;
        eVar2.b(f44317b, c5422a.f44833a);
        eVar2.a(f44318c, c5422a.f44834b);
        eVar2.a(f44319d, c5422a.f44835c);
        eVar2.a(f44320e, c5422a.f44836d);
        eVar2.a(f44321f, c5422a.f44837e);
        eVar2.a(f44322g, c5422a.f44838f);
        eVar2.a(f44323h, c5422a.f44839g);
        eVar2.c(i, 0);
        eVar2.c(f44324j, c5422a.f44840h);
        eVar2.a(f44325k, c5422a.i);
        eVar2.b(f44326l, 0L);
        eVar2.a(f44327m, c5422a.f44841j);
        eVar2.a(f44328n, c5422a.f44842k);
        eVar2.b(f44329o, 0L);
        eVar2.a(f44330p, c5422a.f44843l);
    }
}
