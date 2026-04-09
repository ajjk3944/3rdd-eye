package x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public int f36841a;

    /* renamed from: b, reason: collision with root package name */
    public int f36842b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36845e;

    public a(int i4) {
        this.f36841a = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36842b < this.f36841a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f36842b;
        switch (this.f36844d) {
            case 0:
                objF = ((e) this.f36845e).f(i4);
                break;
            case 1:
                objF = ((e) this.f36845e).j(i4);
                break;
            default:
                objF = ((f) this.f36845e).f36880b[i4];
                break;
        }
        this.f36842b++;
        this.f36843c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f36843c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.f36842b - 1;
        this.f36842b = i4;
        switch (this.f36844d) {
            case 0:
                ((e) this.f36845e).h(i4);
                break;
            case 1:
                ((e) this.f36845e).h(i4);
                break;
            default:
                ((f) this.f36845e).a(i4);
                break;
        }
        this.f36841a--;
        this.f36843c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f36881c);
        this.f36844d = 2;
        this.f36845e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i4) {
        this(eVar.f36920c);
        this.f36844d = i4;
        switch (i4) {
            case 1:
                this.f36845e = eVar;
                this(eVar.f36920c);
                break;
            default:
                this.f36845e = eVar;
                break;
        }
    }
}
