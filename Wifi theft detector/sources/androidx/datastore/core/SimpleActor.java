package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.r1;
import l9.l;
import l9.p;
import y8.s;

/* loaded from: classes.dex */
public final class SimpleActor {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2893b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.channels.a f2894c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f2895d;

    public SimpleActor(j0 scope, final l onComplete, final p onUndeliveredElement, p consumeMessage) {
        kotlin.jvm.internal.p.e(scope, "scope");
        kotlin.jvm.internal.p.e(onComplete, "onComplete");
        kotlin.jvm.internal.p.e(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.p.e(consumeMessage, "consumeMessage");
        this.f2892a = scope;
        this.f2893b = consumeMessage;
        this.f2894c = kotlinx.coroutines.channels.d.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f2895d = new AtomicInteger(0);
        r1 r1Var = (r1) scope.getCoroutineContext().get(r1.H8);
        if (r1Var == null) {
            return;
        }
        r1Var.U(new l() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return s.f25199a;
            }

            public final void invoke(Throwable th) {
                s sVar;
                onComplete.invoke(th);
                this.f2894c.A(th);
                do {
                    Object objF = kotlinx.coroutines.channels.e.f(this.f2894c.v());
                    if (objF == null) {
                        sVar = null;
                    } else {
                        onUndeliveredElement.invoke(objF, th);
                        sVar = s.f25199a;
                    }
                } while (sVar != null);
            }
        });
    }

    public final void e(Object obj) {
        Object objN = this.f2894c.n(obj);
        if (objN instanceof e.a) {
            Throwable thE = kotlinx.coroutines.channels.e.e(objN);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.e.i(objN)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f2895d.getAndIncrement() == 0) {
            kotlinx.coroutines.k.d(this.f2892a, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
