package rg;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f32942a;

    public b(Context context, String str) {
        super(context);
        this.f32942a = str;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_loading);
        CharSequence charSequence = this.f32942a;
        if (charSequence != null && (!i.H0(charSequence))) {
            ((TextView) findViewById(R.id.msg)).setText(charSequence);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
