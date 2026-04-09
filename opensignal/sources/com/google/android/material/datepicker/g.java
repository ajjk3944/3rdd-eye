package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class g extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5598d;

    public /* synthetic */ g(int i10) {
        this.f5598d = i10;
    }

    @Override // u3.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5598d) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        int scrollRange;
        switch (this.f5598d) {
            case 0:
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.j(null);
                break;
            case 1:
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.l(false);
                break;
            case 2:
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.j(null);
                break;
            case 3:
                br.l.e(view, "host");
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.i("android.widget.Button");
                break;
            case 4:
                br.l.e(view, "host");
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f23838a;
                this.f23147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                Object tag = view.getTag(on.r.survicate_accessibility_state_error);
                String str = tag instanceof String ? (String) tag : null;
                if (str != null) {
                    accessibilityNodeInfo.setContentInvalid(true);
                    accessibilityNodeInfo.setError(str);
                    break;
                }
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                br.l.e(view, "host");
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                Object tag2 = view.getTag(on.r.survicate_accessibility_state_expanded);
                Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
                if (bool != null) {
                    cVar.a(bool.booleanValue() ? 524288 : 262144);
                    break;
                }
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                br.l.e(view, "host");
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                cVar.i("android.widget.ProgressBar");
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f23838a;
                this.f23147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setVisibleToUser(false);
                break;
            default:
                this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                cVar.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    cVar.l(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.b(v3.b.f23829i);
                        cVar.b(v3.b.f23831m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.b(v3.b.f23828h);
                        cVar.b(v3.b.f23832n);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f5598d
            switch(r0) {
                case 5: goto La2;
                case 8: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.u(r1, r0, r6)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.u(r1, r0, r6)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        La2:
            java.lang.String r0 = "host"
            br.l.e(r5, r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r6 == r0) goto Lb4
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r6 == r0) goto Lb4
            boolean r5 = super.g(r5, r6, r7)
            goto Lb8
        Lb4:
            r5.performClick()
            r5 = 1
        Lb8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
