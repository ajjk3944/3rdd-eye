package ag;

import ag.AbstractC3844b;
import dg.InterfaceC5372b;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
class i extends m implements InterfaceC5372b {

    /* renamed from: c, reason: collision with root package name */
    private Iterator f26259c;

    /* renamed from: d, reason: collision with root package name */
    private Zf.d f26260d;

    /* renamed from: e, reason: collision with root package name */
    private Zf.d f26261e;

    /* renamed from: f, reason: collision with root package name */
    private int f26262f;

    /* renamed from: g, reason: collision with root package name */
    private int f26263g;

    /* renamed from: h, reason: collision with root package name */
    private Supplier f26264h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f26265i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f26266j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC3844b.a f26267k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC3844b.InterfaceC1013b f26268l;

    i(Zf.d dVar, int i10, int i11, Supplier supplier, AbstractC3844b.a aVar, AbstractC3844b.InterfaceC1013b interfaceC1013b) {
        this(i10, i11, supplier, aVar, true, true, interfaceC1013b);
        this.f26260d = dVar;
    }

    private int f() {
        return this.f26262f + ((int) this.f26269a);
    }

    private Iterator g() {
        if (this.f26259c == null) {
            Supplier supplier = this.f26264h;
            if (supplier != null) {
                this.f26259c = (Iterator) supplier.get();
            } else {
                this.f26259c = this.f26267k.a(this.f26265i, this.f26266j, this.f26262f, this.f26263g);
            }
        }
        return this.f26259c;
    }

    @Override // dg.InterfaceC5371a, ag.AbstractC3846d.e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Zf.d a() {
        Zf.d dVar = this.f26260d;
        if (dVar != null) {
            return dVar;
        }
        Zf.d dVarA = this.f26268l.a(this.f26262f, this.f26263g);
        this.f26260d = dVarA;
        return dVarA;
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        return (this.f26263g - f()) + 1;
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        if (this.f26270b) {
            return;
        }
        this.f26270b = true;
        try {
            this.f26261e = null;
            c(g(), consumer, (this.f26263g - this.f26262f) + 1);
        } finally {
            this.f26270b = false;
        }
    }

    @Override // java.util.Spliterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b trySplit() {
        int iF;
        int iF2;
        if (this.f26270b || (iF2 = this.f26263g - (iF = f())) <= 1) {
            return null;
        }
        this.f26260d = null;
        this.f26261e = null;
        this.f26264h = null;
        int i10 = iF + (iF2 >>> 1);
        this.f26262f = i10 + 1;
        this.f26269a = 0L;
        i iVar = new i(iF, i10, null, this.f26267k, this.f26265i, false, this.f26268l);
        iVar.f26259c = this.f26259c;
        this.f26265i = false;
        this.f26259c = null;
        return iVar;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        if (this.f26270b || f() >= this.f26263g) {
            return false;
        }
        this.f26261e = null;
        return d(g(), consumer);
    }

    private i(int i10, int i11, Supplier supplier, AbstractC3844b.a aVar, boolean z10, boolean z11, AbstractC3844b.InterfaceC1013b interfaceC1013b) {
        this.f26264h = supplier;
        this.f26267k = aVar;
        this.f26265i = z10;
        this.f26266j = z11;
        this.f26268l = interfaceC1013b;
        this.f26262f = i10;
        this.f26263g = i11;
    }
}
