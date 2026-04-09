package S9;

import b9.AbstractC1995b;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: JsonTreeReader.kt */
@h9.e(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class J extends h9.h implements p9.q<AbstractC1995b<C1992A, R9.i>, C1992A, InterfaceC4347e<? super R9.i>, Object> {

    /* renamed from: m, reason: collision with root package name */
    public int f12030m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ AbstractC1995b f12031n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1578j f12032o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C1578j c1578j, InterfaceC4347e<? super J> interfaceC4347e) {
        super(3, interfaceC4347e);
        this.f12032o = c1578j;
    }

    @Override // p9.q
    public final Object invoke(AbstractC1995b<C1992A, R9.i> abstractC1995b, C1992A c1992a, InterfaceC4347e<? super R9.i> interfaceC4347e) {
        J j4 = new J(this.f12032o, interfaceC4347e);
        j4.f12031n = abstractC1995b;
        return j4.invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f12030m;
        if (i == 0) {
            b9.n.b(obj);
            AbstractC1995b abstractC1995b = this.f12031n;
            C1578j c1578j = this.f12032o;
            AbstractC1569a abstractC1569a = (AbstractC1569a) c1578j.f12089b;
            byte bW = abstractC1569a.w();
            if (bW == 1) {
                return c1578j.d(true);
            }
            if (bW == 0) {
                return c1578j.d(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return c1578j.c();
                }
                AbstractC1569a.s(abstractC1569a, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f12030m = 1;
            obj = C1578j.a(c1578j, abstractC1995b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return (R9.i) obj;
    }
}
