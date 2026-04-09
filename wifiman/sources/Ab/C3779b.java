package ab;

import Zg.AbstractC3689v;
import Zg.U;
import com.ui.product.firmware.UiFirmwareBoard;
import com.ui.product.firmware.UiFirmwarePlatform;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;
import ua.b;

/* renamed from: ab.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3779b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25847a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25848b;

    public C3779b() {
        List<UiFirmwareBoard> values = UiFirmwareBoard.INSTANCE.getValues();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(values, 10)), 16));
        for (Object obj : values) {
            String lowerCase = ((UiFirmwareBoard) obj).getId().toLowerCase(Locale.ROOT);
            AbstractC6492s.h(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, obj);
        }
        this.f25847a = linkedHashMap;
        List<UiFirmwarePlatform> values2 = UiFirmwarePlatform.INSTANCE.getValues();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(values2, 10)), 16));
        for (Object obj2 : values2) {
            String lowerCase2 = ((UiFirmwarePlatform) obj2).getId().toLowerCase(Locale.ROOT);
            AbstractC6492s.h(lowerCase2, "toLowerCase(...)");
            linkedHashMap2.put(lowerCase2, obj2);
        }
        this.f25848b = linkedHashMap2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r2.equals("factory_legacy") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r2.equals("factory") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.equals("default_legacy") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals("default") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.AbstractC6492s.i(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1091882742: goto L2f;
                case 982671518: goto L22;
                case 1544803905: goto L18;
                case 1941356423: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L38
        Le:
            java.lang.String r0 = "default_legacy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2c
            goto L38
        L18:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
            goto L38
        L22:
            java.lang.String r0 = "factory_legacy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2c
            goto L38
        L2c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L3c
        L2f:
            java.lang.String r0 = "factory"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            goto L3c
        L3a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3779b.a(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2.equals("factory_legacy") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r2.equals("factory") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return va.c.FACTORY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return va.c.CONFIGURED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.equals("default_legacy") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals("default") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final va.c b(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.AbstractC6492s.i(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1091882742: goto L2f;
                case 982671518: goto L25;
                case 1544803905: goto L18;
                case 1941356423: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L38
        Le:
            java.lang.String r0 = "default_legacy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L22
            goto L38
        L18:
            java.lang.String r0 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L22
            goto L38
        L22:
            va.c r2 = va.c.CONFIGURED
            goto L3c
        L25:
            java.lang.String r0 = "factory_legacy"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L38
            goto L3a
        L2f:
            java.lang.String r0 = "factory"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            goto L3c
        L3a:
            va.c r2 = va.c.FACTORY
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.C3779b.b(java.lang.String):va.c");
    }

    public final UiFirmwareBoard c(String id2) {
        AbstractC6492s.i(id2, "id");
        Map map = this.f25847a;
        String lowerCase = id2.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return (UiFirmwareBoard) map.get(lowerCase);
    }

    public final UiFirmwarePlatform d(String id2) {
        AbstractC6492s.i(id2, "id");
        Map map = this.f25848b;
        String lowerCase = id2.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return (UiFirmwarePlatform) map.get(lowerCase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ua.b e(String line) {
        AbstractC6492s.i(line, "line");
        switch (line.hashCode()) {
            case -1934524643:
                if (line.equals("airfiber_60talyn")) {
                    return b.AbstractC2196b.a.C2198b.f62828b;
                }
                return null;
            case -1934191462:
                if (line.equals("ltu_ptmp_sta")) {
                    return b.f.AbstractC2215b.a.C2217b.f62864b;
                }
                return null;
            case -1633789949:
                if (line.equals("edge_power")) {
                    return b.e.C2212b.f62856b;
                }
                return null;
            case -1417465894:
                if (line.equals("airmax")) {
                    return b.c.d.f62841b;
                }
                return null;
            case -1238226089:
                if (line.equals("uisp_router")) {
                    return b.k.d.f62883b;
                }
                return null;
            case -1202566334:
                if (line.equals("uisp_switch")) {
                    return b.k.e.f62884b;
                }
                return null;
            case -1148521686:
                if (line.equals("airmax_ac25")) {
                    return b.c.a.C2200a.f62832b;
                }
                return null;
            case -1148521567:
                if (line.equals("airmax_ac60")) {
                    return b.c.a.d.f62835b;
                }
                return null;
            case -1148501505:
                if (line.equals("airmax_ax25")) {
                    return b.c.AbstractC2203b.a.f62836b;
                }
                return null;
            case -1148501386:
                if (line.equals("airmax_ax60")) {
                    return b.c.AbstractC2203b.d.f62839b;
                }
                return null;
            case -1148210198:
                if (line.equals("airmax_m365")) {
                    return b.c.f.d.f62846b;
                }
                return null;
            case -1148204623:
                if (line.equals("airmax_m900")) {
                    return b.c.f.h.f62850b;
                }
                return null;
            case -1032225163:
                if (line.equals("ltu_ptmp_ap")) {
                    return b.f.AbstractC2215b.a.C2216a.f62863b;
                }
                return null;
            case -992049025:
                if (line.equals("aircube")) {
                    return b.a.f62824a;
                }
                return null;
            case -732898973:
                if (line.equals("airmax_installer")) {
                    return b.c.e.f62842b;
                }
                return null;
            case -729785749:
                if (line.equals("airmax_ac2")) {
                    return b.c.a.C2201b.f62833b;
                }
                return null;
            case -729785746:
                if (line.equals("airmax_ac5")) {
                    return b.c.a.C2202c.f62834b;
                }
                return null;
            case -729785098:
                if (line.equals("airmax_ax2")) {
                    return b.c.AbstractC2203b.C2204b.f62837b;
                }
                return null;
            case -729785095:
                if (line.equals("airmax_ax5")) {
                    return b.c.AbstractC2203b.C2205c.f62838b;
                }
                return null;
            case -729775769:
                if (line.equals("airmax_m10")) {
                    return b.c.f.a.f62843b;
                }
                return null;
            case -729775733:
                if (line.equals("airmax_m25")) {
                    return b.c.f.C2207b.f62844b;
                }
                return null;
            case -686335518:
                if (line.equals("airfiber")) {
                    return b.AbstractC2196b.C2199b.f62829b;
                }
                return null;
            case -318883017:
                if (line.equals("uisp_power")) {
                    return b.k.c.f62882b;
                }
                return null;
            case -194885402:
                if (line.equals("ufiber_onu_wifi")) {
                    return b.j.c.C2221b.f62878b;
                }
                return null;
            case -152290673:
                if (line.equals("uisp_lte")) {
                    return b.k.C2222b.f62881b;
                }
                return null;
            case -123225032:
                if (line.equals("tough_switch")) {
                    return b.i.f62872a;
                }
                return null;
            case 88413046:
                if (line.equals("sunmax_solarpoint")) {
                    return b.h.C2219b.f62870b;
                }
                return null;
            case 119788570:
                if (line.equals("edge_point_router")) {
                    return b.e.a.C2210a.f62854b;
                }
                return null;
            case 155448325:
                if (line.equals("edge_point_switch")) {
                    return b.e.a.C2211b.f62855b;
                }
                return null;
            case 392100725:
                if (line.equals("airmax_gw")) {
                    return b.c.C2206c.f62840b;
                }
                return null;
            case 392100842:
                if (line.equals("airmax_m2")) {
                    return b.c.f.C2208c.f62845b;
                }
                return null;
            case 392100843:
                if (line.equals("airmax_m3")) {
                    return b.c.f.e.f62847b;
                }
                return null;
            case 392100845:
                if (line.equals("airmax_m5")) {
                    return b.c.f.C2209f.f62848b;
                }
                return null;
            case 392100846:
                if (line.equals("airmax_m6")) {
                    return b.c.f.g.f62849b;
                }
                return null;
            case 405613945:
                if (line.equals("sunmac_solarswitch")) {
                    return b.h.c.f62871b;
                }
                return null;
            case 498124698:
                if (line.equals("ltu_ptp")) {
                    return b.f.AbstractC2215b.C2218b.f62865b;
                }
                return null;
            case 949331979:
                if (line.equals("edge_router")) {
                    return b.e.c.f62857b;
                }
                return null;
            case 984991734:
                if (line.equals("edge_switch")) {
                    return b.e.d.a.f62858b;
                }
                return null;
            case 1127860672:
                if (line.equals("wave_60")) {
                    return b.w.C2225b.f62922b;
                }
                return null;
            case 1193267087:
                if (line.equals("ufiber_olt")) {
                    return b.j.C2220b.f62876b;
                }
                return null;
            case 1193267150:
                if (line.equals("ufiber_onu")) {
                    return b.j.c.a.f62877b;
                }
                return null;
            case 1684254319:
                if (line.equals("edge_switch_x")) {
                    return b.e.d.C2213b.f62859b;
                }
                return null;
            case 1717972535:
                if (line.equals("airfiber_60")) {
                    return b.AbstractC2196b.a.C2197a.f62827b;
                }
                return null;
            default:
                return null;
        }
    }
}
