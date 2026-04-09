package com.survicate.surveys.entities.views;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/entities/views/InputValidationView;", "T", "", "Lcom/survicate/surveys/entities/views/InputValidator;", "validator", "Llq/b0;", "bindValidator", "(Lcom/survicate/surveys/entities/views/InputValidator;)V", "", "validate", "()Z", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InputValidationView<T> {
    void bindValidator(InputValidator<T> validator);

    boolean validate();
}
