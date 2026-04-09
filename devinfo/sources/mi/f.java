package mi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.liuzh.deviceinfo.view.togglebuttongroup.SingleSelectToggleGroup;
import java.util.ArrayList;
import km.y;
import zf.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f extends a {
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f29394k;

    /* renamed from: l, reason: collision with root package name */
    public y f29395l;

    /* renamed from: m, reason: collision with root package name */
    public d f29396m;

    /* renamed from: n, reason: collision with root package name */
    public final e f29397n;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29382a = true;
        this.f29383b = 0;
        this.f29384c = -65538;
        this.f29385d = 0.0f;
        this.f29386e = 0.0f;
        this.f29387f = false;
        this.g = new ArrayList();
        this.f29388h = new ArrayList();
        this.f29389i = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f38274b, 0, 0);
        try {
            this.f29382a = typedArrayObtainStyledAttributes.getBoolean(4, true);
            try {
                this.f29383b = typedArrayObtainStyledAttributes.getInt(2, 0);
            } catch (NumberFormatException unused) {
                this.f29383b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
            }
            try {
                this.f29384c = typedArrayObtainStyledAttributes.getInt(3, -65538);
            } catch (NumberFormatException unused2) {
                this.f29384c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
            }
            try {
                this.f29385d = typedArrayObtainStyledAttributes.getInt(5, 0);
            } catch (NumberFormatException unused3) {
                this.f29385d = typedArrayObtainStyledAttributes.getDimension(5, TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
            }
            this.f29387f = typedArrayObtainStyledAttributes.getBoolean(6, false);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.g, 0, 0);
            try {
                this.j = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                this.f29394k = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                e eVar = new e((SingleSelectToggleGroup) this, 0);
                this.f29397n = eVar;
                super.setOnHierarchyChangeListener(eVar);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateTracker(ni.b bVar) {
        if (this.f29395l == null) {
            this.f29395l = new y(3, this);
        }
        ((ni.a) bVar).setOnCheckedChangeListener(this.f29395l);
    }

    public abstract void d(View view, boolean z3);

    public final void e(int i4, boolean z3) {
        KeyEvent.Callback callbackFindViewById = findViewById(i4);
        if (callbackFindViewById instanceof Checkable) {
            ((Checkable) callbackFindViewById).setChecked(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f29397n.f29392b = onHierarchyChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateTracker(CompoundButton compoundButton) {
        if (this.f29396m == null) {
            this.f29396m = new d(this);
        }
        compoundButton.setOnCheckedChangeListener(this.f29396m);
    }
}
