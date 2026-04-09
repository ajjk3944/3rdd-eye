package androidx.fragment.app;

import android.view.View;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.C5308a;

/* compiled from: FragmentTransition.kt */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final J f15807a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final N f15808b;

    static {
        N n9;
        try {
            n9 = (N) K1.d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n9 = null;
        }
        f15808b = n9;
    }

    public static final void a(ComponentCallbacksC1759l inFragment, ComponentCallbacksC1759l outFragment, boolean z10, C5308a c5308a) {
        kotlin.jvm.internal.l.f(inFragment, "inFragment");
        kotlin.jvm.internal.l.f(outFragment, "outFragment");
        if ((z10 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(c5308a.f44030d);
            Iterator it = ((C5308a.C0496a) c5308a.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(c5308a.f44030d);
            Iterator it2 = ((C5308a.C0496a) c5308a.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(C5308a<String, String> c5308a, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((C5308a.C0496a) c5308a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (kotlin.jvm.internal.l.b(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) C2097r.q0(arrayList);
    }

    public static final void c(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
