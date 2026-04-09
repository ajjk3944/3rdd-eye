package u;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public int f23032a;

    /* renamed from: d, reason: collision with root package name */
    public int f23033d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23034g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23035r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f23036x;

    public a(int i10) {
        this.f23032a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23033d < this.f23032a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23033d;
        switch (this.f23035r) {
            case 0:
                objF = ((e) this.f23036x).f(i10);
                break;
            case 1:
                objF = ((e) this.f23036x).i(i10);
                break;
            default:
                objF = ((f) this.f23036x).f23065d[i10];
                break;
        }
        this.f23033d++;
        this.f23034g = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23034g) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f23033d - 1;
        this.f23033d = i10;
        switch (this.f23035r) {
            case 0:
                ((e) this.f23036x).g(i10);
                break;
            case 1:
                ((e) this.f23036x).g(i10);
                break;
            default:
                ((f) this.f23036x).a(i10);
                break;
        }
        this.f23032a--;
        this.f23034g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f23066g);
        this.f23035r = 2;
        this.f23036x = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f23077g);
        this.f23035r = i10;
        switch (i10) {
            case 1:
                this.f23036x = eVar;
                this(eVar.f23077g);
                break;
            default:
                this.f23036x = eVar;
                break;
        }
    }
}
