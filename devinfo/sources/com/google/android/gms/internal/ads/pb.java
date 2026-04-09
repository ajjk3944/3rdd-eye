package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb implements ec {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ pb f14954b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ pb f14955c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pb f14956d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pb f14957e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pb f14958f;
    public static final /* synthetic */ pb g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pb f14959h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pb f14960i;
    public static final /* synthetic */ pb j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ pb f14961k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ pb f14962l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ pb f14963m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ pb f14964n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ pb f14965o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ pb f14966p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ pb f14967q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14968a;

    static {
        int i4 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i10 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i11 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i12 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i13 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i14 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i15 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i16 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i17 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i18 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i19 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i20 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        f14967q = new pb((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        f14966p = new pb((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        f14965o = new pb(i20);
        f14964n = new pb(i11);
        f14963m = new pb(i12);
        f14962l = new pb(i13);
        f14961k = new pb(i10);
        j = new pb(i14);
        f14960i = new pb(i15);
        f14959h = new pb(i16);
        g = new pb(i4);
        f14958f = new pb(i17);
        f14957e = new pb(i18);
        f14956d = new pb(i19);
        f14955c = new pb(1);
        f14954b = new pb(0);
    }

    public /* synthetic */ pb(int i4) {
        this.f14968a = i4;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws kc {
        gb gbVar;
        lc lcVarE;
        int i4 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.f14968a) {
                                case 0:
                                    return ((hc) obj).a();
                                case 1:
                                    try {
                                        dc dcVar = ((hc) obj).f11824a;
                                        long jM = dcVar.e().m();
                                        lc lcVarE2 = dcVar.e();
                                        List listO = lcVarE2.o();
                                        if (jM < 0) {
                                            jM += ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                dcVar.d(lcVarE2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new kc();
                                    } catch (kc unused) {
                                        gbVar = gb.J;
                                        break;
                                    }
                                case 2:
                                    hc hcVar = (hc) obj;
                                    dc dcVar2 = hcVar.f11824a;
                                    lc lcVarE3 = dcVar2.e();
                                    rb rbVarN = dcVar2.e().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    lcVarE3.k(byteArrayOutputStream);
                                    hcVar.f11824a.d(lc.d(rbVarN.d(rb.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    hc hcVar2 = (hc) obj;
                                    dc dcVar3 = hcVar2.f11824a;
                                    lc lcVarE4 = dcVar3.e();
                                    rb rbVarN2 = dcVar3.e().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    w5.x(lcVarE4.m(), new fk0(8, byteArrayOutputStream2), false);
                                    hcVar2.f11824a.d(lc.d(rbVarN2.d(rb.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    hc hcVar3 = (hc) obj;
                                    wb wbVar = hcVar3.f11826c;
                                    dc dcVar4 = hcVar3.f11824a;
                                    dcVar4.f10425b.set(dcVar4.c(-(hcVar3.f11825b.u().f18694b + wbVar.i())), dcVar4.e());
                                    return Optional.empty();
                                case 5:
                                    dc dcVar5 = ((hc) obj).f11824a;
                                    dcVar5.d(lc.b(dcVar5.e().m() << ((int) dcVar5.e().m())));
                                    return Optional.empty();
                                case 6:
                                    dc dcVar6 = ((hc) obj).f11824a;
                                    dcVar6.d(lc.b(dcVar6.e().m() >>> ((int) dcVar6.e().m())));
                                    return Optional.empty();
                                case 7:
                                    dc dcVar7 = ((hc) obj).f11824a;
                                    dcVar7.d(lc.c(dcVar7.e().q() - dcVar7.e().q()));
                                    return Optional.empty();
                                case 8:
                                    dc dcVar8 = ((hc) obj).f11824a;
                                    dcVar8.d(lc.b(dcVar8.e().m() - dcVar8.e().m()));
                                    return Optional.empty();
                                case 9:
                                    hc hcVar4 = (hc) obj;
                                    dc dcVar9 = hcVar4.f11824a;
                                    long jM2 = dcVar9.e().m();
                                    lc lcVarE5 = dcVar9.e();
                                    dc dcVar10 = hcVar4.f11824a;
                                    lc lcVarF = dcVar10.f(jM2);
                                    dcVar10.f10425b.set(dcVar10.c(jM2), lcVarE5);
                                    dcVar10.d(lcVarF);
                                    return Optional.empty();
                                case 10:
                                    hc hcVar5 = (hc) obj;
                                    dc dcVar11 = hcVar5.f11824a;
                                    long jM3 = hcVar5.f11825b.u().f18694b + dcVar11.e().m();
                                    lc lcVarE6 = dcVar11.e();
                                    dc dcVar12 = hcVar5.f11824a;
                                    long j8 = -jM3;
                                    lc lcVarF2 = dcVar12.f(j8);
                                    dcVar12.f10425b.set(dcVar12.c(j8), lcVarE6);
                                    dcVar12.d(lcVarF2);
                                    return Optional.empty();
                                case 11:
                                    hc hcVar6 = (hc) obj;
                                    wb wbVar2 = hcVar6.f11826c;
                                    dc dcVar13 = hcVar6.f11824a;
                                    long jI = hcVar6.f11825b.u().f18694b + wbVar2.i();
                                    lc lcVarE7 = dcVar13.e();
                                    long j9 = -jI;
                                    lc lcVarF3 = dcVar13.f(j9);
                                    dcVar13.f10425b.set(dcVar13.c(j9), lcVarE7);
                                    dcVar13.d(lcVarF3);
                                    return Optional.empty();
                                case 12:
                                    hc hcVar7 = (hc) obj;
                                    long jM4 = hcVar7.f11824a.e().m();
                                    try {
                                        dc dcVar14 = hcVar7.f11824a;
                                        if (jM4 == 0) {
                                            lcVarE = dcVar14.e();
                                        } else {
                                            dcVar14.f10424a--;
                                            lcVarE = (lc) dcVar14.f10425b.remove(dcVar14.c(jM4));
                                        }
                                        dcVar14.d(lcVarE);
                                        return Optional.empty();
                                    } catch (bc unused2) {
                                        gbVar = gb.f11456h;
                                        break;
                                    }
                                case 13:
                                    hc hcVar8 = (hc) obj;
                                    try {
                                        dc dcVar15 = hcVar8.f11824a;
                                        long jM5 = dcVar15.e().m();
                                        long jM6 = dcVar15.e().m();
                                        mx0 mx0Var = hcVar8.f11825b;
                                        wb wbVar3 = hcVar8.f11826c;
                                        mx0Var.p(wbVar3.d(), jM6, mx0Var.u().f18694b);
                                        wbVar3.b(jM5);
                                        return Optional.empty();
                                    } catch (ac unused3) {
                                        gbVar = gb.f11471x;
                                        break;
                                    } catch (ub | vb unused4) {
                                        gbVar = gb.f11466s;
                                        break;
                                    } catch (zb unused5) {
                                        gbVar = gb.C;
                                        break;
                                    }
                                case 14:
                                    hc hcVar9 = (hc) obj;
                                    try {
                                        hcVar9.f11824a.d(lc.g(hcVar9.f11824a.e().l()));
                                        return Optional.empty();
                                    } catch (jc unused6) {
                                        gbVar = gb.f11464q;
                                        break;
                                    }
                                default:
                                    try {
                                        dc dcVar16 = ((hc) obj).f11824a;
                                        ArrayList arrayList2 = (ArrayList) dcVar16.e().o();
                                        int size = arrayList2.size();
                                        while (i4 < size) {
                                            Object obj2 = arrayList2.get(i4);
                                            i4++;
                                            dcVar16.d((lc) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (cc unused7) {
                                        gbVar = gb.f11451b;
                                        break;
                                    }
                            }
                        } catch (jc unused8) {
                            gbVar = gb.f11459l;
                        } catch (IOException e2) {
                            e = e2;
                            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (cc e10) {
                        e = e10;
                        throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
                    }
                } catch (ac | bc unused9) {
                    gbVar = gb.f11472y;
                }
            } catch (jc | tb | vb unused10) {
                gbVar = gb.f11473z;
            }
        } catch (bc unused11) {
            gbVar = gb.f11457i;
        }
        return Optional.of(gbVar);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
