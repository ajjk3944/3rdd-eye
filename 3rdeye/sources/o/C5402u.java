package o;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import java.util.Objects;

/* compiled from: AppCompatSpinner.java */
/* renamed from: o.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5402u extends Spinner {

    /* renamed from: j, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    public static final int[] f44714j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f44715b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f44716c;

    /* renamed from: d, reason: collision with root package name */
    public final C5401t f44717d;

    /* renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f44718e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44719f;

    /* renamed from: g, reason: collision with root package name */
    public final g f44720g;

    /* renamed from: h, reason: collision with root package name */
    public int f44721h;
    public final Rect i;

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C5402u c5402u = C5402u.this;
            if (!c5402u.getInternalPopup().a()) {
                c5402u.f44720g.l(c5402u.getTextDirection(), c5402u.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = c5402u.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$b */
    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$c */
    public class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.app.d f44723b;

        /* renamed from: c, reason: collision with root package name */
        public d f44724c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f44725d;

        public c() {
        }

        @Override // o.C5402u.g
        public final boolean a() {
            androidx.appcompat.app.d dVar = this.f44723b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // o.C5402u.g
        public final Drawable b() {
            return null;
        }

        @Override // o.C5402u.g
        public final int c() {
            return 0;
        }

        @Override // o.C5402u.g
        public final void dismiss() {
            androidx.appcompat.app.d dVar = this.f44723b;
            if (dVar != null) {
                dVar.dismiss();
                this.f44723b = null;
            }
        }

        @Override // o.C5402u.g
        public final void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C5402u.g
        public final CharSequence f() {
            return this.f44725d;
        }

        @Override // o.C5402u.g
        public final void g(CharSequence charSequence) {
            this.f44725d = charSequence;
        }

        @Override // o.C5402u.g
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // o.C5402u.g
        public final void j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C5402u.g
        public final void k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // o.C5402u.g
        public final void l(int i, int i10) {
            if (this.f44724c == null) {
                return;
            }
            C5402u c5402u = C5402u.this;
            d.a aVar = new d.a(c5402u.getPopupContext());
            CharSequence charSequence = this.f44725d;
            AlertController.b bVar = aVar.f14344a;
            if (charSequence != null) {
                bVar.f14317d = charSequence;
            }
            d dVar = this.f44724c;
            int selectedItemPosition = c5402u.getSelectedItemPosition();
            bVar.f14325m = dVar;
            bVar.f14326n = this;
            bVar.f14331s = selectedItemPosition;
            bVar.f14330r = true;
            androidx.appcompat.app.d dVarA = aVar.a();
            this.f44723b = dVarA;
            AlertController.RecycleListView recycleListView = dVarA.f14343g.f14291f;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i10);
            this.f44723b.show();
        }

        @Override // o.C5402u.g
        public final int m() {
            return 0;
        }

        @Override // o.C5402u.g
        public final void o(ListAdapter listAdapter) {
            this.f44724c = (d) listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C5402u c5402u = C5402u.this;
            c5402u.setSelection(i);
            if (c5402u.getOnItemClickListener() != null) {
                c5402u.performItemClick(null, i, this.f44724c.getItemId(i));
            }
            dismiss();
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$d */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public SpinnerAdapter f44727b;

        /* renamed from: c, reason: collision with root package name */
        public ListAdapter f44728c;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f44728c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f44728c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f44727b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$e */
    public class e extends C5380H implements g {

        /* renamed from: E, reason: collision with root package name */
        public CharSequence f44729E;

        /* renamed from: F, reason: collision with root package name */
        public d f44730F;

        /* renamed from: G, reason: collision with root package name */
        public final Rect f44731G;

        /* renamed from: H, reason: collision with root package name */
        public int f44732H;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: o.u$e$a */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
                e eVar = e.this;
                C5402u.this.setSelection(i);
                C5402u c5402u = C5402u.this;
                if (c5402u.getOnItemClickListener() != null) {
                    c5402u.performItemClick(view, i, eVar.f44730F.getItemId(i));
                }
                eVar.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: o.u$e$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                C5402u c5402u = C5402u.this;
                eVar.getClass();
                if (!c5402u.isAttachedToWindow() || !c5402u.getGlobalVisibleRect(eVar.f44731G)) {
                    eVar.dismiss();
                } else {
                    eVar.r();
                    eVar.show();
                }
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: o.u$e$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f44736b;

            public c(b bVar) {
                this.f44736b = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C5402u.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f44736b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f44731G = new Rect();
            this.f44545p = C5402u.this;
            this.f44555z = true;
            this.f44531A.setFocusable(true);
            this.f44546q = new a();
        }

        @Override // o.C5402u.g
        public final CharSequence f() {
            return this.f44729E;
        }

        @Override // o.C5402u.g
        public final void g(CharSequence charSequence) {
            this.f44729E = charSequence;
        }

        @Override // o.C5402u.g
        public final void k(int i) {
            this.f44732H = i;
        }

        @Override // o.C5402u.g
        public final void l(int i, int i10) {
            ViewTreeObserver viewTreeObserver;
            C5396n c5396n = this.f44531A;
            boolean zIsShowing = c5396n.isShowing();
            r();
            this.f44531A.setInputMethodMode(2);
            show();
            C5376D c5376d = this.f44534d;
            c5376d.setChoiceMode(1);
            c5376d.setTextDirection(i);
            c5376d.setTextAlignment(i10);
            C5402u c5402u = C5402u.this;
            int selectedItemPosition = c5402u.getSelectedItemPosition();
            C5376D c5376d2 = this.f44534d;
            if (c5396n.isShowing() && c5376d2 != null) {
                c5376d2.setListSelectionHidden(false);
                c5376d2.setSelection(selectedItemPosition);
                if (c5376d2.getChoiceMode() != 0) {
                    c5376d2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = c5402u.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f44531A.setOnDismissListener(new c(bVar));
        }

        @Override // o.C5380H, o.C5402u.g
        public final void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.f44730F = (d) listAdapter;
        }

        public final void r() {
            int i;
            C5396n c5396n = this.f44531A;
            Drawable background = c5396n.getBackground();
            C5402u c5402u = C5402u.this;
            if (background != null) {
                background.getPadding(c5402u.i);
                boolean z10 = f0.f44665a;
                int layoutDirection = c5402u.getLayoutDirection();
                Rect rect = c5402u.i;
                i = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = c5402u.i;
                rect2.right = 0;
                rect2.left = 0;
                i = 0;
            }
            int paddingLeft = c5402u.getPaddingLeft();
            int paddingRight = c5402u.getPaddingRight();
            int width = c5402u.getWidth();
            int i10 = c5402u.f44721h;
            if (i10 == -2) {
                int iA = c5402u.a(this.f44730F, c5396n.getBackground());
                int i11 = c5402u.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = c5402u.i;
                int i12 = (i11 - rect3.left) - rect3.right;
                if (iA > i12) {
                    iA = i12;
                }
                q(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i10 == -1) {
                q((width - paddingLeft) - paddingRight);
            } else {
                q(i10);
            }
            boolean z11 = f0.f44665a;
            this.f44537g = c5402u.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f44536f) - this.f44732H) + i : paddingLeft + this.f44732H + i;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$f */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f44738b;

        /* compiled from: AppCompatSpinner.java */
        /* renamed from: o.u$f$a */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.f44738b = parcel.readByte() != 0;
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f44738b ? (byte) 1 : (byte) 0);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* renamed from: o.u$g */
    public interface g {
        boolean a();

        Drawable b();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        void g(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i);

        void k(int i);

        void l(int i, int i10);

        int m();

        void o(ListAdapter listAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5402u(android.content.Context r12, android.util.AttributeSet r13, int r14) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.i = r0
            android.content.Context r0 = r11.getContext()
            o.S.a(r11, r0)
            int[] r0 = g.C4353a.f37895u
            o.X r1 = o.X.e(r12, r13, r0, r14)
            o.d r2 = new o.d
            r2.<init>(r11)
            r11.f44715b = r2
            r2 = 4
            android.content.res.TypedArray r3 = r1.f44608b
            r4 = 0
            int r2 = r3.getResourceId(r2, r4)
            if (r2 == 0) goto L30
            m.c r5 = new m.c
            r5.<init>(r12, r2)
            r11.f44716c = r5
            goto L32
        L30:
            r11.f44716c = r12
        L32:
            r2 = -1
            r5 = 0
            int[] r6 = o.C5402u.f44714j     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r14, r4)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            boolean r7 = r6.hasValue(r4)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            if (r7 == 0) goto L4b
            int r2 = r6.getInt(r4, r4)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            goto L4b
        L45:
            r12 = move-exception
            r5 = r6
            goto Lce
        L49:
            r7 = move-exception
            goto L54
        L4b:
            r6.recycle()
            goto L5e
        L4f:
            r12 = move-exception
            goto Lce
        L52:
            r7 = move-exception
            r6 = r5
        L54:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L5e
            goto L4b
        L5e:
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L96
            if (r2 == r7) goto L65
            goto La3
        L65:
            o.u$e r2 = new o.u$e
            android.content.Context r8 = r11.f44716c
            r2.<init>(r8, r13, r14)
            android.content.Context r8 = r11.f44716c
            o.X r0 = o.X.e(r8, r13, r0, r14)
            android.content.res.TypedArray r8 = r0.f44608b
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f44721h = r8
            android.graphics.drawable.Drawable r8 = r0.b(r7)
            r2.i(r8)
            java.lang.String r6 = r3.getString(r6)
            r2.f44729E = r6
            r0.f()
            r11.f44720g = r2
            o.t r0 = new o.t
            r0.<init>(r11, r11, r2)
            r11.f44717d = r0
            goto La3
        L96:
            o.u$c r0 = new o.u$c
            r0.<init>()
            r11.f44720g = r0
            java.lang.String r2 = r3.getString(r6)
            r0.f44725d = r2
        La3:
            java.lang.CharSequence[] r0 = r3.getTextArray(r4)
            if (r0 == 0) goto Lba
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r3, r0)
            r12 = 2131558672(0x7f0d0110, float:1.8742666E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lba:
            r1.f()
            r11.f44719f = r7
            android.widget.SpinnerAdapter r12 = r11.f44718e
            if (r12 == 0) goto Lc8
            r11.setAdapter(r12)
            r11.f44718e = r5
        Lc8:
            o.d r12 = r11.f44715b
            r12.d(r13, r14)
            return
        Lce:
            if (r5 == 0) goto Ld3
            r5.recycle()
        Ld3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5402u.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.i;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            c5386d.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f44720g;
        return gVar != null ? gVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f44720g;
        return gVar != null ? gVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f44720g != null ? this.f44721h : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f44720g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f44720g;
        return gVar != null ? gVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f44716c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f44720g;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f44720g;
        if (gVar == null || !gVar.a()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.f44720g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f44738b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f44720g;
        fVar.f44738b = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5401t c5401t = this.f44717d;
        if (c5401t == null || !c5401t.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.f44720g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        this.f44720g.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.f44720g;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            gVar.k(i);
            gVar.e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.f44720g;
        if (gVar != null) {
            gVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f44720g != null) {
            this.f44721h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f44720g;
        if (gVar != null) {
            gVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(A9.I.w(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f44720g;
        if (gVar != null) {
            gVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f44715b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f44719f) {
            this.f44718e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f44720g;
        if (gVar != null) {
            Context context = this.f44716c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.f44727b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.f44728c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof T) {
                    T t10 = (T) spinnerAdapter;
                    if (t10.getDropDownViewTheme() == null) {
                        t10.A();
                    }
                }
            }
            gVar.o(dVar);
        }
    }
}
