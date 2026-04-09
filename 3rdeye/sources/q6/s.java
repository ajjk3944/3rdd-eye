package Q6;

import K6.C0713c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: VariableMonitorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class s extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f11374b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f11375c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f11376d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.m f11377e;

    /* compiled from: VariableMonitorView.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<String, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f11378g = new a(1);

        @Override // p9.l
        public final C1992A invoke(String str) {
            String it = str;
            kotlin.jvm.internal.l.f(it, "it");
            return C1992A.f18074a;
        }
    }

    public s(Context context) {
        super(context);
        TextView textView = new TextView(getContext());
        a(textView);
        this.f11374b = textView;
        TextView textView2 = new TextView(getContext());
        a(textView2);
        this.f11375c = textView2;
        final EditText editText = new EditText(getContext());
        a(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Q6.r
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.m, p9.l] */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                s this$0 = this.f11372a;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                EditText editText2 = editText;
                if ((keyEvent != null && keyEvent.getAction() != 0) || i != 6) {
                    return false;
                }
                this$0.f11377e.invoke(editText2.getText().toString());
                return true;
            }
        });
        this.f11376d = editText;
        this.f11377e = a.f11378g;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        addView(textView, new LinearLayout.LayoutParams(C0713c.C(200, displayMetrics), -1));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
        addView(textView2, new LinearLayout.LayoutParams(C0713c.C(60, displayMetrics2), -1));
        addView(editText, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    public static void a(TextView textView) {
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        int iC = C0713c.C(8, displayMetrics);
        textView.setPadding(iC, iC, iC, iC);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R.drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }
}
