package com.survicate.surveys.entities.survey.audience.attributes;

import br.l;
import dq.a;
import dq.e;
import h0.b;
import iq.f;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterNumberAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "", "name", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;", "operator", "", "", "values", "<init>", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;Ljava/util/List;)V", "Liq/f;", "timestampProvider", "Ldq/a;", "toDomainModel", "(Liq/f;)Ldq/a;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterNumberAttribute;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterNumberAttributeOperator;", "getOperator", "Ljava/util/List;", "getValues", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "type", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudienceUserFilterNumberAttribute extends NetworkAudienceUserFilterAttribute {
    private final String name;
    private final AudienceUserFilterNumberAttributeOperator operator;
    private final AudienceUserFilterAttributeType type;
    private final List<Double> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkAudienceUserFilterNumberAttribute(@o(name = "name") String str, @o(name = "operator") AudienceUserFilterNumberAttributeOperator audienceUserFilterNumberAttributeOperator, @o(name = "values") List<Double> list) {
        super(null);
        l.e(str, "name");
        l.e(audienceUserFilterNumberAttributeOperator, "operator");
        l.e(list, "values");
        this.name = str;
        this.operator = audienceUserFilterNumberAttributeOperator;
        this.values = list;
        this.type = AudienceUserFilterAttributeType.NUMBER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkAudienceUserFilterNumberAttribute copy$default(NetworkAudienceUserFilterNumberAttribute networkAudienceUserFilterNumberAttribute, String str, AudienceUserFilterNumberAttributeOperator audienceUserFilterNumberAttributeOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = networkAudienceUserFilterNumberAttribute.name;
        }
        if ((i10 & 2) != 0) {
            audienceUserFilterNumberAttributeOperator = networkAudienceUserFilterNumberAttribute.operator;
        }
        if ((i10 & 4) != 0) {
            list = networkAudienceUserFilterNumberAttribute.values;
        }
        return networkAudienceUserFilterNumberAttribute.copy(str, audienceUserFilterNumberAttributeOperator, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceUserFilterNumberAttributeOperator getOperator() {
        return this.operator;
    }

    public final List<Double> component3() {
        return this.values;
    }

    public final NetworkAudienceUserFilterNumberAttribute copy(@o(name = "name") String name, @o(name = "operator") AudienceUserFilterNumberAttributeOperator operator, @o(name = "values") List<Double> values) {
        l.e(name, "name");
        l.e(operator, "operator");
        l.e(values, "values");
        return new NetworkAudienceUserFilterNumberAttribute(name, operator, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudienceUserFilterNumberAttribute)) {
            return false;
        }
        NetworkAudienceUserFilterNumberAttribute networkAudienceUserFilterNumberAttribute = (NetworkAudienceUserFilterNumberAttribute) other;
        return l.a(this.name, networkAudienceUserFilterNumberAttribute.name) && this.operator == networkAudienceUserFilterNumberAttribute.operator && l.a(this.values, networkAudienceUserFilterNumberAttribute.values);
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
    public List<Double> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + ((this.operator.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public a toDomainModel(f timestampProvider) {
        l.e(timestampProvider, "timestampProvider");
        return new e(getName(), getOperator(), getValues());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkAudienceUserFilterNumberAttribute(name=");
        sb2.append(this.name);
        sb2.append(", operator=");
        sb2.append(this.operator);
        sb2.append(", values=");
        return b.t(sb2, this.values, ')');
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public AudienceUserFilterNumberAttributeOperator getOperator() {
        return this.operator;
    }
}
