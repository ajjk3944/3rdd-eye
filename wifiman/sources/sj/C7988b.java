package sj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.kodein.di.DI;

/* renamed from: sj.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7988b implements InterfaceC7990c {

    /* renamed from: sj.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f61646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f61646a = context;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DI invoke() {
            Context context = this.f61646a;
            return AbstractC7986a.b(context, context);
        }
    }

    @Override // sj.InterfaceC7990c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Yg.m a(Context thisRef, th.l lVar) {
        AbstractC6492s.i(thisRef, "thisRef");
        return Yg.n.b(new a(thisRef));
    }
}
