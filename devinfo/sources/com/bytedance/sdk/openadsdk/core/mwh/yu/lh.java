package com.bytedance.sdk.openadsdk.core.mwh.yu;

import d9.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v8.b;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends o {
    private final ouw zih;
    private final List<vt> rn = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: jg, reason: collision with root package name */
    int f8371jg = 1;
    int ko = 1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements b {
        private ouw() {
        }

        @Override // v8.b
        public final void fkw(c cVar) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).fkw(cVar);
            }
        }

        @Override // v8.b
        public final void lh(c cVar) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).lh(cVar);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar) {
            lh.ouw(lh.this);
            if (lh.this.ko > lh.this.f8371jg) {
                Iterator it = lh.this.rn.iterator();
                while (it.hasNext()) {
                    ((vt) it.next()).ouw(cVar);
                }
                return;
            }
            for (vt vtVar : lh.this.rn) {
                int unused = lh.this.ko;
                int unused2 = lh.this.f8371jg;
                vtVar.ouw();
            }
            lh.this.ryl();
        }

        @Override // v8.b
        public final void vt(c cVar) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).vt(cVar);
            }
        }

        @Override // v8.b
        public final void yu(c cVar) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).yu(cVar);
            }
        }

        public /* synthetic */ ouw(lh lhVar, byte b10) {
            this();
        }

        @Override // v8.b
        public final void vt(c cVar, int i4) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).vt(cVar, i4);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, long j) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, j);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, bVar);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, boolean z3) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, z3);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, int i4, int i10) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, i4, i10);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, int i4, int i10, int i11) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, i4, i10, i11);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, int i4) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, i4);
            }
        }

        @Override // v8.b
        public final void ouw(c cVar, long j, long j8) {
            Iterator it = lh.this.rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(cVar, j, j8);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt extends b {
        @Override // v8.b
        /* synthetic */ void fkw(c cVar);

        @Override // v8.b
        /* synthetic */ void lh(c cVar);

        void ouw();

        @Override // v8.b
        /* synthetic */ void ouw(c cVar);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, int i4);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, int i4, int i10);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, int i4, int i10, int i11);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, long j);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, long j, long j8);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar);

        @Override // v8.b
        /* synthetic */ void ouw(c cVar, boolean z3);

        @Override // v8.b
        /* synthetic */ void vt(c cVar);

        @Override // v8.b
        /* synthetic */ void vt(c cVar, int i4);

        @Override // v8.b
        /* synthetic */ void yu(c cVar);
    }

    public lh() {
        ouw ouwVar = new ouw(this, (byte) 0);
        this.zih = ouwVar;
        super.ouw(ouwVar);
        zih();
    }

    public static /* synthetic */ int ouw(lh lhVar) {
        int i4 = lhVar.ko;
        lhVar.ko = i4 + 1;
        return i4;
    }

    @Override // d9.o
    public final long ko() {
        return super.ko() * this.f8371jg;
    }

    @Override // d9.o
    public final long rn() {
        long jRn = super.rn();
        return this.f8371jg == 1 ? jRn : ((this.ko - 1) * super.ko()) + jRn;
    }

    @Override // d9.o
    public final void ouw(b bVar) {
        if (!(bVar instanceof vt)) {
            super.ouw(bVar);
        } else {
            if (this.rn.contains(bVar)) {
                return;
            }
            this.rn.add((vt) bVar);
        }
    }
}
