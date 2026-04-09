package J8;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.singular.sdk.Singular;
import com.singular.sdk.SingularConfig;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;

/* compiled from: SingularUtils.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.SingularUtils$initialize$1", f = "SingularUtils.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class O extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2839l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f2840m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context context, InterfaceC4347e<? super O> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2840m = context;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new O(this.f2840m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((O) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2839l;
        if (i == 0) {
            b9.n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            this.f2839l = 1;
            B0.f fVar = eVarA.f37019h;
            fVar.getClass();
            obj = C0575f.h(A9.U.f212b, new C0695j(fVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        Context context = this.f2840m;
        Singular.init(context, new SingularConfig(context.getString(R.string.ph_singular_api_key), context.getString(R.string.ph_singular_secret_key)).withCustomUserId((String) obj));
        C0575f.e(A9.F.a(A9.U.f212b), null, null, new P(2, null), 3);
        return C1992A.f18074a;
    }
}
