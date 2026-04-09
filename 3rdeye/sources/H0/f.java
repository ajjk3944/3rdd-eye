package H0;

import H6.C0675l;
import K6.K;
import O6.p;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import s6.i;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class f implements i.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1982b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1983c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1984d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1985e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1986f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1987g;

    public f(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, WebView webView, RecyclerView recyclerView) {
        this.f1983c = imageView;
        this.f1984d = imageView2;
        this.f1985e = constraintLayout2;
        this.f1986f = webView;
        this.f1987g = recyclerView;
    }

    @Override // s6.i.a
    public void b(Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        p pVar = (p) this.f1986f;
        E6.a aVar = (E6.a) this.f1984d;
        if (aVar != null) {
            aVar.l(str);
            String strJ = aVar.j();
            String str2 = (String) this.f1983c;
            if (str2 != null) {
                ((C0675l) this.f1987g).G(str2, strJ);
            }
            pVar.setText(aVar.j());
            return;
        }
        D6.c cVar = (D6.c) this.f1985e;
        if (cVar != null) {
            if (!cVar.a(str)) {
                return;
            }
            cVar.f1067b = str;
            cVar.f1068c = str.length();
        }
        pVar.setText(str);
    }

    @Override // s6.i.a
    public void c(i.b bVar) {
        K k10 = new K(1, this, bVar);
        p pVar = (p) this.f1986f;
        pVar.getClass();
        if (pVar.f10441q == null) {
            O6.o oVar = new O6.o(pVar);
            pVar.addTextChangedListener(oVar);
            pVar.f10441q = oVar;
        }
        pVar.f10440p.add(k10);
    }

    public String toString() {
        switch (this.f1982b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1983c) + ", mProviderPackage: " + ((String) this.f1984d) + ", mQuery: " + ((String) this.f1985e) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f1987g;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i10 = 0; i10 < list2.size(); i10++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public f(String str, String str2, String str3, List list) {
        str.getClass();
        this.f1983c = str;
        str2.getClass();
        this.f1984d = str2;
        this.f1985e = str3;
        list.getClass();
        this.f1987g = list;
        this.f1986f = str + "-" + str2 + "-" + str3;
    }

    public f(E6.a aVar, D6.c cVar, p pVar, String str, C0675l c0675l) {
        this.f1984d = aVar;
        this.f1985e = cVar;
        this.f1986f = pVar;
        this.f1983c = str;
        this.f1987g = c0675l;
    }
}
