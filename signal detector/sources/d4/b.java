package D4;

import B4.q;
import android.content.Intent;
import c5.C0412i;
import com.apm.insight.R;
import com.lefan.base.pdf.PdfReadActivity;
import e.AbstractC2286c;
import p5.l;
import q2.C2834o;
import q5.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdfReadActivity f1284b;

    public /* synthetic */ b(PdfReadActivity pdfReadActivity, int i) {
        this.f1283a = i;
        this.f1284b = pdfReadActivity;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        int i = this.f1283a;
        C0412i c0412i = C0412i.f5929a;
        PdfReadActivity pdfReadActivity = this.f1284b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i3 = PdfReadActivity.f18779T;
                if (!zBooleanValue) {
                    F4.d.b(pdfReadActivity, pdfReadActivity.getString(R.string.permission_write_external_storage_failed));
                    break;
                } else {
                    pdfReadActivity.C();
                    break;
                }
            default:
                q qVar = (q) obj;
                int i6 = PdfReadActivity.f18779T;
                i.e(qVar, "dialog");
                qVar.dismiss();
                C2834o c2834o = pdfReadActivity.f18784S;
                Intent intentX = com.bumptech.glide.d.x((PdfReadActivity) c2834o.f23252b, "android.settings.APPLICATION_DETAILS_SETTINGS");
                if (intentX != null) {
                    ((AbstractC2286c) c2834o.f23257g).a(intentX);
                    break;
                }
                break;
        }
        return c0412i;
    }
}
