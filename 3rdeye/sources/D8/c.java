package D8;

import A9.C0575f;
import A9.E;
import D9.J;
import F9.C0663f;
import J8.L;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import f9.InterfaceC4347e;
import g0.C4356c;
import java.util.LinkedHashSet;

/* compiled from: PhSecretScreenManager.kt */
/* loaded from: classes3.dex */
public final class c implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0663f f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C6.a f1084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.d f1085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f1086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1087f;

    /* compiled from: PhSecretScreenManager.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhSecretScreenManager$1$onStart$1", f = "PhSecretScreenManager.kt", l = {36}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public C6.a f1088l;

        /* renamed from: m, reason: collision with root package name */
        public int f1089m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C6.a f1090n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.d f1091o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ L f1092p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ d f1093q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6.a aVar, com.zipoapps.premiumhelper.d dVar, L l5, d dVar2, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f1090n = aVar;
            this.f1091o = dVar;
            this.f1092p = l5;
            this.f1093q = dVar2;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f1090n, this.f1091o, this.f1092p, this.f1093q, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            C6.a aVar;
            g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
            int i = this.f1089m;
            C6.a aVar3 = this.f1090n;
            if (i == 0) {
                b9.n.b(obj);
                o8.f fVar = o8.f.f44891a;
                this.f1088l = aVar3;
                this.f1089m = 1;
                obj = fVar.a(this.f1091o, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f1088l;
                b9.n.b(obj);
            }
            aVar.f927a = ((Boolean) obj).booleanValue();
            boolean z10 = aVar3.f927a;
            d dVar = this.f1093q;
            L l5 = this.f1092p;
            if (z10) {
                l5.a(dVar);
            } else {
                l5.getClass();
                LinkedHashSet linkedHashSet = l5.f2834d;
                linkedHashSet.remove(dVar);
                Boolean boolValueOf = Boolean.valueOf(!linkedHashSet.isEmpty());
                J j4 = l5.f2836f;
                j4.getClass();
                j4.g(null, boolValueOf);
                va.a.f47104a.a(C4356c.h(linkedHashSet.size(), "Remove listener. Count - "), new Object[0]);
            }
            return C1992A.f18074a;
        }
    }

    public c(C0663f c0663f, C6.a aVar, com.zipoapps.premiumhelper.d dVar, L l5, d dVar2) {
        this.f1083b = c0663f;
        this.f1084c = aVar;
        this.f1085d = dVar;
        this.f1086e = l5;
        this.f1087f = dVar2;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStart(InterfaceC1790x interfaceC1790x) {
        C0575f.e(this.f1083b, null, null, new a(this.f1084c, this.f1085d, this.f1086e, this.f1087f, null), 3);
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
    }
}
