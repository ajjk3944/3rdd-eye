package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.liuzh.deviceinfo.R;
import e4.n0;
import e4.v0;
import java.util.WeakHashMap;
import p.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends x implements DialogInterface {
    public final d g;

    public e(ContextThemeWrapper contextThemeWrapper, int i4) {
        super(contextThemeWrapper, h(i4, contextThemeWrapper));
        this.g = new d(getContext(), this, getWindow());
    }

    public static int h(int i4, Context context) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i4) {
        d dVar = this.g;
        if (i4 == -3) {
            return dVar.f25265p;
        }
        if (i4 == -2) {
            return dVar.f25262m;
        }
        if (i4 == -1) {
            return dVar.j;
        }
        dVar.getClass();
        return null;
    }

    @Override // i.x, d.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        d dVar = this.g;
        dVar.f25253b.setContentView(dVar.A);
        Context context = dVar.f25252a;
        Window window = dVar.f25254c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = dVar.g;
        if (viewInflate == null) {
            viewInflate = dVar.f25258h != 0 ? LayoutInflater.from(context).inflate(dVar.f25258h, viewGroup, false) : null;
        }
        boolean z3 = viewInflate != null;
        if (!z3 || !d.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (dVar.f25259i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (dVar.f25257f != null) {
                ((LinearLayout.LayoutParams) ((t1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = d.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = d.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = d.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        dVar.f25268s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        dVar.f25268s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        dVar.f25272w = textView;
        if (textView != null) {
            CharSequence charSequence = dVar.f25256e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                dVar.f25268s.removeView(dVar.f25272w);
                if (dVar.f25257f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) dVar.f25268s.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(dVar.f25268s);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(dVar.f25257f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        dVar.j = button;
        aa.j jVar = dVar.G;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(dVar.f25260k)) {
            dVar.j.setVisibility(8);
            i4 = 0;
        } else {
            dVar.j.setText(dVar.f25260k);
            dVar.j.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        dVar.f25262m = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(dVar.f25263n)) {
            dVar.f25262m.setVisibility(8);
        } else {
            dVar.f25262m.setText(dVar.f25263n);
            dVar.f25262m.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        dVar.f25265p = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(dVar.f25266q)) {
            dVar.f25265p.setVisibility(8);
        } else {
            dVar.f25265p.setText(dVar.f25266q);
            dVar.f25265p.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button4 = dVar.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button5 = dVar.f25262m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button6 = dVar.f25265p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (dVar.f25273x != null) {
            viewGroupB.addView(dVar.f25273x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            dVar.f25270u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(dVar.f25255d) || !dVar.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                dVar.f25270u.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                dVar.f25271v = textView2;
                textView2.setText(dVar.f25255d);
                Drawable drawable = dVar.f25269t;
                if (drawable != null) {
                    dVar.f25270u.setImageDrawable(drawable);
                } else {
                    dVar.f25271v.setPadding(dVar.f25270u.getPaddingLeft(), dVar.f25270u.getPaddingTop(), dVar.f25270u.getPaddingRight(), dVar.f25270u.getPaddingBottom());
                    dVar.f25270u.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i10 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupB3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = dVar.f25268s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (dVar.f25256e == null && dVar.f25257f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = dVar.f25257f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z11 || i10 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i10 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f666a, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f667b);
            }
        }
        if (!z10) {
            View view = dVar.f25257f;
            if (view == null) {
                view = dVar.f25268s;
            }
            if (view != null) {
                int i11 = z11 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = v0.f22405a;
                n0.b(view, i10 | i11, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = dVar.f25257f;
        if (alertController$RecycleListView2 == null || (listAdapter = dVar.f25274y) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i12 = dVar.f25275z;
        if (i12 > -1) {
            alertController$RecycleListView2.setItemChecked(i12, true);
            alertController$RecycleListView2.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.f25268s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.f25268s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // i.x, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d dVar = this.g;
        dVar.f25255d = charSequence;
        TextView textView = dVar.f25271v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
