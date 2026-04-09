package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f26563a;

    public /* synthetic */ e(BaseStream baseStream) {
        this.f26563a = baseStream;
    }

    public static /* synthetic */ g f(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof f ? ((f) baseStream).f26571a : baseStream instanceof DoubleStream ? z.f((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? i1.f((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? y6.f((java.util.stream.Stream) baseStream) : new e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f26563a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f26563a;
        if (obj instanceof e) {
            obj = ((e) obj).f26563a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26563a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f26563a.isParallel();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f26563a.iterator();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return f(this.f26563a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return f(this.f26563a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return f(this.f26563a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.f26563a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return f(this.f26563a.unordered());
    }
}
