package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29339a;

    private a(AutofillId autofillId) {
        this.f29339a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f29339a;
    }
}
