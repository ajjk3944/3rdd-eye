package Qb;

import b8.EnumC4076c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19277a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4076c.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4076c.ETHERNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4076c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19277a = iArr;
        }
    }

    public static final String a(EnumC4076c enumC4076c) {
        AbstractC6492s.i(enumC4076c, "<this>");
        int i10 = a.f19277a[enumC4076c.ordinal()];
        if (i10 == 1) {
            return "Disconnected";
        }
        if (i10 == 2) {
            return "Mobile.3G";
        }
        if (i10 == 3) {
            return "WiFi";
        }
        if (i10 == 4) {
            return "Ethernet";
        }
        if (i10 == 5) {
            return "Unknown";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.equals("VPN") != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return b8.EnumC4076c.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r3.equals("Unknown") != false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final b8.EnumC4076c b(java.lang.String r3) {
        /*
            if (r3 == 0) goto L4f
            int r0 = r3.hashCode()
            switch(r0) {
                case -1666717920: goto L43;
                case -1354714121: goto L37;
                case -1217068453: goto L2c;
                case 85204: goto L20;
                case 2694997: goto L14;
                case 1379812394: goto La;
                default: goto L9;
            }
        L9:
            goto L4f
        La:
            java.lang.String r0 = "Unknown"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            goto L29
        L14:
            java.lang.String r0 = "WiFi"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            b8.c r3 = b8.EnumC4076c.WIFI
            goto L4e
        L20:
            java.lang.String r0 = "VPN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
        L29:
            b8.c r3 = b8.EnumC4076c.UNKNOWN
            goto L4e
        L2c:
            java.lang.String r0 = "Disconnected"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            b8.c r3 = b8.EnumC4076c.DISCONNECTED
            goto L4e
        L37:
            java.lang.String r0 = "Ethernet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            b8.c r3 = b8.EnumC4076c.ETHERNET
            goto L4e
        L43:
            java.lang.String r0 = "Mobile.3G"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4f
            b8.c r3 = b8.EnumC4076c.MOBILE
        L4e:
            return r3
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown NetworkConnectionType `"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "`"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.b.b(java.lang.String):b8.c");
    }
}
