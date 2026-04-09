package A8;

import com.ubnt.mlkit.product.a;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* renamed from: A8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2409a {

    /* renamed from: A8.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0009a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f363a;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.UNIFI_AP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.UNIFI_AP_INWALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.UNIFI_AP_FLEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.AMPLIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.AMPLIFI_INSTANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.AMPLIFI_ALIEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.AMPLIFI_MESHPOINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.UDM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f363a = iArr;
        }
    }

    public static final s9.d a(a.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        switch (C0009a.f363a[bVar.ordinal()]) {
            case 1:
                return new d.b(R.string.product_unifi_ap);
            case 2:
                return new d.b(R.string.product_unifi_ap_inwall);
            case 3:
                return new d.b(R.string.product_unifi_ap_flex);
            case 4:
                return new d.c("AFI_R_af7");
            case 5:
                return new d.c("AFI_INS_R_eb2");
            case 6:
                return new d.c("AFI_ALN_R_cb7");
            case 7:
                return new d.c("AFI_P_e44");
            case 8:
                return new d.c("UDM_393");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int b(a.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        com.ubnt.usurvey.product.r rVarA = com.ubnt.usurvey.product.s.a(d(bVar));
        Integer numValueOf = rVarA != null ? Integer.valueOf(rVarA.b()) : null;
        AbstractC6492s.f(numValueOf);
        return numValueOf.intValue();
    }

    public static final int c(a.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        com.ubnt.usurvey.product.r rVarA = com.ubnt.usurvey.product.s.a(d(bVar));
        Integer numValueOf = rVarA != null ? Integer.valueOf(rVarA.a()) : null;
        AbstractC6492s.f(numValueOf);
        return numValueOf.intValue();
    }

    private static final com.ubnt.usurvey.product.l d(a.b bVar) {
        switch (C0009a.f363a[bVar.ordinal()]) {
            case 1:
                return com.ubnt.usurvey.product.l.U7NHD_3e3;
            case 2:
                return com.ubnt.usurvey.product.l.U7IWP_cc9;
            case 3:
                return com.ubnt.usurvey.product.l.UFLHD_094;
            case 4:
                return com.ubnt.usurvey.product.l.AFI_R_af7;
            case 5:
                return com.ubnt.usurvey.product.l.AFI_INS_R_eb2;
            case 6:
                return com.ubnt.usurvey.product.l.AFI_ALN_R_cb7;
            case 7:
                return com.ubnt.usurvey.product.l.AFI_P_e44;
            case 8:
                return com.ubnt.usurvey.product.l.UDM_393;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
