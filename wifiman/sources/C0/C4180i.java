package c0;

import Zg.AbstractC3689v;
import Zg.U;
import c0.InterfaceC4179h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4180i implements InterfaceC4179h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f33629a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f33630b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f33631c;

    /* renamed from: c0.i$a */
    public static final class a implements InterfaceC4179h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f33634c;

        a(String str, InterfaceC6824a interfaceC6824a) {
            this.f33633b = str;
            this.f33634c = interfaceC6824a;
        }

        @Override // c0.InterfaceC4179h.a
        public void a() {
            List list = (List) C4180i.this.f33631c.remove(this.f33633b);
            if (list != null) {
                list.remove(this.f33634c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            C4180i.this.f33631c.put(this.f33633b, list);
        }
    }

    public C4180i(Map map, InterfaceC6835l interfaceC6835l) {
        Map mapX;
        this.f33629a = interfaceC6835l;
        this.f33630b = (map == null || (mapX = U.x(map)) == null) ? new LinkedHashMap() : mapX;
        this.f33631c = new LinkedHashMap();
    }

    @Override // c0.InterfaceC4179h
    public boolean a(Object obj) {
        return ((Boolean) this.f33629a.invoke(obj)).booleanValue();
    }

    @Override // c0.InterfaceC4179h
    public Map b() {
        Map mapX = U.x(this.f33630b);
        for (Map.Entry entry : this.f33631c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((InterfaceC6824a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException(AbstractC4174c.b(objInvoke).toString());
                    }
                    mapX.put(str, AbstractC3689v.h(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((InterfaceC6824a) list.get(i10)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException(AbstractC4174c.b(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapX.put(str, arrayList);
            }
        }
        return mapX;
    }

    @Override // c0.InterfaceC4179h
    public Object c(String str) {
        List list = (List) this.f33630b.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.f33630b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // c0.InterfaceC4179h
    public InterfaceC4179h.a e(String str, InterfaceC6824a interfaceC6824a) {
        if (AbstractC4181j.c(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map = this.f33631c;
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        ((List) arrayList).add(interfaceC6824a);
        return new a(str, interfaceC6824a);
    }
}
