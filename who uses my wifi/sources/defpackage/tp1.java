package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tp1 implements gq1 {
    public static final /* synthetic */ tp1 b;
    public static final /* synthetic */ tp1 c;
    public static final /* synthetic */ tp1 d;
    public static final /* synthetic */ tp1 e;
    public static final /* synthetic */ tp1 f;
    public static final /* synthetic */ tp1 g;
    public static final /* synthetic */ tp1 h;
    public static final /* synthetic */ tp1 i;
    public static final /* synthetic */ tp1 j;
    public static final /* synthetic */ tp1 k;
    public static final /* synthetic */ tp1 l;
    public static final /* synthetic */ tp1 m;
    public static final /* synthetic */ tp1 n;
    public static final /* synthetic */ tp1 o;
    public static final /* synthetic */ tp1 p;
    public static final /* synthetic */ tp1 q;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i3 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i4 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i5 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i6 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i7 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i8 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i9 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i10 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i11 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i12 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i13 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        q = new tp1((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        p = new tp1((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        o = new tp1(i13);
        n = new tp1(i4);
        m = new tp1(i5);
        l = new tp1(i6);
        k = new tp1(i3);
        j = new tp1(i7);
        i = new tp1(i8);
        h = new tp1(i9);
        g = new tp1(i2);
        f = new tp1(i10);
        e = new tp1(i11);
        d = new tp1(i12);
        c = new tp1(1);
        b = new tp1(0);
    }

    public /* synthetic */ tp1(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws nq1 {
        ip1 ip1Var;
        oq1 oq1VarB;
        int i2 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.a) {
                                case 0:
                                    return ((iq1) obj).a();
                                case 1:
                                    try {
                                        t3 t3Var = ((iq1) obj).a;
                                        long jM = t3Var.B().m();
                                        oq1 oq1VarB2 = t3Var.B();
                                        List listO = oq1VarB2.o();
                                        if (jM < 0) {
                                            jM += ((ArrayList) listO).size();
                                        }
                                        if (jM >= 0) {
                                            ArrayList arrayList = (ArrayList) listO;
                                            if (jM < arrayList.size()) {
                                                arrayList.remove((int) jM);
                                                t3Var.y(oq1VarB2);
                                                return Optional.empty();
                                            }
                                        }
                                        throw new nq1();
                                    } catch (nq1 unused) {
                                        ip1Var = ip1.O;
                                        break;
                                    }
                                case 2:
                                    iq1 iq1Var = (iq1) obj;
                                    t3 t3Var2 = iq1Var.a;
                                    oq1 oq1VarB3 = t3Var2.B();
                                    vp1 vp1VarN = t3Var2.B().n();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    oq1VarB3.k(byteArrayOutputStream);
                                    iq1Var.a.y(oq1.d(vp1VarN.d(vp1.e(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    iq1 iq1Var2 = (iq1) obj;
                                    t3 t3Var3 = iq1Var2.a;
                                    oq1 oq1VarB4 = t3Var3.B();
                                    vp1 vp1VarN2 = t3Var3.B().n();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    ts0.o(oq1VarB4.m(), new zs1(11, byteArrayOutputStream2), false);
                                    iq1Var2.a.y(oq1.d(vp1VarN2.d(vp1.e(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    iq1 iq1Var3 = (iq1) obj;
                                    r2 r2Var = iq1Var3.c;
                                    t3 t3Var4 = iq1Var3.a;
                                    ((ArrayList) t3Var4.h).set(t3Var4.r(-(iq1Var3.b.l().b + r2Var.k())), t3Var4.B());
                                    return Optional.empty();
                                case 5:
                                    t3 t3Var5 = ((iq1) obj).a;
                                    t3Var5.y(oq1.b(t3Var5.B().m() << ((int) t3Var5.B().m())));
                                    return Optional.empty();
                                case 6:
                                    t3 t3Var6 = ((iq1) obj).a;
                                    t3Var6.y(oq1.b(t3Var6.B().m() >>> ((int) t3Var6.B().m())));
                                    return Optional.empty();
                                case 7:
                                    t3 t3Var7 = ((iq1) obj).a;
                                    t3Var7.y(oq1.c(t3Var7.B().q() - t3Var7.B().q()));
                                    return Optional.empty();
                                case 8:
                                    t3 t3Var8 = ((iq1) obj).a;
                                    t3Var8.y(oq1.b(t3Var8.B().m() - t3Var8.B().m()));
                                    return Optional.empty();
                                case 9:
                                    iq1 iq1Var4 = (iq1) obj;
                                    t3 t3Var9 = iq1Var4.a;
                                    long jM2 = t3Var9.B().m();
                                    oq1 oq1VarB5 = t3Var9.B();
                                    t3 t3Var10 = iq1Var4.a;
                                    oq1 oq1VarC = t3Var10.C(jM2);
                                    ((ArrayList) t3Var10.h).set(t3Var10.r(jM2), oq1VarB5);
                                    t3Var10.y(oq1VarC);
                                    return Optional.empty();
                                case 10:
                                    iq1 iq1Var5 = (iq1) obj;
                                    t3 t3Var11 = iq1Var5.a;
                                    long jM3 = iq1Var5.b.l().b + t3Var11.B().m();
                                    oq1 oq1VarB6 = t3Var11.B();
                                    t3 t3Var12 = iq1Var5.a;
                                    long j2 = -jM3;
                                    oq1 oq1VarC2 = t3Var12.C(j2);
                                    ((ArrayList) t3Var12.h).set(t3Var12.r(j2), oq1VarB6);
                                    t3Var12.y(oq1VarC2);
                                    return Optional.empty();
                                case 11:
                                    iq1 iq1Var6 = (iq1) obj;
                                    r2 r2Var2 = iq1Var6.c;
                                    t3 t3Var13 = iq1Var6.a;
                                    long jK = iq1Var6.b.l().b + r2Var2.k();
                                    oq1 oq1VarB7 = t3Var13.B();
                                    long j3 = -jK;
                                    oq1 oq1VarC3 = t3Var13.C(j3);
                                    ((ArrayList) t3Var13.h).set(t3Var13.r(j3), oq1VarB7);
                                    t3Var13.y(oq1VarC3);
                                    return Optional.empty();
                                case 12:
                                    iq1 iq1Var7 = (iq1) obj;
                                    long jM4 = iq1Var7.a.B().m();
                                    try {
                                        t3 t3Var14 = iq1Var7.a;
                                        if (jM4 == 0) {
                                            oq1VarB = t3Var14.B();
                                        } else {
                                            t3Var14.g--;
                                            oq1VarB = (oq1) ((ArrayList) t3Var14.h).remove(t3Var14.r(jM4));
                                        }
                                        t3Var14.y(oq1VarB);
                                        return Optional.empty();
                                    } catch (eq1 unused2) {
                                        ip1Var = ip1.m;
                                        break;
                                    }
                                case 13:
                                    iq1 iq1Var8 = (iq1) obj;
                                    try {
                                        t3 t3Var15 = iq1Var8.a;
                                        long jM5 = t3Var15.B().m();
                                        long jM6 = t3Var15.B().m();
                                        z71 z71Var = iq1Var8.b;
                                        r2 r2Var3 = iq1Var8.c;
                                        z71Var.j(r2Var3.f(), jM6, z71Var.l().b);
                                        r2Var3.e(jM5);
                                        return Optional.empty();
                                    } catch (cq1 unused3) {
                                        ip1Var = ip1.H;
                                        break;
                                    } catch (dq1 unused4) {
                                        ip1Var = ip1.C;
                                        break;
                                    } catch (yp1 | zp1 unused5) {
                                        ip1Var = ip1.x;
                                        break;
                                    }
                                case 14:
                                    iq1 iq1Var9 = (iq1) obj;
                                    try {
                                        iq1Var9.a.y(oq1.g(iq1Var9.a.B().l()));
                                        return Optional.empty();
                                    } catch (kq1 unused6) {
                                        ip1Var = ip1.v;
                                        break;
                                    }
                                default:
                                    try {
                                        t3 t3Var16 = ((iq1) obj).a;
                                        ArrayList arrayList2 = (ArrayList) t3Var16.B().o();
                                        int size = arrayList2.size();
                                        while (i2 < size) {
                                            Object obj2 = arrayList2.get(i2);
                                            i2++;
                                            t3Var16.y((oq1) obj2);
                                        }
                                        return Optional.empty();
                                    } catch (fq1 unused7) {
                                        ip1Var = ip1.g;
                                        break;
                                    }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
                        } catch (kq1 unused8) {
                            ip1Var = ip1.q;
                        }
                    } catch (eq1 unused9) {
                        ip1Var = ip1.n;
                    }
                } catch (kq1 | xp1 | zp1 unused10) {
                    ip1Var = ip1.E;
                }
            } catch (dq1 | eq1 unused11) {
                ip1Var = ip1.D;
            }
            return Optional.of(ip1Var);
        } catch (fq1 e3) {
            e = e3;
            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
