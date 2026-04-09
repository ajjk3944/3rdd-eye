package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1350j5 implements InterfaceC2105x5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14892b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14893c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14894d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14895e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14896f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14897g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14898h;
    public static final /* synthetic */ C1350j5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14899j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14900k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14901l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14902m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14903n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14904o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14905p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1350j5 f14906q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14907a;

    static {
        int i3 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i6 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i7 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i8 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i9 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i10 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i11 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i12 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i13 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i14 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i15 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i16 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f14906q = new C1350j5((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f14905p = new C1350j5((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f14904o = new C1350j5(i16);
        f14903n = new C1350j5(i7);
        f14902m = new C1350j5(i8);
        f14901l = new C1350j5(i9);
        f14900k = new C1350j5(i6);
        f14899j = new C1350j5(i10);
        i = new C1350j5(i11);
        f14898h = new C1350j5(i12);
        f14897g = new C1350j5(i3);
        f14896f = new C1350j5(i13);
        f14895e = new C1350j5(i14);
        f14894d = new C1350j5(i15);
        f14893c = new C1350j5(1);
        f14892b = new C1350j5(0);
    }

    public /* synthetic */ C1350j5(int i3) {
        this.f14907a = i3;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws D5 {
        EnumC0862a5 enumC0862a5;
        E5 e5V;
        int i3 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f14907a) {
                                case 0:
                                    return ((A5) obj).a();
                                case 1:
                                    try {
                                        L2.w wVar = ((A5) obj).f6931a;
                                        long jM = wVar.v().m();
                                        E5 e5V2 = wVar.v();
                                        List listO = e5V2.o();
                                        if (jM < 0) {
                                            jM += ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                wVar.r(e5V2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new D5();
                                    } catch (D5 unused) {
                                        enumC0862a5 = EnumC0862a5.f13053X;
                                        break;
                                    }
                                case 2:
                                    A5 a52 = (A5) obj;
                                    L2.w wVar2 = a52.f6931a;
                                    E5 e5V3 = wVar2.v();
                                    C1458l5 c1458l5N = wVar2.v().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    e5V3.k(byteArrayOutputStream);
                                    a52.f6931a.r(E5.d(c1458l5N.d(C1458l5.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    A5 a53 = (A5) obj;
                                    L2.w wVar3 = a53.f6931a;
                                    E5 e5V4 = wVar3.v();
                                    C1458l5 c1458l5N2 = wVar3.v().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    C1994v2.w(e5V4.m(), new Rx(5, byteArrayOutputStream2), false);
                                    a53.f6931a.r(E5.d(c1458l5N2.d(C1458l5.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    A5 a54 = (A5) obj;
                                    C1728q5 c1728q5 = a54.f6933c;
                                    L2.w wVar4 = a54.f6931a;
                                    ((ArrayList) wVar4.f2570c).set(wVar4.k(-(a54.f6932b.A().f16680b + c1728q5.h())), wVar4.v());
                                    return Optional.empty();
                                case 5:
                                    L2.w wVar5 = ((A5) obj).f6931a;
                                    wVar5.r(E5.b(wVar5.v().m() << ((int) wVar5.v().m())));
                                    return Optional.empty();
                                case 6:
                                    L2.w wVar6 = ((A5) obj).f6931a;
                                    wVar6.r(E5.b(wVar6.v().m() >>> ((int) wVar6.v().m())));
                                    return Optional.empty();
                                case 7:
                                    L2.w wVar7 = ((A5) obj).f6931a;
                                    wVar7.r(E5.c(wVar7.v().q() - wVar7.v().q()));
                                    return Optional.empty();
                                case 8:
                                    L2.w wVar8 = ((A5) obj).f6931a;
                                    wVar8.r(E5.b(wVar8.v().m() - wVar8.v().m()));
                                    return Optional.empty();
                                case 9:
                                    A5 a55 = (A5) obj;
                                    L2.w wVar9 = a55.f6931a;
                                    long jM2 = wVar9.v().m();
                                    E5 e5V5 = wVar9.v();
                                    L2.w wVar10 = a55.f6931a;
                                    E5 e5W = wVar10.w(jM2);
                                    ((ArrayList) wVar10.f2570c).set(wVar10.k(jM2), e5V5);
                                    wVar10.r(e5W);
                                    return Optional.empty();
                                case 10:
                                    A5 a56 = (A5) obj;
                                    L2.w wVar11 = a56.f6931a;
                                    long jM3 = a56.f6932b.A().f16680b + wVar11.v().m();
                                    E5 e5V6 = wVar11.v();
                                    L2.w wVar12 = a56.f6931a;
                                    long j6 = -jM3;
                                    E5 e5W2 = wVar12.w(j6);
                                    ((ArrayList) wVar12.f2570c).set(wVar12.k(j6), e5V6);
                                    wVar12.r(e5W2);
                                    return Optional.empty();
                                case 11:
                                    A5 a57 = (A5) obj;
                                    C1728q5 c1728q52 = a57.f6933c;
                                    L2.w wVar13 = a57.f6931a;
                                    long jH = a57.f6932b.A().f16680b + c1728q52.h();
                                    E5 e5V7 = wVar13.v();
                                    long j7 = -jH;
                                    E5 e5W3 = wVar13.w(j7);
                                    ((ArrayList) wVar13.f2570c).set(wVar13.k(j7), e5V7);
                                    wVar13.r(e5W3);
                                    return Optional.empty();
                                case 12:
                                    A5 a58 = (A5) obj;
                                    long jM4 = a58.f6931a.v().m();
                                    try {
                                        L2.w wVar14 = a58.f6931a;
                                        if (jM4 == 0) {
                                            e5V = wVar14.v();
                                        } else {
                                            wVar14.f2569b--;
                                            e5V = (E5) ((ArrayList) wVar14.f2570c).remove(wVar14.k(jM4));
                                        }
                                        wVar14.r(e5V);
                                        return Optional.empty();
                                    } catch (C1997v5 unused2) {
                                        enumC0862a5 = EnumC0862a5.f13062h;
                                        break;
                                    }
                                case 13:
                                    A5 a59 = (A5) obj;
                                    try {
                                        L2.w wVar15 = a59.f6931a;
                                        long jM5 = wVar15.v().m();
                                        long jM6 = wVar15.v().m();
                                        Nx nx = a59.f6932b;
                                        C1728q5 c1728q53 = a59.f6933c;
                                        nx.y(c1728q53.d(), jM6, nx.A().f16680b);
                                        c1728q53.c(jM5);
                                        return Optional.empty();
                                    } catch (C1620o5 | C1674p5 unused3) {
                                        enumC0862a5 = EnumC0862a5.f13037G;
                                        break;
                                    } catch (C1889t5 unused4) {
                                        enumC0862a5 = EnumC0862a5.f13046Q;
                                        break;
                                    } catch (C1943u5 unused5) {
                                        enumC0862a5 = EnumC0862a5.f13042L;
                                        break;
                                    }
                                case 14:
                                    A5 a510 = (A5) obj;
                                    try {
                                        a510.f6931a.r(E5.g(a510.f6931a.v().l()));
                                        return Optional.empty();
                                    } catch (C5 unused6) {
                                        enumC0862a5 = EnumC0862a5.f13035E;
                                        break;
                                    }
                                default:
                                    try {
                                        L2.w wVar16 = ((A5) obj).f6931a;
                                        ArrayList arrayList2 = (ArrayList) wVar16.v().o();
                                        int size = arrayList2.size();
                                        while (i3 < size) {
                                            Object obj2 = arrayList2.get(i3);
                                            i3++;
                                            wVar16.r((E5) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (C2051w5 unused7) {
                                        enumC0862a5 = EnumC0862a5.f13056b;
                                        break;
                                    }
                            }
                        } catch (C5 unused8) {
                            enumC0862a5 = EnumC0862a5.f13065l;
                        } catch (IOException e6) {
                            e = e6;
                            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (C1943u5 | C1997v5 unused9) {
                        enumC0862a5 = EnumC0862a5.M;
                    }
                } catch (C1997v5 unused10) {
                    enumC0862a5 = EnumC0862a5.i;
                }
            } catch (C2051w5 e7) {
                e = e7;
                throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (C5 | C1566n5 | C1674p5 unused11) {
            enumC0862a5 = EnumC0862a5.f13043N;
        }
        return Optional.of(enumC0862a5);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
