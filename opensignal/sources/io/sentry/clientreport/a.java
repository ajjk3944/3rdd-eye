package io.sentry.clientreport;

import com.google.android.gms.internal.measurement.b4;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.protocol.i;
import io.sentry.protocol.m;
import io.sentry.s1;
import io.sentry.u0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12154a;

    public /* synthetic */ a(int i10) {
        this.f12154a = i10;
    }

    public static io.sentry.protocol.a b(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            switch (strP0) {
                case "split_names":
                    List list = (List) b2Var.q0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.I = list;
                        break;
                    }
                case "device_app_hash":
                    aVar.f12519g = b2Var.t0();
                    break;
                case "start_type":
                    aVar.F = b2Var.t0();
                    break;
                case "view_names":
                    List list2 = (List) b2Var.q0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.E = list2;
                        break;
                    }
                case "app_version":
                    aVar.f12522y = b2Var.t0();
                    break;
                case "in_foreground":
                    aVar.G = b2Var.w();
                    break;
                case "build_type":
                    aVar.f12520r = b2Var.t0();
                    break;
                case "app_identifier":
                    aVar.f12517a = b2Var.t0();
                    break;
                case "app_start_time":
                    aVar.f12518d = b2Var.y(u0Var);
                    break;
                case "permissions":
                    aVar.D = b4.O((Map) b2Var.q0());
                    break;
                case "app_name":
                    aVar.f12521x = b2Var.t0();
                    break;
                case "app_build":
                    aVar.B = b2Var.t0();
                    break;
                case "is_split_apks":
                    aVar.H = b2Var.w();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap, strP0);
                    break;
            }
        }
        aVar.J = concurrentHashMap;
        b2Var.i();
        return aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.protocol.c c(io.sentry.b2 r14, io.sentry.u0 r15) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.c(io.sentry.b2, io.sentry.u0):io.sentry.protocol.c");
    }

    public static io.sentry.protocol.f d(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        int i10;
        TimeZone timeZone;
        b2Var.f();
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            i10 = 10;
            switch (strP0) {
                case "timezone":
                    switch (b2Var.f12070a) {
                        case 0:
                            io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) b2Var.f12071d;
                            if (aVar.s0() == io.sentry.vendor.gson.stream.b.NULL) {
                                aVar.o0();
                            } else {
                                try {
                                    timeZone = TimeZone.getTimeZone(aVar.q0());
                                    break;
                                } catch (Exception e4) {
                                    u0Var.g(b5.ERROR, "Error when deserializing TimeZone", e4);
                                }
                            }
                            timeZone = null;
                            break;
                        default:
                            String str = (String) b2Var.v0();
                            if (str == null) {
                                timeZone = null;
                                break;
                            } else {
                                timeZone = TimeZone.getTimeZone(str);
                                break;
                            }
                    }
                    fVar.V = timeZone;
                    break;
                case "boot_time":
                    if (b2Var.w0() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        fVar.U = b2Var.y(u0Var);
                        break;
                    }
                case "simulator":
                    fVar.H = b2Var.w();
                    break;
                case "manufacturer":
                    fVar.f12544d = b2Var.t0();
                    break;
                case "processor_count":
                    fVar.f12541a0 = b2Var.Z();
                    break;
                case "orientation":
                    fVar.G = (io.sentry.protocol.e) b2Var.r0(u0Var, new a(i10));
                    break;
                case "battery_temperature":
                    fVar.Z = b2Var.V();
                    break;
                case "family":
                    fVar.f12548r = b2Var.t0();
                    break;
                case "locale":
                    fVar.X = b2Var.t0();
                    break;
                case "online":
                    fVar.F = b2Var.w();
                    break;
                case "battery_level":
                    fVar.D = b2Var.V();
                    break;
                case "model_id":
                    fVar.f12550y = b2Var.t0();
                    break;
                case "screen_density":
                    fVar.S = b2Var.V();
                    break;
                case "screen_dpi":
                    fVar.T = b2Var.Z();
                    break;
                case "free_memory":
                    fVar.J = b2Var.n0();
                    break;
                case "id":
                    fVar.W = b2Var.t0();
                    break;
                case "name":
                    fVar.f12540a = b2Var.t0();
                    break;
                case "low_memory":
                    fVar.L = b2Var.w();
                    break;
                case "archs":
                    List list = (List) b2Var.q0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        fVar.B = strArr;
                        break;
                    }
                case "brand":
                    fVar.f12547g = b2Var.t0();
                    break;
                case "model":
                    fVar.f12549x = b2Var.t0();
                    break;
                case "cpu_description":
                    fVar.f12543c0 = b2Var.t0();
                    break;
                case "processor_frequency":
                    fVar.f12542b0 = b2Var.L();
                    break;
                case "connection_type":
                    fVar.Y = b2Var.t0();
                    break;
                case "chipset":
                    fVar.f12545d0 = b2Var.t0();
                    break;
                case "screen_width_pixels":
                    fVar.Q = b2Var.Z();
                    break;
                case "external_storage_size":
                    fVar.O = b2Var.n0();
                    break;
                case "storage_size":
                    fVar.M = b2Var.n0();
                    break;
                case "usable_memory":
                    fVar.K = b2Var.n0();
                    break;
                case "memory_size":
                    fVar.I = b2Var.n0();
                    break;
                case "charging":
                    fVar.E = b2Var.w();
                    break;
                case "external_free_storage":
                    fVar.P = b2Var.n0();
                    break;
                case "free_storage":
                    fVar.N = b2Var.n0();
                    break;
                case "screen_height_pixels":
                    fVar.R = b2Var.Z();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap, strP0);
                    break;
            }
        }
        fVar.f12546e0 = concurrentHashMap;
        b2Var.i();
        return fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.protocol.g e(io.sentry.b2 r11, io.sentry.u0 r12) throws java.io.IOException {
        /*
            r11.f()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        La:
            io.sentry.vendor.gson.stream.b r7 = r11.w0()
            io.sentry.vendor.gson.stream.b r8 = io.sentry.vendor.gson.stream.b.NAME
            r9 = 0
            if (r7 != r8) goto L9c
            java.lang.String r7 = r11.p0()
            r7.getClass()
            int r8 = r7.hashCode()
            r10 = -1
            switch(r8) {
                case -964729863: goto L5b;
                case -454767501: goto L50;
                case 116079: goto L45;
                case 3373707: goto L3a;
                case 947010237: goto L2f;
                case 954925063: goto L24;
                default: goto L22;
            }
        L22:
            r9 = r10
            goto L64
        L24:
            java.lang.String r8 = "message"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L2d
            goto L22
        L2d:
            r9 = 5
            goto L64
        L2f:
            java.lang.String r8 = "contact_email"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L38
            goto L22
        L38:
            r9 = 4
            goto L64
        L3a:
            java.lang.String r8 = "name"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L43
            goto L22
        L43:
            r9 = 3
            goto L64
        L45:
            java.lang.String r8 = "url"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L4e
            goto L22
        L4e:
            r9 = 2
            goto L64
        L50:
            java.lang.String r8 = "replay_id"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L59
            goto L22
        L59:
            r9 = 1
            goto L64
        L5b:
            java.lang.String r8 = "associated_event_id"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L64
            goto L22
        L64:
            switch(r9) {
                case 0: goto L91;
                case 1: goto L86;
                case 2: goto L81;
                case 3: goto L7c;
                case 4: goto L77;
                case 5: goto L72;
                default: goto L67;
            }
        L67:
            if (r6 != 0) goto L6e
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
        L6e:
            r11.u0(r12, r6, r7)
            goto La
        L72:
            java.lang.String r0 = r11.t0()
            goto La
        L77:
            java.lang.String r1 = r11.t0()
            goto La
        L7c:
            java.lang.String r2 = r11.t0()
            goto La
        L81:
            java.lang.String r5 = r11.t0()
            goto La
        L86:
            io.sentry.protocol.t r4 = new io.sentry.protocol.t
            java.lang.String r7 = r11.s0()
            r4.<init>(r7)
            goto La
        L91:
            io.sentry.protocol.t r3 = new io.sentry.protocol.t
            java.lang.String r7 = r11.s0()
            r3.<init>(r7)
            goto La
        L9c:
            r11.i()
            if (r0 == 0) goto Lc4
            io.sentry.protocol.g r11 = new io.sentry.protocol.g
            r11.<init>()
            int r12 = r0.length()
            r7 = 4096(0x1000, float:5.74E-42)
            if (r12 <= r7) goto Lb5
            java.lang.String r12 = r0.substring(r9, r7)
            r11.f12554a = r12
            goto Lb7
        Lb5:
            r11.f12554a = r0
        Lb7:
            r11.f12555d = r1
            r11.f12556g = r2
            r11.f12557r = r3
            r11.f12558x = r4
            r11.f12559y = r5
            r11.B = r6
            return r11
        Lc4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing required field \"message\""
            r11.<init>(r0)
            io.sentry.b5 r1 = io.sentry.b5.ERROR
            r12.g(r1, r0, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.e(io.sentry.b2, io.sentry.u0):io.sentry.protocol.g");
    }

    public static i f(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        i iVar = new i();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            switch (strP0) {
                case "npot_support":
                    iVar.E = b2Var.t0();
                    break;
                case "vendor_id":
                    iVar.f12572g = b2Var.t0();
                    break;
                case "multi_threaded_rendering":
                    iVar.B = b2Var.w();
                    break;
                case "id":
                    iVar.f12571d = b2Var.Z();
                    break;
                case "name":
                    iVar.f12570a = b2Var.t0();
                    break;
                case "vendor_name":
                    iVar.f12573r = b2Var.t0();
                    break;
                case "version":
                    iVar.D = b2Var.t0();
                    break;
                case "api_type":
                    iVar.f12575y = b2Var.t0();
                    break;
                case "memory_size":
                    iVar.f12574x = b2Var.Z();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap, strP0);
                    break;
            }
        }
        iVar.F = concurrentHashMap;
        b2Var.i();
        return iVar;
    }

    public static m g(b2 b2Var, u0 u0Var) throws IOException {
        String strP0;
        b2Var.f();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (b2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
            strP0 = b2Var.p0();
            strP0.getClass();
            switch (strP0) {
                case "rooted":
                    mVar.f12595y = b2Var.w();
                    break;
                case "raw_description":
                    mVar.f12592g = b2Var.t0();
                    break;
                case "name":
                    mVar.f12590a = b2Var.t0();
                    break;
                case "build":
                    mVar.f12593r = b2Var.t0();
                    break;
                case "version":
                    mVar.f12591d = b2Var.t0();
                    break;
                case "kernel_version":
                    mVar.f12594x = b2Var.t0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    b2Var.u0(u0Var, concurrentHashMap, strP0);
                    break;
            }
        }
        mVar.B = concurrentHashMap;
        b2Var.i();
        return mVar;
    }

    public static IllegalStateException h(u0 u0Var, String str) {
        String strO = h0.b.o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strO);
        u0Var.g(b5.ERROR, strO, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(u0 u0Var, String str) {
        String strO = h0.b.o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strO);
        u0Var.g(b5.ERROR, strO, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(u0 u0Var, String str) {
        String strO = h0.b.o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strO);
        u0Var.g(b5.ERROR, strO, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:921:0x0fab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // io.sentry.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.b2 r38, io.sentry.u0 r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 5044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.a(io.sentry.b2, io.sentry.u0):java.lang.Object");
    }
}
