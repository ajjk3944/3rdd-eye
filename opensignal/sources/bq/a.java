package bq;

import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2857b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2858c;

    public a(DisclaimerSettings disclaimerSettings) {
        String title = disclaimerSettings != null ? disclaimerSettings.getTitle() : null;
        title = title == null ? "" : title;
        String description = disclaimerSettings != null ? disclaimerSettings.getDescription() : null;
        description = description == null ? "" : description;
        String checkboxLabel = disclaimerSettings != null ? disclaimerSettings.getCheckboxLabel() : null;
        String str = checkboxLabel != null ? checkboxLabel : "";
        this.f2856a = title;
        this.f2857b = description;
        this.f2858c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f2856a, aVar.f2856a) && br.l.a(this.f2857b, aVar.f2857b) && br.l.a(this.f2858c, aVar.f2858c);
    }

    public final int hashCode() {
        return this.f2858c.hashCode() + c7.a.g(this.f2857b, this.f2856a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(title=");
        sb2.append(this.f2856a);
        sb2.append(", description=");
        sb2.append(this.f2857b);
        sb2.append(", checkboxLabel=");
        return h0.b.r(sb2, this.f2858c, ')');
    }
}
