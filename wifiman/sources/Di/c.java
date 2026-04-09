package Di;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f3568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object[] buffer, int i10, int i11) {
        super(i10, i11);
        AbstractC6492s.i(buffer, "buffer");
        this.f3568c = buffer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f3568c;
        int iF = f();
        h(iF + 1);
        return objArr[iF];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f3568c;
        h(f() - 1);
        return objArr[f()];
    }
}
