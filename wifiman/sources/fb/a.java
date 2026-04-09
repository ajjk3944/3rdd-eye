package Fb;

import gg.i;
import ig.AbstractC6152a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.L;
import mh.InterfaceC6824a;
import retrofit2.HttpException;

/* loaded from: classes3.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    private final int f6436a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f6437b;

    /* renamed from: Fb.a$a, reason: collision with other inner class name */
    static final class C0248a implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f6438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6439b;

        C0248a(L l10, a aVar) {
            this.f6438a = l10;
            this.f6439b = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            L l10 = this.f6438a;
            int i10 = l10.f51687a;
            l10.f51687a = i10 + 1;
            return (i10 >= this.f6439b.f6436a || !this.f6439b.e(it)) ? AbstractC6152a.a(it) : it;
        }
    }

    static final class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            InterfaceC6824a interfaceC6824a = a.this.f6437b;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
        }
    }

    public a(int i10, InterfaceC6824a interfaceC6824a) {
        this.f6436a = i10;
        this.f6437b = interfaceC6824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(Throwable th2) {
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            if (httpException.a() == 403 || httpException.a() == 401) {
                return true;
            }
        }
        return false;
    }

    @Override // kg.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i apply(i errorFlow) {
        AbstractC6492s.i(errorFlow, "errorFlow");
        i iVarF0 = errorFlow.N0(new C0248a(new L(), this)).f0(new b());
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }
}
