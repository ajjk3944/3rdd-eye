package com.zipoapps.premiumhelper.toto;

import A9.E;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import p9.p;

/* compiled from: TotoManager.kt */
@e(c = "com.zipoapps.premiumhelper.toto.TotoManager$listenForAppStart$2$1$onStart$1", f = "TotoManager.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TotoManager$listenForAppStart$2$1$onStart$1 extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {
    int label;
    final /* synthetic */ TotoManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoManager$listenForAppStart$2$1$onStart$1(TotoManager totoManager, InterfaceC4347e<? super TotoManager$listenForAppStart$2$1$onStart$1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.this$0 = totoManager;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new TotoManager$listenForAppStart$2$1$onStart$1(this.this$0, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((TotoManager$listenForAppStart$2$1$onStart$1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                n.b(obj);
                TotoManager totoManager = this.this$0;
                this.label = 1;
                if (totoManager.getConfig(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            this.this$0.billing.x();
        } catch (Exception e4) {
            va.a.f47104a.e(e4, "[TotoManager] Error while GET TOTO CONFIG on app open", new Object[0]);
        }
        return C1992A.f18074a;
    }
}
