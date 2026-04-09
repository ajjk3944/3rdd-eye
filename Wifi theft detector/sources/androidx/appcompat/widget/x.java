package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1380a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f1381b;

    public static final class a {
        @NonNull
        @DoNotInline
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public x(TextView textView) {
        this.f1380a = (TextView) r0.i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1381b;
        return textClassifier == null ? a.a(this.f1380a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1381b = textClassifier;
    }
}
