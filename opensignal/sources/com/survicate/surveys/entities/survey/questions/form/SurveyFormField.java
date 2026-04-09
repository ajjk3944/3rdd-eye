package com.survicate.surveys.entities.survey.questions.form;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.translations.SurveyPointEntryTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B1\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/form/SurveyFormField;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;", "", "id", "", "label", "fieldType", "", "required", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;)Lcom/survicate/surveys/entities/survey/questions/form/SurveyFormField;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(JLjava/lang/String;Ljava/lang/String;Z)Lcom/survicate/surveys/entities/survey/questions/form/SurveyFormField;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getLabel", "getFieldType", "Z", "getRequired", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyFormField implements Parcelable, Translatable<SurveyPointEntryTranslation, SurveyFormField> {
    public static final Parcelable.Creator<SurveyFormField> CREATOR = new Creator();
    private final String fieldType;
    private final long id;
    private final String label;
    private final boolean required;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyFormField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyFormField createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyFormField(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyFormField[] newArray(int i10) {
            return new SurveyFormField[i10];
        }
    }

    public SurveyFormField(@o(name = "id") long j, @o(name = "label") String str, @o(name = "field_type") String str2, @o(name = "required") boolean z10) {
        l.e(str2, "fieldType");
        this.id = j;
        this.label = str;
        this.fieldType = str2;
        this.required = z10;
    }

    public static /* synthetic */ SurveyFormField copy$default(SurveyFormField surveyFormField, long j, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = surveyFormField.id;
        }
        long j7 = j;
        if ((i10 & 2) != 0) {
            str = surveyFormField.label;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = surveyFormField.fieldType;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            z10 = surveyFormField.required;
        }
        return surveyFormField.copy(j7, str3, str4, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFieldType() {
        return this.fieldType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final SurveyFormField copy(@o(name = "id") long id2, @o(name = "label") String label, @o(name = "field_type") String fieldType, @o(name = "required") boolean required) {
        l.e(fieldType, "fieldType");
        return new SurveyFormField(id2, label, fieldType, required);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyFormField)) {
            return false;
        }
        SurveyFormField surveyFormField = (SurveyFormField) other;
        return this.id == surveyFormField.id && l.a(this.label, surveyFormField.label) && l.a(this.fieldType, surveyFormField.fieldType) && this.required == surveyFormField.required;
    }

    public final String getFieldType() {
        return this.fieldType;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getRequired() {
        return this.required;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.label;
        int iG = a.g(this.fieldType, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z10 = this.required;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iG + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyFormField(id=");
        sb2.append(this.id);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", fieldType=");
        sb2.append(this.fieldType);
        sb2.append(", required=");
        return a.r(sb2, this.required, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.label);
        parcel.writeString(this.fieldType);
        parcel.writeInt(this.required ? 1 : 0);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyFormField translatedWith(SurveyPointEntryTranslation translation) {
        return copy$default(this, 0L, xu.l.C(translation != null ? translation.getValue() : null, this.label), null, false, 13, null);
    }
}
