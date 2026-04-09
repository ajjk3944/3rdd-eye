package B4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apm.insight.R;
import h.DialogInterfaceC2347e;

/* loaded from: classes.dex */
public final class C extends DialogInterfaceC2347e {

    /* renamed from: g, reason: collision with root package name */
    public String f692g;

    /* renamed from: h, reason: collision with root package name */
    public String f693h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f694j;

    public final void h() {
        TextView textView;
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setText(this.f692g);
        }
        String str = this.f693h;
        if (str == null || str.length() == 0 || (textView = this.f694j) == null) {
            return;
        }
        textView.setText(this.f693h);
    }

    @Override // h.DialogInterfaceC2347e, h.x, c.DialogC0390o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_share_copy);
        this.i = (TextView) findViewById(R.id.dialog_message);
        this.f694j = (TextView) findViewById(R.id.dialog_title);
        Button button = (Button) findViewById(R.id.dialog_cancel);
        if (button != null) {
            final int i = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: B4.B

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C f691b;

                {
                    this.f691b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f691b.dismiss();
                            break;
                        case 1:
                            C c6 = this.f691b;
                            d5.y.i(c6.getContext(), c6.f692g);
                            c6.dismiss();
                            break;
                        default:
                            C c7 = this.f691b;
                            String str = c7.f692g;
                            if (str != null && str.length() != 0) {
                                Context context = c7.getContext();
                                String str2 = c7.f692g;
                                String str3 = c7.f693h;
                                if (context != null && str2 != null && str2.length() != 0) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", str2);
                                    Intent intentCreateChooser = Intent.createChooser(intent, str3);
                                    if (intentCreateChooser.resolveActivity(context.getPackageManager()) != null) {
                                        context.startActivity(intentCreateChooser);
                                    } else {
                                        F4.d.b(context, context.getString(R.string.none_share_app));
                                    }
                                }
                                c7.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Button button2 = (Button) findViewById(R.id.dialog_copy);
        if (button2 != null) {
            final int i3 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: B4.B

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C f691b;

                {
                    this.f691b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f691b.dismiss();
                            break;
                        case 1:
                            C c6 = this.f691b;
                            d5.y.i(c6.getContext(), c6.f692g);
                            c6.dismiss();
                            break;
                        default:
                            C c7 = this.f691b;
                            String str = c7.f692g;
                            if (str != null && str.length() != 0) {
                                Context context = c7.getContext();
                                String str2 = c7.f692g;
                                String str3 = c7.f693h;
                                if (context != null && str2 != null && str2.length() != 0) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", str2);
                                    Intent intentCreateChooser = Intent.createChooser(intent, str3);
                                    if (intentCreateChooser.resolveActivity(context.getPackageManager()) != null) {
                                        context.startActivity(intentCreateChooser);
                                    } else {
                                        F4.d.b(context, context.getString(R.string.none_share_app));
                                    }
                                }
                                c7.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Button button3 = (Button) findViewById(R.id.dialog_share);
        if (button3 != null) {
            final int i6 = 2;
            button3.setOnClickListener(new View.OnClickListener(this) { // from class: B4.B

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C f691b;

                {
                    this.f691b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            this.f691b.dismiss();
                            break;
                        case 1:
                            C c6 = this.f691b;
                            d5.y.i(c6.getContext(), c6.f692g);
                            c6.dismiss();
                            break;
                        default:
                            C c7 = this.f691b;
                            String str = c7.f692g;
                            if (str != null && str.length() != 0) {
                                Context context = c7.getContext();
                                String str2 = c7.f692g;
                                String str3 = c7.f693h;
                                if (context != null && str2 != null && str2.length() != 0) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", str2);
                                    Intent intentCreateChooser = Intent.createChooser(intent, str3);
                                    if (intentCreateChooser.resolveActivity(context.getPackageManager()) != null) {
                                        context.startActivity(intentCreateChooser);
                                    } else {
                                        F4.d.b(context, context.getString(R.string.none_share_app));
                                    }
                                }
                                c7.dismiss();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        h();
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        h();
    }
}
