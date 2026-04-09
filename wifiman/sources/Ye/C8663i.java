package ye;

import T.K;
import T.L;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.N;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: ye.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8663i implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f66753a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4017o f66754b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.appcompat.app.c f66755c;

    /* renamed from: ye.i$a */
    public static final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4007e f66756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f66757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4017o f66758c;

        public a(InterfaceC4007e interfaceC4007e, androidx.appcompat.app.c cVar, InterfaceC4017o interfaceC4017o) {
            this.f66756a = interfaceC4007e;
            this.f66757b = cVar;
            this.f66758c = interfaceC4017o;
        }

        @Override // T.K
        public void dispose() {
            if (this.f66756a != null) {
                if (this.f66757b.O().b() == AbstractC4013k.b.RESUMED) {
                    this.f66756a.onStop(this.f66758c);
                }
                this.f66758c.O().c(this.f66756a);
            }
        }
    }

    /* renamed from: ye.i$b */
    public static final class b implements InterfaceC4007e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4007e f66759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f66760b;

        public b(InterfaceC4007e interfaceC4007e, androidx.appcompat.app.c cVar) {
            this.f66759a = interfaceC4007e;
            this.f66760b = cVar;
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void g(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.g(owner);
            this.f66759a.g(owner);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void h(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.h(owner);
            this.f66759a.h(owner);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onDestroy(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onDestroy(owner);
            this.f66759a.onDestroy(owner);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onStart(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onStart(owner);
            this.f66759a.onStart(owner);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onStop(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onStop(owner);
            if (this.f66760b.O().b() != AbstractC4013k.b.RESUMED) {
                this.f66759a.onStop(owner);
            }
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void p(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.p(owner);
            this.f66759a.p(owner);
        }
    }

    public C8663i(N n10, InterfaceC4017o interfaceC4017o, androidx.appcompat.app.c cVar) {
        this.f66753a = n10;
        this.f66754b = interfaceC4017o;
        this.f66755c = cVar;
    }

    @Override // mh.InterfaceC6835l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K invoke(L DisposableEffect) {
        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
        Object obj = this.f66753a;
        InterfaceC4007e interfaceC4007e = obj instanceof InterfaceC4007e ? (InterfaceC4007e) obj : null;
        if (interfaceC4007e != null) {
            this.f66754b.O().a(new b(interfaceC4007e, this.f66755c));
        }
        return new a(interfaceC4007e, this.f66755c, this.f66754b);
    }
}
