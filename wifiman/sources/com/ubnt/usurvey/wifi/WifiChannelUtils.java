package com.ubnt.usurvey.wifi;

import S8.c;
import Z7.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import sh.C7974i;

/* loaded from: classes3.dex */
public final class WifiChannelUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final WifiChannelUtils f41035a = new WifiChannelUtils();

    /* renamed from: b, reason: collision with root package name */
    private static final C7974i f41036b = new C7974i(2412, 2484);

    /* renamed from: c, reason: collision with root package name */
    private static final C7974i f41037c = new C7974i(5160, 5885);

    /* renamed from: d, reason: collision with root package name */
    private static final C7974i f41038d = new C7974i(5955, 7115);

    /* renamed from: e, reason: collision with root package name */
    private static final C7974i f41039e = new C7974i(1, 14);

    /* renamed from: f, reason: collision with root package name */
    private static final C7974i f41040f = new C7974i(32, 177);

    /* renamed from: g, reason: collision with root package name */
    private static final C7974i f41041g = new C7974i(1, 233);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "common-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InternalError extends IllegalStateException {

        public static final class a extends Error {

            /* renamed from: a, reason: collision with root package name */
            private final String f41042a;

            public a(int i10) {
                this.f41042a = "No channel found for frequency " + i10;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.f41042a;
            }
        }

        public static final class b extends Error {

            /* renamed from: a, reason: collision with root package name */
            private final String f41043a;

            public b(int i10, S8.c band) {
                AbstractC6492s.i(band, "band");
                this.f41043a = "No frequency found for channel " + i10 + " on band " + band;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.f41043a;
            }
        }

        public static final class c extends Error {

            /* renamed from: a, reason: collision with root package name */
            private final String f41044a;

            public c(int i10) {
                this.f41044a = "No band found for frequency " + i10;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.f41044a;
            }
        }

        private InternalError() {
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41045a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41045a = iArr;
        }
    }

    private WifiChannelUtils() {
    }

    public final c a(int i10) {
        c cVar;
        C7974i c7974i = f41036b;
        int i11 = c7974i.i();
        if (i10 > c7974i.j() || i11 > i10) {
            C7974i c7974i2 = f41037c;
            int i12 = c7974i2.i();
            if (i10 > c7974i2.j() || i12 > i10) {
                C7974i c7974i3 = f41038d;
                cVar = ((i10 > c7974i3.j() || c7974i3.i() > i10) && i10 != 5935) ? null : c.GHZ_6;
            } else {
                cVar = c.GHZ_5;
            }
        } else {
            cVar = c.GHZ_2_4;
        }
        if (cVar == null) {
            b.f(new InternalError.c(i10), null, 2, null);
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer b(int r5, S8.c r6) {
        /*
            r4 = this;
            java.lang.String r0 = "band"
            kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
            int[] r0 = com.ubnt.usurvey.wifi.WifiChannelUtils.a.f41045a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L57
            if (r0 == r1) goto L3e
            r2 = 3
            if (r0 != r2) goto L38
            sh.i r0 = com.ubnt.usurvey.wifi.WifiChannelUtils.f41041g
            int r2 = r0.i()
            int r0 = r0.j()
            if (r5 > r0) goto L36
            if (r2 > r5) goto L36
            if (r5 != r1) goto L2b
            r0 = 5935(0x172f, float:8.317E-42)
            goto L31
        L2b:
            int r0 = r5 + (-1)
            int r0 = r0 * 5
            int r0 = r0 + 5955
        L31:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L7a
        L36:
            r0 = r3
            goto L7a
        L38:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L3e:
            sh.i r0 = com.ubnt.usurvey.wifi.WifiChannelUtils.f41040f
            int r2 = r0.i()
            int r0 = r0.j()
            if (r5 > r0) goto L36
            if (r2 > r5) goto L36
            int r0 = r5 + (-32)
            int r0 = r0 * 5
            int r0 = r0 + 5160
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L7a
        L57:
            r0 = 14
            if (r5 != r0) goto L62
            r0 = 2484(0x9b4, float:3.481E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L7a
        L62:
            sh.i r0 = com.ubnt.usurvey.wifi.WifiChannelUtils.f41039e
            int r2 = r0.i()
            int r0 = r0.j()
            if (r5 > r0) goto L36
            if (r2 > r5) goto L36
            int r0 = r5 + (-1)
            int r0 = r0 * 5
            int r0 = r0 + 2412
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7a:
            if (r0 != 0) goto L84
            com.ubnt.usurvey.wifi.WifiChannelUtils$InternalError$b r2 = new com.ubnt.usurvey.wifi.WifiChannelUtils$InternalError$b
            r2.<init>(r5, r6)
            Z7.b.f(r2, r3, r1, r3)
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ubnt.usurvey.wifi.WifiChannelUtils.b(int, S8.c):java.lang.Integer");
    }

    public final Integer c(int i10) {
        Integer numValueOf;
        if (i10 == 2484) {
            numValueOf = 14;
        } else {
            c cVarA = a(i10);
            int i11 = cVarA == null ? -1 : a.f41045a[cVarA.ordinal()];
            if (i11 == -1) {
                numValueOf = null;
            } else if (i11 == 1) {
                numValueOf = Integer.valueOf(((i10 - 2412) / 5) + 1);
            } else if (i11 == 2) {
                numValueOf = Integer.valueOf(((i10 - 5160) / 5) + 32);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(((i10 - 5955) / 5) + 1);
            }
        }
        if (numValueOf == null) {
            b.f(new InternalError.a(i10), null, 2, null);
        }
        return numValueOf;
    }
}
