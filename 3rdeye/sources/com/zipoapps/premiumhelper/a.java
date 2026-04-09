package com.zipoapps.premiumhelper;

import A9.E;
import J8.E;
import android.content.SharedPreferences;
import b9.C1992A;
import b9.j;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.i;
import i8.C4461a;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: Analytics.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Analytics$checkHistoryPurchases$1", f = "Analytics.kt", l = {334}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f36999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4461a f37000m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4461a c4461a, InterfaceC4347e<? super a> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37000m = c4461a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new a(this.f37000m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f36999l;
        if (i == 0) {
            n.b(obj);
            e.f37006D.getClass();
            e eVarA = e.a.a();
            this.f36999l = 1;
            obj = eVarA.f37027q.p(this);
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
        C4461a c4461a = this.f37000m;
        l.f(e4, "<this>");
        if (e4 instanceof E.c) {
            boolean zBooleanValue = ((Boolean) ((E.c) e4).f2815b).booleanValue();
            SharedPreferences.Editor editorEdit = c4461a.f38486d.f37004a.edit();
            editorEdit.putBoolean("has_history_purchases", zBooleanValue);
            editorEdit.apply();
            C1992A c1992a = C1992A.f18074a;
        } else if (!(e4 instanceof E.b)) {
            throw new j();
        }
        if (!(e4 instanceof E.c)) {
            if (!(e4 instanceof E.b)) {
                throw new j();
            }
            w9.i<Object>[] iVarArr = C4461a.f38482n;
            c4461a.e().e(((E.b) e4).f2814b, "Failed to update history purchases", new Object[0]);
            C1992A c1992a2 = C1992A.f18074a;
        }
        return C1992A.f18074a;
    }
}
