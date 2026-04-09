package j2;

import Ii.V;
import Yg.J;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.d;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6244b {

    /* renamed from: j2.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f50046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f50047b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, V v10) {
            super(1);
            this.f50046a = aVar;
            this.f50047b = v10;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f50046a.b(this.f50047b.getCompleted());
            } else if (th2 instanceof CancellationException) {
                this.f50046a.c();
            } else {
                this.f50046a.e(th2);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public static final d b(final V v10, final Object obj) {
        AbstractC6492s.i(v10, "<this>");
        d dVarA = c.a(new c.InterfaceC1091c() { // from class: j2.a
            @Override // androidx.concurrent.futures.c.InterfaceC1091c
            public final Object a(c.a aVar) {
                return AbstractC6244b.d(v10, obj, aVar);
            }
        });
        AbstractC6492s.h(dVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return dVarA;
    }

    public static /* synthetic */ d c(V v10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(v10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(V this_asListenableFuture, Object obj, c.a completer) {
        AbstractC6492s.i(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC6492s.i(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
