package q;

import java.util.Iterator;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2784b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C2785c f22891a;

    /* renamed from: b, reason: collision with root package name */
    public C2785c f22892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22893c;

    public C2784b(C2785c c2785c, C2785c c2785c2, int i) {
        this.f22893c = i;
        this.f22891a = c2785c2;
        this.f22892b = c2785c;
    }

    @Override // q.e
    public final void a(C2785c c2785c) {
        C2785c c2785c2;
        C2785c c2785cB = null;
        if (this.f22891a == c2785c && c2785c == this.f22892b) {
            this.f22892b = null;
            this.f22891a = null;
        }
        C2785c c2785c3 = this.f22891a;
        if (c2785c3 == c2785c) {
            switch (this.f22893c) {
                case 0:
                    c2785c2 = c2785c3.f22897d;
                    break;
                default:
                    c2785c2 = c2785c3.f22896c;
                    break;
            }
            this.f22891a = c2785c2;
        }
        C2785c c2785c4 = this.f22892b;
        if (c2785c4 == c2785c) {
            C2785c c2785c5 = this.f22891a;
            if (c2785c4 != c2785c5 && c2785c5 != null) {
                c2785cB = b(c2785c4);
            }
            this.f22892b = c2785cB;
        }
    }

    public final C2785c b(C2785c c2785c) {
        switch (this.f22893c) {
            case 0:
                return c2785c.f22896c;
            default:
                return c2785c.f22897d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22892b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2785c c2785c = this.f22892b;
        C2785c c2785c2 = this.f22891a;
        this.f22892b = (c2785c == c2785c2 || c2785c2 == null) ? null : b(c2785c);
        return c2785c;
    }
}
