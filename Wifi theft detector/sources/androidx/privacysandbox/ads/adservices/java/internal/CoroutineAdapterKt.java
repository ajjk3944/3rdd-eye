package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.o0;
import l9.l;
import y8.s;

/* loaded from: classes.dex */
public abstract class CoroutineAdapterKt {
    public static final com.google.common.util.concurrent.a b(final o0 o0Var, final Object obj) {
        p.e(o0Var, "<this>");
        com.google.common.util.concurrent.a aVarA = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                return CoroutineAdapterKt.d(o0Var, obj, aVar);
            }
        });
        p.d(aVarA, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return aVarA;
    }

    public static /* synthetic */ com.google.common.util.concurrent.a c(o0 o0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(o0Var, obj);
    }

    public static final Object d(final o0 this_asListenableFuture, Object obj, final CallbackToFutureAdapter.a completer) {
        p.e(this_asListenableFuture, "$this_asListenableFuture");
        p.e(completer, "completer");
        this_asListenableFuture.U(new l() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Throwable) obj2);
                return s.f25199a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    completer.c(this_asListenableFuture.l());
                } else if (th instanceof CancellationException) {
                    completer.d();
                } else {
                    completer.f(th);
                }
            }
        });
        return obj;
    }
}
