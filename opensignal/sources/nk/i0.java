package nk;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18401a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f18402b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f18403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f18404d;

    public i0(j0 j0Var) {
        this.f18404d = j0Var;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f18403c) {
            this.f18403c = true;
            ArrayDeque arrayDeque = this.f18402b;
            if (arrayDeque.size() != 1 || ((h0) arrayDeque.getFirst()).f18396b != null) {
                StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    h0 h0Var = (h0) itDescendingIterator.next();
                    sb2.append("\nfor ");
                    Type type = h0Var.f18395a;
                    String str = h0Var.f18396b;
                    sb2.append(type);
                    if (str != null) {
                        sb2.append(' ');
                        sb2.append(str);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z10) {
        this.f18402b.removeLast();
        if (this.f18402b.isEmpty()) {
            this.f18404d.f18409b.remove();
            if (z10) {
                synchronized (this.f18404d.f18410c) {
                    try {
                        int size = this.f18401a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h0 h0Var = (h0) this.f18401a.get(i10);
                            r rVar = (r) this.f18404d.f18410c.put(h0Var.f18397c, h0Var.f18398d);
                            if (rVar != null) {
                                h0Var.f18398d = rVar;
                                this.f18404d.f18410c.put(h0Var.f18397c, rVar);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
