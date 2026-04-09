package com.survicate.surveys.entities.survey.audience;

import br.l;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceKnownUserFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "exclude", "", "type", "Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "values", "", "(ZLcom/survicate/surveys/entities/survey/audience/AudienceFilterType;Ljava/util/List;)V", "getExclude", "()Z", "getType", "()Lcom/survicate/surveys/entities/survey/audience/AudienceFilterType;", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudienceKnownUserFilter extends NetworkAudienceFilter {
    private final boolean exclude;
    private final AudienceFilterType type;
    private final List<Boolean> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkAudienceKnownUserFilter(@o(name = "exclude") boolean z10, @o(name = "type") AudienceFilterType audienceFilterType, @o(name = "values") List<Boolean> list) {
        super(null);
        l.e(audienceFilterType, "type");
        l.e(list, "values");
        this.exclude = z10;
        this.type = audienceFilterType;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkAudienceKnownUserFilter copy$default(NetworkAudienceKnownUserFilter networkAudienceKnownUserFilter, boolean z10, AudienceFilterType audienceFilterType, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkAudienceKnownUserFilter.exclude;
        }
        if ((i10 & 2) != 0) {
            audienceFilterType = networkAudienceKnownUserFilter.type;
        }
        if ((i10 & 4) != 0) {
            list = networkAudienceKnownUserFilter.values;
        }
        return networkAudienceKnownUserFilter.copy(z10, audienceFilterType, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExclude() {
        return this.exclude;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceFilterType getType() {
        return this.type;
    }

    public final List<Boolean> component3() {
        return this.values;
    }

    public final NetworkAudienceKnownUserFilter copy(@o(name = "exclude") boolean exclude, @o(name = "type") AudienceFilterType type, @o(name = "values") List<Boolean> values) {
        l.e(type, "type");
        l.e(values, "values");
        return new NetworkAudienceKnownUserFilter(exclude, type, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudienceKnownUserFilter)) {
            return false;
        }
        NetworkAudienceKnownUserFilter networkAudienceKnownUserFilter = (NetworkAudienceKnownUserFilter) other;
        return this.exclude == networkAudienceKnownUserFilter.exclude && this.type == networkAudienceKnownUserFilter.type && l.a(this.values, networkAudienceKnownUserFilter.values);
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public boolean getExclude() {
        return this.exclude;
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public AudienceFilterType getType() {
        return this.type;
    }

    @Override // com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter
    public List<Boolean> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z10 = this.exclude;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.values.hashCode() + ((this.type.hashCode() + (r02 * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkAudienceKnownUserFilter(exclude=");
        sb2.append(this.exclude);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", values=");
        return b.t(sb2, this.values, ')');
    }
}
