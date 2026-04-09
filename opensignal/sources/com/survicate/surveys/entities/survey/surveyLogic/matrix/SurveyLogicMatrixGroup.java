package com.survicate.surveys.entities.survey.surveyLogic.matrix;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0010J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b6\u0010\u0016¨\u00067"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixGroup;", "Landroid/os/Parcelable;", "", "orderNumber", "", "uid", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "condition", "", "values", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "answerIdOperator", "answerIds", "<init>", "(IJLcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;Ljava/util/List;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "component1", "()I", "component2", "()J", "component3", "()Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "component4", "()Ljava/util/List;", "component5", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component6", "copy", "(IJLcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;Ljava/util/List;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixGroup;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getOrderNumber", "J", "getUid", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "getCondition", "Ljava/util/List;", "getValues", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getAnswerIdOperator", "getAnswerIds", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyLogicMatrixGroup implements Parcelable {
    public static final Parcelable.Creator<SurveyLogicMatrixGroup> CREATOR = new Creator();
    private final SurveyLogicOperator answerIdOperator;
    private final List<Long> answerIds;
    private final SurveyLogicMatrixCondition condition;
    private final int orderNumber;
    private final long uid;
    private final List<Long> values;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyLogicMatrixGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyLogicMatrixGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            int i10 = parcel.readInt();
            long j = parcel.readLong();
            SurveyLogicMatrixCondition surveyLogicMatrixConditionValueOf = SurveyLogicMatrixCondition.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            return new SurveyLogicMatrixGroup(i10, j, surveyLogicMatrixConditionValueOf, arrayList, surveyLogicOperatorValueOf, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyLogicMatrixGroup[] newArray(int i10) {
            return new SurveyLogicMatrixGroup[i10];
        }
    }

    public SurveyLogicMatrixGroup(@o(name = "order_number") int i10, @o(name = "uid") long j, @o(name = "condition") SurveyLogicMatrixCondition surveyLogicMatrixCondition, @o(name = "value") List<Long> list, @o(name = "answer_id_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "answer_id") List<Long> list2) {
        l.e(surveyLogicMatrixCondition, "condition");
        l.e(list, "values");
        l.e(list2, "answerIds");
        this.orderNumber = i10;
        this.uid = j;
        this.condition = surveyLogicMatrixCondition;
        this.values = list;
        this.answerIdOperator = surveyLogicOperator;
        this.answerIds = list2;
    }

    public static /* synthetic */ SurveyLogicMatrixGroup copy$default(SurveyLogicMatrixGroup surveyLogicMatrixGroup, int i10, long j, SurveyLogicMatrixCondition surveyLogicMatrixCondition, List list, SurveyLogicOperator surveyLogicOperator, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = surveyLogicMatrixGroup.orderNumber;
        }
        if ((i11 & 2) != 0) {
            j = surveyLogicMatrixGroup.uid;
        }
        if ((i11 & 4) != 0) {
            surveyLogicMatrixCondition = surveyLogicMatrixGroup.condition;
        }
        if ((i11 & 8) != 0) {
            list = surveyLogicMatrixGroup.values;
        }
        if ((i11 & 16) != 0) {
            surveyLogicOperator = surveyLogicMatrixGroup.answerIdOperator;
        }
        if ((i11 & 32) != 0) {
            list2 = surveyLogicMatrixGroup.answerIds;
        }
        return surveyLogicMatrixGroup.copy(i10, j, surveyLogicMatrixCondition, list, surveyLogicOperator, list2);
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
    public final SurveyLogicMatrixCondition getCondition() {
        return this.condition;
    }

    public final List<Long> component4() {
        return this.values;
    }

    /* renamed from: component5, reason: from getter */
    public final SurveyLogicOperator getAnswerIdOperator() {
        return this.answerIdOperator;
    }

    public final List<Long> component6() {
        return this.answerIds;
    }

    public final SurveyLogicMatrixGroup copy(@o(name = "order_number") int orderNumber, @o(name = "uid") long uid, @o(name = "condition") SurveyLogicMatrixCondition condition, @o(name = "value") List<Long> values, @o(name = "answer_id_operator") SurveyLogicOperator answerIdOperator, @o(name = "answer_id") List<Long> answerIds) {
        l.e(condition, "condition");
        l.e(values, "values");
        l.e(answerIds, "answerIds");
        return new SurveyLogicMatrixGroup(orderNumber, uid, condition, values, answerIdOperator, answerIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyLogicMatrixGroup)) {
            return false;
        }
        SurveyLogicMatrixGroup surveyLogicMatrixGroup = (SurveyLogicMatrixGroup) other;
        return this.orderNumber == surveyLogicMatrixGroup.orderNumber && this.uid == surveyLogicMatrixGroup.uid && this.condition == surveyLogicMatrixGroup.condition && l.a(this.values, surveyLogicMatrixGroup.values) && this.answerIdOperator == surveyLogicMatrixGroup.answerIdOperator && l.a(this.answerIds, surveyLogicMatrixGroup.answerIds);
    }

    public final SurveyLogicOperator getAnswerIdOperator() {
        return this.answerIdOperator;
    }

    public final List<Long> getAnswerIds() {
        return this.answerIds;
    }

    public final SurveyLogicMatrixCondition getCondition() {
        return this.condition;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final long getUid() {
        return this.uid;
    }

    public final List<Long> getValues() {
        return this.values;
    }

    public int hashCode() {
        int iC = b.c((this.condition.hashCode() + b.b(Integer.hashCode(this.orderNumber) * 31, 31, this.uid)) * 31, 31, this.values);
        SurveyLogicOperator surveyLogicOperator = this.answerIdOperator;
        return this.answerIds.hashCode() + ((iC + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyLogicMatrixGroup(orderNumber=");
        sb2.append(this.orderNumber);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", answerIdOperator=");
        sb2.append(this.answerIdOperator);
        sb2.append(", answerIds=");
        return b.t(sb2, this.answerIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeInt(this.orderNumber);
        parcel.writeLong(this.uid);
        parcel.writeString(this.condition.name());
        Iterator itV = a.v(this.values, parcel);
        while (itV.hasNext()) {
            parcel.writeLong(((Number) itV.next()).longValue());
        }
        SurveyLogicOperator surveyLogicOperator = this.answerIdOperator;
        if (surveyLogicOperator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(surveyLogicOperator.name());
        }
        Iterator itV2 = a.v(this.answerIds, parcel);
        while (itV2.hasNext()) {
            parcel.writeLong(((Number) itV2.next()).longValue());
        }
    }
}
