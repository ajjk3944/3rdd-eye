package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class rp1 implements gq1 {
    public static final /* synthetic */ rp1 b;
    public static final /* synthetic */ rp1 c;
    public static final /* synthetic */ rp1 d;
    public static final /* synthetic */ rp1 e;
    public static final /* synthetic */ rp1 f;
    public static final /* synthetic */ rp1 g;
    public static final /* synthetic */ rp1 h;
    public static final /* synthetic */ rp1 i;
    public static final /* synthetic */ rp1 j;
    public static final /* synthetic */ rp1 k;
    public static final /* synthetic */ rp1 l;
    public static final /* synthetic */ rp1 m;
    public static final /* synthetic */ rp1 n;
    public static final /* synthetic */ rp1 o;
    public static final /* synthetic */ rp1 p;
    public static final /* synthetic */ rp1 q;
    public static final /* synthetic */ rp1 r;
    public static final /* synthetic */ rp1 s;
    public static final /* synthetic */ rp1 t;
    public static final /* synthetic */ rp1 u;
    public static final /* synthetic */ rp1 v;
    public final /* synthetic */ int a;

    static {
        int i2 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i3 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i4 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i5 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i6 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i7 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i8 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        v = new rp1((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        u = new rp1((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        t = new rp1((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        s = new rp1(i8);
        r = new rp1(i5);
        q = new rp1(i6);
        rp1 rp1Var = new rp1(i7);
        int i9 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i10 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i11 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i12 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i13 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i14 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i15 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i16 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i17 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        p = rp1Var;
        o = new rp1(i4);
        n = new rp1(i9);
        m = new rp1(i10);
        l = new rp1(i11);
        k = new rp1(i3);
        j = new rp1(i12);
        i = new rp1(i13);
        h = new rp1(i14);
        g = new rp1(i2);
        f = new rp1(i15);
        e = new rp1(i16);
        d = new rp1(i17);
        c = new rp1(1);
        b = new rp1(0);
    }

    public /* synthetic */ rp1(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws nq1 {
        ip1 ip1Var;
        long j2 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.a) {
                                            case 0:
                                                iq1 iq1Var = (iq1) obj;
                                                t3 t3Var = iq1Var.a;
                                                long jM = t3Var.B().m();
                                                if (t3Var.B().m() != 0) {
                                                    iq1Var.c.e(jM);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    t3 t3Var2 = ((iq1) obj).a;
                                                    long jM2 = t3Var2.B().m();
                                                    oq1 oq1VarB = t3Var2.B();
                                                    oq1 oq1VarB2 = t3Var2.B();
                                                    List listO = oq1VarB2.o();
                                                    if (jM2 < 0) {
                                                        jM2 += ((ArrayList) listO).size() + 1;
                                                    }
                                                    if (jM2 >= 0) {
                                                        ArrayList arrayList = (ArrayList) listO;
                                                        if (jM2 < arrayList.size() + 1) {
                                                            arrayList.add((int) jM2, oq1VarB);
                                                            t3Var2.y(oq1VarB2);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new nq1();
                                                } catch (nq1 unused) {
                                                    ip1Var = ip1.O;
                                                    break;
                                                }
                                            case 2:
                                                iq1 iq1Var2 = (iq1) obj;
                                                t3 t3Var3 = iq1Var2.a;
                                                long jM3 = t3Var3.B().m();
                                                if (t3Var3.B().m() == 0) {
                                                    iq1Var2.c.e(jM3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((iq1) obj).a.y(oq1.b(((ArrayList) r12.B().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((iq1) obj).a.y(oq1.b(r12.B().n().a.length));
                                                return Optional.empty();
                                            case 5:
                                                t3 t3Var4 = ((iq1) obj).a;
                                                t3Var4.y(oq1.c(Math.log(t3Var4.B().q())));
                                                return Optional.empty();
                                            case 6:
                                                t3 t3Var5 = ((iq1) obj).a;
                                                long jM4 = t3Var5.B().m();
                                                long jM5 = t3Var5.B().m();
                                                if (jM4 == 0 || jM5 == 0) {
                                                    j2 = 0;
                                                }
                                                t3Var5.y(oq1.b(j2));
                                                return Optional.empty();
                                            case 7:
                                                t3 t3Var6 = ((iq1) obj).a;
                                                if (t3Var6.B().m() != 0) {
                                                    j2 = 0;
                                                }
                                                t3Var6.y(oq1.b(j2));
                                                return Optional.empty();
                                            case 8:
                                                t3 t3Var7 = ((iq1) obj).a;
                                                long jM6 = t3Var7.B().m();
                                                long jM7 = t3Var7.B().m();
                                                if (jM6 == 0 && jM7 == 0) {
                                                    j2 = 0;
                                                }
                                                t3Var7.y(oq1.b(j2));
                                                return Optional.empty();
                                            case 9:
                                                iq1 iq1Var3 = (iq1) obj;
                                                t3 t3Var8 = iq1Var3.a;
                                                try {
                                                    int iCompare = new jq1(false).compare(t3Var8.B(), t3Var8.B());
                                                    t3 t3Var9 = iq1Var3.a;
                                                    if (iCompare >= 0) {
                                                        j2 = 0;
                                                    }
                                                    t3Var9.y(oq1.b(j2));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(ip1.j);
                                                }
                                            case 10:
                                                iq1 iq1Var4 = (iq1) obj;
                                                try {
                                                    t3 t3Var10 = iq1Var4.a;
                                                    long jM8 = t3Var10.B().m();
                                                    t3 t3Var11 = new t3(9, (byte) 0);
                                                    for (int i2 = 0; i2 < t3Var10.g; i2++) {
                                                        try {
                                                            t3Var11.y(oq1.j((oq1) ((ArrayList) t3Var10.h).get(i2)));
                                                        } catch (fq1 e2) {
                                                            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e2);
                                                        }
                                                    }
                                                    r2 r2Var = iq1Var4.c;
                                                    vp1 vp1Var = (vp1) r2Var.h;
                                                    int i3 = r2Var.g;
                                                    mp1 mp1VarMo16h = ((mp1) r2Var.i).mo16h();
                                                    us0 us0Var = (us0) r2Var.j;
                                                    r2 r2Var2 = new r2(vp1Var, i3, mp1VarMo16h);
                                                    r2Var2.j = us0Var;
                                                    new z71(13);
                                                    r2Var2.e(jM8);
                                                    t3Var10.y(oq1.a(new ts0()));
                                                    return Optional.empty();
                                                } catch (yp1 | zp1 unused3) {
                                                    ip1Var = ip1.z;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    t3 t3Var12 = ((iq1) obj).a;
                                                    t3Var12.y(oq1.a(t3Var12.B().i((Class) t3Var12.B().l())));
                                                    return Optional.empty();
                                                } catch (kq1 unused4) {
                                                    ip1Var = ip1.v;
                                                    break;
                                                }
                                            case 12:
                                                t3 t3Var13 = ((iq1) obj).a;
                                                long jM9 = t3Var13.B().m();
                                                long jM10 = t3Var13.B().m();
                                                if (jM9 == 0) {
                                                    return Optional.of(ip1.L);
                                                }
                                                t3Var13.y(oq1.b(jM10 % jM9));
                                                return Optional.empty();
                                            case 13:
                                                t3 t3Var14 = ((iq1) obj).a;
                                                t3Var14.y(oq1.c(t3Var14.B().q() * t3Var14.B().q()));
                                                return Optional.empty();
                                            case 14:
                                                t3 t3Var15 = ((iq1) obj).a;
                                                t3Var15.y(oq1.b(t3Var15.B().m() * t3Var15.B().m()));
                                                return Optional.empty();
                                            case 15:
                                                t3 t3Var16 = ((iq1) obj).a;
                                                long jM11 = t3Var16.B().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j3 = 0; j3 < jM11; j3++) {
                                                    arrayList2.add(t3Var16.B());
                                                }
                                                Collections.reverse(arrayList2);
                                                t3Var16.y(oq1.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                t3 t3Var17 = ((iq1) obj).a;
                                                t3Var17.y(oq1.c(Math.pow(t3Var17.B().q(), t3Var17.B().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((iq1) obj).a.y(oq1.a(null));
                                                return Optional.empty();
                                            case 18:
                                                iq1 iq1Var5 = (iq1) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(iq1Var5.c.l(64L).a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                iq1Var5.a.y(oq1.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                iq1 iq1Var6 = (iq1) obj;
                                                iq1Var6.a.y(oq1.b(iq1Var6.c.k()));
                                                return Optional.empty();
                                            default:
                                                iq1 iq1Var7 = (iq1) obj;
                                                r2 r2Var3 = iq1Var7.c;
                                                long jK = r2Var3.k();
                                                if (jK >= 0 && jK <= 2147483647L) {
                                                    if ((7 & jK) != 0) {
                                                        return Optional.of(ip1.k);
                                                    }
                                                    iq1Var7.a.y(oq1.d(r2Var3.l(jK)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(ip1.F);
                                        }
                                    } catch (fq1 unused5) {
                                        ip1Var = ip1.g;
                                    }
                                } catch (fq1 e3) {
                                    e = e3;
                                    throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (eq1 unused6) {
                                ip1Var = ip1.D;
                            }
                        } catch (kq1 unused7) {
                            ip1Var = ip1.E;
                        }
                    } catch (yp1 | zp1 unused8) {
                        ip1Var = ip1.o;
                    }
                } catch (yp1 e4) {
                    e = e4;
                    throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zp1 unused9) {
                ip1Var = ip1.F;
            }
        } catch (xp1 unused10) {
            ip1Var = ip1.J;
        }
        return Optional.of(ip1Var);
    }
}
