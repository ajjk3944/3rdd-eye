package W;

import W.C1635x;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* compiled from: CapabilitiesByQuality.java */
/* renamed from: W.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627o {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13293a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap<Size, C1635x> f13294b = new TreeMap<>(new G.d(false));

    /* renamed from: c, reason: collision with root package name */
    public final Y.f f13295c;

    /* renamed from: d, reason: collision with root package name */
    public final Y.f f13296d;

    public C1627o(Y.e eVar) {
        C1622j c1622j = C1635x.f13307a;
        Iterator it = new ArrayList(C1635x.i).iterator();
        while (true) {
            Y.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            C1635x c1635x = (C1635x) it.next();
            A2.l.q("Currently only support ConstantQuality", c1635x instanceof C1635x.a);
            InterfaceC1680b0 interfaceC1680b0A = eVar.a(((C1635x.a) c1635x).c());
            if (interfaceC1680b0A != null) {
                C.S.a("CapabilitiesByQuality", "profiles = " + interfaceC1680b0A);
                if (!interfaceC1680b0A.d().isEmpty()) {
                    int iA = interfaceC1680b0A.a();
                    int iB = interfaceC1680b0A.b();
                    List<InterfaceC1680b0.a> listC = interfaceC1680b0A.c();
                    List<InterfaceC1680b0.c> listD = interfaceC1680b0A.d();
                    A2.l.k("Should contain at least one VideoProfile.", !listD.isEmpty());
                    aVar = new Y.a(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : listC.get(0), listD.get(0));
                }
                if (aVar == null) {
                    C.S.g("CapabilitiesByQuality", "EncoderProfiles of quality " + c1635x + " has no video validated profiles.");
                } else {
                    InterfaceC1680b0.c cVar = aVar.f13693f;
                    this.f13294b.put(new Size(cVar.j(), cVar.g()), c1635x);
                    this.f13293a.put(c1635x, aVar);
                }
            }
        }
        if (this.f13293a.isEmpty()) {
            C.S.b("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f13296d = null;
            this.f13295c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f13293a.values());
            this.f13295c = (Y.f) arrayDeque.peekFirst();
            this.f13296d = (Y.f) arrayDeque.peekLast();
        }
    }

    public final Y.f a(C1635x c1635x) {
        A2.l.k("Unknown quality: " + c1635x, C1635x.f13314h.contains(c1635x));
        return c1635x == C1635x.f13312f ? this.f13295c : c1635x == C1635x.f13311e ? this.f13296d : (Y.f) this.f13293a.get(c1635x);
    }
}
