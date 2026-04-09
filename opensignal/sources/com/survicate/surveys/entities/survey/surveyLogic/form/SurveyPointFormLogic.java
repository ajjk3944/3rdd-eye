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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0012J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001f¨\u00065"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyPointFormLogic;", "Landroid/os/Parcelable;", "", "orderNumber", "", "uid", "goTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "logicOperator", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyLogicFormGroup;", "groups", "<init>", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()J", "component3", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component5", "()Ljava/util/List;", "copy", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyPointFormLogic;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOrderNumber", "J", "getUid", "getGoTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getLogicOperator", "Ljava/util/List;", "getGroups", "CREATOR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointFormLogic implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long goTo;
    private final List<SurveyLogicFormGroup> groups;
    private final SurveyLogicOperator logicOperator;
    private final int orderNumber;
    private final long uid;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyPointFormLogic$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyPointFormLogic;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/survicate/surveys/entities/survey/surveyLogic/form/SurveyPointFormLogic;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.survicate.surveys.entities.survey.surveyLogic.form.SurveyPointFormLogic$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SurveyPointFormLogic> {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyPointFormLogic createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyPointFormLogic(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyPointFormLogic[] newArray(int size) {
            return new SurveyPointFormLogic[size];
        }
    }

    public SurveyPointFormLogic(@o(name = "order_number") int i10, @o(name = "uid") long j, @o(name = "go_to") long j7, @o(name = "group_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "group") List<SurveyLogicFormGroup> list) {
        l.e(list, "groups");
        this.orderNumber = i10;
        this.uid = j;
        this.goTo = j7;
        this.logicOperator = surveyLogicOperator;
        this.groups = list;
    }

    public static /* synthetic */ SurveyPointFormLogic copy$default(SurveyPointFormLogic surveyPointFormLogic, int i10, long j, long j7, SurveyLogicOperator surveyLogicOperator, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = surveyPointFormLogic.orderNumber;
        }
        if ((i11 & 2) != 0) {
            j = surveyPointFormLogic.uid;
        }
        if ((i11 & 4) != 0) {
            j7 = surveyPointFormLogic.goTo;
        }
        if ((i11 & 8) != 0) {
            surveyLogicOperator = surveyPointFormLogic.logicOperator;
        }
        if ((i11 & 16) != 0) {
            list = surveyPointFormLogic.groups;
        }
        long j10 = j7;
        return surveyPointFormLogic.copy(i10, j, j10, surveyLogicOperator, list);
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
    public final SurveyLogicOperator getLogicOperator() {
        return this.logicOperator;
    }

    public final List<SurveyLogicFormGroup> component5() {
        return this.groups;
    }

    public final SurveyPointFormLogic copy(@o(name = "order_number") int orderNumber, @o(name = "uid") long uid, @o(name = "go_to") long goTo, @o(name = "group_operator") SurveyLogicOperator logicOperator, @o(name = "group") List<SurveyLogicFormGroup> groups) {
        l.e(groups, "groups");
        return new SurveyPointFormLogic(orderNumber, uid, goTo, logicOperator, groups);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointFormLogic)) {
            return false;
        }
        SurveyPointFormLogic surveyPointFormLogic = (SurveyPointFormLogic) other;
        return this.orderNumber == surveyPointFormLogic.orderNumber && this.uid == surveyPointFormLogic.uid && this.goTo == surveyPointFormLogic.goTo && this.logicOperator == surveyPointFormLogic.logicOperator && l.a(this.groups, surveyPointFormLogic.groups);
    }

    public final long getGoTo() {
        return this.goTo;
    }

    public final List<SurveyLogicFormGroup> getGroups() {
        return this.groups;
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

    public int hashCode() {
        int iB = b.b(b.b(Integer.hashCode(this.orderNumber) * 31, 31, this.uid), 31, this.goTo);
        SurveyLogicOperator surveyLogicOperator = this.logicOperator;
        return this.groups.hashCode() + ((iB + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointFormLogic(orderNumber=");
        sb2.append(this.orderNumber);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", goTo=");
        sb2.append(this.goTo);
        sb2.append(", logicOperator=");
        sb2.append(this.logicOperator);
        sb2.append(", groups=");
        return b.t(sb2, this.groups, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        l.e(dest, "dest");
        dest.writeInt(this.orderNumber);
        dest.writeLong(this.uid);
        dest.writeLong(this.goTo);
        dest.writeSerializable(this.logicOperator);
        dest.writeList(this.groups);
    }

    public SurveyPointFormLogic(Parcel parcel) {
        Object obj;
        l.e(parcel, "parcel");
        int i10 = parcel.readInt();
        long j = parcel.readLong();
        long j7 = parcel.readLong();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            obj = (Serializable) parcel.readSerializable(SurveyLogicOperator.class.getClassLoader(), SurveyLogicOperator.class);
        } else {
            Serializable serializable = parcel.readSerializable();
            obj = (SurveyLogicOperator) (serializable instanceof SurveyLogicOperator ? serializable : null);
        }
        SurveyLogicOperator surveyLogicOperator = (SurveyLogicOperator) obj;
        ArrayList arrayList = new ArrayList();
        if (i11 >= 33) {
            parcel.readList(arrayList, SurveyLogicFormGroup.class.getClassLoader(), SurveyLogicFormGroup.class);
        } else {
            parcel.readList(arrayList, SurveyLogicFormGroup.class.getClassLoader());
        }
        this(i10, j, j7, surveyLogicOperator, arrayList);
    }
}
