package r7;

import K6.C0713c;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import b9.C1992A;
import c9.C2099t;
import java.util.List;
import o.C5376D;
import o.C5380H;
import r7.k;

/* compiled from: SelectView.kt */
/* loaded from: classes.dex */
public class k extends C5535f {

    /* renamed from: x, reason: collision with root package name */
    public p9.l<? super Integer, C1992A> f45798x;

    /* renamed from: y, reason: collision with root package name */
    public T6.b f45799y;

    /* renamed from: z, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final a f45800z;

    /* compiled from: SelectView.kt */
    public static class a extends C5380H {

        /* renamed from: E, reason: collision with root package name */
        public final Context f45801E;

        /* renamed from: F, reason: collision with root package name */
        public final C0524a f45802F;

        /* compiled from: SelectView.kt */
        /* renamed from: r7.k$a$a, reason: collision with other inner class name */
        public final class C0524a extends BaseAdapter {

            /* renamed from: b, reason: collision with root package name */
            public List<String> f45803b = C2099t.f18581b;

            public C0524a() {
            }

            @Override // android.widget.Adapter
            public final int getCount() {
                return this.f45803b.size();
            }

            @Override // android.widget.Adapter
            public final Object getItem(int i) {
                return this.f45803b.get(i);
            }

            @Override // android.widget.Adapter
            public final long getItemId(int i) {
                return i;
            }

            @Override // android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = view;
                if (view == null) {
                    TextView textView = new TextView(a.this.f45801E, null, R.attr.spinnerDropDownItemStyle);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setSingleLine(true);
                    DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
                    kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, C0713c.C(48, displayMetrics)));
                    textView.setTextAlignment(5);
                    view2 = textView;
                }
                TextView textView2 = (TextView) view2;
                textView2.setText(this.f45803b.get(i));
                return textView2;
            }
        }

        public a(Context context) {
            super(context, null, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.listPopupWindowStyle);
            this.f45801E = context;
            this.f45802F = new C0524a();
        }

        @Override // o.C5380H, n.InterfaceC5344f
        public final void show() {
            if (this.f44534d == null) {
                super.show();
                C5376D c5376d = this.f44534d;
                if (c5376d != null) {
                    c5376d.setChoiceMode(1);
                }
            }
            super.show();
        }
    }

    public k(Context context) {
        super(context, 0);
        setOnClickListener(new D8.e(this, 7));
        final a aVar = new a(context);
        aVar.f44555z = true;
        aVar.f44531A.setFocusable(true);
        aVar.f44545p = this;
        aVar.f44546q = new AdapterView.OnItemClickListener() { // from class: r7.j
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
                k this$0 = this.f45796b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                k.a this_apply = aVar;
                kotlin.jvm.internal.l.f(this_apply, "$this_apply");
                this$0.sendAccessibilityEvent(4);
                p9.l<? super Integer, C1992A> lVar = this$0.f45798x;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i));
                }
                this_apply.dismiss();
            }
        };
        aVar.f44541l = true;
        aVar.f44540k = true;
        aVar.i(new ColorDrawable(-1));
        aVar.o(aVar.f45802F);
        this.f45800z = aVar;
    }

    public final T6.b getFocusTracker() {
        return this.f45799y;
    }

    public final p9.l<Integer, C1992A> getOnItemSelectedListener() {
        return this.f45798x;
    }

    @Override // r7.C5535f, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f45800z;
        if (aVar.f44531A.isShowing()) {
            aVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.l.f(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setCanOpenPopup(true);
        info.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        if (z10) {
            a aVar = this.f45800z;
            if (aVar.f44531A.isShowing()) {
                aVar.show();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        kotlin.jvm.internal.l.f(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i != 0) {
            a aVar = this.f45800z;
            if (aVar.f44531A.isShowing()) {
                aVar.dismiss();
            }
        }
    }

    public final void setFocusTracker(T6.b bVar) {
        this.f45799y = bVar;
    }

    public final void setItems(List<String> items) {
        kotlin.jvm.internal.l.f(items, "items");
        a.C0524a c0524a = this.f45800z.f45802F;
        c0524a.getClass();
        c0524a.f45803b = items;
        c0524a.notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(p9.l<? super Integer, C1992A> lVar) {
        this.f45798x = lVar;
    }
}
