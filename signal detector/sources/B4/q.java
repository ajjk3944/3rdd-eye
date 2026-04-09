package B4;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class q extends AlertDialog {

    /* renamed from: a, reason: collision with root package name */
    public Button f742a;

    /* renamed from: b, reason: collision with root package name */
    public Button f743b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f744c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f745d;

    /* renamed from: e, reason: collision with root package name */
    public String f746e;

    /* renamed from: f, reason: collision with root package name */
    public String f747f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f748g;

    /* renamed from: h, reason: collision with root package name */
    public p5.l f749h;
    public p5.l i;

    public q(Context context) {
        super(context, R.style.customDialog);
        this.f748g = true;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        TextView textView2;
        setContentView(R.layout.dialog_permission_layout);
        this.f742a = (Button) findViewById(R.id.perm_d_pos);
        this.f743b = (Button) findViewById(R.id.perm_d_neg);
        this.f744c = (TextView) findViewById(R.id.perm_d_title);
        this.f745d = (TextView) findViewById(R.id.perm_d_info);
        String str = this.f746e;
        if (str != null && (textView2 = this.f744c) != null) {
            textView2.setText(str);
        }
        String str2 = this.f747f;
        if (str2 != null && (textView = this.f745d) != null) {
            textView.setText(str2);
        }
        setCancelable(this.f748g);
        Button button = this.f742a;
        if (button != null) {
            final int i = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: B4.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f741b;

                {
                    this.f741b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            q qVar = this.f741b;
                            p5.l lVar = qVar.f749h;
                            if (lVar != null) {
                                lVar.f(qVar);
                                break;
                            }
                            break;
                        default:
                            q qVar2 = this.f741b;
                            p5.l lVar2 = qVar2.i;
                            if (lVar2 != null) {
                                lVar2.f(qVar2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Button button2 = this.f743b;
        if (button2 != null) {
            final int i3 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: B4.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f741b;

                {
                    this.f741b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            q qVar = this.f741b;
                            p5.l lVar = qVar.f749h;
                            if (lVar != null) {
                                lVar.f(qVar);
                                break;
                            }
                            break;
                        default:
                            q qVar2 = this.f741b;
                            p5.l lVar2 = qVar2.i;
                            if (lVar2 != null) {
                                lVar2.f(qVar2);
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
        TextView textView;
        TextView textView2;
        super.show();
        String str = this.f746e;
        if (str != null && (textView2 = this.f744c) != null) {
            textView2.setText(str);
        }
        String str2 = this.f747f;
        if (str2 != null && (textView = this.f745d) != null) {
            textView.setText(str2);
        }
        setCancelable(this.f748g);
    }
}
