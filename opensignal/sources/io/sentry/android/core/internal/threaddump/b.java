package io.sentry.android.core.internal.threaddump;

import com.google.android.gms.internal.measurement.b4;
import i.g0;
import io.sentry.c5;
import io.sentry.protocol.z;
import io.sentry.x5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f11621f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f11622g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f11623h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f11624i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f11625l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f11626m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f11627n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f11628o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f11629p = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f11630q = Pattern.compile("\\s+");

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11631a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11632b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f11633c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11634d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11635e = new ArrayList();

    public b(x5 x5Var, boolean z10) {
        this.f11631a = x5Var;
        this.f11632b = z10;
        this.f11633c = new g0(x5Var);
    }

    public static void a(z zVar, c5 c5Var) {
        Map map = zVar.F;
        if (map == null) {
            map = new HashMap();
        }
        c5 c5Var2 = (c5) map.get(c5Var.f12114d);
        if (c5Var2 != null) {
            c5Var2.f12113a = Math.max(c5Var2.f12113a, c5Var.f12113a);
        } else {
            String str = c5Var.f12114d;
            c5 c5Var3 = new c5();
            c5Var3.f12113a = c5Var.f12113a;
            c5Var3.f12114d = str;
            c5Var3.f12115g = c5Var.f12115g;
            c5Var3.f12116r = c5Var.f12116r;
            c5Var3.f12117x = c5Var.f12117x;
            c5Var3.f12118y = b4.O(c5Var.f12118y);
            map.put(str, c5Var3);
        }
        zVar.F = map;
    }

    public static Long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
    
        r30 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e A[EDGE_INSN: B:138:0x017e->B:53:0x017e BREAK  A[LOOP:1: B:48:0x0168->B:124:0x0424], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(c3.h r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.b.d(c3.h):void");
    }
}
