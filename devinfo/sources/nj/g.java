package nj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.liuzh.deviceinfo.R;
import nk.k;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f29958b;

    public /* synthetic */ g(Context context, int i4) {
        this.f29957a = i4;
        this.f29958b = context;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f29957a) {
            case 0:
                Toast.makeText(this.f29958b, (String) obj, 0).show();
                break;
            default:
                View view = (View) obj;
                k.e(view, "v");
                TextView textView = (TextView) view.findViewById(R.id.ad_title);
                Context context = this.f29958b;
                textView.setTextColor(cm.g.m(android.R.attr.textColorPrimary, context));
                ((TextView) view.findViewById(R.id.ad_description)).setTextColor(cm.g.m(android.R.attr.textColorSecondary, context));
                view.findViewById(R.id.ad_options_container).setBackgroundColor(context.getColor(R.color.ad_options_bg));
                TextView textView2 = (TextView) view.findViewById(R.id.ad_button);
                textView2.setTextColor(context.getColor(R.color.black_white));
                Drawable background = textView2.getBackground();
                k.d(background, "getBackground(...)");
                textView2.setBackground(wb.e.M(background, context.getColor(R.color.colorPrimarySecondary)));
                view.requestLayout();
                break;
        }
        return u.f37649a;
    }
}
