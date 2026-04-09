package l8;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class s extends ViewDataBinding {
    public final ProgressBar A;
    public final ScrollView B;
    public final TextView C;
    public final u1 D;

    /* renamed from: w, reason: collision with root package name */
    public final Button f23322w;

    /* renamed from: x, reason: collision with root package name */
    public final EditText f23323x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23324y;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f23325z;

    public s(Object obj, View view, int i10, Button button, EditText editText, LinearLayout linearLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ScrollView scrollView, TextView textView, u1 u1Var) {
        super(obj, view, i10);
        this.f23322w = button;
        this.f23323x = editText;
        this.f23324y = linearLayout;
        this.f23325z = relativeLayout;
        this.A = progressBar;
        this.B = scrollView;
        this.C = textView;
        this.D = u1Var;
    }
}
