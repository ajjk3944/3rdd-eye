package N5;

import C.C;
import C.S;
import E.u;
import H6.I;
import W.C1627o;
import W.C1635x;
import W.P;
import android.content.Context;
import android.util.Size;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import b0.C1811b;
import j1.AbstractC5165a;
import j1.C5166b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ThreadPoolExecutor;
import k1.C5209c;
import kotlin.jvm.internal.l;
import t4.i;
import u4.InterfaceC5634c;

/* loaded from: classes2.dex */
public final class c implements P, InterfaceC5634c {

    /* renamed from: b, reason: collision with root package name */
    public Object f4674b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4675c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4676d;

    public c(i0 store, f0 f0Var, AbstractC5165a extras) {
        l.f(store, "store");
        l.f(extras, "extras");
        this.f4674b = store;
        this.f4675c = f0Var;
        this.f4676d = extras;
    }

    @Override // W.P
    public ArrayList a(C c10) {
        C1627o c1627oE = e(c10);
        return c1627oE == null ? new ArrayList() : new ArrayList(c1627oE.f13293a.keySet());
    }

    @Override // W.P
    public Y.f b(Size size, C c10) {
        C1635x value;
        Y.f fVarA = null;
        C1627o c1627oE = e(c10);
        if (c1627oE == null) {
            return null;
        }
        TreeMap<Size, C1635x> treeMap = c1627oE.f13294b;
        Size size2 = M.c.f4110a;
        Map.Entry<Size, C1635x> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry<Size, C1635x> entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        C1635x c1635x = value;
        if (c1635x == null) {
            c1635x = C1635x.f13313g;
        }
        S.a("CapabilitiesByQuality", "Using supported quality of " + c1635x + " for size " + size);
        if (c1635x == C1635x.f13313g || (fVarA = c1627oE.a(c1635x)) != null) {
            return fVarA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // W.P
    public Y.f c(C1635x c1635x, C c10) {
        C1627o c1627oE = e(c10);
        if (c1627oE == null) {
            return null;
        }
        return c1627oE.a(c1635x);
    }

    public void d() {
        b bVar = (b) ((ArrayDeque) this.f4675c).poll();
        this.f4676d = bVar;
        if (bVar != null) {
            bVar.executeOnExecutor((ThreadPoolExecutor) this.f4674b, new Object[0]);
        }
    }

    public C1627o e(C c10) {
        Object next;
        boolean zContains;
        boolean zB = c10.b();
        HashMap map = (HashMap) this.f4675c;
        if (zB) {
            return (C1627o) map.get(c10);
        }
        HashMap map2 = (HashMap) this.f4676d;
        if (map2.containsKey(c10)) {
            return (C1627o) map2.get(c10);
        }
        Set fullySpecifiedDynamicRanges = map.keySet();
        l.f(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (c10.b()) {
            zContains = fullySpecifiedDynamicRanges.contains(c10);
        } else {
            Iterator it = fullySpecifiedDynamicRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C c11 = (C) next;
                A2.l.q("Fully specified range is not actually fully specified.", c11.b());
                int i = c10.f622b;
                if (i == 0 || i == c11.f622b) {
                    A2.l.q("Fully specified range is not actually fully specified.", c11.b());
                    int i10 = c10.f621a;
                    if (i10 != 0) {
                        int i11 = c11.f621a;
                        if ((i10 == 2 && i11 != 1) || i10 == i11) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        C1627o c1627o = zContains ? new C1627o(new Y.e((f0.b) this.f4674b, c10)) : null;
        map2.put(c10, c1627o);
        return c1627o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0 f(kotlin.jvm.internal.e eVar, String key) {
        b0 viewModel;
        l.f(key, "key");
        i0 i0Var = (i0) this.f4674b;
        i0Var.getClass();
        LinkedHashMap linkedHashMap = i0Var.f16160a;
        b0 b0Var = (b0) linkedHashMap.get(key);
        boolean zG = eVar.g(b0Var);
        f0 f0Var = (f0) this.f4675c;
        if (zG) {
            if (f0Var instanceof h0) {
                l.c(b0Var);
                ((h0) f0Var).d(b0Var);
            }
            l.d(b0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b0Var;
        }
        C5166b c5166b = new C5166b((AbstractC5165a) this.f4676d);
        c5166b.f42676a.put(C5209c.f43154a, key);
        try {
            try {
                viewModel = f0Var.b(eVar, c5166b);
            } catch (AbstractMethodError unused) {
                viewModel = f0Var.c(u.C(eVar), c5166b);
            }
        } catch (AbstractMethodError unused2) {
            viewModel = f0Var.a(u.C(eVar));
        }
        l.f(viewModel, "viewModel");
        b0 b0Var2 = (b0) linkedHashMap.put(key, viewModel);
        if (b0Var2 != null) {
            b0Var2.b();
        }
        return viewModel;
    }

    @Override // u4.InterfaceC5634c
    public Object zza() {
        Object objZza = ((InterfaceC5634c) this.f4674b).zza();
        return new t4.f((i) objZza, (Context) ((A3.c) ((I) this.f4676d).f2053c).f36c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [Y.b] */
    public c(androidx.camera.core.impl.I i) {
        this.f4675c = new HashMap();
        this.f4676d = new HashMap();
        InterfaceC1678a0 interfaceC1678a0K = i.k();
        C0 c02 = C1811b.f17055a;
        f0.a aVar = new f0.a(new E7.b(i, interfaceC1678a0K, c02), c02);
        Iterator<C> it = i.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C next = it.next();
            if (Integer.valueOf(next.f621a).equals(3) && next.f622b == 10) {
                aVar = new Y.b(aVar);
                break;
            }
        }
        this.f4674b = new f0.b(i, aVar, c02);
        for (C c10 : i.a()) {
            C1627o c1627o = new C1627o(new Y.e((f0.b) this.f4674b, c10));
            if (!new ArrayList(c1627o.f13293a.keySet()).isEmpty()) {
                ((HashMap) this.f4675c).put(c10, c1627o);
            }
        }
        i.c();
    }
}
