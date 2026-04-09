package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2424f implements InterfaceC2434h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f21073a;

    public /* synthetic */ C2424f(BaseStream baseStream) {
        this.f21073a = baseStream;
    }

    public static /* synthetic */ InterfaceC2434h f(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C2429g ? ((C2429g) baseStream).f21078a : baseStream instanceof DoubleStream ? A.f((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C2450k0.f((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C2403a3.f((java.util.stream.Stream) baseStream) : new C2424f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21073a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f21073a;
        if (obj instanceof C2424f) {
            obj = ((C2424f) obj).f21073a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21073a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ boolean isParallel() {
        return this.f21073a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Iterator iterator() {
        return this.f21073a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h onClose(Runnable runnable) {
        return f(this.f21073a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h parallel() {
        return f(this.f21073a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h sequential() {
        return f(this.f21073a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.O.a(this.f21073a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2434h
    public final /* synthetic */ InterfaceC2434h unordered() {
        return f(this.f21073a.unordered());
    }
}
