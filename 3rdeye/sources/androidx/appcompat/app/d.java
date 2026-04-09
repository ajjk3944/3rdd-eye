package androidx.appcompat.app;

import L0.I;
import L0.S;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import h.l;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public final class d extends l implements DialogInterface {

    /* renamed from: g, reason: collision with root package name */
    public final AlertController f14343g;

    /* compiled from: AlertDialog.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f14344a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14345b;

        public a(Context context) {
            int iF = d.f(context, 0);
            this.f14344a = new AlertController.b(new ContextThemeWrapper(context, d.f(context, iF)));
            this.f14345b = iF;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v16, types: [android.widget.ListAdapter] */
        /* JADX WARN: Type inference failed for: r1v25, types: [androidx.appcompat.app.a] */
        public final d a() {
            ?? aVar;
            AlertController.b bVar = this.f14344a;
            d dVar = new d(bVar.f14314a, this.f14345b);
            View view = bVar.f14318e;
            AlertController alertController = dVar.f14343g;
            if (view != null) {
                alertController.f14307w = view;
            } else {
                CharSequence charSequence = bVar.f14317d;
                if (charSequence != null) {
                    alertController.f14289d = charSequence;
                    TextView textView = alertController.f14305u;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f14316c;
                if (drawable != null) {
                    alertController.f14303s = drawable;
                    ImageView imageView = alertController.f14304t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f14304t.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f14319f;
            if (charSequence2 != null) {
                alertController.f14290e = charSequence2;
                TextView textView2 = alertController.f14306v;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f14320g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, bVar.f14321h);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, bVar.f14322j);
            }
            if (bVar.f14324l != null || bVar.f14325m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f14315b.inflate(alertController.f14279A, (ViewGroup) null);
                boolean z10 = bVar.f14329q;
                ContextThemeWrapper contextThemeWrapper = bVar.f14314a;
                if (z10) {
                    aVar = new androidx.appcompat.app.a(bVar, contextThemeWrapper, alertController.f14280B, bVar.f14324l, recycleListView);
                } else {
                    int i = bVar.f14330r ? alertController.f14281C : alertController.f14282D;
                    Object obj = bVar.f14325m;
                    Object dVar2 = obj;
                    if (obj == null) {
                        dVar2 = new AlertController.d(contextThemeWrapper, i, R.id.text1, bVar.f14324l);
                    }
                    aVar = dVar2;
                }
                alertController.f14308x = aVar;
                alertController.f14309y = bVar.f14331s;
                if (bVar.f14326n != null) {
                    recycleListView.setOnItemClickListener(new b(bVar, alertController));
                } else if (bVar.f14332t != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, recycleListView, alertController));
                }
                if (bVar.f14330r) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.f14329q) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f14291f = recycleListView;
            }
            View view2 = bVar.f14327o;
            if (view2 != null) {
                alertController.f14292g = view2;
                alertController.f14293h = false;
            }
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            dVar.setOnCancelListener(null);
            dVar.setOnDismissListener(null);
            g gVar = bVar.f14323k;
            if (gVar != null) {
                dVar.setOnKeyListener(gVar);
            }
            return dVar;
        }

        public final void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f14344a;
            bVar.f14320g = charSequence;
            bVar.f14321h = onClickListener;
        }
    }

    public d(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, f(contextThemeWrapper, i));
        this.f14343g = new AlertController(getContext(), this, getWindow());
    }

    public static int f(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.l, c.DialogC2011i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i10;
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f14343g;
        alertController.f14287b.setContentView(alertController.f14310z);
        Window window = alertController.f14288c;
        View viewFindViewById2 = window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.customPanel);
        View view = alertController.f14292g;
        if (view == null) {
            view = null;
        }
        boolean z10 = view != null;
        if (!z10 || !AlertController.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            i = 2;
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f14293h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f14291f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            i = 2;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.scrollView);
        alertController.f14302r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f14302r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        alertController.f14306v = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f14290e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f14302r.removeView(alertController.f14306v);
                if (alertController.f14291f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f14302r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f14302r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f14291f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        alertController.i = button;
        AlertController.a aVar = alertController.f14285G;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f14294j)) {
            alertController.i.setVisibility(8);
            i10 = 0;
        } else {
            alertController.i.setText(alertController.f14294j);
            alertController.i.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        alertController.f14296l = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f14297m)) {
            alertController.f14296l.setVisibility(8);
        } else {
            alertController.f14296l.setText(alertController.f14297m);
            alertController.f14296l.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        alertController.f14299o = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f14300p)) {
            alertController.f14299o.setVisibility(8);
        } else {
            alertController.f14299o.setText(alertController.f14300p);
            alertController.f14299o.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        alertController.f14286a.getTheme().resolveAttribute(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i11 = i;
        } else if (i10 == 1) {
            Button button4 = alertController.i;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i11 = i;
        } else {
            i11 = i;
            if (i10 == i11) {
                Button button5 = alertController.f14296l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = alertController.f14299o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.f14307w != null) {
            viewGroupB.addView(alertController.f14307w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.title_template).setVisibility(8);
        } else {
            alertController.f14304t = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f14289d) || !alertController.f14283E) {
                window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.title_template).setVisibility(8);
                alertController.f14304t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.alertTitle);
                alertController.f14305u = textView2;
                textView2.setText(alertController.f14289d);
                Drawable drawable = alertController.f14303s;
                if (drawable != null) {
                    alertController.f14304t.setImageDrawable(drawable);
                } else {
                    alertController.f14305u.setPadding(alertController.f14304t.getPaddingLeft(), alertController.f14304t.getPaddingTop(), alertController.f14304t.getPaddingRight(), alertController.f14304t.getPaddingBottom());
                    alertController.f14304t.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupB3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupB2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i12 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f14302r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f14290e == null && alertController.f14291f == null) ? null : viewGroupB.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f14291f;
        if (recycleListView != null) {
            recycleListView.getClass();
            if (!z12 || i12 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i12 != 0 ? recycleListView.getPaddingTop() : recycleListView.f14311b, recycleListView.getPaddingRight(), z12 ? recycleListView.getPaddingBottom() : recycleListView.f14312c);
            }
        }
        if (!z11) {
            View view2 = alertController.f14291f;
            if (view2 == null) {
                view2 = alertController.f14302r;
            }
            if (view2 != null) {
                int i13 = i12 | (z12 ? i11 : 0);
                View viewFindViewById11 = window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.scrollIndicatorDown);
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.e.d(view2, i13, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f14291f;
        if (recycleListView2 == null || (listAdapter = alertController.f14308x) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i14 = alertController.f14309y;
        if (i14 > -1) {
            recycleListView2.setItemChecked(i14, true);
            recycleListView2.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f14343g.f14302r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f14343g.f14302r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.l, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f14343g;
        alertController.f14289d = charSequence;
        TextView textView = alertController.f14305u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
