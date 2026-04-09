package com.survicate.surveys.entities.survey.surveyLogic.multiple;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JV\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\"¨\u0006:"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyPointMultipleLogic;", "Landroid/os/Parcelable;", "", "orderNumber", "", "uid", "goTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;", "condition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "logicOperator", "", "values", "<init>", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()J", "component3", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;", "component5", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component6", "()Ljava/util/List;", "copy", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyPointMultipleLogic;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOrderNumber", "J", "getUid", "getGoTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyLogicMultipleCondition;", "getCondition", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getLogicOperator", "Ljava/util/List;", "getValues", "CREATOR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointMultipleLogic implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SurveyLogicMultipleCondition condition;
    private final long goTo;
    private final SurveyLogicOperator logicOperator;
    private final int orderNumber;
    private final long uid;
    private final List<Long> values;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyPointMultipleLogic$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyPointMultipleLogic;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/survicate/surveys/entities/survey/surveyLogic/multiple/SurveyPointMultipleLogic;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.survicate.surveys.entities.survey.surveyLogic.multiple.SurveyPointMultipleLogic$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SurveyPointMultipleLogic> {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyPointMultipleLogic createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyPointMultipleLogic(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyPointMultipleLogic[] newArray(int size) {
            return new SurveyPointMultipleLogic[size];
        }
    }

    public SurveyPointMultipleLogic(@o(name = "order_number") int i10, @o(name = "uid") long j, @o(name = "go_to") long j7, @o(name = "condition") SurveyLogicMultipleCondition surveyLogicMultipleCondition, @o(name = "operator") SurveyLogicOperator surveyLogicOperator, @o(name = "value") List<Long> list) {
        l.e(list, "values");
        this.orderNumber = i10;
        this.uid = j;
        this.goTo = j7;
        this.condition = surveyLogicMultipleCondition;
        this.logicOperator = surveyLogicOperator;
        this.values = list;
    }

    public static /* synthetic */ SurveyPointMultipleLogic copy$default(SurveyPointMultipleLogic surveyPointMultipleLogic, int i10, long j, long j7, SurveyLogicMultipleCondition surveyLogicMultipleCondition, SurveyLogicOperator surveyLogicOperator, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = surveyPointMultipleLogic.orderNumber;
        }
        if ((i11 & 2) != 0) {
            j = surveyPointMultipleLogic.uid;
        }
        if ((i11 & 4) != 0) {
            j7 = surveyPointMultipleLogic.goTo;
        }
        if ((i11 & 8) != 0) {
            surveyLogicMultipleCondition = surveyPointMultipleLogic.condition;
        }
        if ((i11 & 16) != 0) {
            surveyLogicOperator = surveyPointMultipleLogic.logicOperator;
        }
        if ((i11 & 32) != 0) {
            list = surveyPointMultipleLogic.values;
        }
        List list2 = list;
        SurveyLogicMultipleCondition surveyLogicMultipleCondition2 = surveyLogicMultipleCondition;
        long j10 = j7;
        return surveyPointMultipleLogic.copy(i10, j, j10, surveyLogicMultipleCondition2, surveyLogicOperator, list2);
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
    public final long getGoTo() {
        return this.goTo;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveyLogicMultipleCondition getCondition() {
        return this.condition;
    }

    /* renamed from: component5, reason: from getter */
    public final SurveyLogicOperator getLogicOperator() {
        return this.logicOperator;
    }

    public final List<Long> component6() {
        return this.values;
    }

    public final SurveyPointMultipleLogic copy(@o(name = "order_number") int orderNumber, @o(name = "uid") long uid, @o(name = "go_to") long goTo, @o(name = "condition") SurveyLogicMultipleCondition condition, @o(name = "operator") SurveyLogicOperator logicOperator, @o(name = "value") List<Long> values) {
        l.e(values, "values");
        return new SurveyPointMultipleLogic(orderNumber, uid, goTo, condition, logicOperator, values);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointMultipleLogic)) {
            return false;
        }
        SurveyPointMultipleLogic surveyPointMultipleLogic = (SurveyPointMultipleLogic) other;
        return this.orderNumber == surveyPointMultipleLogic.orderNumber && this.uid == surveyPointMultipleLogic.uid && this.goTo == surveyPointMultipleLogic.goTo && this.condition == surveyPointMultipleLogic.condition && this.logicOperator == surveyPointMultipleLogic.logicOperator && l.a(this.values, surveyPointMultipleLogic.values);
    }

    public final SurveyLogicMultipleCondition getCondition() {
        return this.condition;
    }

    public final long getGoTo() {
        return this.goTo;
    }

    public final SurveyLogicOperator getLogicOperator() {
        return this.logicOperator;
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
        int iB = b.b(b.b(Integer.hashCode(this.orderNumber) * 31, 31, this.uid), 31, this.goTo);
        SurveyLogicMultipleCondition surveyLogicMultipleCondition = this.condition;
        int iHashCode = (iB + (surveyLogicMultipleCondition == null ? 0 : surveyLogicMultipleCondition.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.logicOperator;
        return this.values.hashCode() + ((iHashCode + (surveyLogicOperator != null ? surveyLogicOperator.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointMultipleLogic(orderNumber=");
        sb2.append(this.orderNumber);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", goTo=");
        sb2.append(this.goTo);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", logicOperator=");
        sb2.append(this.logicOperator);
        sb2.append(", values=");
        return b.t(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        l.e(dest, "dest");
        dest.writeInt(this.orderNumber);
        dest.writeLong(this.uid);
        dest.writeLong(this.goTo);
        dest.writeSerializable(this.condition);
        dest.writeSerializable(this.logicOperator);
        dest.writeList(this.values);
    }

    public SurveyPointMultipleLogic(Parcel parcel) {
        Object obj;
        Object obj2;
        l.e(parcel, "parcel");
        int i10 = parcel.readInt();
        long j = parcel.readLong();
        long j7 = parcel.readLong();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            obj = (Serializable) parcel.readSerializable(SurveyLogicMultipleCondition.class.getClassLoader(), SurveyLogicMultipleCondition.class);
        } else {
            Serializable serializable = parcel.readSerializable();
            obj = (SurveyLogicMultipleCondition) (serializable instanceof SurveyLogicMultipleCondition ? serializable : null);
        }
        SurveyLogicMultipleCondition surveyLogicMultipleCondition = (SurveyLogicMultipleCondition) obj;
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
        this(i10, j, j7, surveyLogicMultipleCondition, surveyLogicOperator, arrayList);
    }
}
