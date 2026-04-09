package com.survicate.surveys.entities.survey.questions;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.survicate.surveys.entities.survey.translations.SurveyPointImageTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointImageTranslation;", "Lcom/survicate/surveys/entities/survey/questions/Image;", "image", "Lcom/survicate/surveys/entities/survey/questions/ImagePosition;", "position", "<init>", "(Lcom/survicate/surveys/entities/survey/questions/Image;Lcom/survicate/surveys/entities/survey/questions/ImagePosition;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointImageTranslation;)Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "component1", "()Lcom/survicate/surveys/entities/survey/questions/Image;", "component2", "()Lcom/survicate/surveys/entities/survey/questions/ImagePosition;", "copy", "(Lcom/survicate/surveys/entities/survey/questions/Image;Lcom/survicate/surveys/entities/survey/questions/ImagePosition;)Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/questions/Image;", "getImage", "Lcom/survicate/surveys/entities/survey/questions/ImagePosition;", "getPosition", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointImage implements Parcelable, Translatable<SurveyPointImageTranslation, SurveyPointImage> {
    public static final Parcelable.Creator<SurveyPointImage> CREATOR = new Creator();
    private final Image image;
    private final ImagePosition position;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointImage createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyPointImage(Image.CREATOR.createFromParcel(parcel), ImagePosition.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointImage[] newArray(int i10) {
            return new SurveyPointImage[i10];
        }
    }

    public SurveyPointImage(@o(name = "image") Image image, @o(name = "mobile_position") ImagePosition imagePosition) {
        l.e(image, "image");
        l.e(imagePosition, "position");
        this.image = image;
        this.position = imagePosition;
    }

    public static /* synthetic */ SurveyPointImage copy$default(SurveyPointImage surveyPointImage, Image image, ImagePosition imagePosition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            image = surveyPointImage.image;
        }
        if ((i10 & 2) != 0) {
            imagePosition = surveyPointImage.position;
        }
        return surveyPointImage.copy(image, imagePosition);
    }

    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final ImagePosition getPosition() {
        return this.position;
    }

    public final SurveyPointImage copy(@o(name = "image") Image image, @o(name = "mobile_position") ImagePosition position) {
        l.e(image, "image");
        l.e(position, "position");
        return new SurveyPointImage(image, position);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointImage)) {
            return false;
        }
        SurveyPointImage surveyPointImage = (SurveyPointImage) other;
        return l.a(this.image, surveyPointImage.image) && this.position == surveyPointImage.position;
    }

    public final Image getImage() {
        return this.image;
    }

    public final ImagePosition getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + (this.image.hashCode() * 31);
    }

    public String toString() {
        return "SurveyPointImage(image=" + this.image + ", position=" + this.position + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        this.image.writeToParcel(parcel, flags);
        parcel.writeString(this.position.name());
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyPointImage translatedWith(SurveyPointImageTranslation translation) {
        return copy$default(this, this.image.translatedWith(translation != null ? translation.getImage() : null), null, 2, null);
    }
}
