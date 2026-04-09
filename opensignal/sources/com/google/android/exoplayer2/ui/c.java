package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends View implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4625a;

    /* renamed from: d, reason: collision with root package name */
    public List f4626d;

    /* renamed from: g, reason: collision with root package name */
    public float f4627g;

    /* renamed from: r, reason: collision with root package name */
    public d f4628r;

    /* renamed from: x, reason: collision with root package name */
    public float f4629x;

    public c(Context context, int i10) {
        super(context, null);
        this.f4625a = new ArrayList();
        this.f4626d = Collections.EMPTY_LIST;
        this.f4627g = 0.0533f;
        this.f4628r = d.f4630g;
        this.f4629x = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.a0
    public final void a(List list, d dVar, float f10, float f11) {
        this.f4626d = list;
        this.f4628r = dVar;
        this.f4627g = f10;
        this.f4629x = f11;
        while (true) {
            ArrayList arrayList = this.f4625a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new z(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0467  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
