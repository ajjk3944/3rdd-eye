package zh;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d4.a {
    @Override // d4.a
    public final void accept(Object obj) {
        TextView textView = (TextView) obj;
        Resources resources = textView.getResources();
        textView.setMinimumWidth(resources.getDimensionPixelSize(R.dimen.afs_md2_popup_min_width));
        textView.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.afs_md2_popup_min_height));
        textView.setMaxWidth(a4.a.m(textView.getContext()) - a4.a.c(resources, 60.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 49;
        layoutParams.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_margin_end));
        textView.setLayoutParams(layoutParams);
        Context context = textView.getContext();
        textView.setBackground(new d(context));
        textView.setElevation(resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_elevation));
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setTextColor(cm.g.l(android.R.attr.textColorPrimaryInverse, context));
        textView.setTextSize(0, resources.getDimensionPixelSize(R.dimen.afs_md2_popup_text_size));
    }
}
