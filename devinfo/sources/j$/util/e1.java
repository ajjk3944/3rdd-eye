package j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class e1 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26373a = false;

    /* renamed from: b, reason: collision with root package name */
    public Object f26374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f26375c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public e1(Spliterator spliterator) {
        this.f26375c = spliterator;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26373a = true;
        this.f26374b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f26373a) {
            this.f26375c.tryAdvance(this);
        }
        return this.f26373a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f26373a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26373a = false;
        return this.f26374b;
    }
}
