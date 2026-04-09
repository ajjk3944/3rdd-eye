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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0016¨\u00062"}, d2 = {"Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyPointMatrixLogic;", "Landroid/os/Parcelable;", "", "orderNumber", "", "uid", "goTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "groupOperator", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyLogicMatrixGroup;", "groups", "<init>", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)V", "component1", "()I", "component2", "()J", "component3", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component5", "()Ljava/util/List;", "copy", "(IJJLcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;)Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyPointMatrixLogic;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getOrderNumber", "J", "getUid", "getGoTo", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getGroupOperator", "Ljava/util/List;", "getGroups", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointMatrixLogic implements Parcelable {
    public static final Parcelable.Creator<SurveyPointMatrixLogic> CREATOR = new Creator();
    private final long goTo;
    private final SurveyLogicOperator groupOperator;
    private final List<SurveyLogicMatrixGroup> groups;
    private final int orderNumber;
    private final long uid;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointMatrixLogic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointMatrixLogic createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            int i10 = parcel.readInt();
            long j = parcel.readLong();
            long j7 = parcel.readLong();
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(SurveyLogicMatrixGroup.CREATOR.createFromParcel(parcel));
            }
            return new SurveyPointMatrixLogic(i10, j, j7, surveyLogicOperatorValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointMatrixLogic[] newArray(int i10) {
            return new SurveyPointMatrixLogic[i10];
        }
    }

    public SurveyPointMatrixLogic(@o(name = "order_number") int i10, @o(name = "uid") long j, @o(name = "go_to") long j7, @o(name = "group_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "group") List<SurveyLogicMatrixGroup> list) {
        l.e(list, "groups");
        this.orderNumber = i10;
        this.uid = j;
        this.goTo = j7;
        this.groupOperator = surveyLogicOperator;
        this.groups = list;
    }

    public static /* synthetic */ SurveyPointMatrixLogic copy$default(SurveyPointMatrixLogic surveyPointMatrixLogic, int i10, long j, long j7, SurveyLogicOperator surveyLogicOperator, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = surveyPointMatrixLogic.orderNumber;
        }
        if ((i11 & 2) != 0) {
            j = surveyPointMatrixLogic.uid;
        }
        if ((i11 & 4) != 0) {
            j7 = surveyPointMatrixLogic.goTo;
        }
        if ((i11 & 8) != 0) {
            surveyLogicOperator = surveyPointMatrixLogic.groupOperator;
        }
        if ((i11 & 16) != 0) {
            list = surveyPointMatrixLogic.groups;
        }
        long j10 = j7;
        return surveyPointMatrixLogic.copy(i10, j, j10, surveyLogicOperator, list);
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
    public final SurveyLogicOperator getGroupOperator() {
        return this.groupOperator;
    }

    public final List<SurveyLogicMatrixGroup> component5() {
        return this.groups;
    }

    public final SurveyPointMatrixLogic copy(@o(name = "order_number") int orderNumber, @o(name = "uid") long uid, @o(name = "go_to") long goTo, @o(name = "group_operator") SurveyLogicOperator groupOperator, @o(name = "group") List<SurveyLogicMatrixGroup> groups) {
        l.e(groups, "groups");
        return new SurveyPointMatrixLogic(orderNumber, uid, goTo, groupOperator, groups);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointMatrixLogic)) {
            return false;
        }
        SurveyPointMatrixLogic surveyPointMatrixLogic = (SurveyPointMatrixLogic) other;
        return this.orderNumber == surveyPointMatrixLogic.orderNumber && this.uid == surveyPointMatrixLogic.uid && this.goTo == surveyPointMatrixLogic.goTo && this.groupOperator == surveyPointMatrixLogic.groupOperator && l.a(this.groups, surveyPointMatrixLogic.groups);
    }

    public final long getGoTo() {
        return this.goTo;
    }

    public final SurveyLogicOperator getGroupOperator() {
        return this.groupOperator;
    }

    public final List<SurveyLogicMatrixGroup> getGroups() {
        return this.groups;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iB = b.b(b.b(Integer.hashCode(this.orderNumber) * 31, 31, this.uid), 31, this.goTo);
        SurveyLogicOperator surveyLogicOperator = this.groupOperator;
        return this.groups.hashCode() + ((iB + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointMatrixLogic(orderNumber=");
        sb2.append(this.orderNumber);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", goTo=");
        sb2.append(this.goTo);
        sb2.append(", groupOperator=");
        sb2.append(this.groupOperator);
        sb2.append(", groups=");
        return b.t(sb2, this.groups, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeInt(this.orderNumber);
        parcel.writeLong(this.uid);
        parcel.writeLong(this.goTo);
        SurveyLogicOperator surveyLogicOperator = this.groupOperator;
        if (surveyLogicOperator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(surveyLogicOperator.name());
        }
        Iterator itV = a.v(this.groups, parcel);
        while (itV.hasNext()) {
            ((SurveyLogicMatrixGroup) itV.next()).writeToParcel(parcel, flags);
        }
    }
}
