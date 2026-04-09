package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ql0 {
    public int a;
    public InetAddress b;
    public int c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;
    public pl0 g;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (java.net.NetworkInterface.getByInetAddress(r4) != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ql0 a(java.lang.String r4) throws java.net.UnknownHostException {
        /*
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)
            ql0 r0 = new ql0
            r0.<init>()
            r1 = 50
            r0.a = r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.c = r2
            r3 = 0
            r0.d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.e = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f = r3
            r0.b = r4
            java.util.regex.Pattern r3 = defpackage.x10.a
            if (r4 != 0) goto L29
            goto L3d
        L29:
            boolean r3 = r4.isAnyLocalAddress()
            if (r3 != 0) goto L53
            boolean r3 = r4.isLoopbackAddress()
            if (r3 == 0) goto L36
            goto L53
        L36:
            java.net.NetworkInterface r4 = java.net.NetworkInterface.getByInetAddress(r4)     // Catch: java.net.SocketException -> L3d
            if (r4 == 0) goto L3d
            goto L53
        L3d:
            java.net.InetAddress r4 = r0.b
            if (r4 == 0) goto L4c
            boolean r4 = r4.isSiteLocalAddress()
            if (r4 == 0) goto L4c
            r0.c = r2
            r0.a = r1
            goto L52
        L4c:
            r4 = 2500(0x9c4, float:3.503E-42)
            r0.c = r4
            r0.a = r1
        L52:
            return r0
        L53:
            r4 = 25
            r0.c = r4
            r4 = 7
            r0.a = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql0.a(java.lang.String):ql0");
    }

    public static void b(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Start port cannot be less than 1");
        }
        if (i > 65535) {
            throw new IllegalArgumentException("Start cannot be greater than 65535");
        }
    }
}
