package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyLogicMatrixCondition;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0012¨\u0006."}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/MatrixDisplayLogicGroup;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "condition", "", "", "value", "answerId", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "answerIdOperator", "<init>", "(Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;Ljava/util/List;Ljava/util/List;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;)V", "component1", "()Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "copy", "(Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;Ljava/util/List;Ljava/util/List;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/MatrixDisplayLogicGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixCondition;", "getCondition", "Ljava/util/List;", "getValue", "getAnswerId", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getAnswerIdOperator", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MatrixDisplayLogicGroup implements Parcelable {
    public static final Parcelable.Creator<MatrixDisplayLogicGroup> CREATOR = new Creator();
    private final List<Long> answerId;
    private final SurveyLogicOperator answerIdOperator;
    private final SurveyLogicMatrixCondition condition;
    private final List<Long> value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MatrixDisplayLogicGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatrixDisplayLogicGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            SurveyLogicMatrixCondition surveyLogicMatrixConditionValueOf = SurveyLogicMatrixCondition.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            return new MatrixDisplayLogicGroup(surveyLogicMatrixConditionValueOf, arrayList, arrayList2, SurveyLogicOperator.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatrixDisplayLogicGroup[] newArray(int i10) {
            return new MatrixDisplayLogicGroup[i10];
        }
    }

    public MatrixDisplayLogicGroup(@o(name = "condition") SurveyLogicMatrixCondition surveyLogicMatrixCondition, @o(name = "value") List<Long> list, @o(name = "answer_id") List<Long> list2, @o(name = "answer_id_operator") SurveyLogicOperator surveyLogicOperator) {
        l.e(surveyLogicMatrixCondition, "condition");
        l.e(list, "value");
        l.e(list2, "answerId");
        l.e(surveyLogicOperator, "answerIdOperator");
        this.condition = surveyLogicMatrixCondition;
        this.value = list;
        this.answerId = list2;
        this.answerIdOperator = surveyLogicOperator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatrixDisplayLogicGroup copy$default(MatrixDisplayLogicGroup matrixDisplayLogicGroup, SurveyLogicMatrixCondition surveyLogicMatrixCondition, List list, List list2, SurveyLogicOperator surveyLogicOperator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyLogicMatrixCondition = matrixDisplayLogicGroup.condition;
        }
        if ((i10 & 2) != 0) {
            list = matrixDisplayLogicGroup.value;
        }
        if ((i10 & 4) != 0) {
            list2 = matrixDisplayLogicGroup.answerId;
        }
        if ((i10 & 8) != 0) {
            surveyLogicOperator = matrixDisplayLogicGroup.answerIdOperator;
        }
        return matrixDisplayLogicGroup.copy(surveyLogicMatrixCondition, list, list2, surveyLogicOperator);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyLogicMatrixCondition getCondition() {
        return this.condition;
    }

    public final List<Long> component2() {
        return this.value;
    }

    public final List<Long> component3() {
        return this.answerId;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveyLogicOperator getAnswerIdOperator() {
        return this.answerIdOperator;
    }

    public final MatrixDisplayLogicGroup copy(@o(name = "condition") SurveyLogicMatrixCondition condition, @o(name = "value") List<Long> value, @o(name = "answer_id") List<Long> answerId, @o(name = "answer_id_operator") SurveyLogicOperator answerIdOperator) {
        l.e(condition, "condition");
        l.e(value, "value");
        l.e(answerId, "answerId");
        l.e(answerIdOperator, "answerIdOperator");
        return new MatrixDisplayLogicGroup(condition, value, answerId, answerIdOperator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatrixDisplayLogicGroup)) {
            return false;
        }
        MatrixDisplayLogicGroup matrixDisplayLogicGroup = (MatrixDisplayLogicGroup) other;
        return this.condition == matrixDisplayLogicGroup.condition && l.a(this.value, matrixDisplayLogicGroup.value) && l.a(this.answerId, matrixDisplayLogicGroup.answerId) && this.answerIdOperator == matrixDisplayLogicGroup.answerIdOperator;
    }

    public final List<Long> getAnswerId() {
        return this.answerId;
    }

    public final SurveyLogicOperator getAnswerIdOperator() {
        return this.answerIdOperator;
    }

    public final SurveyLogicMatrixCondition getCondition() {
        return this.condition;
    }

    public final List<Long> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.answerIdOperator.hashCode() + b.c(b.c(this.condition.hashCode() * 31, 31, this.value), 31, this.answerId);
    }

    public String toString() {
        return "MatrixDisplayLogicGroup(condition=" + this.condition + ", value=" + this.value + ", answerId=" + this.answerId + ", answerIdOperator=" + this.answerIdOperator + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.condition.name());
        Iterator itV = a.v(this.value, parcel);
        while (itV.hasNext()) {
            parcel.writeLong(((Number) itV.next()).longValue());
        }
        Iterator itV2 = a.v(this.answerId, parcel);
        while (itV2.hasNext()) {
            parcel.writeLong(((Number) itV2.next()).longValue());
        }
        parcel.writeString(this.answerIdOperator.name());
    }
}
