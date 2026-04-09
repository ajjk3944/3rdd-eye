package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dr3 {
    public static final Charset b = Charset.forName("UTF-8");
    public final ByteArrayInputStream a;

    public dr3(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public static int b(b44 b44Var) throws NumberFormatException, IOException {
        if (!(b44Var instanceof f44)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(b44Var.c().f instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberD = b44Var.c().d();
        try {
            if (!(numberD instanceof uu3)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j = Long.parseLong(((uu3) numberD).f);
            if (j > 4294967295L || j < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0227 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f A[Catch: all -> 0x0031, IllegalStateException -> 0x0034, e44 -> 0x0037, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:13:0x003a, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x0082, B:25:0x0088, B:27:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00ac, B:35:0x00b4, B:51:0x00ff, B:56:0x0136, B:69:0x0159, B:71:0x016f, B:73:0x0175, B:75:0x017b, B:90:0x01ea, B:91:0x021d, B:92:0x0226, B:93:0x0227, B:94:0x022e, B:60:0x0141, B:64:0x014c, B:68:0x0157, B:95:0x022f, B:96:0x0238, B:97:0x0239, B:98:0x0242, B:99:0x0243, B:100:0x024a, B:101:0x024b, B:102:0x0252, B:103:0x0253, B:106:0x025d, B:107:0x0264, B:108:0x0265, B:109:0x026c, B:110:0x026d, B:111:0x0274, B:112:0x0275, B:113:0x027a), top: B:116:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vz3 a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr3.a():vz3");
    }
}
