package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class s {
    public static final void a(View view, m fullyDrawnReporterOwner) {
        kotlin.jvm.internal.p.e(view, "<this>");
        kotlin.jvm.internal.p.e(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(r.report_drawn, fullyDrawnReporterOwner);
    }
}
