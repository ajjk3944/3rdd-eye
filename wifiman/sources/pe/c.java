package pe;

import com.ubnt.usurvey.wifi.WifiMcs;
import ke.EnumC6457b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f57878a = new c();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57879a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f57880b;

        static {
            int[] iArr = new int[S8.a.values().length];
            try {
                iArr[S8.a.BE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.a.AX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.a.AC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S8.a.f20357N.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S8.a.f20355B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S8.a.f20356G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[S8.a.f20354A.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[S8.a.AD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f57879a = iArr;
            int[] iArr2 = new int[EnumC6457b.values().length];
            try {
                iArr2[EnumC6457b.EHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC6457b.HE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC6457b.VHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC6457b.HT.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f57880b = iArr2;
        }
    }

    private c() {
    }

    public final WifiMcs a(EnumC6457b mcsType, int i10, int i11) {
        int i12;
        AbstractC6492s.i(mcsType, "mcsType");
        int i13 = a.f57880b[mcsType.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i12 = i10;
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = i10 % 8;
        }
        switch (i12) {
            case 0:
                return WifiMcs.f41046d.b(WifiMcs.c.BPSK, WifiMcs.a._1_2, i11);
            case 1:
                return WifiMcs.f41046d.b(WifiMcs.c.QPSK, WifiMcs.a._1_2, i11);
            case 2:
                return WifiMcs.f41046d.b(WifiMcs.c.QPSK, WifiMcs.a._3_4, i11);
            case 3:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_16, WifiMcs.a._1_2, i11);
            case 4:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_16, WifiMcs.a._3_4, i11);
            case 5:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_64, WifiMcs.a._2_3, i11);
            case 6:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_64, WifiMcs.a._3_4, i11);
            case 7:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_64, WifiMcs.a._5_6, i11);
            case 8:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_256, WifiMcs.a._3_4, i11);
            case 9:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_256, WifiMcs.a._5_6, i11);
            case 10:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_1024, WifiMcs.a._3_4, i11);
            case 11:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_1024, WifiMcs.a._5_6, i11);
            case 12:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_4096, WifiMcs.a._3_4, i11);
            case 13:
                return WifiMcs.f41046d.b(WifiMcs.c.QAM_4096, WifiMcs.a._5_6, i11);
            case 14:
                return WifiMcs.f41046d.b(WifiMcs.c.BPSK, WifiMcs.a._1_2, i11);
            case 15:
                return WifiMcs.f41046d.b(WifiMcs.c.BPSK, WifiMcs.a._1_2, i11);
            default:
                throw new IllegalArgumentException("invalid mcs index '" + i12 + "' got from (" + mcsType + ", " + i10 + ", " + i11 + ")");
        }
    }

    public final EnumC6457b b(S8.a ieeeMode) {
        AbstractC6492s.i(ieeeMode, "ieeeMode");
        switch (a.f57879a[ieeeMode.ordinal()]) {
            case 1:
                return EnumC6457b.EHT;
            case 2:
                return EnumC6457b.HE;
            case 3:
                return EnumC6457b.VHT;
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC6457b.HT;
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
