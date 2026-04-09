package y3;

import a9.InterfaceC1676a;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
public final class k implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1676a<Executor> f48081b;

    /* renamed from: c, reason: collision with root package name */
    public A3.c f48082c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1676a f48083d;

    /* renamed from: e, reason: collision with root package name */
    public F3.t f48084e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1676a<F3.m> f48085f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1676a<u> f48086g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48085f.get().close();
    }
}
