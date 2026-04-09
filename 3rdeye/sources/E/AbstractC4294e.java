package e;

import J8.C0692g;
import N7.B8;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import e.AbstractC4294e;
import f.AbstractC4328a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import x9.C5783a;

/* compiled from: ActivityResultRegistry.kt */
/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4294e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f37608a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37609b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f37610c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f37611d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f37612e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f37613f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f37614g = new Bundle();

    /* compiled from: ActivityResultRegistry.kt */
    /* renamed from: e.e$a */
    public static final class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4291b<O> f37615a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC4328a<?, O> f37616b;

        public a(AbstractC4328a contract, InterfaceC4291b callback) {
            l.f(callback, "callback");
            l.f(contract, "contract");
            this.f37615a = callback;
            this.f37616b = contract;
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    /* renamed from: e.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1781n f37617a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f37618b = new ArrayList();

        public b(AbstractC1781n abstractC1781n) {
            this.f37617a = abstractC1781n;
        }
    }

    public final boolean a(int i, int i10, Intent intent) {
        String str = (String) this.f37608a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f37612e.get(str);
        if ((aVar != null ? aVar.f37615a : null) != null) {
            ArrayList arrayList = this.f37611d;
            if (arrayList.contains(str)) {
                aVar.f37615a.onActivityResult(aVar.f37616b.c(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f37613f.remove(str);
        this.f37614g.putParcelable(str, new C4290a(i10, intent));
        return true;
    }

    public abstract void b(int i, AbstractC4328a abstractC4328a, Object obj);

    public final C4296g c(final String key, InterfaceC1790x interfaceC1790x, final AbstractC4328a contract, final InterfaceC4291b callback) {
        l.f(key, "key");
        l.f(contract, "contract");
        l.f(callback, "callback");
        AbstractC1781n lifecycle = interfaceC1790x.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1790x + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f37610c;
        b bVar = (b) linkedHashMap.get(key);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        InterfaceC1788v interfaceC1788v = new InterfaceC1788v() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x2, AbstractC1781n.a aVar) {
                AbstractC4294e this$0 = this.f37604b;
                l.f(this$0, "this$0");
                String key2 = key;
                l.f(key2, "$key");
                InterfaceC4291b callback2 = callback;
                l.f(callback2, "$callback");
                AbstractC4328a contract2 = contract;
                l.f(contract2, "$contract");
                AbstractC1781n.a aVar2 = AbstractC1781n.a.ON_START;
                LinkedHashMap linkedHashMap2 = this$0.f37612e;
                if (aVar2 != aVar) {
                    if (AbstractC1781n.a.ON_STOP == aVar) {
                        linkedHashMap2.remove(key2);
                        return;
                    } else {
                        if (AbstractC1781n.a.ON_DESTROY == aVar) {
                            this$0.f(key2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(key2, new AbstractC4294e.a(contract2, callback2));
                LinkedHashMap linkedHashMap3 = this$0.f37613f;
                if (linkedHashMap3.containsKey(key2)) {
                    Object obj = linkedHashMap3.get(key2);
                    linkedHashMap3.remove(key2);
                    callback2.onActivityResult(obj);
                }
                Bundle bundle = this$0.f37614g;
                C4290a c4290a = (C4290a) G0.c.a(bundle, key2);
                if (c4290a != null) {
                    bundle.remove(key2);
                    callback2.onActivityResult(contract2.c(c4290a.f37602b, c4290a.f37603c));
                }
            }
        };
        bVar.f37617a.addObserver(interfaceC1788v);
        bVar.f37618b.add(interfaceC1788v);
        linkedHashMap.put(key, bVar);
        return new C4296g(this, key, contract);
    }

    public final C4297h d(String key, AbstractC4328a abstractC4328a, InterfaceC4291b interfaceC4291b) {
        l.f(key, "key");
        e(key);
        this.f37612e.put(key, new a(abstractC4328a, interfaceC4291b));
        LinkedHashMap linkedHashMap = this.f37613f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC4291b.onActivityResult(obj);
        }
        Bundle bundle = this.f37614g;
        C4290a c4290a = (C4290a) G0.c.a(bundle, key);
        if (c4290a != null) {
            bundle.remove(key);
            interfaceC4291b.onActivityResult(abstractC4328a.c(c4290a.f37602b, c4290a.f37603c));
        }
        return new C4297h(this, key, abstractC4328a);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f37609b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        C4295f nextFunction = C4295f.f37619g;
        l.f(nextFunction, "nextFunction");
        Iterator it = new C5783a(new x9.f(nextFunction, new C0692g(nextFunction, 3))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f37608a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        l.f(key, "key");
        if (!this.f37611d.contains(key) && (num = (Integer) this.f37609b.remove(key)) != null) {
            this.f37608a.remove(num);
        }
        this.f37612e.remove(key);
        LinkedHashMap linkedHashMap = this.f37613f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbK = B8.k("Dropping pending result for request ", key, ": ");
            sbK.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbK.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f37614g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4290a) G0.c.a(bundle, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f37610c;
        b bVar = (b) linkedHashMap2.get(key);
        if (bVar != null) {
            ArrayList arrayList = bVar.f37618b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f37617a.removeObserver((InterfaceC1788v) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
