package com.survicate.surveys.entities.survey.theme;

import c7.a;
import com.survicate.surveys.infrastructure.serialization.HexColor;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/survicate/surveys/entities/survey/theme/MicroColorScheme;", "Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "question", "", "answer", "button", "background", "progressBar", "(IIIII)V", "getAnswer", "()I", "getBackground", "getButton", "getProgressBar", "getQuestion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MicroColorScheme extends ColorScheme {
    private final int answer;
    private final int background;
    private final int button;
    private final int progressBar;
    private final int question;

    public MicroColorScheme(@o(name = "question") @HexColor int i10, @o(name = "answer") @HexColor int i11, @o(name = "button") @HexColor int i12, @o(name = "background") @HexColor int i13, @o(name = "progress_bar") @HexColor int i14) {
        this.question = i10;
        this.answer = i11;
        this.button = i12;
        this.background = i13;
        this.progressBar = i14;
    }

    public static /* synthetic */ MicroColorScheme copy$default(MicroColorScheme microColorScheme, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = microColorScheme.question;
        }
        if ((i15 & 2) != 0) {
            i11 = microColorScheme.answer;
        }
        if ((i15 & 4) != 0) {
            i12 = microColorScheme.button;
        }
        if ((i15 & 8) != 0) {
            i13 = microColorScheme.background;
        }
        if ((i15 & 16) != 0) {
            i14 = microColorScheme.progressBar;
        }
        int i16 = i14;
        int i17 = i12;
        return microColorScheme.copy(i10, i11, i17, i13, i16);
    }

    /* renamed from: component1, reason: from getter */
    public final int getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAnswer() {
        return this.answer;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButton() {
        return this.button;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    /* renamed from: component5, reason: from getter */
    public final int getProgressBar() {
        return this.progressBar;
    }

    public final MicroColorScheme copy(@o(name = "question") @HexColor int question, @o(name = "answer") @HexColor int answer, @o(name = "button") @HexColor int button, @o(name = "background") @HexColor int background, @o(name = "progress_bar") @HexColor int progressBar) {
        return new MicroColorScheme(question, answer, button, background, progressBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicroColorScheme)) {
            return false;
        }
        MicroColorScheme microColorScheme = (MicroColorScheme) other;
        return this.question == microColorScheme.question && this.answer == microColorScheme.answer && this.button == microColorScheme.button && this.background == microColorScheme.background && this.progressBar == microColorScheme.progressBar;
    }

    public final int getAnswer() {
        return this.answer;
    }

    public final int getBackground() {
        return this.background;
    }

    public final int getButton() {
        return this.button;
    }

    public final int getProgressBar() {
        return this.progressBar;
    }

    public final int getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return Integer.hashCode(this.progressBar) + a.C(this.background, a.C(this.button, a.C(this.answer, Integer.hashCode(this.question) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MicroColorScheme{question=");
        sb2.append(this.question);
        sb2.append(", answer=");
        sb2.append(this.answer);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", progressBar=");
        return a.q(sb2, this.progressBar, '}');
    }
}
