package com.zipoapps.premiumhelper.util;

import A9.C0575f;
import A9.E;
import A9.U;
import F9.q;
import I9.c;
import J8.E;
import J8.F;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;
import va.a;

/* compiled from: ConsumeAllReceiver.kt */
/* loaded from: classes3.dex */
public final class ConsumeAllReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37185a = 0;

    /* compiled from: ConsumeAllReceiver.kt */
    @e(c = "com.zipoapps.premiumhelper.util.ConsumeAllReceiver$onReceive$1", f = "ConsumeAllReceiver.kt", l = {21}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37186l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f37187m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37187m = context;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f37187m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37186l;
            if (i == 0) {
                n.b(obj);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                this.f37186l = 1;
                obj = eVarA.f37027q.j(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            J8.E e4 = (J8.E) obj;
            l.f(e4, "<this>");
            boolean z10 = e4 instanceof E.c;
            Context context = this.f37187m;
            if (z10) {
                Toast.makeText(context, "Successfully consumed: " + F.b(e4) + " products", 0).show();
                a.b bVar = va.a.f47104a;
                int i10 = ConsumeAllReceiver.f37185a;
                bVar.o("ConsumeAllReceiver");
                bVar.a("onReceive()-> Successfully consumed: " + F.b(e4) + " products", new Object[0]);
            } else {
                Toast.makeText(context, "Failed to consume: " + F.a(e4), 0).show();
                a.b bVar2 = va.a.f47104a;
                int i11 = ConsumeAllReceiver.f37185a;
                bVar2.o("ConsumeAllReceiver");
                bVar2.c("onReceive()-> Failed to consume: " + F.a(e4), new Object[0]);
            }
            return C1992A.f18074a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.f(context, "context");
        l.f(intent, "intent");
        c cVar = U.f211a;
        C0575f.e(A9.F.a(q.f1782a), null, null, new a(context, null), 3);
    }
}
