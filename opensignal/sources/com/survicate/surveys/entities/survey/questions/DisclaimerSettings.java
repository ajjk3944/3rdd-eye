package com.survicate.surveys.entities.survey.questions;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.translations.DisclaimerSettingsTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import h0.b;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B9\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011JB\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u0011¨\u0006/"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/DisclaimerSettingsTranslation;", "", "title", "description", "", "checkboxVisible", "checkboxRequired", "checkboxLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/DisclaimerSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Z", "getCheckboxVisible", "getCheckboxRequired", "getCheckboxLabel", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DisclaimerSettings implements Parcelable, Translatable<DisclaimerSettingsTranslation, DisclaimerSettings> {
    public static final Parcelable.Creator<DisclaimerSettings> CREATOR = new Creator();
    private final String checkboxLabel;
    private final boolean checkboxRequired;
    private final boolean checkboxVisible;
    private final String description;
    private final String title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclaimerSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisclaimerSettings createFromParcel(Parcel parcel) {
            boolean z10;
            l.e(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new DisclaimerSettings(string, string2, z11, parcel.readInt() == 0 ? z10 : true, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisclaimerSettings[] newArray(int i10) {
            return new DisclaimerSettings[i10];
        }
    }

    public DisclaimerSettings(@o(name = "title") String str, @o(name = "description") String str2, @o(name = "checkbox_visible") boolean z10, @o(name = "checkbox_required") boolean z11, @o(name = "checkbox_label") String str3) {
        l.e(str, "title");
        l.e(str2, "description");
        l.e(str3, "checkboxLabel");
        this.title = str;
        this.description = str2;
        this.checkboxVisible = z10;
        this.checkboxRequired = z11;
        this.checkboxLabel = str3;
    }

    public static /* synthetic */ DisclaimerSettings copy$default(DisclaimerSettings disclaimerSettings, String str, String str2, boolean z10, boolean z11, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = disclaimerSettings.title;
        }
        if ((i10 & 2) != 0) {
            str2 = disclaimerSettings.description;
        }
        if ((i10 & 4) != 0) {
            z10 = disclaimerSettings.checkboxVisible;
        }
        if ((i10 & 8) != 0) {
            z11 = disclaimerSettings.checkboxRequired;
        }
        if ((i10 & 16) != 0) {
            str3 = disclaimerSettings.checkboxLabel;
        }
        String str4 = str3;
        boolean z12 = z10;
        return disclaimerSettings.copy(str, str2, z12, z11, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCheckboxVisible() {
        return this.checkboxVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCheckboxRequired() {
        return this.checkboxRequired;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCheckboxLabel() {
        return this.checkboxLabel;
    }

    public final DisclaimerSettings copy(@o(name = "title") String title, @o(name = "description") String description, @o(name = "checkbox_visible") boolean checkboxVisible, @o(name = "checkbox_required") boolean checkboxRequired, @o(name = "checkbox_label") String checkboxLabel) {
        l.e(title, "title");
        l.e(description, "description");
        l.e(checkboxLabel, "checkboxLabel");
        return new DisclaimerSettings(title, description, checkboxVisible, checkboxRequired, checkboxLabel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerSettings)) {
            return false;
        }
        DisclaimerSettings disclaimerSettings = (DisclaimerSettings) other;
        return l.a(this.title, disclaimerSettings.title) && l.a(this.description, disclaimerSettings.description) && this.checkboxVisible == disclaimerSettings.checkboxVisible && this.checkboxRequired == disclaimerSettings.checkboxRequired && l.a(this.checkboxLabel, disclaimerSettings.checkboxLabel);
    }

    public final String getCheckboxLabel() {
        return this.checkboxLabel;
    }

    public final boolean getCheckboxRequired() {
        return this.checkboxRequired;
    }

    public final boolean getCheckboxVisible() {
        return this.checkboxVisible;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iG = a.g(this.description, this.title.hashCode() * 31, 31);
        boolean z10 = this.checkboxVisible;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iG + i10) * 31;
        boolean z11 = this.checkboxRequired;
        return this.checkboxLabel.hashCode() + ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerSettings(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", checkboxVisible=");
        sb2.append(this.checkboxVisible);
        sb2.append(", checkboxRequired=");
        sb2.append(this.checkboxRequired);
        sb2.append(", checkboxLabel=");
        return b.r(sb2, this.checkboxLabel, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.checkboxVisible ? 1 : 0);
        parcel.writeInt(this.checkboxRequired ? 1 : 0);
        parcel.writeString(this.checkboxLabel);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public DisclaimerSettings translatedWith(DisclaimerSettingsTranslation translation) {
        return copy$default(this, xu.l.B(translation != null ? translation.getTitle() : null, this.title), xu.l.B(translation != null ? translation.getDescription() : null, this.description), false, false, xu.l.B(translation != null ? translation.getCheckboxLabel() : null, this.checkboxLabel), 12, null);
    }
}
