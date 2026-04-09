package H6;

import N7.B9;
import N7.C1179g4;
import android.view.View;
import h7.C4421b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: Handler.kt */
/* loaded from: classes.dex */
public final class N implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f2091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0675l f2093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A7.d f2095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Map f2096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2097h;

    public N(L l5, View view, C0675l c0675l, String str, A7.d dVar, Map map, ArrayList arrayList) {
        this.f2091b = l5;
        this.f2092c = view;
        this.f2093d = c0675l;
        this.f2094e = str;
        this.f2095f = dVar;
        this.f2096g = map;
        this.f2097h = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = C4421b.f38269a;
        C4421b.a(C7.a.INFO);
        L l5 = this.f2091b;
        WeakHashMap<View, Set<C1179g4>> weakHashMap = l5.f2073k;
        View view = this.f2092c;
        Set<C1179g4> set = weakHashMap.get(view);
        if (set != null) {
            ArrayList arrayList = this.f2097h;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C1179g4) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                set.remove((C1179g4) it.next());
            }
            if (set.isEmpty()) {
                l5.f2073k.remove(view);
                l5.f2072j.remove(view);
            }
        }
        C0675l c0675l = this.f2093d;
        if (kotlin.jvm.internal.l.b(c0675l.getLogId(), this.f2094e)) {
            K k10 = l5.f2065b;
            B9[] actions = (B9[]) this.f2096g.values().toArray(new B9[0]);
            A7.d resolver = this.f2095f;
            kotlin.jvm.internal.l.f(resolver, "resolver");
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(actions, "actions");
            c0675l.s(new J(actions, k10, c0675l, resolver, view));
        }
    }
}
