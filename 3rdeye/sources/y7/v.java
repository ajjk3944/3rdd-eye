package y7;

import K6.C0713c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import h.AbstractC4397a;
import io.appmetrica.analytics.impl.Oo;
import y7.e;

/* compiled from: TabView.java */
/* loaded from: classes.dex */
public final class v extends r7.n {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f48334v = 0;

    /* renamed from: k, reason: collision with root package name */
    public u6.a f48335k;

    /* renamed from: l, reason: collision with root package name */
    public T6.b f48336l;

    /* renamed from: m, reason: collision with root package name */
    public int f48337m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f48338n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f48339o;

    /* renamed from: p, reason: collision with root package name */
    public a f48340p;

    /* renamed from: q, reason: collision with root package name */
    public b f48341q;

    /* renamed from: r, reason: collision with root package name */
    public e.f f48342r;

    /* renamed from: s, reason: collision with root package name */
    public u6.b f48343s;

    /* renamed from: t, reason: collision with root package name */
    public u6.b f48344t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f48345u;

    /* compiled from: TabView.java */
    public interface a {
        int a();
    }

    /* compiled from: TabView.java */
    public interface b {
    }

    public v(Context context) {
        super(context, 0);
        this.f48340p = new Oo(15);
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new u());
    }

    private Typeface getDefaultTypeface() {
        u6.a aVar = this.f48335k;
        if (aVar != null) {
            if (this.f48345u) {
                u6.b bVar = this.f48344t;
                if (bVar != null) {
                    return bVar.getTypeface(aVar);
                }
            } else {
                u6.b bVar2 = this.f48343s;
                if (bVar2 != null) {
                    return bVar2.getTypeface(aVar);
                }
            }
        }
        if (aVar != null) {
            return aVar.getMedium();
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC4397a.c.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC4397a.c.class.getName());
    }

    @Override // r7.n, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        e.f fVar;
        CharSequence transformation;
        TextPaint paint;
        Typeface defaultTypeface;
        TextPaint paint2 = getPaint();
        if (paint2 != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint2.setTypeface(defaultTypeface);
        }
        if (!this.f48339o) {
            super.onMeasure(i, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int iA = this.f48340p.a();
        if (iA > 0 && (mode == 0 || size > iA)) {
            i = View.MeasureSpec.makeMeasureSpec(iA, RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i10);
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (fVar = this.f48342r) == null || (transformation = fVar.f48286a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            transformation = transformationMethod.getTransformation(transformation, this);
        }
        if (transformation == null) {
            return;
        }
        setText(TextUtils.ellipsize(transformation, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i, i10);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        T6.b bVar = this.f48336l;
        if (bVar != null) {
            C0713c.y(this, bVar);
        }
        e.f fVar = this.f48342r;
        if (fVar == null) {
            return zPerformClick;
        }
        e eVar = fVar.f48288c;
        if (eVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        eVar.p(fVar, true);
        return true;
    }

    public void setActiveTypefaceType(u6.b bVar) {
        this.f48344t = bVar;
    }

    public void setBoldTextOnSelection(boolean z10) {
        this.f48338n = z10;
    }

    public void setEllipsizeEnabled(boolean z10) {
        this.f48339o = z10;
        setEllipsize(z10 ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setAlpha(z10 ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(u6.b bVar) {
        this.f48343s = bVar;
    }

    public void setInputFocusTracker(T6.b bVar) {
        this.f48336l = bVar;
    }

    public void setMaxWidthProvider(a aVar) {
        this.f48340p = aVar;
    }

    public void setOnUpdateListener(b bVar) {
        this.f48341q = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        boolean z11 = isSelected() != z10;
        super.setSelected(z10);
        setTypefaceType(z10);
        if (this.f48338n && z11 && !isSelected()) {
            setTextAppearance(getContext(), this.f48337m);
        }
        if (z11 && z10) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTab(e.f fVar) {
        if (fVar != this.f48342r) {
            this.f48342r = fVar;
            setText(fVar == null ? null : fVar.f48286a);
            b bVar = this.f48341q;
            if (bVar != null) {
                ((e) ((D7.c) bVar).f1075c).getClass();
            }
        }
    }

    public void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTypefaceType(boolean z10) {
        boolean z11 = this.f48345u != z10;
        this.f48345u = z10;
        if (z11) {
            requestLayout();
        }
    }
}
