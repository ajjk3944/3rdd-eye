package f8;

import android.content.Intent;
import b9.C1992A;
import b9.j;
import b9.n;
import f8.AbstractC4342e;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: PremiumActivity.kt */
@h9.e(c = "com.zipoapps.premium.PremiumActivity$handleUiEvents$1", f = "PremiumActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: f8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4339b extends i implements p<AbstractC4342e.a, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f37824l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4340c<AbstractC4342e> f37825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4339b(AbstractActivityC4340c<AbstractC4342e> abstractActivityC4340c, InterfaceC4347e<? super C4339b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37825m = abstractActivityC4340c;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C4339b c4339b = new C4339b(this.f37825m, interfaceC4347e);
        c4339b.f37824l = obj;
        return c4339b;
    }

    @Override // p9.p
    public final Object invoke(AbstractC4342e.a aVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C4339b) create(aVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        AbstractC4342e.a aVar2 = (AbstractC4342e.a) this.f37824l;
        boolean z10 = aVar2 instanceof AbstractC4342e.a.b;
        AbstractActivityC4340c<AbstractC4342e> abstractActivityC4340c = this.f37825m;
        if (z10) {
            abstractActivityC4340c.startActivity(new Intent(abstractActivityC4340c, ((AbstractC4342e.a.b) aVar2).f37846a));
            abstractActivityC4340c.finish();
        } else {
            if (!l.b(aVar2, AbstractC4342e.a.C0454a.f37845a)) {
                throw new j();
            }
            abstractActivityC4340c.finish();
        }
        return C1992A.f18074a;
    }
}
