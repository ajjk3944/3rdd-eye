package u;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2932a implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f23680a;

    /* renamed from: b, reason: collision with root package name */
    public int f23681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23684e;

    public C2932a(int i) {
        this.f23680a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23681b < this.f23680a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23681b;
        switch (this.f23683d) {
            case 0:
                objF = ((C2936e) this.f23684e).f(i);
                break;
            case 1:
                objF = ((C2936e) this.f23684e).j(i);
                break;
            default:
                objF = ((C2937f) this.f23684e).f23695b[i];
                break;
        }
        this.f23681b++;
        this.f23682c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23682c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f23681b - 1;
        this.f23681b = i;
        switch (this.f23683d) {
            case 0:
                ((C2936e) this.f23684e).h(i);
                break;
            case 1:
                ((C2936e) this.f23684e).h(i);
                break;
            default:
                ((C2937f) this.f23684e).a(i);
                break;
        }
        this.f23680a--;
        this.f23682c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2932a(C2937f c2937f) {
        this(c2937f.f23696c);
        this.f23683d = 2;
        this.f23684e = c2937f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2932a(C2936e c2936e, int i) {
        this(c2936e.f23705c);
        this.f23683d = i;
        switch (i) {
            case 1:
                this.f23684e = c2936e;
                this(c2936e.f23705c);
                break;
            default:
                this.f23684e = c2936e;
                break;
        }
    }
}
