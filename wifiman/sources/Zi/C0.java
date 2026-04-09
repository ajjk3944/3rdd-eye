package Zi;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes4.dex */
public abstract class C0 {
    public static final void a(int i10, int i11, Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.f(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.a());
    }
}
