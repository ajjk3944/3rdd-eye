package ii;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.f0;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import pi.S;
import wi.AbstractC8399a;
import xi.C8544k;

/* renamed from: ii.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6177x extends AbstractC6154a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f49241d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f49242b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6164k f49243c;

    /* renamed from: ii.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC6164k a(String message, Collection types) {
            AbstractC6492s.i(message, "message");
            AbstractC6492s.i(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).r());
            }
            C8544k c8544kB = AbstractC8399a.b(arrayList);
            InterfaceC6164k interfaceC6164kB = C6155b.f49176d.b(message, c8544kB);
            return c8544kB.size() <= 1 ? interfaceC6164kB : new C6177x(message, interfaceC6164kB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6177x(String str, InterfaceC6164k interfaceC6164k, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC6164k);
    }

    public static final InterfaceC6164k m(String str, Collection collection) {
        return f49241d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2491a n(InterfaceC2491a selectMostSpecificInEachOverridableGroup) {
        AbstractC6492s.i(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2491a o(f0 selectMostSpecificInEachOverridableGroup) {
        AbstractC6492s.i(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2491a p(Y selectMostSpecificInEachOverridableGroup) {
        AbstractC6492s.i(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // ii.AbstractC6154a, ii.InterfaceC6164k
    public Collection b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return bi.r.b(super.b(name, location), C6174u.f49238a);
    }

    @Override // ii.AbstractC6154a, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return bi.r.b(super.d(name, location), C6175v.f49239a);
    }

    @Override // ii.AbstractC6154a, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        Collection collectionE = super.e(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionE) {
            if (((InterfaceC2503m) obj) instanceof InterfaceC2491a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Yg.s sVar = new Yg.s(arrayList, arrayList2);
        List list = (List) sVar.a();
        List list2 = (List) sVar.c();
        AbstractC6492s.g(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return AbstractC3689v.M0(bi.r.b(list, C6176w.f49240a), list2);
    }

    @Override // ii.AbstractC6154a
    protected InterfaceC6164k i() {
        return this.f49243c;
    }

    private C6177x(String str, InterfaceC6164k interfaceC6164k) {
        this.f49242b = str;
        this.f49243c = interfaceC6164k;
    }
}
