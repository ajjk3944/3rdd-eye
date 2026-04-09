package com.survicate.surveys.entities.survey.surveyLogic.form;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import br.g;
import br.l;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import h0.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010 ¨\u00067"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup;", "Landroid/os/Parcelable;", "", "orderNumber", "", "uid", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "condition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "fieldOperator", "", "fields", "<init>", "(IJLcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()J", "component3", "()Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component5", "()Ljava/util/List;", "copy", "(IJLcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOrderNumber", "J", "getUid", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormCondition;", "getCondition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getFieldOperator", "Ljava/util/List;", "getFields", "CREATOR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyLogicFormGroup implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SurveyLogicFormCondition condition;
    private final SurveyLogicOperator fieldOperator;
    private final List<Long> fields;
    private final int orderNumber;
    private final long uid;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormGroup$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SurveyLogicFormGroup> {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyLogicFormGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyLogicFormGroup(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyLogicFormGroup[] newArray(int size) {
            return new SurveyLogicFormGroup[size];
        }
    }

    public SurveyLogicFormGroup(@o(name = "order_number") int i10, @o(name = "uid") long j, @o(name = "condition") SurveyLogicFormCondition surveyLogicFormCondition, @o(name = "field_id_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "field_id") List<Long> list) {
        l.e(list, "fields");
        this.orderNumber = i10;
        this.uid = j;
        this.condition = surveyLogicFormCondition;
        this.fieldOperator = surveyLogicOperator;
        this.fields = list;
    }

    public static /* synthetic */ SurveyLogicFormGroup copy$default(SurveyLogicFormGroup surveyLogicFormGroup, int i10, long j, SurveyLogicFormCondition surveyLogicFormCondition, SurveyLogicOperator surveyLogicOperator, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = surveyLogicFormGroup.orderNumber;
        }
        if ((i11 & 2) != 0) {
            j = surveyLogicFormGroup.uid;
        }
        if ((i11 & 4) != 0) {
            surveyLogicFormCondition = surveyLogicFormGroup.condition;
        }
        if ((i11 & 8) != 0) {
            surveyLogicOperator = surveyLogicFormGroup.fieldOperator;
        }
        if ((i11 & 16) != 0) {
            list = surveyLogicFormGroup.fields;
        }
        List list2 = list;
        SurveyLogicFormCondition surveyLogicFormCondition2 = surveyLogicFormCondition;
        return surveyLogicFormGroup.copy(i10, j, surveyLogicFormCondition2, surveyLogicOperator, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final SurveyLogicFormCondition getCondition() {
        return this.condition;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveyLogicOperator getFieldOperator() {
        return this.fieldOperator;
    }

    public final List<Long> component5() {
        return this.fields;
    }

    public final SurveyLogicFormGroup copy(@o(name = "order_number") int orderNumber, @o(name = "uid") long uid, @o(name = "condition") SurveyLogicFormCondition condition, @o(name = "field_id_operator") SurveyLogicOperator fieldOperator, @o(name = "field_id") List<Long> fields) {
        l.e(fields, "fields");
        return new SurveyLogicFormGroup(orderNumber, uid, condition, fieldOperator, fields);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyLogicFormGroup)) {
            return false;
        }
        SurveyLogicFormGroup surveyLogicFormGroup = (SurveyLogicFormGroup) other;
        return this.orderNumber == surveyLogicFormGroup.orderNumber && this.uid == surveyLogicFormGroup.uid && this.condition == surveyLogicFormGroup.condition && this.fieldOperator == surveyLogicFormGroup.fieldOperator && l.a(this.fields, surveyLogicFormGroup.fields);
    }

    public final SurveyLogicFormCondition getCondition() {
        return this.condition;
    }

    public final SurveyLogicOperator getFieldOperator() {
        return this.fieldOperator;
    }

    public final List<Long> getFields() {
        return this.fields;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iB = b.b(Integer.hashCode(this.orderNumber) * 31, 31, this.uid);
        SurveyLogicFormCondition surveyLogicFormCondition = this.condition;
        int iHashCode = (iB + (surveyLogicFormCondition == null ? 0 : surveyLogicFormCondition.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.fieldOperator;
        return this.fields.hashCode() + ((iHashCode + (surveyLogicOperator != null ? surveyLogicOperator.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyLogicFormGroup(orderNumber=");
        sb2.append(this.orderNumber);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", fieldOperator=");
        sb2.append(this.fieldOperator);
        sb2.append(", fields=");
        return b.t(sb2, this.fields, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        l.e(dest, "dest");
        dest.writeInt(this.orderNumber);
        dest.writeLong(this.uid);
        dest.writeSerializable(this.condition);
        dest.writeSerializable(this.fieldOperator);
        dest.writeList(this.fields);
    }

    public SurveyLogicFormGroup(Parcel parcel) {
        Object obj;
        Object obj2;
        l.e(parcel, "parcel");
        int i10 = parcel.readInt();
        long j = parcel.readLong();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            obj = (Serializable) parcel.readSerializable(SurveyLogicFormCondition.class.getClassLoader(), SurveyLogicFormCondition.class);
        } else {
            Serializable serializable = parcel.readSerializable();
            obj = (SurveyLogicFormCondition) (serializable instanceof SurveyLogicFormCondition ? serializable : null);
        }
        SurveyLogicFormCondition surveyLogicFormCondition = (SurveyLogicFormCondition) obj;
        if (i11 >= 33) {
            obj2 = (Serializable) parcel.readSerializable(SurveyLogicOperator.class.getClassLoader(), SurveyLogicOperator.class);
        } else {
            Serializable serializable2 = parcel.readSerializable();
            obj2 = (SurveyLogicOperator) (serializable2 instanceof SurveyLogicOperator ? serializable2 : null);
        }
        SurveyLogicOperator surveyLogicOperator = (SurveyLogicOperator) obj2;
        ArrayList arrayList = new ArrayList();
        if (i11 >= 33) {
            parcel.readList(arrayList, Long.class.getClassLoader(), Long.class);
        } else {
            parcel.readList(arrayList, Long.class.getClassLoader());
        }
        this(i10, j, surveyLogicFormCondition, surveyLogicOperator, arrayList);
    }
}
