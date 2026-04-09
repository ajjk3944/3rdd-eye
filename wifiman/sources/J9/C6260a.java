package j9;

import Zg.AbstractC3689v;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.IOException;
import java.lang.Thread;
import java.net.SocketException;
import java.util.List;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6260a implements InterfaceC6469f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f50173a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f50174b;

    public C6260a(InterfaceC6835l fatalErrorLogger, InterfaceC6835l unhandledExceptionHandler) {
        AbstractC6492s.i(fatalErrorLogger, "fatalErrorLogger");
        AbstractC6492s.i(unhandledExceptionHandler, "unhandledExceptionHandler");
        this.f50173a = fatalErrorLogger;
        this.f50174b = unhandledExceptionHandler;
    }

    @Override // kg.InterfaceC6469f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable error) {
        Throwable cause;
        List listC;
        AbstractC6492s.i(error, "error");
        if (!(error instanceof CompositeException) ? !(!(error instanceof UndeliverableException) || (cause = error.getCause()) == null) : !((listC = ((CompositeException) error).c()) == null || (cause = (Throwable) AbstractC3689v.s0(listC)) == null)) {
            error = cause;
        }
        if ((error instanceof IOException) || (error instanceof SocketException) || (error instanceof InterruptedException)) {
            return;
        }
        if ((error instanceof NullPointerException) || (error instanceof IllegalArgumentException)) {
            this.f50173a.invoke(error);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler == null) {
                throw new IllegalStateException("unexpectedly null error thread handler");
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), error);
            return;
        }
        if (!(error instanceof IllegalStateException)) {
            this.f50174b.invoke(error);
            return;
        }
        this.f50173a.invoke(error);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = Thread.currentThread().getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler2 == null) {
            throw new IllegalStateException("unexpectedly null error thread handler");
        }
        uncaughtExceptionHandler2.uncaughtException(Thread.currentThread(), error);
    }
}
