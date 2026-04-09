package je;

import android.text.Editable;

/* loaded from: classes.dex */
public final class k extends xd.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f13640a;

    public k(m mVar) {
        this.f13640a = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f13640a.b().a();
    }

    @Override // xd.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f13640a.b().b();
    }
}
