package on;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f19645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19647c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19648d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19649e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19650f;

    /* renamed from: g, reason: collision with root package name */
    public final y f19651g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19652h;

    public l(String str, String str2, String str3, String str4, long j, String str5, y yVar, String str6) {
        br.l.e(str3, "surveyId");
        br.l.e(str4, "surveyName");
        this.f19645a = str;
        this.f19646b = str2;
        this.f19647c = str3;
        this.f19648d = str4;
        this.f19649e = j;
        this.f19650f = str5;
        this.f19651g = yVar;
        this.f19652h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return br.l.a(this.f19645a, lVar.f19645a) && br.l.a(this.f19646b, lVar.f19646b) && br.l.a(this.f19647c, lVar.f19647c) && br.l.a(this.f19648d, lVar.f19648d) && this.f19649e == lVar.f19649e && br.l.a(this.f19650f, lVar.f19650f) && br.l.a(this.f19651g, lVar.f19651g) && br.l.a(this.f19652h, lVar.f19652h);
    }

    public final int hashCode() {
        return this.f19652h.hashCode() + ((this.f19651g.hashCode() + c7.a.g(this.f19650f, h0.b.b(c7.a.g(this.f19648d, c7.a.g(this.f19647c, c7.a.g(this.f19646b, this.f19645a.hashCode() * 31, 31), 31), 31), 31, this.f19649e), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionAnsweredEvent(responseUuid=");
        sb2.append(this.f19645a);
        sb2.append(", visitorUuid=");
        sb2.append(this.f19646b);
        sb2.append(", surveyId=");
        sb2.append(this.f19647c);
        sb2.append(", surveyName=");
        sb2.append(this.f19648d);
        sb2.append(", questionId=");
        sb2.append(this.f19649e);
        sb2.append(", questionText=");
        sb2.append(this.f19650f);
        sb2.append(", answer=");
        sb2.append(this.f19651g);
        sb2.append(", panelAnswerUrl=");
        return h0.b.r(sb2, this.f19652h, ')');
    }
}
