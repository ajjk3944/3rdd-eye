package com.survicate.surveys.entities.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/survicate/surveys/entities/models/QuestionValidationState;", "", "isSuccess", "", "hideDefaultSubmitButton", "(ZZ)V", "getHideDefaultSubmitButton", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionValidationState {
    private final boolean hideDefaultSubmitButton;
    private final boolean isSuccess;

    public QuestionValidationState(boolean z10, boolean z11) {
        this.isSuccess = z10;
        this.hideDefaultSubmitButton = z11;
    }

    public static /* synthetic */ QuestionValidationState copy$default(QuestionValidationState questionValidationState, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = questionValidationState.isSuccess;
        }
        if ((i10 & 2) != 0) {
            z11 = questionValidationState.hideDefaultSubmitButton;
        }
        return questionValidationState.copy(z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHideDefaultSubmitButton() {
        return this.hideDefaultSubmitButton;
    }

    public final QuestionValidationState copy(boolean isSuccess, boolean hideDefaultSubmitButton) {
        return new QuestionValidationState(isSuccess, hideDefaultSubmitButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionValidationState)) {
            return false;
        }
        QuestionValidationState questionValidationState = (QuestionValidationState) other;
        return this.isSuccess == questionValidationState.isSuccess && this.hideDefaultSubmitButton == questionValidationState.hideDefaultSubmitButton;
    }

    public final boolean getHideDefaultSubmitButton() {
        return this.hideDefaultSubmitButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.isSuccess;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.hideDefaultSubmitButton;
        return i10 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionValidationState(isSuccess=");
        sb2.append(this.isSuccess);
        sb2.append(", hideDefaultSubmitButton=");
        return c7.a.r(sb2, this.hideDefaultSubmitButton, ')');
    }
}
