package b6;

import C6.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import x6.InterfaceC8423a;

/* loaded from: classes3.dex */
public abstract class c {
    public static final void a(HashMap map, float f10, float f11, InterfaceC8423a entry, int i10) {
        AbstractC6492s.i(map, "<this>");
        AbstractC6492s.i(entry, "entry");
        Float fValueOf = Float.valueOf(f10);
        Object arrayList = map.get(fValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList(0);
            map.put(fValueOf, arrayList);
        }
        ((List) arrayList).add(new a.C0081a(D6.b.a(f10, f11), entry, i10, null));
    }
}
