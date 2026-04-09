package eq;

import br.l;
import com.survicate.surveys.entities.survey.audience.AudienceRelation;
import com.survicate.surveys.entities.survey.audience.AudienceVisitorType;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AudienceRelation f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8250b;

    /* renamed from: c, reason: collision with root package name */
    public final AudienceVisitorType f8251c;

    public b(long j, AudienceRelation audienceRelation, ArrayList arrayList, AudienceVisitorType audienceVisitorType) {
        l.e(audienceRelation, "relation");
        this.f8249a = audienceRelation;
        this.f8250b = arrayList;
        this.f8251c = audienceVisitorType;
    }
}
