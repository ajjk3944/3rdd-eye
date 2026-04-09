package com.survicate.surveys.entities.survey.questions;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import com.survicate.surveys.entities.survey.translations.ImageTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import h0.b;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/Image;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/ImageTranslation;", "", "url", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/ImageTranslation;)Lcom/survicate/surveys/entities/survey/questions/Image;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/entities/survey/questions/Image;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "getDescription", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Image implements Parcelable, Translatable<ImageTranslation, Image> {
    public static final Parcelable.Creator<Image> CREATOR = new Creator();
    private final String description;
    private final String url;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Image> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new Image(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i10) {
            return new Image[i10];
        }
    }

    public Image(@o(name = "url") String str, @o(name = "description") String str2) {
        l.e(str, "url");
        this.url = str;
        this.description = str2;
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = image.url;
        }
        if ((i10 & 2) != 0) {
            str2 = image.description;
        }
        return image.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Image copy(@o(name = "url") String url, @o(name = "description") String description) {
        l.e(url, "url");
        return new Image(url, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return l.a(this.url, image.url) && l.a(this.description, image.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Image(url=");
        sb2.append(this.url);
        sb2.append(", description=");
        return b.r(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.description);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public Image translatedWith(ImageTranslation translation) {
        return copy$default(this, null, xu.l.C(translation != null ? translation.getDescription() : null, this.description), 1, null);
    }
}
