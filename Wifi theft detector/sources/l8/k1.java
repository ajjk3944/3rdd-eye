package l8;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class k1 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    /* renamed from: w, reason: collision with root package name */
    public final Button f23278w;

    /* renamed from: x, reason: collision with root package name */
    public final AutoCompleteTextView f23279x;

    /* renamed from: y, reason: collision with root package name */
    public final ProgressBar f23280y;

    /* renamed from: z, reason: collision with root package name */
    public final ScrollView f23281z;

    public k1(Object obj, View view, int i10, Button button, AutoCompleteTextView autoCompleteTextView, ProgressBar progressBar, ScrollView scrollView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f23278w = button;
        this.f23279x = autoCompleteTextView;
        this.f23280y = progressBar;
        this.f23281z = scrollView;
        this.A = textView;
        this.B = textView2;
    }
}
