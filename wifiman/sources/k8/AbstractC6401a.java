package k8;

import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6401a {

    /* renamed from: k8.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1896a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51301a;

        static {
            int[] iArr = new int[U7.b.values().length];
            try {
                iArr[U7.b.BLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U7.b.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51301a = iArr;
        }
    }

    public static final s9.d a(U7.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        int i10 = C1896a.f51301a[bVar.ordinal()];
        if (i10 == 1) {
            return new d.b(R.string.bluetooth_type_low_energy);
        }
        if (i10 == 2) {
            return new d.b(R.string.bluetooth_type_low_classic);
        }
        throw new NoWhenBranchMatchedException();
    }
}
