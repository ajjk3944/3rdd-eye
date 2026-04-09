package com.survicate.surveys.entities.survey.surveyLogic.display;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyLogicTextCondition;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/display/TextDisplayLogicGroup;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;", "condition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "valueOperator", "", "", "value", "<init>", "(Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "component1", "()Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;", "component2", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component3", "()Ljava/util/List;", "copy", "(Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/display/TextDisplayLogicGroup;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyLogicTextCondition;", "getCondition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getValueOperator", "Ljava/util/List;", "getValue", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextDisplayLogicGroup implements Parcelable {
    public static final Parcelable.Creator<TextDisplayLogicGroup> CREATOR = new Creator();
    private final SurveyLogicTextCondition condition;
    private final List<String> value;
    private final SurveyLogicOperator valueOperator;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextDisplayLogicGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextDisplayLogicGroup createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new TextDisplayLogicGroup(SurveyLogicTextCondition.valueOf(parcel.readString()), SurveyLogicOperator.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextDisplayLogicGroup[] newArray(int i10) {
            return new TextDisplayLogicGroup[i10];
        }
    }

    public TextDisplayLogicGroup(@o(name = "condition") SurveyLogicTextCondition surveyLogicTextCondition, @o(name = "value_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "value") List<String> list) {
        l.e(surveyLogicTextCondition, "condition");
        l.e(surveyLogicOperator, "valueOperator");
        l.e(list, "value");
        this.condition = surveyLogicTextCondition;
        this.valueOperator = surveyLogicOperator;
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextDisplayLogicGroup copy$default(TextDisplayLogicGroup textDisplayLogicGroup, SurveyLogicTextCondition surveyLogicTextCondition, SurveyLogicOperator surveyLogicOperator, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyLogicTextCondition = textDisplayLogicGroup.condition;
        }
        if ((i10 & 2) != 0) {
            surveyLogicOperator = textDisplayLogicGroup.valueOperator;
        }
        if ((i10 & 4) != 0) {
            list = textDisplayLogicGroup.value;
        }
        return textDisplayLogicGroup.copy(surveyLogicTextCondition, surveyLogicOperator, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyLogicTextCondition getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final SurveyLogicOperator getValueOperator() {
        return this.valueOperator;
    }

    public final List<String> component3() {
        return this.value;
    }

    public final TextDisplayLogicGroup copy(@o(name = "condition") SurveyLogicTextCondition condition, @o(name = "value_operator") SurveyLogicOperator valueOperator, @o(name = "value") List<String> value) {
        l.e(condition, "condition");
        l.e(valueOperator, "valueOperator");
        l.e(value, "value");
        return new TextDisplayLogicGroup(condition, valueOperator, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDisplayLogicGroup)) {
            return false;
        }
        TextDisplayLogicGroup textDisplayLogicGroup = (TextDisplayLogicGroup) other;
        return this.condition == textDisplayLogicGroup.condition && this.valueOperator == textDisplayLogicGroup.valueOperator && l.a(this.value, textDisplayLogicGroup.value);
    }

    public final SurveyLogicTextCondition getCondition() {
        return this.condition;
    }

    public final List<String> getValue() {
        return this.value;
    }

    public final SurveyLogicOperator getValueOperator() {
        return this.valueOperator;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.valueOperator.hashCode() + (this.condition.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextDisplayLogicGroup(condition=");
        sb2.append(this.condition);
        sb2.append(", valueOperator=");
        sb2.append(this.valueOperator);
        sb2.append(", value=");
        return b.t(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.condition.name());
        parcel.writeString(this.valueOperator.name());
        parcel.writeStringList(this.value);
    }
}
