package c9;

import java.util.Iterator;
import p9.InterfaceC5480a;
import q9.InterfaceC5499a;

/* compiled from: Iterables.kt */
/* renamed from: c9.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2103x<T> implements Iterable<C2102w<? extends T>>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5480a<Iterator<T>> f18586b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2103x(InterfaceC5480a<? extends Iterator<? extends T>> interfaceC5480a) {
        this.f18586b = interfaceC5480a;
    }

    @Override // java.lang.Iterable
    public final Iterator<C2102w<T>> iterator() {
        return new O9.g(this.f18586b.invoke());
    }
}
