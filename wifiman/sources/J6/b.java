package J6;

import J6.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class b implements Map {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f9788a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a f9789b;

    class a implements d.a {
        a() {
        }

        @Override // J6.d.a
        public d a(I6.a aVar) {
            return new d(aVar);
        }
    }

    public b() {
        this(new a());
    }

    private void b() {
        Iterator it = this.f9788a.entrySet().iterator();
        while (it.hasNext()) {
            if (((d) ((Map.Entry) it.next()).getValue()).b()) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.f9788a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9788a.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Iterator it = this.f9788a.values().iterator();
        while (it.hasNext()) {
            if (((d) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public I6.a get(Object obj) {
        d dVar = (d) this.f9788a.get(obj);
        if (dVar != null) {
            return (I6.a) dVar.get();
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public I6.a put(String str, I6.a aVar) {
        this.f9788a.put(str, this.f9789b.a(aVar));
        b();
        return aVar;
    }

    @Override // java.util.Map
    public Set entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f9788a.entrySet()) {
            d dVar = (d) entry.getValue();
            if (!dVar.b()) {
                hashSet.add(new J6.a((String) entry.getKey(), this.f9789b.a((I6.a) dVar.get())));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public I6.a remove(Object obj) {
        d dVar = (d) this.f9788a.remove(obj);
        b();
        if (dVar != null) {
            return (I6.a) dVar.get();
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        b();
        return this.f9788a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f9788a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put((String) entry.getKey(), (I6.a) entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        b();
        return this.f9788a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f9788a.values()) {
            if (!dVar.b()) {
                arrayList.add((I6.a) dVar.get());
            }
        }
        return arrayList;
    }

    b(d.a aVar) {
        this.f9788a = new HashMap();
        this.f9789b = aVar;
    }
}
