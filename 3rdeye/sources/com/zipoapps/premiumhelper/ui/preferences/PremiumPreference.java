package com.zipoapps.premiumhelper.ui.preferences;

import A9.C0575f;
import A9.E;
import A9.F;
import A9.L0;
import A9.U;
import C.e0;
import D9.H;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import F9.C0663f;
import F9.q;
import I9.c;
import android.content.Context;
import android.util.AttributeSet;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.preferences.common.SafeClickPreference;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import h9.e;
import h9.i;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import n1.h;
import p9.p;
import x8.C5782b;

/* compiled from: PremiumPreference.kt */
/* loaded from: classes3.dex */
public class PremiumPreference extends SafeClickPreference {

    /* renamed from: O, reason: collision with root package name */
    public C0663f f37070O;

    /* renamed from: P, reason: collision with root package name */
    public final C5782b f37071P;

    /* compiled from: PremiumPreference.kt */
    @e(c = "com.zipoapps.premiumhelper.ui.preferences.PremiumPreference$onAttached$1", f = "PremiumPreference.kt", l = {47}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37072l;

        /* compiled from: PremiumPreference.kt */
        /* renamed from: com.zipoapps.premiumhelper.ui.preferences.PremiumPreference$a$a, reason: collision with other inner class name */
        public static final class C0431a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PremiumPreference f37074b;

            public C0431a(PremiumPreference premiumPreference) {
                this.f37074b = premiumPreference;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                ((Boolean) obj).getClass();
                this.f37074b.B();
                return C1992A.f18074a;
            }
        }

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return PremiumPreference.this.new a(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37072l;
            if (i == 0) {
                n.b(obj);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                InterfaceC0644f interfaceC0644fC = H.c(e.a.a().f37027q.f43576h);
                C0431a c0431a = new C0431a(PremiumPreference.this);
                this.f37072l = 1;
                if (interfaceC0644fC.b(c0431a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    public boolean A() {
        this.f37071P.getClass();
        return !C5782b.b();
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        L0 l0A = C0575f.a();
        c cVar = U.f211a;
        C0663f c0663fA = F.a(InterfaceC4350h.a.C0456a.d(l0A, q.f1782a.R0()));
        this.f37070O = c0663fA;
        C0575f.e(c0663fA, null, null, new a(null), 3);
    }

    @Override // androidx.preference.Preference
    public final void l(h holder) {
        l.f(holder, "holder");
        super.l(holder);
        this.f37071P.a(holder);
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        C0663f c0663f = this.f37070O;
        if (c0663f != null) {
            F.b(c0663f, null);
        }
    }

    public /* synthetic */ PremiumPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f37071P = new C5782b(context, attributeSet);
        this.f16252f = new e0(20, this, new N.g(this, context));
    }

    public void B() {
    }
}
