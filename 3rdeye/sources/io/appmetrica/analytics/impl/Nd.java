package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public abstract class Nd implements Yn, InterfaceC4834o2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39897b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4804mo f39898c;

    /* renamed from: d, reason: collision with root package name */
    public final W2 f39899d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f39900e = PublicLogger.getAnonymousInstance();

    public Nd(int i, String str, InterfaceC4804mo interfaceC4804mo, W2 w22) {
        this.f39897b = i;
        this.f39896a = str;
        this.f39898c = interfaceC4804mo;
        this.f39899d = w22;
    }

    public final Zn a() {
        Zn zn = new Zn();
        zn.f40497b = this.f39897b;
        zn.f40496a = this.f39896a.getBytes();
        zn.f40499d = new C4520bo();
        zn.f40498c = new C4494ao();
        return zn;
    }

    @Override // io.appmetrica.analytics.impl.Yn
    public abstract /* synthetic */ void a(Xn xn);

    public final W2 b() {
        return this.f39899d;
    }

    public final String c() {
        return this.f39896a;
    }

    public final InterfaceC4804mo d() {
        return this.f39898c;
    }

    public final int e() {
        return this.f39897b;
    }

    public final boolean f() {
        C4752ko c4752koA = this.f39898c.a(this.f39896a);
        if (c4752koA.f41158a) {
            return true;
        }
        this.f39900e.warning("Attribute " + this.f39896a + " of type " + ((String) In.f39651a.get(this.f39897b)) + " is skipped because " + c4752koA.f41159b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.f39900e = publicLogger;
    }
}
