package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class b0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f20696a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f20697b = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f20698c;

    /* renamed from: d, reason: collision with root package name */
    public long f20699d;

    /* renamed from: e, reason: collision with root package name */
    public int f20700e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2383c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC2383c.e(this, i);
    }

    public b0(java.util.Collection collection, int i) {
        this.f20696a = collection;
        this.f20698c = (i & 4096) == 0 ? i | 16448 : i;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f20697b;
        if (it == null) {
            it = this.f20696a.iterator();
            this.f20697b = it;
            size = this.f20696a.size();
            this.f20699d = size;
        } else {
            size = this.f20699d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f20700e + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i3 = 0;
        do {
            objArr[i3] = it.next();
            i3++;
            if (i3 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f20700e = i3;
        long j6 = this.f20699d;
        if (j6 != Long.MAX_VALUE) {
            this.f20699d = j6 - i3;
        }
        return new U(objArr, 0, i3, this.f20698c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f20697b;
        if (it == null) {
            it = this.f20696a.iterator();
            this.f20697b = it;
            this.f20699d = this.f20696a.size();
        }
        if (it instanceof InterfaceC2391k) {
            ((InterfaceC2391k) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f20697b == null) {
            this.f20697b = this.f20696a.iterator();
            this.f20699d = this.f20696a.size();
        }
        if (!this.f20697b.hasNext()) {
            return false;
        }
        consumer.accept(this.f20697b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f20697b == null) {
            this.f20697b = this.f20696a.iterator();
            long size = this.f20696a.size();
            this.f20699d = size;
            return size;
        }
        return this.f20699d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f20698c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC2383c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
