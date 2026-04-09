package C6;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: SparseArrays.kt */
/* loaded from: classes.dex */
public final class o implements Iterator, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f955b;

    /* renamed from: c, reason: collision with root package name */
    public int f956c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f957d;

    public /* synthetic */ o(Object obj, int i) {
        this.f955b = i;
        this.f957d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f955b) {
            case 0:
                if (((m0.j) this.f957d).f44033d > this.f956c) {
                }
                break;
            default:
                if (this.f956c < ((ViewGroup) this.f957d).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f955b) {
            case 0:
                int i = this.f956c;
                this.f956c = i + 1;
                return ((m0.j) this.f957d).f44032c[i];
            default:
                int i10 = this.f956c;
                this.f956c = i10 + 1;
                View childAt = ((ViewGroup) this.f957d).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f955b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f956c - 1;
                this.f956c = i;
                ((ViewGroup) this.f957d).removeViewAt(i);
                return;
        }
    }
}
