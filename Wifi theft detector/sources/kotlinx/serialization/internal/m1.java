package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes4.dex */
public abstract class m1 {
    public static final void a(int i10, int i11, kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.e(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.h());
    }
}
