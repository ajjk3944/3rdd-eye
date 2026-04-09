package x8;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public TextView f24983a;

    public a(Context context) {
        this(context, d.DialogTheme);
    }

    public final void a() {
        setContentView(c.lv_material_loading_dialog);
        this.f24983a = (TextView) findViewById(b.tv_loading);
    }

    public a(Context context, int i10) {
        super(context, i10);
        a();
    }
}
