package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12175a;

    public /* synthetic */ d(int i10) {
        this.f12175a = i10;
    }

    public static k6 b(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.protocol.t tVar = null;
        n6 n6Var = null;
        String strS0 = null;
        ConcurrentHashMap concurrentHashMap = null;
        n6 n6Var2 = null;
        String strS02 = null;
        o6 o6Var = null;
        String strS03 = null;
        ConcurrentHashMap concurrentHashMapO = null;
        Map map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            switch (strP0) {
                case "span_id":
                    n6Var = new n6(b2Var.s0());
                    break;
                case "parent_span_id":
                    n6Var2 = (n6) b2Var.r0(u0Var, new d(21));
                    break;
                case "description":
                    strS02 = b2Var.s0();
                    break;
                case "origin":
                    strS03 = b2Var.s0();
                    break;
                case "status":
                    o6Var = (o6) b2Var.r0(u0Var, new d(22));
                    break;
                case "op":
                    strS0 = b2Var.s0();
                    break;
                case "data":
                    map = (Map) b2Var.q0();
                    break;
                case "tags":
                    concurrentHashMapO = com.google.android.gms.internal.measurement.b4.O((Map) b2Var.q0());
                    break;
                case "trace_id":
                    tVar = new io.sentry.protocol.t(b2Var.s0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap, strP0);
                    break;
            }
        }
        if (tVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            u0Var.g(b5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (n6Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            u0Var.g(b5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strS0 == null) {
            strS0 = "";
        }
        k6 k6Var = new k6(tVar, n6Var, strS0, n6Var2);
        k6Var.f12417y = strS02;
        k6Var.B = o6Var;
        k6Var.E = strS03;
        if (concurrentHashMapO != null) {
            k6Var.D = concurrentHashMapO;
        }
        if (map != null) {
            k6Var.F = map;
        }
        k6Var.G = concurrentHashMap;
        b2Var.i();
        return k6Var;
    }

    private final Object c(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        Date dateQ = dr.a.q();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strT0 = null;
        String strT02 = null;
        String strT03 = null;
        String strT04 = null;
        b5 b5VarValueOf = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            switch (strP0) {
                case "origin":
                    strT04 = b2Var.t0();
                    break;
                case "data":
                    ConcurrentHashMap concurrentHashMapO = com.google.android.gms.internal.measurement.b4.O((Map) b2Var.q0());
                    if (concurrentHashMapO == null) {
                        break;
                    } else {
                        concurrentHashMap = concurrentHashMapO;
                        break;
                    }
                case "type":
                    strT02 = b2Var.t0();
                    break;
                case "category":
                    strT03 = b2Var.t0();
                    break;
                case "timestamp":
                    Date dateY = b2Var.y(u0Var);
                    if (dateY == null) {
                        break;
                    } else {
                        dateQ = dateY;
                        break;
                    }
                case "level":
                    try {
                        b5VarValueOf = b5.valueOf(b2Var.s0().toUpperCase(Locale.ROOT));
                        break;
                    } catch (Exception e4) {
                        u0Var.f(b5.ERROR, e4, "Error when deserializing SentryLevel", new Object[0]);
                        break;
                    }
                case "message":
                    strT0 = b2Var.t0();
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap2, strP0);
                    break;
            }
        }
        e eVar = new e(dateQ);
        eVar.f12203r = strT0;
        eVar.f12204x = strT02;
        eVar.f12205y = concurrentHashMap;
        eVar.B = strT03;
        eVar.D = strT04;
        eVar.E = b5VarValueOf;
        eVar.F = concurrentHashMap2;
        b2Var.i();
        return eVar;
    }

    public static IllegalStateException d(u0 u0Var, String str) {
        String strO = h0.b.o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strO);
        u0Var.g(b5.ERROR, strO, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException e(u0 u0Var, String str) {
        String strO = h0.b.o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strO);
        u0Var.g(b5.ERROR, strO, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ba, code lost:
    
        r5.h();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:262:0x03b2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:1101:0x12b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x0f86  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // io.sentry.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.b2 r45, io.sentry.u0 r46) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 6072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.d.a(io.sentry.b2, io.sentry.u0):java.lang.Object");
    }
}
