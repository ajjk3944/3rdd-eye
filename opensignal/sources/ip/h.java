package ip;

import android.view.View;
import br.l;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixColumnItem;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final View f12910a;

    /* renamed from: b, reason: collision with root package name */
    public final MicroSurveyPointMatrixColumnItem f12911b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12912c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12913d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12914e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12915f;

    public h(View view, MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItem, boolean z10, boolean z11, String str, String str2) {
        l.e(microSurveyPointMatrixColumnItem, "columnItem");
        l.e(str, "commentLabel");
        l.e(str2, "commentHint");
        this.f12910a = view;
        this.f12911b = microSurveyPointMatrixColumnItem;
        this.f12912c = z10;
        this.f12913d = z11;
        this.f12914e = str;
        this.f12915f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f12910a, hVar.f12910a) && l.a(this.f12911b, hVar.f12911b) && this.f12912c == hVar.f12912c && this.f12913d == hVar.f12913d && l.a(this.f12914e, hVar.f12914e) && l.a(this.f12915f, hVar.f12915f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f12911b.hashCode() + (this.f12910a.hashCode() * 31)) * 31;
        boolean z10 = this.f12912c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f12913d;
        return this.f12915f.hashCode() + c7.a.g(this.f12914e, (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnBindingData(columnView=");
        sb2.append(this.f12910a);
        sb2.append(", columnItem=");
        sb2.append(this.f12911b);
        sb2.append(", isSelected=");
        sb2.append(this.f12912c);
        sb2.append(", isCommentAvailable=");
        sb2.append(this.f12913d);
        sb2.append(", commentLabel=");
        sb2.append(this.f12914e);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f12915f, ')');
    }
}
