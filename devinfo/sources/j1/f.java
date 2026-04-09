package j1;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements p {

    /* renamed from: a, reason: collision with root package name */
    public final AutofillValue f27050a;

    public f(AutofillValue autofillValue) {
        this.f27050a = autofillValue;
    }

    public final Boolean a() {
        if (this.f27050a.isToggle()) {
            return Boolean.valueOf(this.f27050a.getToggleValue());
        }
        return null;
    }
}
