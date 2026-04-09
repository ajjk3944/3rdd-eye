package j1;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j2.r f27035a;

    /* renamed from: b, reason: collision with root package name */
    public final l f27036b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f27037c;

    /* renamed from: d, reason: collision with root package name */
    public final AutofillId f27038d;

    public a(j2.r rVar, l lVar) {
        this.f27035a = rVar;
        this.f27036b = lVar;
        AutofillManager autofillManager = (AutofillManager) rVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f27037c = autofillManager;
        rVar.setImportantForAutofill(1);
        q qVarF = nh.a.f(rVar);
        AutofillId autofillId = qVarF != null ? (AutofillId) qVarF.f27058a : null;
        if (autofillId == null) {
            throw d.h.o("Required value was null.");
        }
        this.f27038d = autofillId;
    }
}
