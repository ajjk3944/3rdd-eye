package androidx.camera.core.impl;

import C.C0634v;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: CameraRepository.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14919a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14920b = new LinkedHashMap();

    public M() {
        new HashSet();
    }

    public final LinkedHashSet<J> a() {
        LinkedHashSet<J> linkedHashSet;
        synchronized (this.f14919a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends J>) this.f14920b.values());
        }
        return linkedHashSet;
    }

    public final void b(H h10) throws C.P {
        synchronized (this.f14919a) {
            try {
                for (String str : h10.a()) {
                    C.S.a("CameraRepository", "Added camera: " + str);
                    this.f14920b.put(str, h10.c(str));
                }
            } catch (C0634v e4) {
                throw new C.P(e4);
            }
        }
    }
}
