package D4;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import c5.C0412i;
import com.lefan.base.pdf.PdfReadActivity;
import h5.InterfaceC2370d;
import j5.g;
import java.io.File;
import java.util.ArrayList;
import p5.p;
import q5.i;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class e extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PdfReadActivity f1288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PdfReadActivity pdfReadActivity, String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f1288e = pdfReadActivity;
        this.f1289f = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((e) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new e(this.f1288e, this.f1289f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        ArrayList arrayList = this.f1288e.f18780O;
        ArrayList arrayList2 = new ArrayList();
        File file = new File(this.f1289f);
        if (file.exists()) {
            try {
                PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456));
                int pageCount = pdfRenderer.getPageCount();
                for (int i = 0; i < pageCount; i++) {
                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
                    i.d(pageOpenPage, "openPage(...)");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                    arrayList2.add(bitmapCreateBitmap);
                    pageOpenPage.close();
                }
                pdfRenderer.close();
            } catch (Throwable th) {
                R2.a.d(th);
            }
        }
        return Boolean.valueOf(arrayList.addAll(arrayList2));
    }
}
