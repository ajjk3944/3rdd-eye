package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class P implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20664a = false;

    /* renamed from: b, reason: collision with root package name */
    public Object f20665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f20666c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public P(Spliterator spliterator) {
        this.f20666c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f20664a = true;
        this.f20665b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20664a) {
            this.f20666c.tryAdvance(this);
        }
        return this.f20664a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f20664a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20664a = false;
        return this.f20665b;
    }
}
