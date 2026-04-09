package com.zipoapps.premiumhelper.ui.settings;

import A2.l;
import A9.C0575f;
import A9.E;
import A9.F;
import A9.U;
import F9.q;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import i8.m;
import p9.p;

/* compiled from: SettingsApi.kt */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: SettingsApi.kt */
    @e(c = "com.zipoapps.premiumhelper.ui.settings.SettingsApi$openCMPDialog$1", f = "SettingsApi.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f37154l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37154l = context;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f37154l, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            AppCompatActivity appCompatActivity = (AppCompatActivity) this.f37154l;
            I9.c cVar = U.f211a;
            C0575f.e(F.a(q.f1782a), null, null, new m(eVarA, appCompatActivity, null), 3);
            return C1992A.f18074a;
        }
    }

    public static void a(Context context) {
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            C0575f.e(l.y(appCompatActivity), null, null, new a(context, null), 3);
        }
    }
}
