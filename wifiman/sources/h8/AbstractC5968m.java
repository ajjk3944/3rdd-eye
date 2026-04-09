package h8;

import java.lang.Thread;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: h8.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5968m {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6469f f48517a = new InterfaceC6469f() { // from class: h8.l
        @Override // kg.InterfaceC6469f
        public final void accept(Object obj) {
            AbstractC5968m.b((Throwable) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Throwable error) {
        AbstractC6492s.i(error, "error");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), error);
            return;
        }
        throw new IllegalStateException(("no uncaughtExceptionHandler set on thread " + Thread.currentThread().getName()).toString());
    }
}
