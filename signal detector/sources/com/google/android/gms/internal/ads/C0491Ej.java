package com.google.android.gms.internal.ads;

import android.content.Context;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.Ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491Ej implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7986a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f7987b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f7988c;

    /* renamed from: d, reason: collision with root package name */
    public final C1113ek f7989d;

    public /* synthetic */ C0491Ej(C1113ek c1113ek, C1799rN c1799rN, InterfaceC2069wN interfaceC2069wN, int i) {
        this.f7986a = i;
        this.f7989d = c1113ek;
        this.f7987b = c1799rN;
        this.f7988c = interfaceC2069wN;
    }

    public Jr a() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Jr(c0623Mf, (C0597Kn) this.f7987b.c(), this.f7989d.a(), (String) this.f7988c.c(), 3);
    }

    public Nr b() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        C0960bu c0960buA = this.f7989d.a();
        return new Nr(c0623Mf, c0960buA, ((Integer) this.f7988c.c()).intValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        String string;
        switch (this.f7986a) {
            case 0:
                Q2.a aVar = (Q2.a) this.f7987b.c();
                C0572Jf c0572JfC = ((C0659Oh) this.f7988c).c();
                String str = this.f7989d.a().f13485g;
                C0889ae c0889ae = c0572JfC.f9321c;
                synchronized (c0889ae) {
                    string = ((BigInteger) c0889ae.f13150b).toString();
                    c0889ae.f13150b = ((BigInteger) c0889ae.f13150b).add(BigInteger.ONE);
                    c0889ae.f13151c = string;
                }
                return new C0470Df(aVar, c0572JfC, string, str);
            case 1:
                return new C0678Pj((Context) this.f7987b.c(), ((C0642Nh) this.f7988c).a(), this.f7989d.a(), 0);
            case 2:
                return new C0445Bo((C0581Jo) this.f7987b.c(), this.f7989d.a(), (String) this.f7988c.c());
            case 3:
                return new Lr((Q2.a) this.f7987b.c(), this.f7989d.a(), ((Long) this.f7988c.c()).longValue());
            case 4:
                return b();
            case 5:
                return a();
            case 6:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Jr((Object) c0623Mf, this.f7989d.a(), this.f7987b.c(), (Object) ((C0489Eh) this.f7988c).c(), 5);
            default:
                return d();
        }
    }

    public Jr d() {
        Context contextA = ((C0540Hh) this.f7987b).a();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Jr(contextA, c0623Mf, this.f7989d.a(), ((C0642Nh) this.f7988c).a());
    }

    public /* synthetic */ C0491Ej(InterfaceC2069wN interfaceC2069wN, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN2, int i) {
        this.f7986a = i;
        this.f7987b = interfaceC2069wN;
        this.f7989d = c1113ek;
        this.f7988c = interfaceC2069wN2;
    }

    public /* synthetic */ C0491Ej(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, C1113ek c1113ek, int i) {
        this.f7986a = i;
        this.f7987b = interfaceC2069wN;
        this.f7988c = interfaceC2069wN2;
        this.f7989d = c1113ek;
    }
}
