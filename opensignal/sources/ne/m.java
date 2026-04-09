package ne;

import bc.f0;
import i.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements Iterator {
    public final /* synthetic */ g0 B;

    /* renamed from: d, reason: collision with root package name */
    public String f17531d;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f17532g;

    /* renamed from: r, reason: collision with root package name */
    public final d f17533r;

    /* renamed from: y, reason: collision with root package name */
    public int f17535y;

    /* renamed from: a, reason: collision with root package name */
    public c f17530a = c.NOT_READY;

    /* renamed from: x, reason: collision with root package name */
    public int f17534x = 0;

    public m(g0 g0Var, f0 f0Var, CharSequence charSequence) {
        this.B = g0Var;
        this.f17533r = (d) f0Var.f2603g;
        this.f17535y = f0Var.f2602d;
        this.f17532g = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        d dVar;
        c cVar = this.f17530a;
        c cVar2 = c.FAILED;
        if (cVar == cVar2) {
            throw new IllegalStateException();
        }
        int i10 = b.f17519a[cVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            this.f17530a = cVar2;
            int i11 = this.f17534x;
            while (true) {
                int length = this.f17534x;
                if (length == -1) {
                    this.f17530a = c.DONE;
                    string = null;
                    break;
                }
                e eVar = (e) this.B.f11051a;
                CharSequence charSequence = this.f17532g;
                int length2 = charSequence.length();
                ba.m.l(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (eVar.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.f17534x = -1;
                } else {
                    this.f17534x = length + 1;
                }
                int i12 = this.f17534x;
                if (i12 == i11) {
                    int i13 = i12 + 1;
                    this.f17534x = i13;
                    if (i13 > charSequence.length()) {
                        this.f17534x = -1;
                    }
                } else {
                    while (true) {
                        dVar = this.f17533r;
                        if (i11 >= length || !dVar.a(charSequence.charAt(i11))) {
                            break;
                        }
                        i11++;
                    }
                    while (length > i11 && dVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i14 = this.f17535y;
                    if (i14 == 1) {
                        length = charSequence.length();
                        this.f17534x = -1;
                        while (length > i11 && dVar.a(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f17535y = i14 - 1;
                    }
                    string = charSequence.subSequence(i11, length).toString();
                }
            }
            this.f17531d = string;
            if (this.f17530a == c.DONE) {
                return false;
            }
            this.f17530a = c.READY;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17530a = c.NOT_READY;
        String str = this.f17531d;
        this.f17531d = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
