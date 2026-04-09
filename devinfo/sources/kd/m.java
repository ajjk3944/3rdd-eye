package kd;

import android.text.Editable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends zc.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f28173a;

    public m(o oVar) {
        this.f28173a = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f28173a.b().a();
    }

    @Override // zc.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        this.f28173a.b().b();
    }
}
