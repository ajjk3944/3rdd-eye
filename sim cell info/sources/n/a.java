package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends androidx.constraintlayout.widget.a {

    /* renamed from: h, reason: collision with root package name */
    private int f2967h;

    /* renamed from: i, reason: collision with root package name */
    private int f2968i;

    /* renamed from: j, reason: collision with root package name */
    private m.b f2969j;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.a
    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        super.b(attributeSet);
        this.f2969j = new m.b();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f2970a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == c.f2984h) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == c.f2982g) {
                    this.f2969j.K0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1335e = this.f2969j;
        f();
    }

    public int getType() {
        return this.f2967h;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f2969j.K0(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.f2967h = r7
            r6.f2968i = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L18
            if (r7 != r2) goto L13
        L10:
            r6.f2968i = r3
            goto L3b
        L13:
            if (r7 != r1) goto L3b
        L15:
            r6.f2968i = r4
            goto L3b
        L18:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L33
            int r7 = r6.f2967h
            if (r7 != r2) goto L30
            goto L15
        L30:
            if (r7 != r1) goto L3b
            goto L10
        L33:
            int r7 = r6.f2967h
            if (r7 != r2) goto L38
            goto L10
        L38:
            if (r7 != r1) goto L3b
            goto L15
        L3b:
            m.b r7 = r6.f2969j
            int r0 = r6.f2968i
            r7.L0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a.setType(int):void");
    }
}
