package h;

import R.O;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.apm.insight.R;
import java.util.WeakHashMap;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC2347e extends x implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C2346d f20339f;

    public DialogInterfaceC2347e(Context context, int i) {
        super(context, g(context, i));
        this.f20339f = new C2346d(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.x, c.DialogC0390o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C2346d c2346d = this.f20339f;
        c2346d.f20318b.setContentView(c2346d.f20332q);
        Context context = c2346d.f20317a;
        Window window = c2346d.f20319c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C2346d.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C2346d.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C2346d.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c2346d.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c2346d.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c2346d.f20328m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c2346d.i.removeView(c2346d.f20328m);
            if (c2346d.f20321e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c2346d.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c2346d.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c2346d.f20321e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c2346d.f20322f = button;
        A3.o oVar = c2346d.f20338w;
        button.setOnClickListener(oVar);
        if (TextUtils.isEmpty(null)) {
            c2346d.f20322f.setVisibility(8);
            i = 0;
        } else {
            c2346d.f20322f.setText((CharSequence) null);
            c2346d.f20322f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c2346d.f20323g = button2;
        button2.setOnClickListener(oVar);
        if (TextUtils.isEmpty(null)) {
            c2346d.f20323g.setVisibility(8);
        } else {
            c2346d.f20323g.setText((CharSequence) null);
            c2346d.f20323g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c2346d.f20324h = button3;
        button3.setOnClickListener(oVar);
        if (TextUtils.isEmpty(null)) {
            c2346d.f20324h.setVisibility(8);
        } else {
            c2346d.f20324h.setText((CharSequence) null);
            c2346d.f20324h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c2346d.f20322f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c2346d.f20323g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c2346d.f20324h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c2346d.f20329n != null) {
            viewGroupA.addView(c2346d.f20329n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c2346d.f20326k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c2346d.f20320d) || !c2346d.f20336u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c2346d.f20326k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c2346d.f20327l = textView2;
                textView2.setText(c2346d.f20320d);
                Drawable drawable = c2346d.f20325j;
                if (drawable != null) {
                    c2346d.f20326k.setImageDrawable(drawable);
                } else {
                    c2346d.f20327l.setPadding(c2346d.f20326k.getPaddingLeft(), c2346d.f20326k.getPaddingTop(), c2346d.f20326k.getPaddingRight(), c2346d.f20326k.getPaddingBottom());
                    c2346d.f20326k.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z7 = viewGroupA3.getVisibility() != 8;
        if (!z7 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c2346d.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c2346d.f20321e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c2346d.f20321e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z7 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4757a, alertController$RecycleListView.getPaddingRight(), z7 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4758b);
            }
        }
        if (!z6) {
            View view = c2346d.f20321e;
            if (view == null) {
                view = c2346d.i;
            }
            if (view != null) {
                int i6 = z7 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = O.f3270a;
                R.G.b(view, i3 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c2346d.f20321e;
        if (alertController$RecycleListView2 == null || (listAdapter = c2346d.f20330o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = c2346d.f20331p;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f20339f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f20339f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.x, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C2346d c2346d = this.f20339f;
        c2346d.f20320d = charSequence;
        TextView textView = c2346d.f20327l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
