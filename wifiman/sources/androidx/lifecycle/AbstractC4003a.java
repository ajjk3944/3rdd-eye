package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.P;
import b2.AbstractC4056a;
import kotlin.jvm.internal.AbstractC6492s;
import q2.C7416d;
import q2.InterfaceC7418f;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4003a extends P.e implements P.c {

    /* renamed from: b, reason: collision with root package name */
    private C7416d f31640b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4013k f31641c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f31642d;

    public AbstractC4003a(InterfaceC7418f owner, Bundle bundle) {
        AbstractC6492s.i(owner, "owner");
        this.f31640b = owner.t();
        this.f31641c = owner.O();
        this.f31642d = bundle;
    }

    private final N e(String str, Class cls) throws Exception {
        C7416d c7416d = this.f31640b;
        AbstractC6492s.f(c7416d);
        AbstractC4013k abstractC4013k = this.f31641c;
        AbstractC6492s.f(abstractC4013k);
        G gB = C4012j.b(c7416d, abstractC4013k, str, this.f31642d);
        N nF = f(str, cls, gB.s());
        nF.T("androidx.lifecycle.savedstate.vm.tag", gB);
        return nF;
    }

    @Override // androidx.lifecycle.P.c
    public N a(Class modelClass) {
        AbstractC6492s.i(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f31641c != null) {
            return e(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.P.c
    public N b(Class modelClass, AbstractC4056a extras) {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(extras, "extras");
        String str = (String) extras.a(P.d.f31634d);
        if (str != null) {
            return this.f31640b != null ? e(str, modelClass) : f(str, modelClass, H.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.P.e
    public void d(N viewModel) {
        AbstractC6492s.i(viewModel, "viewModel");
        C7416d c7416d = this.f31640b;
        if (c7416d != null) {
            AbstractC6492s.f(c7416d);
            AbstractC4013k abstractC4013k = this.f31641c;
            AbstractC6492s.f(abstractC4013k);
            C4012j.a(viewModel, c7416d, abstractC4013k);
        }
    }

    protected abstract N f(String str, Class cls, E e10);
}
