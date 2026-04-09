package a1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.y3;
import u.u;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    public final b9.c f11a;

    /* renamed from: b, reason: collision with root package name */
    public final e2.m f12b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f13c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.a f14d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15e;

    /* renamed from: f, reason: collision with root package name */
    public final AutofillId f16f;

    /* renamed from: g, reason: collision with root package name */
    public final u f17g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18h;

    public c(b9.c cVar, e2.m mVar, AndroidComposeView androidComposeView, f2.a aVar, String str) {
        this.f11a = cVar;
        this.f12b = mVar;
        this.f13c = androidComposeView;
        this.f14d = aVar;
        this.f15e = str;
        new Rect();
        androidComposeView.setImportantForAutofill(1);
        a2.a aVarT = y3.t(androidComposeView);
        AutofillId autofillIdD = aVarT != null ? a.d(aVarT.f28a) : null;
        if (autofillIdD == null) {
            throw c7.a.h("Required value was null.");
        }
        this.f16f = autofillIdD;
        this.f17g = new u();
    }
}
