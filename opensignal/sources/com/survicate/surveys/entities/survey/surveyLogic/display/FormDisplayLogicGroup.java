package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormCondition;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/FormDisplayLogicGroup;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "condition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "fieldIdOperator", "", "", "fieldId", "<init>", "(Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "component1", "()Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "component2", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component3", "()Ljava/util/List;", "copy", "(Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/FormDisplayLogicGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "getCondition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getFieldIdOperator", "Ljava/util/List;", "getFieldId", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FormDisplayLogicGroup implements Parcelable {
    public static final Parcelable.Creator<FormDisplayLogicGroup> CREATOR = new Creator();
    private final SurveyLogicFormCondition condition;
    private final List<Long> fieldId;
    private final SurveyLogicOperator fieldIdOperator;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FormDisplayLogicGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormDisplayLogicGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            SurveyLogicFormCondition surveyLogicFormConditionValueOf = SurveyLogicFormCondition.valueOf(parcel.readString());
            SurveyLogicOperator surveyLogicOperatorValueOf = SurveyLogicOperator.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new FormDisplayLogicGroup(surveyLogicFormConditionValueOf, surveyLogicOperatorValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormDisplayLogicGroup[] newArray(int i10) {
            return new FormDisplayLogicGroup[i10];
        }
    }

    public FormDisplayLogicGroup(@o(name = "condition") SurveyLogicFormCondition surveyLogicFormCondition, @o(name = "field_id_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "field_id") List<Long> list) {
        l.e(surveyLogicFormCondition, "condition");
        l.e(surveyLogicOperator, "fieldIdOperator");
        l.e(list, "fieldId");
        this.condition = surveyLogicFormCondition;
        this.fieldIdOperator = surveyLogicOperator;
        this.fieldId = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormDisplayLogicGroup copy$default(FormDisplayLogicGroup formDisplayLogicGroup, SurveyLogicFormCondition surveyLogicFormCondition, SurveyLogicOperator surveyLogicOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyLogicFormCondition = formDisplayLogicGroup.condition;
        }
        if ((i10 & 2) != 0) {
            surveyLogicOperator = formDisplayLogicGroup.fieldIdOperator;
        }
        if ((i10 & 4) != 0) {
            list = formDisplayLogicGroup.fieldId;
        }
        return formDisplayLogicGroup.copy(surveyLogicFormCondition, surveyLogicOperator, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyLogicFormCondition getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyLogicOperator getFieldIdOperator() {
        return this.fieldIdOperator;
    }

    public final List<Long> component3() {
        return this.fieldId;
    }

    public final FormDisplayLogicGroup copy(@o(name = "condition") SurveyLogicFormCondition condition, @o(name = "field_id_operator") SurveyLogicOperator fieldIdOperator, @o(name = "field_id") List<Long> fieldId) {
        l.e(condition, "condition");
        l.e(fieldIdOperator, "fieldIdOperator");
        l.e(fieldId, "fieldId");
        return new FormDisplayLogicGroup(condition, fieldIdOperator, fieldId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormDisplayLogicGroup)) {
            return false;
        }
        FormDisplayLogicGroup formDisplayLogicGroup = (FormDisplayLogicGroup) other;
        return this.condition == formDisplayLogicGroup.condition && this.fieldIdOperator == formDisplayLogicGroup.fieldIdOperator && l.a(this.fieldId, formDisplayLogicGroup.fieldId);
    }

    public final SurveyLogicFormCondition getCondition() {
        return this.condition;
    }

    public final List<Long> getFieldId() {
        return this.fieldId;
    }

    public final SurveyLogicOperator getFieldIdOperator() {
        return this.fieldIdOperator;
    }

    public int hashCode() {
        return this.fieldId.hashCode() + ((this.fieldIdOperator.hashCode() + (this.condition.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormDisplayLogicGroup(condition=");
        sb2.append(this.condition);
        sb2.append(", fieldIdOperator=");
        sb2.append(this.fieldIdOperator);
        sb2.append(", fieldId=");
        return b.t(sb2, this.fieldId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.condition.name());
        parcel.writeString(this.fieldIdOperator.name());
        Iterator itV = a.v(this.fieldId, parcel);
        while (itV.hasNext()) {
            parcel.writeLong(((Number) itV.next()).longValue());
        }
    }
}
