package k8;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51322a;

        static {
            int[] iArr = new int[com.ubnt.usurvey.product.l.values().length];
            try {
                iArr[com.ubnt.usurvey.product.l.UDM_393.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDR_f36.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDMPRO_d87.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDMPROMAX_055.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDMPROSE_f02.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDW_1df.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f51322a = iArr;
        }
    }

    public static final s9.b a(com.ubnt.usurvey.product.l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        switch (a.f51322a[lVar.ordinal()]) {
            case 1:
            case 2:
                return Pe.a.f18599a.T();
            case 3:
            case 4:
            case 5:
                return Pe.a.f18599a.V();
            case 6:
                return Pe.a.f18599a.W();
            default:
                return null;
        }
    }
}
