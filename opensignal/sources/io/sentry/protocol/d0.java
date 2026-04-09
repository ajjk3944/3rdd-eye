package io.sentry.protocol;

import com.google.android.gms.internal.measurement.b4;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.s1;
import io.sentry.u0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d0 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12533a;

    public /* synthetic */ d0(int i10) {
        this.f12533a = i10;
    }

    public static io.sentry.rrweb.a b(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP02 = b2Var.p0();
            strP02.getClass();
            if (strP02.equals("data")) {
                b2Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strP03 = b2Var.p0();
                    strP03.getClass();
                    if (strP03.equals("payload")) {
                        b2Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                            strP0 = b2Var.p0();
                            strP0.getClass();
                            switch (strP0) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapO = b4.O((Map) b2Var.q0());
                                    if (concurrentHashMapO == null) {
                                        break;
                                    } else {
                                        aVar.E = concurrentHashMapO;
                                        break;
                                    }
                                case "type":
                                    aVar.f12697x = b2Var.t0();
                                    break;
                                case "category":
                                    aVar.f12698y = b2Var.t0();
                                    break;
                                case "timestamp":
                                    aVar.f12696r = b2Var.G();
                                    break;
                                case "level":
                                    try {
                                        aVar.D = b5.valueOf(b2Var.s0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e4) {
                                        u0Var.f(b5.DEBUG, e4, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                case "message":
                                    aVar.B = b2Var.t0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.u0(u0Var, concurrentHashMap2, strP0);
                                    break;
                            }
                        }
                        aVar.G = concurrentHashMap2;
                        b2Var.i();
                    } else if (strP03.equals("tag")) {
                        String strT0 = b2Var.t0();
                        if (strT0 == null) {
                            strT0 = "";
                        }
                        aVar.f12695g = strT0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.u0(u0Var, concurrentHashMap, strP03);
                    }
                }
                aVar.H = concurrentHashMap;
                b2Var.i();
            } else if (strP02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(8));
                ir.f0.T(cVar, "");
                aVar.f12699a = cVar;
            } else if (strP02.equals("timestamp")) {
                aVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP02);
            }
        }
        aVar.F = map;
        b2Var.i();
        return aVar;
    }

    public static io.sentry.rrweb.g c(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP02 = b2Var.p0();
            strP02.getClass();
            if (strP02.equals("data")) {
                b2Var.f();
                HashMap map2 = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    strP0 = b2Var.p0();
                    strP0.getClass();
                    switch (strP0) {
                        case "x":
                            gVar.f12704y = b2Var.R();
                            break;
                        case "y":
                            gVar.B = b2Var.R();
                            break;
                        case "id":
                            gVar.f12703x = b2Var.Y();
                            break;
                        case "type":
                            gVar.f12702r = (io.sentry.rrweb.f) b2Var.r0(u0Var, new d0(11));
                            break;
                        case "pointerType":
                            gVar.D = b2Var.Y();
                            break;
                        case "pointerId":
                            gVar.E = b2Var.Y();
                            break;
                        default:
                            if (!strP0.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                b2Var.u0(u0Var, map2, strP0);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) b2Var.r0(u0Var, new d0(9));
                                ir.f0.T(dVar, "");
                                gVar.f12701g = dVar;
                                break;
                            }
                    }
                }
                gVar.G = map2;
                b2Var.i();
            } else if (strP02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(8));
                ir.f0.T(cVar, "");
                gVar.f12699a = cVar;
            } else if (strP02.equals("timestamp")) {
                gVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP02);
            }
        }
        gVar.F = map;
        b2Var.i();
        return gVar;
    }

    public static io.sentry.rrweb.i d(b2 b2Var, u0 u0Var) throws IOException {
        b2Var.f();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP0 = b2Var.p0();
            strP0.getClass();
            if (strP0.equals("data")) {
                b2Var.f();
                HashMap map2 = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strP02 = b2Var.p0();
                    strP02.getClass();
                    if (strP02.equals("pointerId")) {
                        iVar.f12710r = b2Var.Y();
                    } else if (strP02.equals("positions")) {
                        iVar.f12711x = b2Var.f0(u0Var, new d0(13));
                    } else if (strP02.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) b2Var.r0(u0Var, new d0(9));
                        ir.f0.T(dVar, "");
                        iVar.f12701g = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        b2Var.u0(u0Var, map2, strP02);
                    }
                }
                iVar.B = map2;
                b2Var.i();
            } else if (strP0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(8));
                ir.f0.T(cVar, "");
                iVar.f12699a = cVar;
            } else if (strP0.equals("timestamp")) {
                iVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP0);
            }
        }
        iVar.f12712y = map;
        b2Var.i();
        return iVar;
    }

    public static io.sentry.rrweb.j e(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP02 = b2Var.p0();
            strP02.getClass();
            if (strP02.equals("data")) {
                b2Var.f();
                AbstractMap concurrentHashMap = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    strP0 = b2Var.p0();
                    strP0.getClass();
                    switch (strP0) {
                        case "height":
                            Integer numZ = b2Var.Z();
                            jVar.f12714r = numZ != null ? numZ.intValue() : 0;
                            break;
                        case "href":
                            String strT0 = b2Var.t0();
                            if (strT0 == null) {
                                strT0 = "";
                            }
                            jVar.f12713g = strT0;
                            break;
                        case "width":
                            Integer numZ2 = b2Var.Z();
                            jVar.f12715x = numZ2 != null ? numZ2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            b2Var.u0(u0Var, concurrentHashMap, strP0);
                            break;
                    }
                }
                b2Var.i();
            } else if (strP02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(8));
                ir.f0.T(cVar, "");
                jVar.f12699a = cVar;
            } else if (strP02.equals("timestamp")) {
                jVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP02);
            }
        }
        jVar.f12716y = map;
        b2Var.i();
        return jVar;
    }

    public static io.sentry.rrweb.l f(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP02 = b2Var.p0();
            strP02.getClass();
            if (strP02.equals("data")) {
                b2Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strP03 = b2Var.p0();
                    strP03.getClass();
                    if (strP03.equals("payload")) {
                        b2Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                            strP0 = b2Var.p0();
                            strP0.getClass();
                            switch (strP0) {
                                case "description":
                                    lVar.f12721x = b2Var.t0();
                                    break;
                                case "endTimestamp":
                                    lVar.B = b2Var.G();
                                    break;
                                case "startTimestamp":
                                    lVar.f12722y = b2Var.G();
                                    break;
                                case "op":
                                    lVar.f12720r = b2Var.t0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapO = b4.O((Map) b2Var.q0());
                                    if (concurrentHashMapO == null) {
                                        break;
                                    } else {
                                        lVar.D = concurrentHashMapO;
                                        break;
                                    }
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.u0(u0Var, concurrentHashMap2, strP0);
                                    break;
                            }
                        }
                        lVar.F = concurrentHashMap2;
                        b2Var.i();
                    } else if (strP03.equals("tag")) {
                        String strT0 = b2Var.t0();
                        if (strT0 == null) {
                            strT0 = "";
                        }
                        lVar.f12719g = strT0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.u0(u0Var, concurrentHashMap, strP03);
                    }
                }
                lVar.G = concurrentHashMap;
                b2Var.i();
            } else if (strP02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(8));
                ir.f0.T(cVar, "");
                lVar.f12699a = cVar;
            } else if (strP02.equals("timestamp")) {
                lVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP02);
            }
        }
        lVar.E = map;
        b2Var.i();
        return lVar;
    }

    public static io.sentry.rrweb.m g(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strP02 = b2Var.p0();
            strP02.getClass();
            int i10 = 8;
            if (strP02.equals("data")) {
                b2Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strP03 = b2Var.p0();
                    strP03.getClass();
                    if (strP03.equals("payload")) {
                        b2Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                            strP0 = b2Var.p0();
                            strP0.getClass();
                            switch (strP0) {
                                case "duration":
                                    mVar.f12726y = b2Var.i0();
                                    break;
                                case "segmentId":
                                    mVar.f12724r = b2Var.Y();
                                    break;
                                case "height":
                                    Integer numZ = b2Var.Z();
                                    mVar.E = numZ != null ? numZ.intValue() : 0;
                                    break;
                                case "container":
                                    String strT0 = b2Var.t0();
                                    if (strT0 == null) {
                                        strT0 = "";
                                    }
                                    mVar.D = strT0;
                                    break;
                                case "frameCount":
                                    Integer numZ2 = b2Var.Z();
                                    mVar.G = numZ2 != null ? numZ2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numZ3 = b2Var.Z();
                                    mVar.K = numZ3 != null ? numZ3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numZ4 = b2Var.Z();
                                    mVar.J = numZ4 != null ? numZ4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lN0 = b2Var.n0();
                                    mVar.f12725x = lN0 == null ? 0L : lN0.longValue();
                                    break;
                                case "width":
                                    Integer numZ5 = b2Var.Z();
                                    mVar.F = numZ5 != null ? numZ5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numZ6 = b2Var.Z();
                                    mVar.I = numZ6 != null ? numZ6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strT02 = b2Var.t0();
                                    if (strT02 == null) {
                                        strT02 = "";
                                    }
                                    mVar.B = strT02;
                                    break;
                                case "frameRateType":
                                    String strT03 = b2Var.t0();
                                    if (strT03 == null) {
                                        strT03 = "";
                                    }
                                    mVar.H = strT03;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    b2Var.u0(u0Var, concurrentHashMap2, strP0);
                                    break;
                            }
                        }
                        mVar.M = concurrentHashMap2;
                        b2Var.i();
                    } else if (strP03.equals("tag")) {
                        String strT04 = b2Var.t0();
                        if (strT04 == null) {
                            strT04 = "";
                        }
                        mVar.f12723g = strT04;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        b2Var.u0(u0Var, concurrentHashMap, strP03);
                    }
                }
                mVar.N = concurrentHashMap;
                b2Var.i();
            } else if (strP02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) b2Var.r0(u0Var, new d0(i10));
                ir.f0.T(cVar, "");
                mVar.f12699a = cVar;
            } else if (strP02.equals("timestamp")) {
                mVar.f12700d = b2Var.i0();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                b2Var.u0(u0Var, map, strP02);
            }
        }
        mVar.L = map;
        b2Var.i();
        return mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    @Override // io.sentry.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.b2 r18, io.sentry.u0 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.d0.a(io.sentry.b2, io.sentry.u0):java.lang.Object");
    }
}
