package h8;

import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: h8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5961f {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.c f48511a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f48512b;

    /* renamed from: c, reason: collision with root package name */
    private final a f48513c;

    /* renamed from: h8.f$a */
    public static final class a implements InterfaceC4007e {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void g(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.g(owner);
            AbstractC5961f.this.b().h(EnumC5959d.RESUME);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void h(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.h(owner);
            AbstractC5961f.this.b().h(EnumC5959d.CREATE);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onDestroy(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onDestroy(owner);
            AbstractC5961f.this.b().h(EnumC5959d.DESTROY);
            AbstractC5961f.this.a(EnumC5958c.VIEW_DESTROYED);
            AbstractC5961f.this.a(EnumC5958c.DESTROYED);
            AbstractC5961f.this.b().a();
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onStart(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onStart(owner);
            AbstractC5961f.this.b().h(EnumC5959d.START);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void onStop(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.onStop(owner);
            AbstractC5961f.this.b().h(EnumC5959d.STOP);
            AbstractC5961f.this.a(EnumC5958c.STOPPED);
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void p(InterfaceC4017o owner) {
            AbstractC6492s.i(owner, "owner");
            super.p(owner);
            AbstractC5961f.this.b().h(EnumC5959d.PAUSE);
            AbstractC5961f.this.a(EnumC5958c.PAUSED);
        }
    }

    public AbstractC5961f(InterfaceC4017o lifecycleOwner) {
        AbstractC6492s.i(lifecycleOwner, "lifecycleOwner");
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f48511a = cVarJ2;
        this.f48512b = new LinkedHashMap();
        a aVar = new a();
        this.f48513c = aVar;
        lifecycleOwner.O().a(aVar);
    }

    private final C6042b c(EnumC5958c enumC5958c) {
        if (!this.f48512b.containsKey(enumC5958c)) {
            C6042b c6042b = new C6042b();
            this.f48512b.put(enumC5958c, c6042b);
            return c6042b;
        }
        throw new IllegalStateException(enumC5958c + " already has disposable!");
    }

    protected final void a(EnumC5958c state) {
        AbstractC6492s.i(state, "state");
        C6042b c6042b = (C6042b) this.f48512b.remove(state);
        if (c6042b != null) {
            c6042b.dispose();
        }
    }

    protected final Fg.c b() {
        return this.f48511a;
    }

    public final void d(InterfaceC6043c disposable, EnumC5958c state) {
        AbstractC6492s.i(disposable, "disposable");
        AbstractC6492s.i(state, "state");
        C6042b c6042bC = (C6042b) this.f48512b.get(state);
        if (c6042bC == null) {
            c6042bC = c(state);
        }
        c6042bC.a(disposable);
    }
}
