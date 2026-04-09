package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import m.j;

/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: b, reason: collision with root package name */
    protected int[] f1332b;

    /* renamed from: c, reason: collision with root package name */
    protected int f1333c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f1334d;

    /* renamed from: e, reason: collision with root package name */
    protected j f1335e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f1336f;

    /* renamed from: g, reason: collision with root package name */
    private String f1337g;

    public a(Context context) throws IllegalAccessException, IllegalArgumentException {
        super(context);
        this.f1332b = new int[32];
        this.f1336f = false;
        this.f1334d = context;
        b(null);
    }

    private void a(String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objC;
        if (str == null || this.f1334d == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = n.b.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = this.f1334d.getResources().getIdentifier(strTrim, "id", this.f1334d.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (objC = ((ConstraintLayout) getParent()).c(0, strTrim)) != null && (objC instanceof Integer)) {
            iIntValue = ((Integer) objC).intValue();
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void setIds(String str) throws IllegalAccessException, IllegalArgumentException {
        if (str == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.c.f2970a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == n.c.f2988j) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1337g = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) throws IllegalAccessException, IllegalArgumentException {
        if (isInEditMode()) {
            setIds(this.f1337g);
        }
        j jVar = this.f1335e;
        if (jVar == null) {
            return;
        }
        jVar.J0();
        for (int i2 = 0; i2 < this.f1333c; i2++) {
            View viewE = constraintLayout.e(this.f1332b[i2]);
            if (viewE != null) {
                this.f1335e.I0(constraintLayout.f(viewE));
            }
        }
    }

    public void f() {
        if (this.f1335e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f1315l0 = this.f1335e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1332b, this.f1333c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f1336f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1333c = 0;
        for (int i2 : iArr) {
            setTag(i2, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        int i3 = this.f1333c + 1;
        int[] iArr = this.f1332b;
        if (i3 > iArr.length) {
            this.f1332b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1332b;
        int i4 = this.f1333c;
        iArr2[i4] = i2;
        this.f1333c = i4 + 1;
    }
}
