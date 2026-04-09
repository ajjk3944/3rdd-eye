package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.survicate.surveys.entities.survey.surveyLogic.date.SurveyLogicDateCondition;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/DateDisplayLogicGroup;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;", "condition", "", "", "value", "<init>", "(Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;Ljava/util/List;)V", "component1", "()Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;", "component2", "()Ljava/util/List;", "copy", "(Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/DateDisplayLogicGroup;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/surveyLogic/date/SurveyLogicDateCondition;", "getCondition", "Ljava/util/List;", "getValue", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DateDisplayLogicGroup implements Parcelable {
    public static final Parcelable.Creator<DateDisplayLogicGroup> CREATOR = new Creator();
    private final SurveyLogicDateCondition condition;
    private final List<String> value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateDisplayLogicGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateDisplayLogicGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new DateDisplayLogicGroup(SurveyLogicDateCondition.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateDisplayLogicGroup[] newArray(int i10) {
            return new DateDisplayLogicGroup[i10];
        }
    }

    public DateDisplayLogicGroup(@o(name = "condition") SurveyLogicDateCondition surveyLogicDateCondition, @o(name = "value") List<String> list) {
        l.e(surveyLogicDateCondition, "condition");
        l.e(list, "value");
        this.condition = surveyLogicDateCondition;
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DateDisplayLogicGroup copy$default(DateDisplayLogicGroup dateDisplayLogicGroup, SurveyLogicDateCondition surveyLogicDateCondition, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyLogicDateCondition = dateDisplayLogicGroup.condition;
        }
        if ((i10 & 2) != 0) {
            list = dateDisplayLogicGroup.value;
        }
        return dateDisplayLogicGroup.copy(surveyLogicDateCondition, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyLogicDateCondition getCondition() {
        return this.condition;
    }

    public final List<String> component2() {
        return this.value;
    }

    public final DateDisplayLogicGroup copy(@o(name = "condition") SurveyLogicDateCondition condition, @o(name = "value") List<String> value) {
        l.e(condition, "condition");
        l.e(value, "value");
        return new DateDisplayLogicGroup(condition, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateDisplayLogicGroup)) {
            return false;
        }
        DateDisplayLogicGroup dateDisplayLogicGroup = (DateDisplayLogicGroup) other;
        return this.condition == dateDisplayLogicGroup.condition && l.a(this.value, dateDisplayLogicGroup.value);
    }

    public final SurveyLogicDateCondition getCondition() {
        return this.condition;
    }

    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.condition.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DateDisplayLogicGroup(condition=");
        sb2.append(this.condition);
        sb2.append(", value=");
        return b.t(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.condition.name());
        parcel.writeStringList(this.value);
    }
}
