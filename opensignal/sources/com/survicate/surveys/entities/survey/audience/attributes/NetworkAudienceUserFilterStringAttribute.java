package com.survicate.surveys.entities.survey.audience.attributes;

import br.l;
import dq.a;
import dq.e;
import h0.b;
import iq.f;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterStringAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "", "name", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;", "operator", "", "values", "<init>", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;Ljava/util/List;)V", "Liq/f;", "timestampProvider", "Ldq/a;", "toDomainModel", "(Liq/f;)Ldq/a;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterStringAttribute;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterStringAttributeOperator;", "getOperator", "Ljava/util/List;", "getValues", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "type", "Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "getType", "()Lcom/survicate/surveys/entities/survey/audience/attributes/AudienceUserFilterAttributeType;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkAudienceUserFilterStringAttribute extends NetworkAudienceUserFilterAttribute {
    private final String name;
    private final AudienceUserFilterStringAttributeOperator operator;
    private final AudienceUserFilterAttributeType type;
    private final List<String> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkAudienceUserFilterStringAttribute(@o(name = "name") String str, @o(name = "operator") AudienceUserFilterStringAttributeOperator audienceUserFilterStringAttributeOperator, @o(name = "values") List<String> list) {
        super(null);
        l.e(str, "name");
        l.e(audienceUserFilterStringAttributeOperator, "operator");
        l.e(list, "values");
        this.name = str;
        this.operator = audienceUserFilterStringAttributeOperator;
        this.values = list;
        this.type = AudienceUserFilterAttributeType.STRING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkAudienceUserFilterStringAttribute copy$default(NetworkAudienceUserFilterStringAttribute networkAudienceUserFilterStringAttribute, String str, AudienceUserFilterStringAttributeOperator audienceUserFilterStringAttributeOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = networkAudienceUserFilterStringAttribute.name;
        }
        if ((i10 & 2) != 0) {
            audienceUserFilterStringAttributeOperator = networkAudienceUserFilterStringAttribute.operator;
        }
        if ((i10 & 4) != 0) {
            list = networkAudienceUserFilterStringAttribute.values;
        }
        return networkAudienceUserFilterStringAttribute.copy(str, audienceUserFilterStringAttributeOperator, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final AudienceUserFilterStringAttributeOperator getOperator() {
        return this.operator;
    }

    public final List<String> component3() {
        return this.values;
    }

    public final NetworkAudienceUserFilterStringAttribute copy(@o(name = "name") String name, @o(name = "operator") AudienceUserFilterStringAttributeOperator operator, @o(name = "values") List<String> values) {
        l.e(name, "name");
        l.e(operator, "operator");
        l.e(values, "values");
        return new NetworkAudienceUserFilterStringAttribute(name, operator, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkAudienceUserFilterStringAttribute)) {
            return false;
        }
        NetworkAudienceUserFilterStringAttribute networkAudienceUserFilterStringAttribute = (NetworkAudienceUserFilterStringAttribute) other;
        return l.a(this.name, networkAudienceUserFilterStringAttribute.name) && this.operator == networkAudienceUserFilterStringAttribute.operator && l.a(this.values, networkAudienceUserFilterStringAttribute.values);
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
    public List<String> getValues() {
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
        StringBuilder sb2 = new StringBuilder("NetworkAudienceUserFilterStringAttribute(name=");
        sb2.append(this.name);
        sb2.append(", operator=");
        sb2.append(this.operator);
        sb2.append(", values=");
        return b.t(sb2, this.values, ')');
    }

    @Override // com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute
    public AudienceUserFilterStringAttributeOperator getOperator() {
        return this.operator;
    }
}
