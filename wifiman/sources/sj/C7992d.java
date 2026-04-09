package sj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.kodein.di.DI;

/* renamed from: sj.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7992d implements InterfaceC7990c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f61647a;

    /* renamed from: sj.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f61648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7992d f61649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, C7992d c7992d) {
            super(0);
            this.f61648a = obj;
            this.f61649b = c7992d;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DI invoke() {
            return AbstractC7986a.b(this.f61648a, (Context) this.f61649b.f61647a.invoke());
        }
    }

    public C7992d(InterfaceC6824a getContext) {
        AbstractC6492s.i(getContext, "getContext");
        this.f61647a = getContext;
    }

    @Override // sj.InterfaceC7990c
    public Yg.m a(Object obj, th.l lVar) {
        return Yg.n.b(new a(obj, this));
    }
}
