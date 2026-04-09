package com.survicate.surveys.entities.survey.questions.question;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.translations.SurveyPointEntryTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B)\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0014¨\u0006,"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;", "", "id", "", "possibleAnswer", "", "addingCommentAvailable", "<init>", "(JLjava/lang/String;Ljava/lang/Boolean;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;)Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(JLjava/lang/String;Ljava/lang/Boolean;)Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getPossibleAnswer", "Ljava/lang/Boolean;", "getAddingCommentAvailable", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionPointAnswer implements Parcelable, Translatable<SurveyPointEntryTranslation, QuestionPointAnswer> {
    public static final Parcelable.Creator<QuestionPointAnswer> CREATOR = new Creator();
    private final Boolean addingCommentAvailable;
    private final long id;
    private final String possibleAnswer;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionPointAnswer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionPointAnswer createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            l.e(parcel, "parcel");
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuestionPointAnswer(j, string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionPointAnswer[] newArray(int i10) {
            return new QuestionPointAnswer[i10];
        }
    }

    public QuestionPointAnswer(@o(name = "id") long j, @o(name = "possible_answer") String str, @o(name = "add_comment") Boolean bool) {
        this.id = j;
        this.possibleAnswer = str;
        this.addingCommentAvailable = bool;
    }

    public static /* synthetic */ QuestionPointAnswer copy$default(QuestionPointAnswer questionPointAnswer, long j, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = questionPointAnswer.id;
        }
        if ((i10 & 2) != 0) {
            str = questionPointAnswer.possibleAnswer;
        }
        if ((i10 & 4) != 0) {
            bool = questionPointAnswer.addingCommentAvailable;
        }
        return questionPointAnswer.copy(j, str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPossibleAnswer() {
        return this.possibleAnswer;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getAddingCommentAvailable() {
        return this.addingCommentAvailable;
    }

    public final QuestionPointAnswer copy(@o(name = "id") long id2, @o(name = "possible_answer") String possibleAnswer, @o(name = "add_comment") Boolean addingCommentAvailable) {
        return new QuestionPointAnswer(id2, possibleAnswer, addingCommentAvailable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionPointAnswer)) {
            return false;
        }
        QuestionPointAnswer questionPointAnswer = (QuestionPointAnswer) other;
        return this.id == questionPointAnswer.id && l.a(this.possibleAnswer, questionPointAnswer.possibleAnswer) && l.a(this.addingCommentAvailable, questionPointAnswer.addingCommentAvailable);
    }

    public final Boolean getAddingCommentAvailable() {
        return this.addingCommentAvailable;
    }

    public final long getId() {
        return this.id;
    }

    public final String getPossibleAnswer() {
        return this.possibleAnswer;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.possibleAnswer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.addingCommentAvailable;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "QuestionPointAnswer(id=" + this.id + ", possibleAnswer=" + this.possibleAnswer + ", addingCommentAvailable=" + this.addingCommentAvailable + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.possibleAnswer);
        Boolean bool = this.addingCommentAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.x(parcel, 1, bool);
        }
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public QuestionPointAnswer translatedWith(SurveyPointEntryTranslation translation) {
        return copy$default(this, 0L, xu.l.C(translation != null ? translation.getValue() : null, this.possibleAnswer), null, 5, null);
    }
}
