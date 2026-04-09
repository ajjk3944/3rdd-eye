package androidx.camera.core;

import A2.l;
import B.f;
import C.C0616c;
import C.L;
import C.S;
import C.T;
import C.b0;
import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.b;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.InterfaceC1700l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: MetadataImageReader.java */
/* loaded from: classes.dex */
public final class d implements InterfaceC1700l0, b.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14844b;

    /* renamed from: c, reason: collision with root package name */
    public int f14845c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14846d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14847e;

    /* renamed from: f, reason: collision with root package name */
    public final C0616c f14848f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1700l0.a f14849g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f14850h;
    public final LongSparseArray<L> i;

    /* renamed from: j, reason: collision with root package name */
    public final LongSparseArray<c> f14851j;

    /* renamed from: k, reason: collision with root package name */
    public int f14852k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14853l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f14854m;

    /* compiled from: MetadataImageReader.java */
    public class a extends AbstractC1707p {
        public a() {
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void b(int i, A a10) {
            d dVar = d.this;
            synchronized (dVar.f14843a) {
                try {
                    if (dVar.f14847e) {
                        return;
                    }
                    dVar.i.put(a10.getTimestamp(), new J.c(a10));
                    dVar.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public d(int i, int i10, int i11, int i12) {
        C0616c c0616c = new C0616c(ImageReader.newInstance(i, i10, i11, i12));
        this.f14843a = new Object();
        this.f14844b = new a();
        this.f14845c = 0;
        this.f14846d = new f(this, 2);
        this.f14847e = false;
        this.i = new LongSparseArray<>();
        this.f14851j = new LongSparseArray<>();
        this.f14854m = new ArrayList();
        this.f14848f = c0616c;
        this.f14852k = 0;
        this.f14853l = new ArrayList(f());
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final Surface a() {
        Surface surfaceA;
        synchronized (this.f14843a) {
            surfaceA = this.f14848f.a();
        }
        return surfaceA;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final c b() {
        synchronized (this.f14843a) {
            try {
                if (this.f14853l.isEmpty()) {
                    return null;
                }
                if (this.f14852k >= this.f14853l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f14853l.size() - 1; i++) {
                    if (!this.f14854m.contains(this.f14853l.get(i))) {
                        arrayList.add((c) this.f14853l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).close();
                }
                int size = this.f14853l.size();
                ArrayList arrayList2 = this.f14853l;
                this.f14852k = size;
                c cVar = (c) arrayList2.get(size - 1);
                this.f14854m.add(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.b.a
    public final void c(b bVar) {
        synchronized (this.f14843a) {
            i(bVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void close() {
        synchronized (this.f14843a) {
            try {
                if (this.f14847e) {
                    return;
                }
                Iterator it = new ArrayList(this.f14853l).iterator();
                while (it.hasNext()) {
                    ((c) it.next()).close();
                }
                this.f14853l.clear();
                this.f14848f.close();
                this.f14847e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int d() {
        int iD;
        synchronized (this.f14843a) {
            iD = this.f14848f.d();
        }
        return iD;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void e() {
        synchronized (this.f14843a) {
            this.f14848f.e();
            this.f14849g = null;
            this.f14850h = null;
            this.f14845c = 0;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int f() {
        int iF;
        synchronized (this.f14843a) {
            iF = this.f14848f.f();
        }
        return iF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final c g() {
        synchronized (this.f14843a) {
            try {
                if (this.f14853l.isEmpty()) {
                    return null;
                }
                if (this.f14852k >= this.f14853l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f14853l;
                int i = this.f14852k;
                this.f14852k = i + 1;
                c cVar = (c) arrayList.get(i);
                this.f14854m.add(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getHeight() {
        int height;
        synchronized (this.f14843a) {
            height = this.f14848f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getWidth() {
        int width;
        synchronized (this.f14843a) {
            width = this.f14848f.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void h(InterfaceC1700l0.a aVar, Executor executor) {
        synchronized (this.f14843a) {
            aVar.getClass();
            this.f14849g = aVar;
            executor.getClass();
            this.f14850h = executor;
            this.f14848f.h(this.f14846d, executor);
        }
    }

    public final void i(b bVar) {
        synchronized (this.f14843a) {
            try {
                int iIndexOf = this.f14853l.indexOf(bVar);
                if (iIndexOf >= 0) {
                    this.f14853l.remove(iIndexOf);
                    int i = this.f14852k;
                    if (iIndexOf <= i) {
                        this.f14852k = i - 1;
                    }
                }
                this.f14854m.remove(bVar);
                if (this.f14845c > 0) {
                    k(this.f14848f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(b0 b0Var) {
        InterfaceC1700l0.a aVar;
        Executor executor;
        synchronized (this.f14843a) {
            try {
                if (this.f14853l.size() < f()) {
                    b0Var.a(this);
                    this.f14853l.add(b0Var);
                    aVar = this.f14849g;
                    executor = this.f14850h;
                } else {
                    S.a("TAG", "Maximum image number reached.");
                    b0Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new T(0, this, aVar));
            } else {
                aVar.c(this);
            }
        }
    }

    public final void k(InterfaceC1700l0 interfaceC1700l0) {
        c cVarG;
        synchronized (this.f14843a) {
            try {
                if (this.f14847e) {
                    return;
                }
                int size = this.f14851j.size() + this.f14853l.size();
                if (size >= interfaceC1700l0.f()) {
                    S.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        cVarG = interfaceC1700l0.g();
                        if (cVarG != null) {
                            this.f14845c--;
                            size++;
                            this.f14851j.put(cVarG.i0().getTimestamp(), cVarG);
                            l();
                        }
                    } catch (IllegalStateException e4) {
                        String strF = S.f("MetadataImageReader");
                        if (S.e(3, strF)) {
                            Log.d(strF, "Failed to acquire next image.", e4);
                        }
                        cVarG = null;
                    }
                    if (cVarG == null || this.f14845c <= 0) {
                        break;
                    }
                } while (size < interfaceC1700l0.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.f14843a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    L lValueAt = this.i.valueAt(size);
                    long timestamp = lValueAt.getTimestamp();
                    c cVar = this.f14851j.get(timestamp);
                    if (cVar != null) {
                        this.f14851j.remove(timestamp);
                        this.i.removeAt(size);
                        j(new b0(cVar, null, lValueAt));
                    }
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.f14843a) {
            try {
                if (this.f14851j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.f14851j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    l.l(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f14851j.size() - 1; size >= 0; size--) {
                            if (this.f14851j.keyAt(size) < jKeyAt2) {
                                this.f14851j.valueAt(size).close();
                                this.f14851j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
