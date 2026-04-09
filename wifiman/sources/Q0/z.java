package Q0;

import Zg.AbstractC3689v;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final List f19110a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19111b;

    public z(y... yVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (yVarArr.length > 0) {
            y yVar = yVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + AbstractC3689v.z0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
            }
            AbstractC3689v.C(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f19110a = arrayList2;
        if (arrayList2.size() > 0) {
            AbstractC5487d.a(arrayList2.get(0));
            throw null;
        }
        this.f19111b = false;
    }

    public final List a() {
        return this.f19110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && AbstractC6492s.d(this.f19110a, ((z) obj).f19110a);
    }

    public int hashCode() {
        return this.f19110a.hashCode();
    }
}
