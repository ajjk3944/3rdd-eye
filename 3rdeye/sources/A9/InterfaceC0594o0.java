package A9;

import b9.C1992A;
import c9.C2096q;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;

/* compiled from: Job.kt */
/* renamed from: A9.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0594o0 extends InterfaceC4350h.a {

    /* compiled from: Job.kt */
    /* renamed from: A9.o0$a */
    public static final class a implements InterfaceC4350h.b<InterfaceC0594o0> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f263b = new a();
    }

    CancellationException A();

    W F(p9.l<? super Throwable, C1992A> lVar);

    C2096q a();

    void c(CancellationException cancellationException);

    InterfaceC0594o0 getParent();

    boolean isActive();

    boolean isCancelled();

    InterfaceC0591n k(C0605u0 c0605u0);

    W n(boolean z10, boolean z11, C0601s0 c0601s0);

    boolean start();

    Object w0(h9.c cVar);
}
