package B4;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.apm.insight.R;
import h.DialogInterfaceC2347e;

/* renamed from: B4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0143e extends DialogInterfaceC2347e {

    /* renamed from: g, reason: collision with root package name */
    public TextView f707g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f708h;
    public AppCompatButton i;

    /* renamed from: j, reason: collision with root package name */
    public AppCompatButton f709j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f710k;

    /* renamed from: l, reason: collision with root package name */
    public h2.d f711l;

    /* renamed from: m, reason: collision with root package name */
    public c1.g f712m;

    public final void h() {
        Integer num;
        AppCompatButton appCompatButton;
        AppCompatButton appCompatButton2;
        TextView textView;
        c1.g gVar = this.f712m;
        if (TextUtils.isEmpty(gVar != null ? (String) gVar.f5897c : null)) {
            TextView textView2 = this.f707g;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f707g;
            if (textView3 != null) {
                c1.g gVar2 = this.f712m;
                textView3.setText(gVar2 != null ? (String) gVar2.f5897c : null);
            }
            TextView textView4 = this.f707g;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
        c1.g gVar3 = this.f712m;
        if (!TextUtils.isEmpty(gVar3 != null ? (String) gVar3.f5896b : null) && (textView = this.f708h) != null) {
            c1.g gVar4 = this.f712m;
            textView.setText(gVar4 != null ? (String) gVar4.f5896b : null);
        }
        c1.g gVar5 = this.f712m;
        if (!TextUtils.isEmpty(gVar5 != null ? (String) gVar5.f5898d : null) && (appCompatButton2 = this.f709j) != null) {
            c1.g gVar6 = this.f712m;
            appCompatButton2.setText(gVar6 != null ? (String) gVar6.f5898d : null);
        }
        if (!TextUtils.isEmpty(null) && (appCompatButton = this.i) != null) {
            appCompatButton.setText((CharSequence) null);
        }
        TextView textView5 = this.f710k;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        AppCompatButton appCompatButton3 = this.i;
        if (appCompatButton3 != null) {
            appCompatButton3.setVisibility(0);
        }
        c1.g gVar7 = this.f712m;
        if (gVar7 == null || (num = (Integer) gVar7.f5899e) == null) {
            return;
        }
        int iIntValue = num.intValue();
        AppCompatButton appCompatButton4 = this.f709j;
        if (appCompatButton4 != null) {
            appCompatButton4.setTextColor(iIntValue);
        }
    }

    @Override // h.DialogInterfaceC2347e, h.x, c.DialogC0390o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_custom_layout);
        this.f707g = (TextView) findViewById(R.id.dialog_title);
        this.f708h = (TextView) findViewById(R.id.dialog_message);
        this.i = (AppCompatButton) findViewById(R.id.dialog_negative);
        this.f709j = (AppCompatButton) findViewById(R.id.dialog_positive);
        this.f710k = (TextView) findViewById(R.id.dialog_message_info);
        h();
        AppCompatButton appCompatButton = this.f709j;
        if (appCompatButton != null) {
            final int i = 0;
            appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: B4.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DialogC0143e f706b;

                {
                    this.f706b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            DialogC0143e dialogC0143e = this.f706b;
                            h2.d dVar = dialogC0143e.f711l;
                            if (dVar != null) {
                                dVar.i(dialogC0143e);
                                break;
                            }
                            break;
                        default:
                            DialogC0143e dialogC0143e2 = this.f706b;
                            if (dialogC0143e2.f711l != null) {
                                dialogC0143e2.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        AppCompatButton appCompatButton2 = this.i;
        if (appCompatButton2 != null) {
            final int i3 = 1;
            appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: B4.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DialogC0143e f706b;

                {
                    this.f706b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            DialogC0143e dialogC0143e = this.f706b;
                            h2.d dVar = dialogC0143e.f711l;
                            if (dVar != null) {
                                dVar.i(dialogC0143e);
                                break;
                            }
                            break;
                        default:
                            DialogC0143e dialogC0143e2 = this.f706b;
                            if (dialogC0143e2.f711l != null) {
                                dialogC0143e2.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        h();
        setCancelable(true);
    }
}
