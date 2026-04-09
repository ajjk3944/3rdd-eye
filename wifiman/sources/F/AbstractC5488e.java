package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import g.AbstractC5837a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import mh.InterfaceC6824a;
import qh.AbstractC7510c;
import s1.AbstractC7875c;
import zi.AbstractC8783m;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5488e {

    /* renamed from: h, reason: collision with root package name */
    private static final b f46541h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f46542a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f46543b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f46544c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List f46545d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final transient Map f46546e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map f46547f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f46548g = new Bundle();

    /* renamed from: f.e$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5485b f46549a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5837a f46550b;

        public a(InterfaceC5485b callback, AbstractC5837a contract) {
            AbstractC6492s.i(callback, "callback");
            AbstractC6492s.i(contract, "contract");
            this.f46549a = callback;
            this.f46550b = contract;
        }

        public final InterfaceC5485b a() {
            return this.f46549a;
        }

        public final AbstractC5837a b() {
            return this.f46550b;
        }
    }

    /* renamed from: f.e$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: f.e$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46551a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AbstractC7510c.f59421a.g(2147418112) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        }
    }

    /* renamed from: f.e$d */
    public static final class d extends AbstractC5486c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5837a f46554c;

        d(String str, AbstractC5837a abstractC5837a) {
            this.f46553b = str;
            this.f46554c = abstractC5837a;
        }

        @Override // f.AbstractC5486c
        public void b(Object obj, AbstractC7875c abstractC7875c) throws Exception {
            Object obj2 = AbstractC5488e.this.f46543b.get(this.f46553b);
            AbstractC5837a abstractC5837a = this.f46554c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC5488e.this.f46545d.add(this.f46553b);
                try {
                    AbstractC5488e.this.h(iIntValue, this.f46554c, obj, abstractC7875c);
                    return;
                } catch (Exception e10) {
                    AbstractC5488e.this.f46545d.remove(this.f46553b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5837a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // f.AbstractC5486c
        public void c() {
            AbstractC5488e.this.m(this.f46553b);
        }
    }

    private final void c(int i10, String str) {
        this.f46542a.put(Integer.valueOf(i10), str);
        this.f46543b.put(str, Integer.valueOf(i10));
    }

    private final void f(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f46545d.contains(str)) {
            this.f46547f.remove(str);
            this.f46548g.putParcelable(str, new C5484a(i10, intent));
        } else {
            aVar.a().a(aVar.b().c(i10, intent));
            this.f46545d.remove(str);
        }
    }

    private final int g() {
        for (Number number : AbstractC8783m.o(c.f46551a)) {
            if (!this.f46542a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void l(String str) {
        if (((Integer) this.f46543b.get(str)) != null) {
            return;
        }
        c(g(), str);
    }

    public final boolean d(int i10, int i11, Intent intent) {
        String str = (String) this.f46542a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f(str, i11, intent, (a) this.f46546e.get(str));
        return true;
    }

    public final boolean e(int i10, Object obj) {
        String str = (String) this.f46542a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f46546e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f46548g.remove(str);
            this.f46547f.put(str, obj);
            return true;
        }
        InterfaceC5485b interfaceC5485bA = aVar.a();
        AbstractC6492s.g(interfaceC5485bA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f46545d.remove(str)) {
            return true;
        }
        interfaceC5485bA.a(obj);
        return true;
    }

    public abstract void h(int i10, AbstractC5837a abstractC5837a, Object obj, AbstractC7875c abstractC7875c);

    public final void i(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f46545d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f46548g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f46543b.containsKey(str)) {
                Integer num = (Integer) this.f46543b.remove(str);
                if (!this.f46548g.containsKey(str)) {
                    V.d(this.f46542a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            AbstractC6492s.h(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            AbstractC6492s.h(str2, "keys[i]");
            c(iIntValue, str2);
        }
    }

    public final void j(Bundle outState) {
        AbstractC6492s.i(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f46543b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f46543b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f46545d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f46548g));
    }

    public final AbstractC5486c k(String key, AbstractC5837a contract, InterfaceC5485b callback) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(contract, "contract");
        AbstractC6492s.i(callback, "callback");
        l(key);
        this.f46546e.put(key, new a(callback, contract));
        if (this.f46547f.containsKey(key)) {
            Object obj = this.f46547f.get(key);
            this.f46547f.remove(key);
            callback.a(obj);
        }
        C5484a c5484a = (C5484a) A1.c.a(this.f46548g, key, C5484a.class);
        if (c5484a != null) {
            this.f46548g.remove(key);
            callback.a(contract.c(c5484a.b(), c5484a.a()));
        }
        return new d(key, contract);
    }

    public final void m(String key) {
        Integer num;
        AbstractC6492s.i(key, "key");
        if (!this.f46545d.contains(key) && (num = (Integer) this.f46543b.remove(key)) != null) {
            this.f46542a.remove(num);
        }
        this.f46546e.remove(key);
        if (this.f46547f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f46547f.get(key));
            this.f46547f.remove(key);
        }
        if (this.f46548g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C5484a) A1.c.a(this.f46548g, key, C5484a.class)));
            this.f46548g.remove(key);
        }
        AbstractC5487d.a(this.f46544c.get(key));
    }
}
