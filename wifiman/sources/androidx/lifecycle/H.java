package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import b2.AbstractC4056a;
import kotlin.jvm.internal.AbstractC6492s;
import q2.C7416d;
import q2.InterfaceC7418f;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC4056a.b f31605a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC4056a.b f31606b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC4056a.b f31607c = new a();

    public static final class a implements AbstractC4056a.b {
        a() {
        }
    }

    public static final class b implements AbstractC4056a.b {
        b() {
        }
    }

    public static final class c implements AbstractC4056a.b {
        c() {
        }
    }

    public static final class d implements P.c {
        d() {
        }

        @Override // androidx.lifecycle.P.c
        public N b(Class modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            return new J();
        }
    }

    public static final E a(AbstractC4056a abstractC4056a) {
        AbstractC6492s.i(abstractC4056a, "<this>");
        InterfaceC7418f interfaceC7418f = (InterfaceC7418f) abstractC4056a.a(f31605a);
        if (interfaceC7418f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        S s10 = (S) abstractC4056a.a(f31606b);
        if (s10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC4056a.a(f31607c);
        String str = (String) abstractC4056a.a(P.d.f31634d);
        if (str != null) {
            return b(interfaceC7418f, s10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final E b(InterfaceC7418f interfaceC7418f, S s10, String str, Bundle bundle) {
        I iD = d(interfaceC7418f);
        J jE = e(s10);
        E e10 = (E) jE.X().get(str);
        if (e10 != null) {
            return e10;
        }
        E eA = E.f31594f.a(iD.b(str), bundle);
        jE.X().put(str, eA);
        return eA;
    }

    public static final void c(InterfaceC7418f interfaceC7418f) {
        AbstractC6492s.i(interfaceC7418f, "<this>");
        AbstractC4013k.b bVarB = interfaceC7418f.O().b();
        if (bVarB != AbstractC4013k.b.INITIALIZED && bVarB != AbstractC4013k.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC7418f.t().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            I i10 = new I(interfaceC7418f.t(), (S) interfaceC7418f);
            interfaceC7418f.t().h("androidx.lifecycle.internal.SavedStateHandlesProvider", i10);
            interfaceC7418f.O().a(new F(i10));
        }
    }

    public static final I d(InterfaceC7418f interfaceC7418f) {
        AbstractC6492s.i(interfaceC7418f, "<this>");
        C7416d.c cVarC = interfaceC7418f.t().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        I i10 = cVarC instanceof I ? (I) cVarC : null;
        if (i10 != null) {
            return i10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final J e(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return (J) new P(s10, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", J.class);
    }
}
