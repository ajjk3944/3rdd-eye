package h4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.o0;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24866c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24867a;

    /* renamed from: b, reason: collision with root package name */
    public c f24868b;

    public d(Context context, List list) {
        super(context);
        this.f24867a = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[LOOP:0: B:6:0x0023->B:26:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.f24867a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lbf
        La:
            h4.g r1 = r13.getOrInstallSystemBarStateMonitor()
            h4.c r2 = new h4.c
            r2.<init>(r1, r0)
            r13.f24868b = r2
            int r0 = r13.getChildCount()
            h4.c r1 = r13.f24868b
            java.util.ArrayList r1 = r1.f24860a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lbf
            h4.c r4 = r13.f24868b
            java.util.ArrayList r4 = r4.f24860a
            java.lang.Object r4 = r4.get(r3)
            h4.a r4 = (h4.a) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            h4.b r7 = r4.f24846b
            int r4 = r4.f24845a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L64
            r8 = 2
            if (r4 == r8) goto L5f
            if (r4 == r9) goto L58
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.f24853b
            r8 = 80
            goto L68
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected side: "
            java.lang.String r1 = je.u.r(r4, r1)
            r0.<init>(r1)
            throw r0
        L58:
            int r4 = r7.f24852a
            r8 = 5
        L5b:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L68
        L5f:
            int r4 = r7.f24853b
            r8 = 48
            goto L68
        L64:
            int r4 = r7.f24852a
            r8 = 3
            goto L5b
        L68:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            v3.b r4 = r7.f24854c
            int r8 = r4.f35793a
            r11.leftMargin = r8
            int r8 = r4.f35794b
            r11.topMargin = r8
            int r8 = r4.f35795c
            r11.rightMargin = r8
            int r4 = r4.f35796d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = h4.d.f24866c
            r4.setTag(r5)
            float r5 = r7.f24857f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.f24858h
            r4.setAlpha(r5)
            boolean r5 = r7.f24855d
            if (r5 == 0) goto L9d
            r9 = r2
        L9d:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.f24856e
            r4.setBackground(r5)
            y4.a r5 = new y4.a
            r5.<init>(r11, r4)
            y4.a r8 = r7.f24859i
            if (r8 != 0) goto Lb7
            r7.f24859i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            r0.<init>(r1)
            throw r0
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.d.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f24866c) {
            c cVar = this.f24868b;
            int childCount = getChildCount() - (cVar != null ? cVar.f24860a.size() : 0);
            if (i4 > childCount || i4 < 0) {
                i4 = childCount;
            }
        }
        super.addView(view, i4, layoutParams);
    }

    public final void b() {
        if (this.f24868b != null) {
            removeViews(getChildCount() - this.f24868b.f24860a.size(), this.f24868b.f24860a.size());
            int size = this.f24868b.f24860a.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((a) this.f24868b.f24860a.get(i4)).f24846b.f24859i = null;
            }
            c cVar = this.f24868b;
            ArrayList arrayList = cVar.f24860a;
            if (!cVar.f24865f) {
                cVar.f24865f = true;
                cVar.f24861b.f24875b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f24849e = null;
                }
                arrayList.clear();
            }
            this.f24868b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24868b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.f24875b.isEmpty()) {
                gVar.f24874a.post(new o0(24, gVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f24867a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
