package q2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7417e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f58360d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7418f f58361a;

    /* renamed from: b, reason: collision with root package name */
    private final C7416d f58362b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f58363c;

    /* renamed from: q2.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7417e a(InterfaceC7418f owner) {
            AbstractC6492s.i(owner, "owner");
            return new C7417e(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C7417e(InterfaceC7418f interfaceC7418f, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7418f);
    }

    public static final C7417e a(InterfaceC7418f interfaceC7418f) {
        return f58360d.a(interfaceC7418f);
    }

    public final C7416d b() {
        return this.f58362b;
    }

    public final void c() {
        AbstractC4013k abstractC4013kO = this.f58361a.O();
        if (abstractC4013kO.b() != AbstractC4013k.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC4013kO.a(new C7414b(this.f58361a));
        this.f58362b.e(abstractC4013kO);
        this.f58363c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f58363c) {
            c();
        }
        AbstractC4013k abstractC4013kO = this.f58361a.O();
        if (!abstractC4013kO.b().isAtLeast(AbstractC4013k.b.STARTED)) {
            this.f58362b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC4013kO.b()).toString());
    }

    public final void e(Bundle outBundle) {
        AbstractC6492s.i(outBundle, "outBundle");
        this.f58362b.g(outBundle);
    }

    private C7417e(InterfaceC7418f interfaceC7418f) {
        this.f58361a = interfaceC7418f;
        this.f58362b = new C7416d();
    }
}
