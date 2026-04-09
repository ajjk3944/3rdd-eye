package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements ec {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ nb f14200b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ nb f14201c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ nb f14202d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ nb f14203e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ nb f14204f;
    public static final /* synthetic */ nb g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ nb f14205h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ nb f14206i;
    public static final /* synthetic */ nb j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ nb f14207k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ nb f14208l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ nb f14209m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ nb f14210n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ nb f14211o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ nb f14212p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ nb f14213q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ nb f14214r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ nb f14215s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ nb f14216t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ nb f14217u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ nb f14218v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14219a;

    static {
        int i4 = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i10 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i11 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i12 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i13 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i14 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i15 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        f14218v = new nb((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        f14217u = new nb((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        f14216t = new nb((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        f14215s = new nb(i15);
        f14214r = new nb(i12);
        f14213q = new nb(i13);
        nb nbVar = new nb(i14);
        int i16 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i17 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i18 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i19 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i20 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i21 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i22 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i23 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i24 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        f14212p = nbVar;
        f14211o = new nb(i11);
        f14210n = new nb(i16);
        f14209m = new nb(i17);
        f14208l = new nb(i18);
        f14207k = new nb(i10);
        j = new nb(i19);
        f14206i = new nb(i20);
        f14205h = new nb(i21);
        g = new nb(i4);
        f14204f = new nb(i22);
        f14203e = new nb(i23);
        f14202d = new nb(i24);
        f14201c = new nb(1);
        f14200b = new nb(0);
    }

    public /* synthetic */ nb(int i4) {
        this.f14219a = i4;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws kc {
        gb gbVar;
        long j8 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (this.f14219a) {
                                            case 0:
                                                hc hcVar = (hc) obj;
                                                dc dcVar = hcVar.f11824a;
                                                long jM = dcVar.e().m();
                                                if (dcVar.e().m() != 0) {
                                                    hcVar.f11826c.b(jM);
                                                }
                                                return Optional.empty();
                                            case 1:
                                                try {
                                                    dc dcVar2 = ((hc) obj).f11824a;
                                                    long jM2 = dcVar2.e().m();
                                                    lc lcVarE = dcVar2.e();
                                                    lc lcVarE2 = dcVar2.e();
                                                    List listO = lcVarE2.o();
                                                    if (jM2 < 0) {
                                                        jM2 += ((ArrayList) listO).size() + 1;
                                                    }
                                                    if (jM2 >= 0) {
                                                        ArrayList arrayList = (ArrayList) listO;
                                                        if (jM2 < arrayList.size() + 1) {
                                                            arrayList.add((int) jM2, lcVarE);
                                                            dcVar2.d(lcVarE2);
                                                            return Optional.empty();
                                                        }
                                                    }
                                                    throw new kc();
                                                } catch (kc unused) {
                                                    gbVar = gb.J;
                                                    break;
                                                }
                                            case 2:
                                                hc hcVar2 = (hc) obj;
                                                dc dcVar3 = hcVar2.f11824a;
                                                long jM3 = dcVar3.e().m();
                                                if (dcVar3.e().m() == 0) {
                                                    hcVar2.f11826c.b(jM3);
                                                }
                                                return Optional.empty();
                                            case 3:
                                                ((hc) obj).f11824a.d(lc.b(((ArrayList) r12.e().o()).size()));
                                                return Optional.empty();
                                            case 4:
                                                ((hc) obj).f11824a.d(lc.b(r12.e().n().f15610a.length));
                                                return Optional.empty();
                                            case 5:
                                                dc dcVar4 = ((hc) obj).f11824a;
                                                dcVar4.d(lc.c(Math.log(dcVar4.e().q())));
                                                return Optional.empty();
                                            case 6:
                                                dc dcVar5 = ((hc) obj).f11824a;
                                                long jM4 = dcVar5.e().m();
                                                long jM5 = dcVar5.e().m();
                                                if (jM4 == 0 || jM5 == 0) {
                                                    j8 = 0;
                                                }
                                                dcVar5.d(lc.b(j8));
                                                return Optional.empty();
                                            case 7:
                                                dc dcVar6 = ((hc) obj).f11824a;
                                                if (dcVar6.e().m() != 0) {
                                                    j8 = 0;
                                                }
                                                dcVar6.d(lc.b(j8));
                                                return Optional.empty();
                                            case 8:
                                                dc dcVar7 = ((hc) obj).f11824a;
                                                long jM6 = dcVar7.e().m();
                                                long jM7 = dcVar7.e().m();
                                                if (jM6 == 0 && jM7 == 0) {
                                                    j8 = 0;
                                                }
                                                dcVar7.d(lc.b(j8));
                                                return Optional.empty();
                                            case 9:
                                                hc hcVar3 = (hc) obj;
                                                dc dcVar8 = hcVar3.f11824a;
                                                try {
                                                    int iCompare = new ic(false).compare(dcVar8.e(), dcVar8.e());
                                                    dc dcVar9 = hcVar3.f11824a;
                                                    if (iCompare >= 0) {
                                                        j8 = 0;
                                                    }
                                                    dcVar9.d(lc.b(j8));
                                                    return Optional.empty();
                                                } catch (IllegalArgumentException unused2) {
                                                    return Optional.of(gb.f11454e);
                                                }
                                            case 10:
                                                hc hcVar4 = (hc) obj;
                                                try {
                                                    dc dcVar10 = hcVar4.f11824a;
                                                    long jM8 = dcVar10.e().m();
                                                    dc dcVar11 = new dc(0);
                                                    for (int i4 = 0; i4 < dcVar10.f10424a; i4++) {
                                                        try {
                                                            dcVar11.d(lc.j((lc) dcVar10.f10425b.get(i4)));
                                                        } catch (cc e2) {
                                                            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e2);
                                                        }
                                                    }
                                                    wb wbVar = hcVar4.f11826c;
                                                    rb rbVar = (rb) wbVar.f17958b;
                                                    int i10 = wbVar.f17957a;
                                                    kb kbVarZzc = ((kb) wbVar.f17959c).zzc();
                                                    w5 w5Var = (w5) wbVar.f17960d;
                                                    wb wbVar2 = new wb(rbVar, i10, kbVarZzc);
                                                    wbVar2.f17960d = w5Var;
                                                    new mx0(7);
                                                    wbVar2.b(jM8);
                                                    dcVar10.d(lc.a(new w5(24)));
                                                    return Optional.empty();
                                                } catch (ub | vb unused3) {
                                                    gbVar = gb.f11468u;
                                                    break;
                                                }
                                            case 11:
                                                try {
                                                    dc dcVar12 = ((hc) obj).f11824a;
                                                    dcVar12.d(lc.a(dcVar12.e().i((Class) dcVar12.e().l())));
                                                    return Optional.empty();
                                                } catch (jc unused4) {
                                                    gbVar = gb.f11464q;
                                                    break;
                                                }
                                            case 12:
                                                dc dcVar13 = ((hc) obj).f11824a;
                                                long jM9 = dcVar13.e().m();
                                                long jM10 = dcVar13.e().m();
                                                if (jM9 == 0) {
                                                    return Optional.of(gb.G);
                                                }
                                                dcVar13.d(lc.b(jM10 % jM9));
                                                return Optional.empty();
                                            case 13:
                                                dc dcVar14 = ((hc) obj).f11824a;
                                                dcVar14.d(lc.c(dcVar14.e().q() * dcVar14.e().q()));
                                                return Optional.empty();
                                            case 14:
                                                dc dcVar15 = ((hc) obj).f11824a;
                                                dcVar15.d(lc.b(dcVar15.e().m() * dcVar15.e().m()));
                                                return Optional.empty();
                                            case 15:
                                                dc dcVar16 = ((hc) obj).f11824a;
                                                long jM11 = dcVar16.e().m();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (long j9 = 0; j9 < jM11; j9++) {
                                                    arrayList2.add(dcVar16.e());
                                                }
                                                Collections.reverse(arrayList2);
                                                dcVar16.d(lc.e(arrayList2));
                                                return Optional.empty();
                                            case 16:
                                                dc dcVar17 = ((hc) obj).f11824a;
                                                dcVar17.d(lc.c(Math.pow(dcVar17.e().q(), dcVar17.e().q())));
                                                return Optional.empty();
                                            case 17:
                                                ((hc) obj).f11824a.d(lc.a(null));
                                                return Optional.empty();
                                            case 18:
                                                hc hcVar5 = (hc) obj;
                                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(hcVar5.f11826c.j(64L).a());
                                                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                                hcVar5.f11824a.d(lc.c(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                                return Optional.empty();
                                            case 19:
                                                hc hcVar6 = (hc) obj;
                                                hcVar6.f11824a.d(lc.b(hcVar6.f11826c.i()));
                                                return Optional.empty();
                                            default:
                                                hc hcVar7 = (hc) obj;
                                                wb wbVar3 = hcVar7.f11826c;
                                                long jI = wbVar3.i();
                                                if (jI >= 0 && jI <= 2147483647L) {
                                                    if ((7 & jI) != 0) {
                                                        return Optional.of(gb.f11455f);
                                                    }
                                                    hcVar7.f11824a.d(lc.d(wbVar3.j(jI)));
                                                    return Optional.empty();
                                                }
                                                return Optional.of(gb.A);
                                        }
                                    } catch (jc unused5) {
                                        gbVar = gb.f11473z;
                                    }
                                } catch (bc unused6) {
                                    gbVar = gb.f11472y;
                                }
                            } catch (ub e10) {
                                e = e10;
                                throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (vb unused7) {
                            gbVar = gb.A;
                        }
                    } catch (tb unused8) {
                        gbVar = gb.E;
                    }
                } catch (ub | vb unused9) {
                    gbVar = gb.j;
                }
            } catch (cc unused10) {
                gbVar = gb.f11451b;
            }
            return Optional.of(gbVar);
        } catch (cc e11) {
            e = e11;
            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
