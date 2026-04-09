package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5403v {

    /* renamed from: a, reason: collision with root package name */
    public TextView f44739a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f44740b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* renamed from: o.v$a */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
