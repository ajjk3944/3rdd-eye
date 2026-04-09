package com.survicate.surveys.entities.survey.audience;

import br.l;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;", "", "id", "", "relation", "Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;", "filters", "", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "visitorType", "Lcom/survicate/surveys/entities/survey/audience/AudienceVisitorType;", "hasBackendFilters", "", "(JLcom/survicate/surveys/entities/survey/audience/AudienceRelation;Ljava/util/List;Lcom/survicate/surveys/entities/survey/audience/AudienceVisitorType;Ljava/lang/Boolean;)V", "getFilters", "()Ljava/util/List;", "getHasBackendFilters", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "getRelation", "()Lcom/survicate/surveys/entities/survey/audience/AudienceRelation;", "getVisitorType", "()Lcom/survicate/surveys/entities/survey/audience/AudienceVisitorType;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLcom/survicate/surveys/entities/survey/audience/AudienceRelation;Ljava/util/List;Lcom/survicate/surveys/entities/survey/audience/AudienceVisitorType;Ljava/lang/Boolean;)Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;", "equals", "other", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudience {
    private final List<NetworkAudienceFilter> filters;
    private final Boolean hasBackendFilters;
    private final long id;
    private final AudienceRelation relation;
    private final AudienceVisitorType visitorType;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkAudience(@o(name = "id") long j, @o(name = "filters_relation") AudienceRelation audienceRelation, @o(name = "filters") List<? extends NetworkAudienceFilter> list, @o(name = "visitor_type") AudienceVisitorType audienceVisitorType, @o(name = "has_backend_filters") Boolean bool) {
        l.e(audienceRelation, "relation");
        l.e(list, "filters");
        this.id = j;
        this.relation = audienceRelation;
        this.filters = list;
        this.visitorType = audienceVisitorType;
        this.hasBackendFilters = bool;
    }

    public static /* synthetic */ NetworkAudience copy$default(NetworkAudience networkAudience, long j, AudienceRelation audienceRelation, List list, AudienceVisitorType audienceVisitorType, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = networkAudience.id;
        }
        long j7 = j;
        if ((i10 & 2) != 0) {
            audienceRelation = networkAudience.relation;
        }
        AudienceRelation audienceRelation2 = audienceRelation;
        if ((i10 & 4) != 0) {
            list = networkAudience.filters;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            audienceVisitorType = networkAudience.visitorType;
        }
        AudienceVisitorType audienceVisitorType2 = audienceVisitorType;
        if ((i10 & 16) != 0) {
            bool = networkAudience.hasBackendFilters;
        }
        return networkAudience.copy(j7, audienceRelation2, list2, audienceVisitorType2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceRelation getRelation() {
        return this.relation;
    }

    public final List<NetworkAudienceFilter> component3() {
        return this.filters;
    }

    /* renamed from: component4, reason: from getter */
    public final AudienceVisitorType getVisitorType() {
        return this.visitorType;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasBackendFilters() {
        return this.hasBackendFilters;
    }

    public final NetworkAudience copy(@o(name = "id") long id2, @o(name = "filters_relation") AudienceRelation relation, @o(name = "filters") List<? extends NetworkAudienceFilter> filters, @o(name = "visitor_type") AudienceVisitorType visitorType, @o(name = "has_backend_filters") Boolean hasBackendFilters) {
        l.e(relation, "relation");
        l.e(filters, "filters");
        return new NetworkAudience(id2, relation, filters, visitorType, hasBackendFilters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudience)) {
            return false;
        }
        NetworkAudience networkAudience = (NetworkAudience) other;
        return this.id == networkAudience.id && this.relation == networkAudience.relation && l.a(this.filters, networkAudience.filters) && this.visitorType == networkAudience.visitorType && l.a(this.hasBackendFilters, networkAudience.hasBackendFilters);
    }

    public final List<NetworkAudienceFilter> getFilters() {
        return this.filters;
    }

    public final Boolean getHasBackendFilters() {
        return this.hasBackendFilters;
    }

    public final long getId() {
        return this.id;
    }

    public final AudienceRelation getRelation() {
        return this.relation;
    }

    public final AudienceVisitorType getVisitorType() {
        return this.visitorType;
    }

    public int hashCode() {
        int iC = b.c((this.relation.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.filters);
        AudienceVisitorType audienceVisitorType = this.visitorType;
        int iHashCode = (iC + (audienceVisitorType == null ? 0 : audienceVisitorType.hashCode())) * 31;
        Boolean bool = this.hasBackendFilters;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "NetworkAudience(id=" + this.id + ", relation=" + this.relation + ", filters=" + this.filters + ", visitorType=" + this.visitorType + ", hasBackendFilters=" + this.hasBackendFilters + ')';
    }
}
