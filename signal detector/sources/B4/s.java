package B4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static int f753a;

    public static void a(Context context, View view, String str) {
        q5.i.e(view, "view");
        if (context == null || str == null || str.length() == 0) {
            return;
        }
        PopupWindow popupWindow = new PopupWindow();
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.tip_text_popup, (ViewGroup) null);
        q5.i.d(viewInflate, "inflate(...)");
        popupWindow.setContentView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tip_popup_text);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tip_popup_text);
        if (textView2 != null) {
            textView2.setOnClickListener(new r(popupWindow, context, str));
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAttachedInDecor(true);
        popupWindow.setFocusable(false);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f753a == 0) {
            f753a = context.getResources().getDisplayMetrics().heightPixels;
        }
        if ((view.getHeight() * 2) + iArr[1] < f753a) {
            popupWindow.showAsDropDown(view, 0, 10);
        } else {
            popupWindow.showAtLocation(view, 0, iArr[0], (iArr[1] - view.getHeight()) - 20);
        }
    }
}
