package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2429g implements BaseStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2434h f21078a;

    public /* synthetic */ C2429g(InterfaceC2434h interfaceC2434h) {
        this.f21078a = interfaceC2434h;
    }

    public static /* synthetic */ BaseStream f(InterfaceC2434h interfaceC2434h) {
        if (interfaceC2434h == null) {
            return null;
        }
        return interfaceC2434h instanceof C2424f ? ((C2424f) interfaceC2434h).f21073a : interfaceC2434h instanceof C ? B.f((C) interfaceC2434h) : interfaceC2434h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC2434h) : interfaceC2434h instanceof InterfaceC2460m0 ? C2455l0.f((InterfaceC2460m0) interfaceC2434h) : interfaceC2434h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC2434h) : new C2429g(interfaceC2434h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f21078a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC2434h interfaceC2434h = this.f21078a;
        if (obj instanceof C2429g) {
            obj = ((C2429g) obj).f21078a;
        }
        return interfaceC2434h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21078a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f21078a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f21078a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f(this.f21078a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f(this.f21078a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f(this.f21078a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f21078a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f(this.f21078a.unordered());
    }
}
