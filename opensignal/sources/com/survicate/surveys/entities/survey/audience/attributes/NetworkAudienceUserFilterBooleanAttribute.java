package com.survicate.surveys.entities.survey.audience.attributes;

import br.l;
import dq.a;
import dq.c;
import h0.b;
import iq.f;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0015R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterBooleanAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "", "name", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;", "operator", "", "", "values", "<init>", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;Ljava/util/List;)V", "Liq/f;", "timestampProvider", "Ldq/a;", "toDomainModel", "(Liq/f;)Ldq/a;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterBooleanAttribute;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterBooleanAttributeOperator;", "getOperator", "Ljava/util/List;", "getValues", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "type", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudienceUserFilterBooleanAttribute extends NetworkAudienceUserFilterAttribute {
    private final String name;
    private final AudienceUserFilterBooleanAttributeOperator operator;
    private final AudienceUserFilterAttributeType type;
    private final List<Boolean> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkAudienceUserFilterBooleanAttribute(@o(name = "name") String str, @o(name = "operator") AudienceUserFilterBooleanAttributeOperator audienceUserFilterBooleanAttributeOperator, @o(name = "values") List<Boolean> list) {
        super(null);
        l.e(str, "name");
        l.e(audienceUserFilterBooleanAttributeOperator, "operator");
        l.e(list, "values");
        this.name = str;
        this.operator = audienceUserFilterBooleanAttributeOperator;
        this.values = list;
        this.type = AudienceUserFilterAttributeType.BOOLEAN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkAudienceUserFilterBooleanAttribute copy$default(NetworkAudienceUserFilterBooleanAttribute networkAudienceUserFilterBooleanAttribute, String str, AudienceUserFilterBooleanAttributeOperator audienceUserFilterBooleanAttributeOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = networkAudienceUserFilterBooleanAttribute.name;
        }
        if ((i10 & 2) != 0) {
            audienceUserFilterBooleanAttributeOperator = networkAudienceUserFilterBooleanAttribute.operator;
        }
        if ((i10 & 4) != 0) {
            list = networkAudienceUserFilterBooleanAttribute.values;
        }
        return networkAudienceUserFilterBooleanAttribute.copy(str, audienceUserFilterBooleanAttributeOperator, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceUserFilterBooleanAttributeOperator getOperator() {
        return this.operator;
    }

    public final List<Boolean> component3() {
        return this.values;
    }

    public final NetworkAudienceUserFilterBooleanAttribute copy(@o(name = "name") String name, @o(name = "operator") AudienceUserFilterBooleanAttributeOperator operator, @o(name = "values") List<Boolean> values) {
        l.e(name, "name");
        l.e(operator, "operator");
        l.e(values, "values");
        return new NetworkAudienceUserFilterBooleanAttribute(name, operator, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudienceUserFilterBooleanAttribute)) {
            return false;
        }
        NetworkAudienceUserFilterBooleanAttribute networkAudienceUserFilterBooleanAttribute = (NetworkAudienceUserFilterBooleanAttribute) other;
        return l.a(this.name, networkAudienceUserFilterBooleanAttribute.name) && this.operator == networkAudienceUserFilterBooleanAttribute.operator && l.a(this.values, networkAudienceUserFilterBooleanAttribute.values);
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public String getName() {
        return this.name;
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public AudienceUserFilterAttributeType getType() {
        return this.type;
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public List<Boolean> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + ((this.operator.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public a toDomainModel(f timestampProvider) {
        l.e(timestampProvider, "timestampProvider");
        return new c(getName(), getOperator());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkAudienceUserFilterBooleanAttribute(name=");
        sb2.append(this.name);
        sb2.append(", operator=");
        sb2.append(this.operator);
        sb2.append(", values=");
        return b.t(sb2, this.values, ')');
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public AudienceUserFilterBooleanAttributeOperator getOperator() {
        return this.operator;
    }
}
