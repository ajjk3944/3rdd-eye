package D4;

import c5.C0412i;
import com.apm.insight.R;
import com.lefan.base.pdf.PdfReadActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import j5.g;
import java.util.ArrayList;
import p5.p;
import z5.AbstractC3046w;
import z5.D;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class f extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f1290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PdfReadActivity f1291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PdfReadActivity pdfReadActivity, String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f1291f = pdfReadActivity;
        this.f1292g = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((f) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new f(this.f1291f, this.f1292g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        PdfReadActivity pdfReadActivity = this.f1291f;
        ArrayList arrayList = pdfReadActivity.f18780O;
        a aVar = pdfReadActivity.f18782Q;
        int i = this.f1290e;
        if (i == 0) {
            R2.a.H(obj);
            arrayList.clear();
            aVar.n(R.layout.empty_pdf_loading);
            G5.d dVar = D.f24486b;
            e eVar = new e(pdfReadActivity, this.f1292g, null);
            this.f1290e = 1;
            Object objR = AbstractC3046w.r(dVar, this, eVar);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objR == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        aVar.n(R.layout.empty_pdf_view);
        aVar.o(arrayList);
        return C0412i.f5929a;
    }
}
