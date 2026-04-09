package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/RangeDisplayLogicGroup;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyLogicRangeCondition;", "condition", "", "", "value", "<init>", "(Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyLogicRangeCondition;Ljava/util/List;)V", "component1", "()Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyLogicRangeCondition;", "component2", "()Ljava/util/List;", "copy", "(Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyLogicRangeCondition;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/RangeDisplayLogicGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyLogicRangeCondition;", "getCondition", "Ljava/util/List;", "getValue", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RangeDisplayLogicGroup implements Parcelable {
    public static final Parcelable.Creator<RangeDisplayLogicGroup> CREATOR = new Creator();
    private final SurveyLogicRangeCondition condition;
    private final List<Long> value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RangeDisplayLogicGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RangeDisplayLogicGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            SurveyLogicRangeCondition surveyLogicRangeConditionValueOf = SurveyLogicRangeCondition.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new RangeDisplayLogicGroup(surveyLogicRangeConditionValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RangeDisplayLogicGroup[] newArray(int i10) {
            return new RangeDisplayLogicGroup[i10];
        }
    }

    public RangeDisplayLogicGroup(@o(name = "condition") SurveyLogicRangeCondition surveyLogicRangeCondition, @o(name = "value") List<Long> list) {
        l.e(surveyLogicRangeCondition, "condition");
        l.e(list, "value");
        this.condition = surveyLogicRangeCondition;
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RangeDisplayLogicGroup copy$default(RangeDisplayLogicGroup rangeDisplayLogicGroup, SurveyLogicRangeCondition surveyLogicRangeCondition, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyLogicRangeCondition = rangeDisplayLogicGroup.condition;
        }
        if ((i10 & 2) != 0) {
            list = rangeDisplayLogicGroup.value;
        }
        return rangeDisplayLogicGroup.copy(surveyLogicRangeCondition, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyLogicRangeCondition getCondition() {
        return this.condition;
    }

    public final List<Long> component2() {
        return this.value;
    }

    public final RangeDisplayLogicGroup copy(@o(name = "condition") SurveyLogicRangeCondition condition, @o(name = "value") List<Long> value) {
        l.e(condition, "condition");
        l.e(value, "value");
        return new RangeDisplayLogicGroup(condition, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeDisplayLogicGroup)) {
            return false;
        }
        RangeDisplayLogicGroup rangeDisplayLogicGroup = (RangeDisplayLogicGroup) other;
        return this.condition == rangeDisplayLogicGroup.condition && l.a(this.value, rangeDisplayLogicGroup.value);
    }

    public final SurveyLogicRangeCondition getCondition() {
        return this.condition;
    }

    public final List<Long> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.condition.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RangeDisplayLogicGroup(condition=");
        sb2.append(this.condition);
        sb2.append(", value=");
        return b.t(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.condition.name());
        Iterator itV = a.v(this.value, parcel);
        while (itV.hasNext()) {
            parcel.writeLong(((Number) itV.next()).longValue());
        }
    }
}
