package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CameraCaptureCallbacks.java */
/* renamed from: androidx.camera.core.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709q extends AbstractC1707p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15113a = new ArrayList();

    public C1709q(List<AbstractC1707p> list) {
        for (AbstractC1707p abstractC1707p : list) {
            if (!(abstractC1707p instanceof r)) {
                this.f15113a.add(abstractC1707p);
            }
        }
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void a(int i) {
        Iterator it = this.f15113a.iterator();
        while (it.hasNext()) {
            ((AbstractC1707p) it.next()).a(i);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void b(int i, A a10) {
        Iterator it = this.f15113a.iterator();
        while (it.hasNext()) {
            ((AbstractC1707p) it.next()).b(i, a10);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void c(int i, C1712s c1712s) {
        Iterator it = this.f15113a.iterator();
        while (it.hasNext()) {
            ((AbstractC1707p) it.next()).c(i, c1712s);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void d(int i) {
        Iterator it = this.f15113a.iterator();
        while (it.hasNext()) {
            ((AbstractC1707p) it.next()).d(i);
        }
    }
}
