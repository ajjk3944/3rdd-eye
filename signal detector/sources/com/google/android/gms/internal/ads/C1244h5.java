package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1244h5 implements InterfaceC2105x5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14428b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14429c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14430d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14431e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14432f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14433g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14434h;
    public static final /* synthetic */ C1244h5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14435j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14436k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14437l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14438m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14439n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14440o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14441p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14442q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14443r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14444s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14445t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14446u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1244h5 f14447v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14448a;

    static {
        int i3 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i6 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i7 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i8 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i9 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i10 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i11 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f14447v = new C1244h5((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f14446u = new C1244h5((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f14445t = new C1244h5((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f14444s = new C1244h5(i11);
        f14443r = new C1244h5(i8);
        f14442q = new C1244h5(i9);
        C1244h5 c1244h5 = new C1244h5(i10);
        int i12 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i13 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i14 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i15 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i16 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i17 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i18 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i19 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i20 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f14441p = c1244h5;
        f14440o = new C1244h5(i7);
        f14439n = new C1244h5(i12);
        f14438m = new C1244h5(i13);
        f14437l = new C1244h5(i14);
        f14436k = new C1244h5(i6);
        f14435j = new C1244h5(i15);
        i = new C1244h5(i16);
        f14434h = new C1244h5(i17);
        f14433g = new C1244h5(i3);
        f14432f = new C1244h5(i18);
        f14431e = new C1244h5(i19);
        f14430d = new C1244h5(i20);
        f14429c = new C1244h5(1);
        f14428b = new C1244h5(0);
    }

    public /* synthetic */ C1244h5(int i3) {
        this.f14448a = i3;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws D5 {
        EnumC0862a5 enumC0862a5;
        long j6 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f14448a) {
                                            case 0:
                                                A5 a52 = (A5) obj;
                                                L2.w wVar = a52.f6931a;
                                                long jM = wVar.v().m();
                                                if (wVar.v().m() != 0) {
                                                    a52.f6933c.c(jM);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    L2.w wVar2 = ((A5) obj).f6931a;
                                                    long jM2 = wVar2.v().m();
                                                    E5 e5V = wVar2.v();
                                                    E5 e5V2 = wVar2.v();
                                                    List listO = e5V2.o();
                                                    if (jM2 < 0) {
                                                        jM2 += ((ArrayList) listO).size() + 1;
                                                    }
                                                    if (jM2 >= 0) {
                                                        ArrayList arrayList = (ArrayList) listO;
                                                        if (jM2 < arrayList.size() + 1) {
                                                            arrayList.add((int) jM2, e5V);
                                                            wVar2.r(e5V2);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new D5();
                                                } catch (D5 unused) {
                                                    enumC0862a5 = EnumC0862a5.f13053X;
                                                    break;
                                                }
                                            case 2:
                                                A5 a53 = (A5) obj;
                                                L2.w wVar3 = a53.f6931a;
                                                long jM3 = wVar3.v().m();
                                                if (wVar3.v().m() == 0) {
                                                    a53.f6933c.c(jM3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((A5) obj).f6931a.r(E5.b(((ArrayList) r12.v().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((A5) obj).f6931a.r(E5.b(r12.v().n().f15350a.length));
                                                return Optional.empty();
                                            case 5:
                                                L2.w wVar4 = ((A5) obj).f6931a;
                                                wVar4.r(E5.c(Math.log(wVar4.v().q())));
                                                return Optional.empty();
                                            case 6:
                                                L2.w wVar5 = ((A5) obj).f6931a;
                                                long jM4 = wVar5.v().m();
                                                long jM5 = wVar5.v().m();
                                                if (jM4 == 0 || jM5 == 0) {
                                                    j6 = 0;
                                                }
                                                wVar5.r(E5.b(j6));
                                                return Optional.empty();
                                            case 7:
                                                L2.w wVar6 = ((A5) obj).f6931a;
                                                if (wVar6.v().m() != 0) {
                                                    j6 = 0;
                                                }
                                                wVar6.r(E5.b(j6));
                                                return Optional.empty();
                                            case 8:
                                                L2.w wVar7 = ((A5) obj).f6931a;
                                                long jM6 = wVar7.v().m();
                                                long jM7 = wVar7.v().m();
                                                if (jM6 == 0 && jM7 == 0) {
                                                    j6 = 0;
                                                }
                                                wVar7.r(E5.b(j6));
                                                return Optional.empty();
                                            case 9:
                                                A5 a54 = (A5) obj;
                                                L2.w wVar8 = a54.f6931a;
                                                try {
                                                    int iCompare = new B5(false).compare(wVar8.v(), wVar8.v());
                                                    L2.w wVar9 = a54.f6931a;
                                                    if (iCompare >= 0) {
                                                        j6 = 0;
                                                    }
                                                    wVar9.r(E5.b(j6));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(EnumC0862a5.f13059e);
                                                }
                                            case 10:
                                                A5 a55 = (A5) obj;
                                                try {
                                                    L2.w wVar10 = a55.f6931a;
                                                    long jM8 = wVar10.v().m();
                                                    L2.w wVar11 = new L2.w(5, (byte) 0);
                                                    for (int i3 = 0; i3 < wVar10.f2569b; i3++) {
                                                        try {
                                                            wVar11.r(E5.j((E5) ((ArrayList) wVar10.f2570c).get(i3)));
                                                        } catch (C2051w5 e6) {
                                                            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e6);
                                                        }
                                                    }
                                                    C1728q5 c1728q5 = a55.f6933c;
                                                    C1458l5 c1458l5 = (C1458l5) c1728q5.f16318b;
                                                    int i6 = c1728q5.f16317a;
                                                    InterfaceC1080e5 interfaceC1080e5Mo14f = ((InterfaceC1080e5) c1728q5.f16319c).mo14f();
                                                    C1994v2 c1994v2 = (C1994v2) c1728q5.f16320d;
                                                    C1728q5 c1728q52 = new C1728q5(c1458l5, i6, interfaceC1080e5Mo14f);
                                                    c1728q52.f16320d = c1994v2;
                                                    new Nx(4);
                                                    c1728q52.c(jM8);
                                                    wVar10.r(E5.a(new C1994v2(24)));
                                                    return Optional.empty();
                                                } catch (C1620o5 | C1674p5 unused3) {
                                                    enumC0862a5 = EnumC0862a5.f13039I;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    L2.w wVar12 = ((A5) obj).f6931a;
                                                    wVar12.r(E5.a(wVar12.v().i((Class) wVar12.v().l())));
                                                    return Optional.empty();
                                                } catch (C5 unused4) {
                                                    enumC0862a5 = EnumC0862a5.f13035E;
                                                    break;
                                                }
                                            case 12:
                                                L2.w wVar13 = ((A5) obj).f6931a;
                                                long jM9 = wVar13.v().m();
                                                long jM10 = wVar13.v().m();
                                                if (jM9 == 0) {
                                                    return Optional.of(EnumC0862a5.f13050U);
                                                }
                                                wVar13.r(E5.b(jM10 % jM9));
                                                return Optional.empty();
                                            case 13:
                                                L2.w wVar14 = ((A5) obj).f6931a;
                                                wVar14.r(E5.c(wVar14.v().q() * wVar14.v().q()));
                                                return Optional.empty();
                                            case 14:
                                                L2.w wVar15 = ((A5) obj).f6931a;
                                                wVar15.r(E5.b(wVar15.v().m() * wVar15.v().m()));
                                                return Optional.empty();
                                            case 15:
                                                L2.w wVar16 = ((A5) obj).f6931a;
                                                long jM11 = wVar16.v().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j7 = 0; j7 < jM11; j7++) {
                                                    arrayList2.add(wVar16.v());
                                                }
                                                Collections.reverse(arrayList2);
                                                wVar16.r(E5.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                L2.w wVar17 = ((A5) obj).f6931a;
                                                wVar17.r(E5.c(Math.pow(wVar17.v().q(), wVar17.v().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((A5) obj).f6931a.r(E5.a(null));
                                                return Optional.empty();
                                            case 18:
                                                A5 a56 = (A5) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(a56.f6933c.i(64L).a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                a56.f6931a.r(E5.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                A5 a57 = (A5) obj;
                                                a57.f6931a.r(E5.b(a57.f6933c.h()));
                                                return Optional.empty();
                                            default:
                                                A5 a58 = (A5) obj;
                                                C1728q5 c1728q53 = a58.f6933c;
                                                long jH = c1728q53.h();
                                                if (jH >= 0 && jH <= 2147483647L) {
                                                    if ((7 & jH) != 0) {
                                                        return Optional.of(EnumC0862a5.f13060f);
                                                    }
                                                    a58.f6931a.r(E5.d(c1728q53.i(jH)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(EnumC0862a5.f13044O);
                                        }
                                    } catch (C5 unused5) {
                                        enumC0862a5 = EnumC0862a5.f13043N;
                                    }
                                } catch (C1997v5 unused6) {
                                    enumC0862a5 = EnumC0862a5.M;
                                }
                            } catch (C1620o5 e7) {
                                e = e7;
                                throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (C1674p5 unused7) {
                            enumC0862a5 = EnumC0862a5.f13044O;
                        }
                    } catch (C2051w5 unused8) {
                        enumC0862a5 = EnumC0862a5.f13056b;
                    }
                } catch (C2051w5 e8) {
                    e = e8;
                    throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (C1566n5 unused9) {
                enumC0862a5 = EnumC0862a5.f13048S;
            }
        } catch (C1620o5 | C1674p5 unused10) {
            enumC0862a5 = EnumC0862a5.f13063j;
        }
        return Optional.of(enumC0862a5);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
