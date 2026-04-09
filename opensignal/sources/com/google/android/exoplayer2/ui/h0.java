package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h0 extends FrameLayout implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f4660a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f4661d;

    /* renamed from: g, reason: collision with root package name */
    public List f4662g;

    /* renamed from: r, reason: collision with root package name */
    public d f4663r;

    /* renamed from: x, reason: collision with root package name */
    public float f4664x;

    /* renamed from: y, reason: collision with root package name */
    public float f4665y;

    public h0(Context context) {
        super(context, null);
        this.f4662g = Collections.EMPTY_LIST;
        this.f4663r = d.f4630g;
        this.f4664x = 0.0533f;
        this.f4665y = 0.08f;
        c cVar = new c(context, 0);
        this.f4660a = cVar;
        f0 f0Var = new f0(context, null);
        this.f4661d = f0Var;
        f0Var.setBackgroundColor(0);
        addView(cVar);
        addView(f0Var);
    }

    @Override // com.google.android.exoplayer2.ui.a0
    public final void a(List list, d dVar, float f10, float f11) {
        this.f4663r = dVar;
        this.f4664x = f10;
        this.f4665y = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            eb.b bVar = (eb.b) list.get(i10);
            if (bVar.f8059d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f4662g.isEmpty() || !arrayList2.isEmpty()) {
            this.f4662g = arrayList2;
            c();
        }
        this.f4660a.a(arrayList, dVar, f10, f11);
        invalidate();
    }

    public final String b(int i10, float f10) {
        float fK = vc.e.K(i10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f10);
        if (fK == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fK / getContext().getResources().getDisplayMetrics().density)};
        int i11 = qb.v.f20828a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x051c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h0.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f4662g.isEmpty()) {
            return;
        }
        c();
    }
}
