package O2;

import O2.i;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
public final class e<K extends i, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f10174a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10175b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final i f10176a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f10177b;

        /* renamed from: c, reason: collision with root package name */
        public a<K, V> f10178c;

        /* renamed from: d, reason: collision with root package name */
        public a<K, V> f10179d;

        public a() {
            this(null);
        }

        public a(i iVar) {
            this.f10179d = this;
            this.f10178c = this;
            this.f10176a = iVar;
        }
    }

    public final V a(K k10) {
        a aVar;
        HashMap map = this.f10175b;
        a aVar2 = (a) map.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            map.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f10179d;
        aVar4.f10178c = aVar.f10178c;
        aVar.f10178c.f10179d = aVar4;
        a<K, V> aVar5 = this.f10174a;
        aVar.f10179d = aVar5;
        a<K, V> aVar6 = aVar5.f10178c;
        aVar.f10178c = aVar6;
        aVar6.f10179d = aVar;
        aVar.f10179d.f10178c = aVar;
        ArrayList arrayList = aVar.f10177b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) aVar.f10177b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k10, V v10) {
        HashMap map = this.f10175b;
        a aVar = (a) map.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            aVar.f10178c = aVar;
            aVar.f10179d = aVar;
            a<K, V> aVar2 = this.f10174a;
            aVar.f10179d = aVar2.f10179d;
            aVar.f10178c = aVar2;
            aVar2.f10179d = aVar;
            aVar.f10179d.f10178c = aVar;
            map.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f10177b == null) {
            aVar.f10177b = new ArrayList();
        }
        aVar.f10177b.add(v10);
    }

    public final V c() {
        a<K, V> aVar = this.f10174a;
        a aVar2 = aVar.f10179d;
        while (true) {
            V v10 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f10177b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v10 = (V) aVar2.f10177b.remove(size - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar3 = aVar2.f10179d;
            aVar3.f10178c = aVar2.f10178c;
            aVar2.f10178c.f10179d = aVar3;
            HashMap map = this.f10175b;
            i iVar = aVar2.f10176a;
            map.remove(iVar);
            iVar.a();
            aVar2 = aVar2.f10179d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f10174a;
        a aVar2 = aVar.f10178c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.f10176a);
            sb.append(':');
            ArrayList arrayList = aVar2.f10177b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            aVar2 = aVar2.f10178c;
            z10 = true;
        }
        if (z10) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
