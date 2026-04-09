package pk;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import ir.m;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lr.t0;
import mq.g;
import mq.p;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final List f20588a;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f20589d;

    public b(List list, Object[] objArr) {
        l.e(list, "parameterKeys");
        this.f20588a = list;
        this.f20589d = objArr;
    }

    @Override // mq.g
    public final Set a() {
        List list = this.f20588a;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            arrayList.add(new AbstractMap.SimpleEntry((m) obj, this.f20589d[i10]));
            i10 = i11;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : arrayList) {
            if (((AbstractMap.SimpleEntry) obj2).getValue() != c.f20590a) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof m) {
            return this.f20589d[((t0) ((m) obj)).f15690d] != c.f20590a;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof m)) {
            return null;
        }
        Object obj2 = this.f20589d[((t0) ((m) obj)).f15690d];
        if (obj2 != c.f20590a) {
            return obj2;
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m) ? obj2 : super.getOrDefault((m) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l.e((m) obj, "key");
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof m) {
            return super.remove((m) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof m) {
            return super.remove((m) obj, obj2);
        }
        return false;
    }
}
