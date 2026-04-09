package Oa;

import Yg.J;
import com.ui.sso.account.UIAccountManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class b implements Oa.a {

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f17692b = new WeakHashMap();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17693a = new a();

        a() {
            super(1);
        }

        public final void a(UIAccountManager.a it) {
            AbstractC6492s.i(it, "it");
            it.a();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UIAccountManager.a) obj);
            return J.f24997a;
        }
    }

    /* renamed from: Oa.b$b, reason: collision with other inner class name */
    static final class C0611b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f17694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0611b(UUID uuid) {
            super(1);
            this.f17694a = uuid;
        }

        public final void a(UIAccountManager.a it) {
            AbstractC6492s.i(it, "it");
            it.b(this.f17694a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UIAccountManager.a) obj);
            return J.f24997a;
        }
    }

    private final void e(InterfaceC6835l interfaceC6835l) {
        ArrayList arrayList;
        synchronized (this) {
            WeakHashMap weakHashMap = this.f17692b;
            arrayList = new ArrayList(weakHashMap.size());
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((UIAccountManager.a) ((Map.Entry) it.next()).getKey());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            interfaceC6835l.invoke(it2.next());
        }
    }

    @Override // Oa.a
    public void a(UUID accountId) {
        AbstractC6492s.i(accountId, "accountId");
        e(new C0611b(accountId));
    }

    @Override // Oa.a
    public void b() {
        e(a.f17693a);
    }

    @Override // Oa.a
    public void c(UIAccountManager.a listener) {
        AbstractC6492s.i(listener, "listener");
        synchronized (this) {
        }
    }

    @Override // Oa.a
    public void d(UIAccountManager.a listener) {
        AbstractC6492s.i(listener, "listener");
        synchronized (this) {
            this.f17692b.put(listener, J.f24997a);
        }
    }
}
