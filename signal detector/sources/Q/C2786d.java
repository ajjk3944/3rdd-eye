package q;

import java.util.Iterator;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2786d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C2785c f22898a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22899b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f22900c;

    public C2786d(f fVar) {
        this.f22900c = fVar;
    }

    @Override // q.e
    public final void a(C2785c c2785c) {
        C2785c c2785c2 = this.f22898a;
        if (c2785c == c2785c2) {
            C2785c c2785c3 = c2785c2.f22897d;
            this.f22898a = c2785c3;
            this.f22899b = c2785c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22899b) {
            return this.f22900c.f22901a != null;
        }
        C2785c c2785c = this.f22898a;
        return (c2785c == null || c2785c.f22896c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f22899b) {
            this.f22899b = false;
            this.f22898a = this.f22900c.f22901a;
        } else {
            C2785c c2785c = this.f22898a;
            this.f22898a = c2785c != null ? c2785c.f22896c : null;
        }
        return this.f22898a;
    }
}
