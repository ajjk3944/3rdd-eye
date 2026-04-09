package ij;

import ij.AbstractC6178a;
import ij.b;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public class c extends b implements Map, Serializable, Cloneable {

    /* renamed from: k, reason: collision with root package name */
    private transient int f49267k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f49268l;

    public c(int i10) {
        this(i10, 0.75f);
    }

    @Override // ij.AbstractC6178a
    protected void X0(AbstractC6178a.b bVar, Object obj) {
        e1((b.c) bVar);
        bVar.setValue(obj);
    }

    @Override // java.util.AbstractMap
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public c clone() {
        return (c) super.t();
    }

    public Object c1(Object obj, boolean z10) {
        b.c cVarC0 = C0(obj);
        if (cVarC0 == null) {
            return null;
        }
        if (z10) {
            e1(cVarC0);
        }
        return cVarC0.getValue();
    }

    public boolean d1() {
        return this.f49246b >= this.f49267k;
    }

    protected void e1(b.c cVar) {
        b.c cVar2 = cVar.f49262f;
        b.c cVar3 = this.f49260j;
        if (cVar2 == cVar3) {
            if (cVar == cVar3) {
                throw new IllegalStateException("Can't move header to MRU This should not occur if your keys are immutable, and you have used synchronization properly.");
            }
            return;
        }
        this.f49249e++;
        b.c cVar4 = cVar.f49261e;
        if (cVar4 == null) {
            throw new IllegalStateException("Entry.before is null. This should not occur if your keys are immutable, and you have used synchronization properly.");
        }
        cVar4.f49262f = cVar2;
        cVar.f49262f.f49261e = cVar4;
        cVar.f49262f = cVar3;
        cVar.f49261e = cVar3.f49261e;
        cVar3.f49261e.f49262f = cVar;
        cVar3.f49261e = cVar;
    }

    protected boolean f1(b.c cVar) {
        return true;
    }

    protected void g1(b.c cVar, int i10, int i11, Object obj, Object obj2) {
        try {
            int iG0 = G0(cVar.f49255b, this.f49247c.length);
            AbstractC6178a.b bVar = this.f49247c[iG0];
            AbstractC6178a.b bVar2 = null;
            while (bVar != cVar && bVar != null) {
                bVar2 = bVar;
                bVar = bVar.f49254a;
            }
            if (bVar != null) {
                this.f49249e++;
                U0(cVar, iG0, bVar2);
                W0(cVar, i10, i11, obj, obj2);
                h(cVar, i10);
                return;
            }
            throw new IllegalStateException("Entry.next=null, data[removeIndex]=" + this.f49247c[iG0] + " previous=" + bVar2 + " key=" + obj + " value=" + obj2 + " size=" + this.f49246b + " maxSize=" + this.f49267k + " This should not occur if your keys are immutable, and you have used synchronization properly.");
        } catch (NullPointerException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NPE, entry=");
            sb2.append(cVar);
            sb2.append(" entryIsHeader=");
            sb2.append(cVar == this.f49260j);
            sb2.append(" key=");
            sb2.append(obj);
            sb2.append(" value=");
            sb2.append(obj2);
            sb2.append(" size=");
            sb2.append(this.f49246b);
            sb2.append(" maxSize=");
            sb2.append(this.f49267k);
            sb2.append(" This should not occur if your keys are immutable, and you have used synchronization properly.");
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return c1(obj, true);
    }

    @Override // ij.AbstractC6178a
    protected void l(int i10, int i11, Object obj, Object obj2) {
        boolean zF1;
        if (!d1()) {
            super.l(i10, i11, obj, obj2);
            return;
        }
        b.c cVar = this.f49260j.f49262f;
        if (this.f49268l) {
            while (cVar != this.f49260j && cVar != null) {
                if (f1(cVar)) {
                    zF1 = true;
                    break;
                }
                cVar = cVar.f49262f;
            }
            zF1 = false;
            if (cVar == null) {
                throw new IllegalStateException("Entry.after=null, header.after=" + this.f49260j.f49262f + " header.before=" + this.f49260j.f49261e + " key=" + obj + " value=" + obj2 + " size=" + this.f49246b + " maxSize=" + this.f49267k + " This should not occur if your keys are immutable, and you have used synchronization properly.");
            }
        } else {
            zF1 = f1(cVar);
        }
        b.c cVar2 = cVar;
        if (!zF1) {
            super.l(i10, i11, obj, obj2);
            return;
        }
        if (cVar2 != null) {
            g1(cVar2, i10, i11, obj, obj2);
            return;
        }
        throw new IllegalStateException("reuse=null, header.after=" + this.f49260j.f49262f + " header.before=" + this.f49260j.f49261e + " key=" + obj + " value=" + obj2 + " size=" + this.f49246b + " maxSize=" + this.f49267k + " This should not occur if your keys are immutable, and you have used synchronization properly.");
    }

    public c(int i10, float f10) {
        this(i10, f10, false);
    }

    public c(int i10, float f10, boolean z10) {
        this(i10, i10, f10, z10);
    }

    public c(int i10, int i11, float f10, boolean z10) {
        super(i11, f10);
        if (i10 < 1) {
            throw new IllegalArgumentException("LRUMap max size must be greater than 0");
        }
        if (i11 <= i10) {
            this.f49267k = i10;
            this.f49268l = z10;
            return;
        }
        throw new IllegalArgumentException("LRUMap initial size must not be greather than max size");
    }
}
