package com.survicate.surveys.presentation.matrix.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import i6.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import w.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/matrix/micro/MicroSurveyPointMatrixAnswerItem;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMatrixAnswerItem implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointMatrixAnswerItem> CREATOR = new a(2);
    public Long B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final long f6418a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6419d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6420g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6421r;

    /* renamed from: x, reason: collision with root package name */
    public final String f6422x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6423y;

    public MicroSurveyPointMatrixAnswerItem(long j, String str, ArrayList arrayList, boolean z10, String str2, String str3, Long l10, boolean z11) {
        l.e(str, "title");
        l.e(str2, "commentLabel");
        l.e(str3, "commentHint");
        this.f6418a = j;
        this.f6419d = str;
        this.f6420g = arrayList;
        this.f6421r = z10;
        this.f6422x = str2;
        this.f6423y = str3;
        this.B = l10;
        this.D = z11;
    }

    public final MicroSurveyPointMatrixColumnItem d() {
        Object next;
        Iterator it = this.f6420g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j = ((MicroSurveyPointMatrixColumnItem) next).f6424a;
            Long l10 = this.B;
            if (l10 != null && j == l10.longValue()) {
                break;
            }
        }
        return (MicroSurveyPointMatrixColumnItem) next;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MicroSurveyPointMatrixAnswerItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem");
        MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = (MicroSurveyPointMatrixAnswerItem) obj;
        return this.f6418a == microSurveyPointMatrixAnswerItem.f6418a && l.a(this.f6419d, microSurveyPointMatrixAnswerItem.f6419d) && this.f6420g.equals(microSurveyPointMatrixAnswerItem.f6420g) && this.f6421r == microSurveyPointMatrixAnswerItem.f6421r && l.a(this.f6422x, microSurveyPointMatrixAnswerItem.f6422x) && l.a(this.f6423y, microSurveyPointMatrixAnswerItem.f6423y) && l.a(this.B, microSurveyPointMatrixAnswerItem.B) && this.D == microSurveyPointMatrixAnswerItem.D;
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f6423y, c7.a.g(this.f6422x, g.b((this.f6420g.hashCode() + c7.a.g(this.f6419d, Long.hashCode(this.f6418a) * 31, 31)) * 31, this.f6421r, 31), 31), 31);
        Long l10 = this.B;
        return Boolean.hashCode(this.D) + ((iG + (l10 != null ? l10.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeLong(this.f6418a);
        parcel.writeString(this.f6419d);
        ArrayList arrayList = this.f6420g;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MicroSurveyPointMatrixColumnItem) it.next()).writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f6421r ? 1 : 0);
        parcel.writeString(this.f6422x);
        parcel.writeString(this.f6423y);
        Long l10 = this.B;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        parcel.writeInt(this.D ? 1 : 0);
    }
}
