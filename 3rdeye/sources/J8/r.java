package J8;

import A9.C0575f;
import A9.InterfaceC0594o0;
import android.content.SharedPreferences;
import b9.C1992A;
import com.facebook.applinks.AppLinkData;
import f9.InterfaceC4347e;

/* compiled from: FacebookInstallData.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2", f = "FacebookInstallData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class r extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super InterfaceC0594o0>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2891l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0705u f2892m;

    /* compiled from: FacebookInstallData.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData$fetchAndReport$2$1", f = "FacebookInstallData.kt", l = {25}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public C0705u f2893l;

        /* renamed from: m, reason: collision with root package name */
        public int f2894m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C0705u f2895n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0705u c0705u, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f2895n = c0705u;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f2895n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f2894m;
            C0705u c0705u = this.f2895n;
            com.zipoapps.premiumhelper.c cVar = c0705u.f2900b;
            if (i == 0) {
                b9.n.b(obj);
                if (!cVar.f37004a.getBoolean("is_facebook_install_handled", false)) {
                    this.f2893l = c0705u;
                    this.f2894m = 1;
                    obj = c0705u.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C1992A.f18074a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0705u = this.f2893l;
            b9.n.b(obj);
            c0705u.b((AppLinkData) obj);
            SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
            editorEdit.putBoolean("is_facebook_install_handled", true);
            editorEdit.apply();
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0705u c0705u, InterfaceC4347e<? super r> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2892m = c0705u;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        r rVar = new r(this.f2892m, interfaceC4347e);
        rVar.f2891l = obj;
        return rVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super InterfaceC0594o0> interfaceC4347e) {
        return ((r) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        return C0575f.e((A9.E) this.f2891l, A9.U.f212b, null, new a(this.f2892m, null), 2);
    }
}
