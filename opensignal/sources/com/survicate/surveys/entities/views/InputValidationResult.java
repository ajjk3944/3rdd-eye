package com.survicate.surveys.entities.views;

import br.g;
import br.l;
import h0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/survicate/surveys/entities/views/InputValidationResult;", "", "isSuccess", "", "errorMessage", "", "(ZLjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InputValidationResult {
    private final String errorMessage;
    private final boolean isSuccess;

    public InputValidationResult(boolean z10, String str) {
        this.isSuccess = z10;
        this.errorMessage = str;
    }

    public static /* synthetic */ InputValidationResult copy$default(InputValidationResult inputValidationResult, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = inputValidationResult.isSuccess;
        }
        if ((i10 & 2) != 0) {
            str = inputValidationResult.errorMessage;
        }
        return inputValidationResult.copy(z10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final InputValidationResult copy(boolean isSuccess, String errorMessage) {
        return new InputValidationResult(isSuccess, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputValidationResult)) {
            return false;
        }
        InputValidationResult inputValidationResult = (InputValidationResult) other;
        return this.isSuccess == inputValidationResult.isSuccess && l.a(this.errorMessage, inputValidationResult.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
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
        String str = this.errorMessage;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputValidationResult(isSuccess=");
        sb2.append(this.isSuccess);
        sb2.append(", errorMessage=");
        return b.r(sb2, this.errorMessage, ')');
    }

    public /* synthetic */ InputValidationResult(boolean z10, String str, int i10, g gVar) {
        this(z10, (i10 & 2) != 0 ? null : str);
    }
}
