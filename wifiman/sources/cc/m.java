package Cc;

import kotlin.jvm.internal.AbstractC6492s;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public abstract class m {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2519a;

        static {
            int[] iArr = new int[com.ubnt.usurvey.product.l.values().length];
            try {
                iArr[com.ubnt.usurvey.product.l.UDMA67A_ae6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.ubnt.usurvey.product.l.UDMA69B_7c8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2519a = iArr;
        }
    }

    public static final boolean a(InterfaceC8439a.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        com.ubnt.usurvey.product.l lVar = (com.ubnt.usurvey.product.l) dVar.N();
        int i10 = lVar == null ? -1 : a.f2519a[lVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? false : true;
    }
}
