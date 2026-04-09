package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import l0.C6533i;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5840a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final View f47365a;

    /* renamed from: b, reason: collision with root package name */
    private final i f47366b;

    /* renamed from: c, reason: collision with root package name */
    private final AutofillManager f47367c;

    public C5840a(View view, i iVar) {
        this.f47365a = view;
        this.f47366b = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f47367c = autofillManager;
        view.setImportantForAutofill(1);
    }

    @Override // g0.d
    public void a(h hVar) {
        C6533i c6533iD = hVar.d();
        if (c6533iD == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.f47367c.notifyViewEntered(this.f47365a, hVar.e(), new Rect(Math.round(c6533iD.k()), Math.round(c6533iD.n()), Math.round(c6533iD.l()), Math.round(c6533iD.e())));
    }

    @Override // g0.d
    public void b(h hVar) {
        this.f47367c.notifyViewExited(this.f47365a, hVar.e());
    }

    public final AutofillManager c() {
        return this.f47367c;
    }

    public final i d() {
        return this.f47366b;
    }

    public final View e() {
        return this.f47365a;
    }
}
