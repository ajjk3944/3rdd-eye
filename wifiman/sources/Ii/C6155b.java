package ii;

import Bh.C;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import wi.AbstractC8399a;
import xi.C8544k;

/* renamed from: ii.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6155b implements InterfaceC6164k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f49176d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f49177b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6164k[] f49178c;

    /* renamed from: ii.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC6164k a(String debugName, Iterable scopes) {
            AbstractC6492s.i(debugName, "debugName");
            AbstractC6492s.i(scopes, "scopes");
            C8544k c8544k = new C8544k();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                InterfaceC6164k interfaceC6164k = (InterfaceC6164k) it.next();
                if (interfaceC6164k != InterfaceC6164k.b.f49223b) {
                    if (interfaceC6164k instanceof C6155b) {
                        AbstractC3689v.E(c8544k, ((C6155b) interfaceC6164k).f49178c);
                    } else {
                        c8544k.add(interfaceC6164k);
                    }
                }
            }
            return b(debugName, c8544k);
        }

        public final InterfaceC6164k b(String debugName, List scopes) {
            AbstractC6492s.i(debugName, "debugName");
            AbstractC6492s.i(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new C6155b(debugName, (InterfaceC6164k[]) scopes.toArray(new InterfaceC6164k[0]), null) : (InterfaceC6164k) scopes.get(0) : InterfaceC6164k.b.f49223b;
        }

        private a() {
        }
    }

    public /* synthetic */ C6155b(String str, InterfaceC6164k[] interfaceC6164kArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC6164kArr);
    }

    @Override // ii.InterfaceC6164k
    public Set a() {
        InterfaceC6164k[] interfaceC6164kArr = this.f49178c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArr) {
            AbstractC3689v.C(linkedHashSet, interfaceC6164k.a());
        }
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        InterfaceC6164k[] interfaceC6164kArr = this.f49178c;
        int length = interfaceC6164kArr.length;
        if (length == 0) {
            return AbstractC3689v.l();
        }
        if (length == 1) {
            return interfaceC6164kArr[0].b(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArr) {
            collectionA = AbstractC8399a.a(collectionA, interfaceC6164k.b(name, location));
        }
        return collectionA == null ? d0.e() : collectionA;
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        InterfaceC6164k[] interfaceC6164kArr = this.f49178c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArr) {
            AbstractC3689v.C(linkedHashSet, interfaceC6164k.c());
        }
        return linkedHashSet;
    }

    @Override // ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        InterfaceC6164k[] interfaceC6164kArr = this.f49178c;
        int length = interfaceC6164kArr.length;
        if (length == 0) {
            return AbstractC3689v.l();
        }
        if (length == 1) {
            return interfaceC6164kArr[0].d(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArr) {
            collectionA = AbstractC8399a.a(collectionA, interfaceC6164k.d(name, location));
        }
        return collectionA == null ? d0.e() : collectionA;
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        InterfaceC6164k[] interfaceC6164kArr = this.f49178c;
        int length = interfaceC6164kArr.length;
        if (length == 0) {
            return AbstractC3689v.l();
        }
        if (length == 1) {
            return interfaceC6164kArr[0].e(kindFilter, nameFilter);
        }
        Collection collectionA = null;
        for (InterfaceC6164k interfaceC6164k : interfaceC6164kArr) {
            collectionA = AbstractC8399a.a(collectionA, interfaceC6164k.e(kindFilter, nameFilter));
        }
        return collectionA == null ? d0.e() : collectionA;
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        return AbstractC6166m.a(AbstractC3682n.P(this.f49178c));
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        InterfaceC2498h interfaceC2498h = null;
        for (InterfaceC6164k interfaceC6164k : this.f49178c) {
            InterfaceC2498h interfaceC2498hG = interfaceC6164k.g(name, location);
            if (interfaceC2498hG != null) {
                if (!(interfaceC2498hG instanceof InterfaceC2499i) || !((C) interfaceC2498hG).L()) {
                    return interfaceC2498hG;
                }
                if (interfaceC2498h == null) {
                    interfaceC2498h = interfaceC2498hG;
                }
            }
        }
        return interfaceC2498h;
    }

    public String toString() {
        return this.f49177b;
    }

    private C6155b(String str, InterfaceC6164k[] interfaceC6164kArr) {
        this.f49177b = str;
        this.f49178c = interfaceC6164kArr;
    }
}
