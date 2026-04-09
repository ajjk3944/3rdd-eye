package Q9;

import N7.C1154e9;
import java.util.ArrayList;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11423a = new Object();

    public static final void a(int i, int i10, O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.g(i12));
            }
            i11 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.l.f(serialName, "serialName");
        throw new M9.c(arrayList, arrayList.size() == 1 ? C1154e9.j(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
