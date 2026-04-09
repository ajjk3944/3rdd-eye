package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class u<S> extends A<S> {

    /* renamed from: c, reason: collision with root package name */
    public int f22871c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4012d<S> f22872d;

    /* renamed from: e, reason: collision with root package name */
    public C4009a f22873e;

    /* compiled from: MaterialTextInputPicker.java */
    public class a extends z<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.z
        public final void a(S s10) {
            Iterator<z<S>> it = u.this.f22769b.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22871c = bundle.getInt("THEME_RES_ID_KEY");
        this.f22872d = (InterfaceC4012d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f22873e = (C4009a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f22871c));
        InterfaceC4012d<S> interfaceC4012d = this.f22872d;
        new a();
        return interfaceC4012d.v0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f22871c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22872d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22873e);
    }
}
