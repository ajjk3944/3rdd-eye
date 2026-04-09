package com.survicate.surveys.entities.survey.audience;

import br.l;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceUserFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "exclude", "", "type", "Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "values", "", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "relation", "Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;", "(ZLcom/survicate/surveys/entities/survey/audience/AudienceFilterType;Ljava/util/List;Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;)V", "getExclude", "()Z", "getRelation", "()Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudienceUserFilter extends NetworkAudienceFilter {
    private final boolean exclude;
    private final AudienceRelation relation;
    private final AudienceFilterType type;
    private final List<NetworkAudienceUserFilterAttribute> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkAudienceUserFilter(@o(name = "exclude") boolean z10, @o(name = "type") AudienceFilterType audienceFilterType, @o(name = "attributes") List<? extends NetworkAudienceUserFilterAttribute> list, @o(name = "relation") AudienceRelation audienceRelation) {
        super(null);
        l.e(audienceFilterType, "type");
        l.e(list, "values");
        l.e(audienceRelation, "relation");
        this.exclude = z10;
        this.type = audienceFilterType;
        this.values = list;
        this.relation = audienceRelation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkAudienceUserFilter copy$default(NetworkAudienceUserFilter networkAudienceUserFilter, boolean z10, AudienceFilterType audienceFilterType, List list, AudienceRelation audienceRelation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkAudienceUserFilter.exclude;
        }
        if ((i10 & 2) != 0) {
            audienceFilterType = networkAudienceUserFilter.type;
        }
        if ((i10 & 4) != 0) {
            list = networkAudienceUserFilter.values;
        }
        if ((i10 & 8) != 0) {
            audienceRelation = networkAudienceUserFilter.relation;
        }
        return networkAudienceUserFilter.copy(z10, audienceFilterType, list, audienceRelation);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExclude() {
        return this.exclude;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceFilterType getType() {
        return this.type;
    }

    public final List<NetworkAudienceUserFilterAttribute> component3() {
        return this.values;
    }

    /* renamed from: component4, reason: from getter */
    public final AudienceRelation getRelation() {
        return this.relation;
    }

    public final NetworkAudienceUserFilter copy(@o(name = "exclude") boolean exclude, @o(name = "type") AudienceFilterType type, @o(name = "attributes") List<? extends NetworkAudienceUserFilterAttribute> values, @o(name = "relation") AudienceRelation relation) {
        l.e(type, "type");
        l.e(values, "values");
        l.e(relation, "relation");
        return new NetworkAudienceUserFilter(exclude, type, values, relation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudienceUserFilter)) {
            return false;
        }
        NetworkAudienceUserFilter networkAudienceUserFilter = (NetworkAudienceUserFilter) other;
        return this.exclude == networkAudienceUserFilter.exclude && this.type == networkAudienceUserFilter.type && l.a(this.values, networkAudienceUserFilter.values) && this.relation == networkAudienceUserFilter.relation;
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public boolean getExclude() {
        return this.exclude;
    }

    public final AudienceRelation getRelation() {
        return this.relation;
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public AudienceFilterType getType() {
        return this.type;
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public List<NetworkAudienceUserFilterAttribute> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z10 = this.exclude;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.relation.hashCode() + b.c((this.type.hashCode() + (r02 * 31)) * 31, 31, this.values);
    }

    public String toString() {
        return "NetworkAudienceUserFilter(exclude=" + this.exclude + ", type=" + this.type + ", values=" + this.values + ", relation=" + this.relation + ')';
    }
}
