package androidx.camera.core;

import C.L;
import android.media.Image;
import androidx.camera.core.c;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ForwardingImageProxy.java */
/* loaded from: classes.dex */
public abstract class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public final c f14841c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14840b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f14842d = new HashSet();

    /* compiled from: ForwardingImageProxy.java */
    public interface a {
        void c(b bVar);
    }

    public b(c cVar) {
        this.f14841c = cVar;
    }

    public final void a(a aVar) {
        synchronized (this.f14840b) {
            this.f14842d.add(aVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f14841c.close();
        synchronized (this.f14840b) {
            hashSet = new HashSet(this.f14842d);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c(this);
        }
    }

    @Override // androidx.camera.core.c
    public final int getFormat() {
        return this.f14841c.getFormat();
    }

    @Override // androidx.camera.core.c
    public int getHeight() {
        return this.f14841c.getHeight();
    }

    @Override // androidx.camera.core.c
    public final Image getImage() {
        return this.f14841c.getImage();
    }

    @Override // androidx.camera.core.c
    public int getWidth() {
        return this.f14841c.getWidth();
    }

    @Override // androidx.camera.core.c
    public L i0() {
        return this.f14841c.i0();
    }

    @Override // androidx.camera.core.c
    public final c.a[] y() {
        return this.f14841c.y();
    }
}
