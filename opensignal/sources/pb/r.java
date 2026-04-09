package pb;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import oe.z0;

/* loaded from: classes.dex */
public final class r implements g, u0 {
    public static final oe.i0 J;
    public static final oe.u0 K;
    public static final oe.u0 L;
    public static final oe.u0 M;
    public static final oe.u0 N;
    public static final oe.u0 O;
    public static final oe.u0 P;
    public static r Q;
    public long B;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f20411a;

    /* renamed from: d, reason: collision with root package name */
    public final f f20412d = new f(0);

    /* renamed from: g, reason: collision with root package name */
    public final qb.r f20413g;

    /* renamed from: r, reason: collision with root package name */
    public final qb.a f20414r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20415x;

    /* renamed from: y, reason: collision with root package name */
    public int f20416y;

    static {
        oe.i0 i0Var;
        i.g0 g0Var = new i.g0(25);
        int size = 0;
        g0Var.L("AD", 1, 2, 0, 0, 2, 2);
        g0Var.L("AE", 1, 4, 4, 4, 2, 2);
        g0Var.L("AF", 4, 4, 3, 4, 2, 2);
        g0Var.L("AG", 4, 2, 1, 4, 2, 2);
        g0Var.L("AI", 1, 2, 2, 2, 2, 2);
        g0Var.L("AL", 1, 1, 1, 1, 2, 2);
        g0Var.L("AM", 2, 2, 1, 3, 2, 2);
        g0Var.L("AO", 3, 4, 3, 1, 2, 2);
        g0Var.L("AR", 2, 4, 2, 1, 2, 2);
        g0Var.L("AS", 2, 2, 3, 3, 2, 2);
        g0Var.L("AT", 0, 1, 0, 0, 0, 2);
        g0Var.L("AU", 0, 2, 0, 1, 1, 2);
        g0Var.L("AW", 1, 2, 0, 4, 2, 2);
        g0Var.L("AX", 0, 2, 2, 2, 2, 2);
        g0Var.L("AZ", 3, 3, 3, 4, 4, 2);
        g0Var.L("BA", 1, 1, 0, 1, 2, 2);
        g0Var.L("BB", 0, 2, 0, 0, 2, 2);
        g0Var.L("BD", 2, 0, 3, 3, 2, 2);
        g0Var.L("BE", 0, 0, 2, 3, 2, 2);
        g0Var.L("BF", 4, 4, 4, 2, 2, 2);
        g0Var.L("BG", 0, 1, 0, 0, 2, 2);
        g0Var.L("BH", 1, 0, 2, 4, 2, 2);
        g0Var.L("BI", 4, 4, 4, 4, 2, 2);
        g0Var.L("BJ", 4, 4, 4, 4, 2, 2);
        g0Var.L("BL", 1, 2, 2, 2, 2, 2);
        g0Var.L("BM", 0, 2, 0, 0, 2, 2);
        g0Var.L("BN", 3, 2, 1, 0, 2, 2);
        g0Var.L("BO", 1, 2, 4, 2, 2, 2);
        g0Var.L("BQ", 1, 2, 1, 2, 2, 2);
        g0Var.L("BR", 2, 4, 3, 2, 2, 2);
        g0Var.L("BS", 2, 2, 1, 3, 2, 2);
        g0Var.L("BT", 3, 0, 3, 2, 2, 2);
        g0Var.L("BW", 3, 4, 1, 1, 2, 2);
        g0Var.L("BY", 1, 1, 1, 2, 2, 2);
        g0Var.L("BZ", 2, 2, 2, 2, 2, 2);
        g0Var.L("CA", 0, 3, 1, 2, 4, 2);
        g0Var.L("CD", 4, 2, 2, 1, 2, 2);
        g0Var.L("CF", 4, 2, 3, 2, 2, 2);
        g0Var.L("CG", 3, 4, 2, 2, 2, 2);
        g0Var.L("CH", 0, 0, 0, 0, 1, 2);
        g0Var.L("CI", 3, 3, 3, 3, 2, 2);
        g0Var.L("CK", 2, 2, 3, 0, 2, 2);
        g0Var.L("CL", 1, 1, 2, 2, 2, 2);
        g0Var.L("CM", 3, 4, 3, 2, 2, 2);
        g0Var.L("CN", 2, 2, 2, 1, 3, 2);
        g0Var.L("CO", 2, 3, 4, 2, 2, 2);
        g0Var.L("CR", 2, 3, 4, 4, 2, 2);
        g0Var.L("CU", 4, 4, 2, 2, 2, 2);
        g0Var.L("CV", 2, 3, 1, 0, 2, 2);
        g0Var.L("CW", 1, 2, 0, 0, 2, 2);
        g0Var.L("CY", 1, 1, 0, 0, 2, 2);
        g0Var.L("CZ", 0, 1, 0, 0, 1, 2);
        g0Var.L("DE", 0, 0, 1, 1, 0, 2);
        g0Var.L("DJ", 4, 0, 4, 4, 2, 2);
        g0Var.L("DK", 0, 0, 1, 0, 0, 2);
        g0Var.L("DM", 1, 2, 2, 2, 2, 2);
        g0Var.L("DO", 3, 4, 4, 4, 2, 2);
        g0Var.L("DZ", 3, 3, 4, 4, 2, 4);
        g0Var.L("EC", 2, 4, 3, 1, 2, 2);
        g0Var.L("EE", 0, 1, 0, 0, 2, 2);
        g0Var.L("EG", 3, 4, 3, 3, 2, 2);
        g0Var.L("EH", 2, 2, 2, 2, 2, 2);
        g0Var.L("ER", 4, 2, 2, 2, 2, 2);
        g0Var.L("ES", 0, 1, 1, 1, 2, 2);
        g0Var.L("ET", 4, 4, 4, 1, 2, 2);
        g0Var.L("FI", 0, 0, 0, 0, 0, 2);
        g0Var.L("FJ", 3, 0, 2, 3, 2, 2);
        g0Var.L("FK", 4, 2, 2, 2, 2, 2);
        g0Var.L("FM", 3, 2, 4, 4, 2, 2);
        g0Var.L("FO", 1, 2, 0, 1, 2, 2);
        g0Var.L("FR", 1, 1, 2, 0, 1, 2);
        g0Var.L("GA", 3, 4, 1, 1, 2, 2);
        g0Var.L("GB", 0, 0, 1, 1, 1, 2);
        g0Var.L("GD", 1, 2, 2, 2, 2, 2);
        g0Var.L("GE", 1, 1, 1, 2, 2, 2);
        g0Var.L("GF", 2, 2, 2, 3, 2, 2);
        g0Var.L("GG", 1, 2, 0, 0, 2, 2);
        g0Var.L("GH", 3, 1, 3, 2, 2, 2);
        g0Var.L("GI", 0, 2, 0, 0, 2, 2);
        g0Var.L("GL", 1, 2, 0, 0, 2, 2);
        g0Var.L("GM", 4, 3, 2, 4, 2, 2);
        g0Var.L("GN", 4, 3, 4, 2, 2, 2);
        g0Var.L("GP", 2, 1, 2, 3, 2, 2);
        g0Var.L("GQ", 4, 2, 2, 4, 2, 2);
        g0Var.L("GR", 1, 2, 0, 0, 2, 2);
        g0Var.L("GT", 3, 2, 3, 1, 2, 2);
        g0Var.L("GU", 1, 2, 3, 4, 2, 2);
        g0Var.L("GW", 4, 4, 4, 4, 2, 2);
        g0Var.L("GY", 3, 3, 3, 4, 2, 2);
        g0Var.L("HK", 0, 1, 2, 3, 2, 0);
        g0Var.L("HN", 3, 1, 3, 3, 2, 2);
        g0Var.L("HR", 1, 1, 0, 0, 3, 2);
        g0Var.L("HT", 4, 4, 4, 4, 2, 2);
        g0Var.L("HU", 0, 0, 0, 0, 0, 2);
        g0Var.L("ID", 3, 2, 3, 3, 2, 2);
        g0Var.L("IE", 0, 0, 1, 1, 3, 2);
        g0Var.L("IL", 1, 0, 2, 3, 4, 2);
        g0Var.L("IM", 0, 2, 0, 1, 2, 2);
        g0Var.L("IN", 2, 1, 3, 3, 2, 2);
        g0Var.L("IO", 4, 2, 2, 4, 2, 2);
        g0Var.L("IQ", 3, 3, 4, 4, 2, 2);
        g0Var.L("IR", 3, 2, 3, 2, 2, 2);
        g0Var.L("IS", 0, 2, 0, 0, 2, 2);
        g0Var.L("IT", 0, 4, 0, 1, 2, 2);
        g0Var.L("JE", 2, 2, 1, 2, 2, 2);
        g0Var.L("JM", 3, 3, 4, 4, 2, 2);
        g0Var.L("JO", 2, 2, 1, 1, 2, 2);
        g0Var.L("JP", 0, 0, 0, 0, 2, 1);
        g0Var.L("KE", 3, 4, 2, 2, 2, 2);
        g0Var.L("KG", 2, 0, 1, 1, 2, 2);
        g0Var.L("KH", 1, 0, 4, 3, 2, 2);
        g0Var.L("KI", 4, 2, 4, 3, 2, 2);
        g0Var.L("KM", 4, 3, 2, 3, 2, 2);
        g0Var.L("KN", 1, 2, 2, 2, 2, 2);
        g0Var.L("KP", 4, 2, 2, 2, 2, 2);
        g0Var.L("KR", 0, 0, 1, 3, 1, 2);
        g0Var.L("KW", 1, 3, 1, 1, 1, 2);
        g0Var.L("KY", 1, 2, 0, 2, 2, 2);
        g0Var.L("KZ", 2, 2, 2, 3, 2, 2);
        g0Var.L("LA", 1, 2, 1, 1, 2, 2);
        g0Var.L("LB", 3, 2, 0, 0, 2, 2);
        g0Var.L("LC", 1, 2, 0, 0, 2, 2);
        g0Var.L("LI", 0, 2, 2, 2, 2, 2);
        g0Var.L("LK", 2, 0, 2, 3, 2, 2);
        g0Var.L("LR", 3, 4, 4, 3, 2, 2);
        g0Var.L("LS", 3, 3, 2, 3, 2, 2);
        g0Var.L("LT", 0, 0, 0, 0, 2, 2);
        g0Var.L("LU", 1, 0, 1, 1, 2, 2);
        g0Var.L("LV", 0, 0, 0, 0, 2, 2);
        g0Var.L("LY", 4, 2, 4, 3, 2, 2);
        g0Var.L("MA", 3, 2, 2, 1, 2, 2);
        g0Var.L("MC", 0, 2, 0, 0, 2, 2);
        g0Var.L("MD", 1, 2, 0, 0, 2, 2);
        g0Var.L("ME", 1, 2, 0, 1, 2, 2);
        g0Var.L("MF", 2, 2, 1, 1, 2, 2);
        g0Var.L("MG", 3, 4, 2, 2, 2, 2);
        g0Var.L("MH", 4, 2, 2, 4, 2, 2);
        g0Var.L("MK", 1, 1, 0, 0, 2, 2);
        g0Var.L("ML", 4, 4, 2, 2, 2, 2);
        g0Var.L("MM", 2, 3, 3, 3, 2, 2);
        g0Var.L("MN", 2, 4, 2, 2, 2, 2);
        g0Var.L("MO", 0, 2, 4, 4, 2, 2);
        g0Var.L("MP", 0, 2, 2, 2, 2, 2);
        g0Var.L("MQ", 2, 2, 2, 3, 2, 2);
        g0Var.L("MR", 3, 0, 4, 3, 2, 2);
        g0Var.L("MS", 1, 2, 2, 2, 2, 2);
        g0Var.L("MT", 0, 2, 0, 0, 2, 2);
        g0Var.L("MU", 2, 1, 1, 2, 2, 2);
        g0Var.L("MV", 4, 3, 2, 4, 2, 2);
        g0Var.L("MW", 4, 2, 1, 0, 2, 2);
        g0Var.L("MX", 2, 4, 4, 4, 4, 2);
        g0Var.L("MY", 1, 0, 3, 2, 2, 2);
        g0Var.L("MZ", 3, 3, 2, 1, 2, 2);
        g0Var.L("NA", 4, 3, 3, 2, 2, 2);
        g0Var.L("NC", 3, 0, 4, 4, 2, 2);
        g0Var.L("NE", 4, 4, 4, 4, 2, 2);
        g0Var.L("NF", 2, 2, 2, 2, 2, 2);
        g0Var.L("NG", 3, 3, 2, 3, 2, 2);
        g0Var.L("NI", 2, 1, 4, 4, 2, 2);
        g0Var.L("NL", 0, 2, 3, 2, 0, 2);
        g0Var.L("NO", 0, 1, 2, 0, 0, 2);
        g0Var.L("NP", 2, 0, 4, 2, 2, 2);
        g0Var.L("NR", 3, 2, 3, 1, 2, 2);
        g0Var.L("NU", 4, 2, 2, 2, 2, 2);
        g0Var.L("NZ", 0, 2, 1, 2, 4, 2);
        g0Var.L("OM", 2, 2, 1, 3, 3, 2);
        g0Var.L("PA", 1, 3, 3, 3, 2, 2);
        g0Var.L("PE", 2, 3, 4, 4, 2, 2);
        g0Var.L("PF", 2, 2, 2, 1, 2, 2);
        g0Var.L("PG", 4, 4, 3, 2, 2, 2);
        g0Var.L("PH", 2, 1, 3, 3, 3, 2);
        g0Var.L("PK", 3, 2, 3, 3, 2, 2);
        g0Var.L("PL", 1, 0, 1, 2, 3, 2);
        g0Var.L("PM", 0, 2, 2, 2, 2, 2);
        g0Var.L("PR", 2, 1, 2, 2, 4, 3);
        g0Var.L("PS", 3, 3, 2, 2, 2, 2);
        g0Var.L("PT", 0, 1, 1, 0, 2, 2);
        g0Var.L("PW", 1, 2, 4, 1, 2, 2);
        g0Var.L("PY", 2, 0, 3, 2, 2, 2);
        g0Var.L("QA", 2, 3, 1, 2, 3, 2);
        g0Var.L("RE", 1, 0, 2, 2, 2, 2);
        g0Var.L("RO", 0, 1, 0, 1, 0, 2);
        g0Var.L("RS", 1, 2, 0, 0, 2, 2);
        g0Var.L("RU", 0, 1, 0, 1, 4, 2);
        g0Var.L("RW", 3, 3, 3, 1, 2, 2);
        g0Var.L("SA", 2, 2, 2, 1, 1, 2);
        g0Var.L("SB", 4, 2, 3, 2, 2, 2);
        g0Var.L("SC", 4, 2, 1, 3, 2, 2);
        g0Var.L("SD", 4, 4, 4, 4, 2, 2);
        g0Var.L("SE", 0, 0, 0, 0, 0, 2);
        g0Var.L("SG", 1, 0, 1, 2, 3, 2);
        g0Var.L("SH", 4, 2, 2, 2, 2, 2);
        g0Var.L("SI", 0, 0, 0, 0, 2, 2);
        g0Var.L("SJ", 2, 2, 2, 2, 2, 2);
        g0Var.L("SK", 0, 1, 0, 0, 2, 2);
        g0Var.L("SL", 4, 3, 4, 0, 2, 2);
        g0Var.L("SM", 0, 2, 2, 2, 2, 2);
        g0Var.L("SN", 4, 4, 4, 4, 2, 2);
        g0Var.L("SO", 3, 3, 3, 4, 2, 2);
        g0Var.L("SR", 3, 2, 2, 2, 2, 2);
        g0Var.L("SS", 4, 4, 3, 3, 2, 2);
        g0Var.L("ST", 2, 2, 1, 2, 2, 2);
        g0Var.L("SV", 2, 1, 4, 3, 2, 2);
        g0Var.L("SX", 2, 2, 1, 0, 2, 2);
        g0Var.L("SY", 4, 3, 3, 2, 2, 2);
        g0Var.L("SZ", 3, 3, 2, 4, 2, 2);
        g0Var.L("TC", 2, 2, 2, 0, 2, 2);
        g0Var.L("TD", 4, 3, 4, 4, 2, 2);
        g0Var.L("TG", 3, 2, 2, 4, 2, 2);
        g0Var.L("TH", 0, 3, 2, 3, 2, 2);
        g0Var.L("TJ", 4, 4, 4, 4, 2, 2);
        g0Var.L("TL", 4, 0, 4, 4, 2, 2);
        g0Var.L("TM", 4, 2, 4, 3, 2, 2);
        g0Var.L("TN", 2, 1, 1, 2, 2, 2);
        g0Var.L("TO", 3, 3, 4, 3, 2, 2);
        g0Var.L("TR", 1, 2, 1, 1, 2, 2);
        g0Var.L("TT", 1, 4, 0, 1, 2, 2);
        g0Var.L("TV", 3, 2, 2, 4, 2, 2);
        g0Var.L("TW", 0, 0, 0, 0, 1, 0);
        g0Var.L("TZ", 3, 3, 3, 2, 2, 2);
        g0Var.L("UA", 0, 3, 1, 1, 2, 2);
        g0Var.L("UG", 3, 2, 3, 3, 2, 2);
        g0Var.L("US", 1, 1, 2, 2, 4, 2);
        g0Var.L("UY", 2, 2, 1, 1, 2, 2);
        g0Var.L("UZ", 2, 1, 3, 4, 2, 2);
        g0Var.L("VC", 1, 2, 2, 2, 2, 2);
        g0Var.L("VE", 4, 4, 4, 4, 2, 2);
        g0Var.L("VG", 2, 2, 1, 1, 2, 2);
        g0Var.L("VI", 1, 2, 1, 2, 2, 2);
        g0Var.L("VN", 0, 1, 3, 4, 2, 2);
        g0Var.L("VU", 4, 0, 3, 1, 2, 2);
        g0Var.L("WF", 4, 2, 2, 4, 2, 2);
        g0Var.L("WS", 3, 1, 3, 1, 2, 2);
        g0Var.L("XK", 0, 1, 1, 0, 2, 2);
        g0Var.L("YE", 4, 4, 4, 3, 2, 2);
        g0Var.L("YT", 4, 2, 2, 3, 2, 2);
        g0Var.L("ZA", 3, 3, 2, 1, 2, 2);
        g0Var.L("ZM", 3, 2, 3, 3, 2, 2);
        g0Var.L("ZW", 3, 2, 4, 3, 2, 2);
        Collection collectionEntrySet = ((oe.w) g0Var.f11051a).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            i0Var = oe.b0.f19301x;
        } else {
            oe.u uVar = (oe.u) collectionEntrySet;
            bc.f0 f0Var = new bc.f0(uVar.f19382d.size(), 8);
            Iterator it = uVar.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                oe.h0 h0VarL = oe.h0.l((Collection) entry.getValue());
                if (!h0VarL.isEmpty()) {
                    f0Var.r(key, h0VarL);
                    size = h0VarL.size() + size;
                }
            }
            i0Var = new oe.i0(f0Var.c(), size);
        }
        J = i0Var;
        K = oe.h0.o(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        L = oe.h0.o(248000L, 160000L, 142000L, 127000L, 113000L);
        M = oe.h0.o(2200000L, 1300000L, 950000L, 760000L, 520000L);
        N = oe.h0.o(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        O = oe.h0.o(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        P = oe.h0.o(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    }

    public r(Context context, Map map, int i10, et.d dVar, boolean z10) {
        qb.p pVar;
        int i11;
        this.f20411a = z0.a(map);
        this.f20413g = new qb.r(i10);
        this.f20414r = dVar;
        this.f20415x = z10;
        if (context == null) {
            this.E = 0;
            this.H = h(0);
            return;
        }
        synchronized (qb.p.class) {
            try {
                if (qb.p.f20804e == null) {
                    qb.p.f20804e = new qb.p(context);
                }
                pVar = qb.p.f20804e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (pVar.f20808d) {
            i11 = pVar.f20805a;
        }
        this.E = i11;
        this.H = h(i11);
        q qVar = new q(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) pVar.f20807c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(qVar));
        ((Handler) pVar.f20806b).post(new io.sentry.cache.e(pVar, 20, qVar));
    }

    @Override // pb.g
    public final synchronized long b() {
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(na.c r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            int r3 = r3.f17421e     // Catch: java.lang.Throwable -> Ld
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Lf
        Lb:
            r3 = 1
            goto L10
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            r3 = 0
        L10:
            if (r3 != 0) goto L14
            monitor-exit(r2)
            return
        L14:
            long r3 = r2.D     // Catch: java.lang.Throwable -> Ld
            long r0 = (long) r5     // Catch: java.lang.Throwable -> Ld
            long r3 = r3 + r0
            r2.D = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.r.c(na.c, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(na.c r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L13
            int r13 = r13.f17421e     // Catch: java.lang.Throwable -> Lf
            r14 = 8
            r13 = r13 & r14
            if (r13 != r14) goto Ld
            goto L13
        Ld:
            r13 = r1
            goto L14
        Lf:
            r0 = move-exception
            r13 = r0
            goto L8f
        L13:
            r13 = r0
        L14:
            if (r13 != 0) goto L18
            monitor-exit(r12)
            return
        L18:
            int r13 = r12.f20416y     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r0 = r1
        L1d:
            qb.b.j(r0)     // Catch: java.lang.Throwable -> Lf
            qb.a r13 = r12.f20414r     // Catch: java.lang.Throwable -> Lf
            et.d r13 = (et.d) r13     // Catch: java.lang.Throwable -> Lf
            r13.getClass()     // Catch: java.lang.Throwable -> Lf
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.B     // Catch: java.lang.Throwable -> Lf
            long r2 = r13 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.F     // Catch: java.lang.Throwable -> Lf
            long r6 = (long) r5     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.F = r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.G     // Catch: java.lang.Throwable -> Lf
            long r6 = r12.D     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.G = r2     // Catch: java.lang.Throwable -> Lf
            if (r5 <= 0) goto L88
            float r0 = (float) r6     // Catch: java.lang.Throwable -> Lf
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> Lf
            float r0 = r0 / r2
            qb.r r2 = r12.f20413g     // Catch: java.lang.Throwable -> Lf
            double r3 = (double) r6     // Catch: java.lang.Throwable -> Lf
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> Lf
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lf
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.F     // Catch: java.lang.Throwable -> Lf
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L61
            long r2 = r12.G     // Catch: java.lang.Throwable -> Lf
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L6a
        L61:
            qb.r r0 = r12.f20413g     // Catch: java.lang.Throwable -> Lf
            float r0 = r0.b()     // Catch: java.lang.Throwable -> Lf
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lf
            r12.H = r2     // Catch: java.lang.Throwable -> Lf
        L6a:
            long r6 = r12.D     // Catch: java.lang.Throwable -> Lf
            long r8 = r12.H     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r5 != 0) goto L7d
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7d
            long r10 = r12.I     // Catch: java.lang.Throwable -> Lf
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L7d
            goto L84
        L7d:
            r12.I = r8     // Catch: java.lang.Throwable -> Lf
            pb.f r4 = r12.f20412d     // Catch: java.lang.Throwable -> Lf
            r4.a(r5, r6, r8)     // Catch: java.lang.Throwable -> Lf
        L84:
            r12.B = r13     // Catch: java.lang.Throwable -> Lf
            r12.D = r2     // Catch: java.lang.Throwable -> Lf
        L88:
            int r13 = r12.f20416y     // Catch: java.lang.Throwable -> Lf
            int r13 = r13 - r1
            r12.f20416y = r13     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r12)
            return
        L8f:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lf
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.r.d(na.c, boolean):void");
    }

    @Override // pb.g
    public final void e(Handler handler, AnalyticsCollector analyticsCollector) {
        analyticsCollector.getClass();
        f fVar = this.f20412d;
        fVar.getClass();
        fVar.c(analyticsCollector);
        fVar.f20371b.add(new e(handler, analyticsCollector));
    }

    @Override // pb.g
    public final void f(AnalyticsCollector analyticsCollector) {
        this.f20412d.c(analyticsCollector);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(na.c r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            int r2 = r2.f17421e     // Catch: java.lang.Throwable -> Le
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto L10
        Lc:
            r2 = r0
            goto L11
        Le:
            r2 = move-exception
            goto L2d
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r1)
            return
        L15:
            int r2 = r1.f20416y     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L26
            qb.a r2 = r1.f20414r     // Catch: java.lang.Throwable -> Le
            et.d r2 = (et.d) r2     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r1.B = r2     // Catch: java.lang.Throwable -> Le
        L26:
            int r2 = r1.f20416y     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.f20416y = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.r.g(na.c, boolean):void");
    }

    public final long h(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        z0 z0Var = this.f20411a;
        Long l10 = (Long) z0Var.get(numValueOf);
        if (l10 == null) {
            l10 = (Long) z0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // pb.g
    public final u0 a() {
        return this;
    }
}
