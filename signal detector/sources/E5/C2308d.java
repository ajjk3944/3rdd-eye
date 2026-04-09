package e5;

import R.C;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2308d extends C implements Iterator, r5.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19955e;

    public C2308d(C2310f c2310f, int i) {
        this.f19955e = i;
        q5.i.e(c2310f, "map");
        this.f3262d = c2310f;
        this.f3260b = -1;
        this.f3261c = c2310f.f19967h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19955e) {
            case 0:
                b();
                int i = this.f3259a;
                C2310f c2310f = (C2310f) this.f3262d;
                if (i >= c2310f.f19965f) {
                    throw new NoSuchElementException();
                }
                this.f3259a = i + 1;
                this.f3260b = i;
                C2309e c2309e = new C2309e(c2310f, i);
                e();
                return c2309e;
            case 1:
                b();
                int i3 = this.f3259a;
                C2310f c2310f2 = (C2310f) this.f3262d;
                if (i3 >= c2310f2.f19965f) {
                    throw new NoSuchElementException();
                }
                this.f3259a = i3 + 1;
                this.f3260b = i3;
                Object obj = c2310f2.f19960a[i3];
                e();
                return obj;
            default:
                b();
                int i6 = this.f3259a;
                C2310f c2310f3 = (C2310f) this.f3262d;
                if (i6 >= c2310f3.f19965f) {
                    throw new NoSuchElementException();
                }
                this.f3259a = i6 + 1;
                this.f3260b = i6;
                Object[] objArr = c2310f3.f19961b;
                q5.i.b(objArr);
                Object obj2 = objArr[this.f3260b];
                e();
                return obj2;
        }
    }
}
