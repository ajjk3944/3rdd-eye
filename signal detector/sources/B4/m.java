package B4;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.apm.insight.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m extends AlertDialog {

    /* renamed from: a, reason: collision with root package name */
    public l f724a;

    /* renamed from: b, reason: collision with root package name */
    public String f725b;

    /* renamed from: c, reason: collision with root package name */
    public String f726c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatButton f727d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatButton f728e;

    /* renamed from: f, reason: collision with root package name */
    public TextInputLayout f729f;

    /* renamed from: g, reason: collision with root package name */
    public TextInputEditText f730g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f731h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f732j;

    /* renamed from: k, reason: collision with root package name */
    public String f733k;

    public m(Context context) {
        super(context, R.style.customDialog);
        this.i = 1;
        this.f732j = -1;
    }

    public final void a() {
        String str = this.f725b;
        if (str == null || str.length() == 0) {
            TextView textView = this.f731h;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.f731h;
            if (textView2 != null) {
                textView2.setText(this.f725b);
            }
        }
        TextInputLayout textInputLayout = this.f729f;
        if (textInputLayout != null) {
            textInputLayout.setHint(this.f726c);
        }
        String str2 = this.f733k;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        TextInputEditText textInputEditText = this.f730g;
        if (textInputEditText != null) {
            textInputEditText.setText(this.f733k);
        }
        TextInputEditText textInputEditText2 = this.f730g;
        if (textInputEditText2 != null) {
            textInputEditText2.setInputType(this.i);
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_input);
        this.f727d = (AppCompatButton) findViewById(R.id.dialog_cancel);
        this.f728e = (AppCompatButton) findViewById(R.id.dialog_confirm);
        this.f729f = (TextInputLayout) findViewById(R.id.trace_input_layout);
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.input);
        this.f730g = textInputEditText;
        int i = this.f732j;
        if (i != -1 && textInputEditText != null) {
            textInputEditText.setMaxLines(i);
        }
        this.f731h = (TextView) findViewById(R.id.input_title);
        a();
        AppCompatButton appCompatButton = this.f728e;
        if (appCompatButton != null) {
            final int i3 = 0;
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: B4.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f723b;

                {
                    this.f723b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable text;
                    switch (i3) {
                        case 0:
                            m mVar = this.f723b;
                            l lVar = mVar.f724a;
                            if (lVar != null) {
                                TextInputEditText textInputEditText2 = mVar.f730g;
                                lVar.j(mVar, (textInputEditText2 == null || (text = textInputEditText2.getText()) == null) ? null : text.toString());
                                break;
                            }
                            break;
                        default:
                            m mVar2 = this.f723b;
                            l lVar2 = mVar2.f724a;
                            if (lVar2 != null) {
                                lVar2.h(mVar2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        AppCompatButton appCompatButton2 = this.f727d;
        if (appCompatButton2 != null) {
            final int i6 = 1;
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: B4.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f723b;

                {
                    this.f723b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable text;
                    switch (i6) {
                        case 0:
                            m mVar = this.f723b;
                            l lVar = mVar.f724a;
                            if (lVar != null) {
                                TextInputEditText textInputEditText2 = mVar.f730g;
                                lVar.j(mVar, (textInputEditText2 == null || (text = textInputEditText2.getText()) == null) ? null : text.toString());
                                break;
                            }
                            break;
                        default:
                            m mVar2 = this.f723b;
                            l lVar2 = mVar2.f724a;
                            if (lVar2 != null) {
                                lVar2.h(mVar2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        a();
    }
}
