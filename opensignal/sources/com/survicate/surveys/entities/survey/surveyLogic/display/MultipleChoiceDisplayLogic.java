package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0014¨\u00061"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/MultipleChoiceDisplayLogic;", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "", "pointId", "Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "answerType", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "groupOperator", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/MultipleChoiceDisplayLogicGroup;", "groups", "<init>", "(JLcom/survicate/surveys/entities/survey/SurveyAnswerType;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "component1", "()J", "component2", "()Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "component3", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component4", "()Ljava/util/List;", "copy", "(JLcom/survicate/surveys/entities/survey/SurveyAnswerType;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/MultipleChoiceDisplayLogic;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getPointId", "Lcom/survicate/surveys/entities/survey/SurveyAnswerType;", "getAnswerType", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getGroupOperator", "Ljava/util/List;", "getGroups", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MultipleChoiceDisplayLogic extends DisplayLogic {
    public static final Parcelable.Creator<MultipleChoiceDisplayLogic> CREATOR = new Creator();
    private final SurveyAnswerType answerType;
    private final SurveyLogicOperator groupOperator;
    private final List<MultipleChoiceDisplayLogicGroup> groups;
    private final long pointId;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultipleChoiceDisplayLogic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultipleChoiceDisplayLogic createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            long j = parcel.readLong();
            SurveyAnswerType surveyAnswerTypeValueOf = SurveyAnswerType.valueOf(parcel.readString());
            SurveyLogicOperator surveyLogicOperatorValueOf = SurveyLogicOperator.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(MultipleChoiceDisplayLogicGroup.CREATOR.createFromParcel(parcel));
            }
            return new MultipleChoiceDisplayLogic(j, surveyAnswerTypeValueOf, surveyLogicOperatorValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultipleChoiceDisplayLogic[] newArray(int i10) {
            return new MultipleChoiceDisplayLogic[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleChoiceDisplayLogic(@o(name = "point_id") long j, @o(name = "answer_type") SurveyAnswerType surveyAnswerType, @o(name = "group_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "groups") List<MultipleChoiceDisplayLogicGroup> list) {
        super(null);
        l.e(surveyAnswerType, "answerType");
        l.e(surveyLogicOperator, "groupOperator");
        l.e(list, "groups");
        this.pointId = j;
        this.answerType = surveyAnswerType;
        this.groupOperator = surveyLogicOperator;
        this.groups = list;
    }

    public static /* synthetic */ MultipleChoiceDisplayLogic copy$default(MultipleChoiceDisplayLogic multipleChoiceDisplayLogic, long j, SurveyAnswerType surveyAnswerType, SurveyLogicOperator surveyLogicOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = multipleChoiceDisplayLogic.pointId;
        }
        long j7 = j;
        if ((i10 & 2) != 0) {
            surveyAnswerType = multipleChoiceDisplayLogic.answerType;
        }
        SurveyAnswerType surveyAnswerType2 = surveyAnswerType;
        if ((i10 & 4) != 0) {
            surveyLogicOperator = multipleChoiceDisplayLogic.groupOperator;
        }
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        if ((i10 & 8) != 0) {
            list = multipleChoiceDisplayLogic.groups;
        }
        return multipleChoiceDisplayLogic.copy(j7, surveyAnswerType2, surveyLogicOperator2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPointId() {
        return this.pointId;
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyAnswerType getAnswerType() {
        return this.answerType;
    }

    /* renamed from: component3, reason: from getter */
    public final SurveyLogicOperator getGroupOperator() {
        return this.groupOperator;
    }

    public final List<MultipleChoiceDisplayLogicGroup> component4() {
        return this.groups;
    }

    public final MultipleChoiceDisplayLogic copy(@o(name = "point_id") long pointId, @o(name = "answer_type") SurveyAnswerType answerType, @o(name = "group_operator") SurveyLogicOperator groupOperator, @o(name = "groups") List<MultipleChoiceDisplayLogicGroup> groups) {
        l.e(answerType, "answerType");
        l.e(groupOperator, "groupOperator");
        l.e(groups, "groups");
        return new MultipleChoiceDisplayLogic(pointId, answerType, groupOperator, groups);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleChoiceDisplayLogic)) {
            return false;
        }
        MultipleChoiceDisplayLogic multipleChoiceDisplayLogic = (MultipleChoiceDisplayLogic) other;
        return this.pointId == multipleChoiceDisplayLogic.pointId && this.answerType == multipleChoiceDisplayLogic.answerType && this.groupOperator == multipleChoiceDisplayLogic.groupOperator && l.a(this.groups, multipleChoiceDisplayLogic.groups);
    }

    @Override // com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic
    public SurveyAnswerType getAnswerType() {
        return this.answerType;
    }

    @Override // com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic
    public SurveyLogicOperator getGroupOperator() {
        return this.groupOperator;
    }

    public final List<MultipleChoiceDisplayLogicGroup> getGroups() {
        return this.groups;
    }

    @Override // com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic
    public long getPointId() {
        return this.pointId;
    }

    public int hashCode() {
        return this.groups.hashCode() + ((this.groupOperator.hashCode() + ((this.answerType.hashCode() + (Long.hashCode(this.pointId) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultipleChoiceDisplayLogic(pointId=");
        sb2.append(this.pointId);
        sb2.append(", answerType=");
        sb2.append(this.answerType);
        sb2.append(", groupOperator=");
        sb2.append(this.groupOperator);
        sb2.append(", groups=");
        return b.t(sb2, this.groups, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeLong(this.pointId);
        parcel.writeString(this.answerType.name());
        parcel.writeString(this.groupOperator.name());
        Iterator itV = a.v(this.groups, parcel);
        while (itV.hasNext()) {
            ((MultipleChoiceDisplayLogicGroup) itV.next()).writeToParcel(parcel, flags);
        }
    }
}
