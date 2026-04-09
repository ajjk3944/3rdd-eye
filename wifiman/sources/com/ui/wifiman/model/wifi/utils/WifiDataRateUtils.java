package com.ui.wifiman.model.wifi.utils;

import S8.d;
import com.ubnt.usurvey.wifi.WifiMcs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class WifiDataRateUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final WifiDataRateUtils f44060a = new WifiDataRateUtils();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils$IeeeModeUnsupportedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IeeeModeUnsupportedException extends IllegalStateException {
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44061a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44062b;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.MHZ_20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.MHZ_40.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.MHZ_80.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.MHZ_160.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.MHZ_80_80.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.MHZ_320.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f44061a = iArr;
            int[] iArr2 = new int[S8.a.values().length];
            try {
                iArr2[S8.a.f20354A.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[S8.a.f20355B.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[S8.a.f20356G.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[S8.a.f20357N.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[S8.a.AC.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[S8.a.AX.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[S8.a.BE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[S8.a.AD.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            f44062b = iArr2;
        }
    }

    private WifiDataRateUtils() {
    }

    private final float a(S8.a aVar) {
        switch (a.f44062b[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 0.4f;
            case 6:
            case 7:
                return 0.8f;
            case 8:
                throw new IeeeModeUnsupportedException();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float c(S8.a r5, S8.d r6) {
        /*
            r4 = this;
            int[] r0 = com.ui.wifiman.model.wifi.utils.WifiDataRateUtils.a.f44062b
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1148518400(0x44750000, float:980.0)
            r1 = 1131020288(0x436a0000, float:234.0)
            r2 = 1156907008(0x44f50000, float:1960.0)
            r3 = 1139408896(0x43ea0000, float:468.0)
            switch(r5) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L39;
                case 7: goto L1f;
                case 8: goto L19;
                default: goto L13;
            }
        L13:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L19:
            com.ui.wifiman.model.wifi.utils.WifiDataRateUtils$IeeeModeUnsupportedException r5 = new com.ui.wifiman.model.wifi.utils.WifiDataRateUtils$IeeeModeUnsupportedException
            r5.<init>()
            throw r5
        L1f:
            int[] r5 = com.ui.wifiman.model.wifi.utils.WifiDataRateUtils.a.f44061a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L37;
                case 2: goto L35;
                case 3: goto L60;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L30;
                default: goto L2a;
            }
        L2a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L30:
            r0 = 1165295616(0x45750000, float:3920.0)
            goto L60
        L33:
            r0 = r2
            goto L60
        L35:
            r0 = r3
            goto L60
        L37:
            r0 = r1
            goto L60
        L39:
            int[] r5 = com.ui.wifiman.model.wifi.utils.WifiDataRateUtils.a.f44061a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L37;
                case 2: goto L35;
                case 3: goto L60;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L33;
                default: goto L44;
            }
        L44:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4a:
            int[] r5 = com.ui.wifiman.model.wifi.utils.WifiDataRateUtils.a.f44061a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L5e;
                case 2: goto L5b;
                case 3: goto L37;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                default: goto L55;
            }
        L55:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5b:
            r0 = 1121452032(0x42d80000, float:108.0)
            goto L60
        L5e:
            r0 = 1112539136(0x42500000, float:52.0)
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.wifi.utils.WifiDataRateUtils.c(S8.a, S8.d):float");
    }

    private final float d(S8.a aVar) {
        switch (a.f44062b[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 3.2f;
            case 6:
            case 7:
                return 12.8f;
            case 8:
                throw new IeeeModeUnsupportedException();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final W7.a b(S8.a phyMode, WifiMcs mcs, d channelWidth) {
        AbstractC6492s.i(phyMode, "phyMode");
        AbstractC6492s.i(mcs, "mcs");
        AbstractC6492s.i(channelWidth, "channelWidth");
        return W7.a.f23676b.c((((c(phyMode, channelWidth) * mcs.b().getNcb()) * mcs.a().getR()) * mcs.c()) / (d(phyMode) + a(phyMode)));
    }
}
