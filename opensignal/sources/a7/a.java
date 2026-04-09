package a7;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public float f182i;

    /* renamed from: a, reason: collision with root package name */
    public float f174a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f175b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f176c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f177d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f178e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f179f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f180g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f181h = -1.0f;
    public final c j = new c(0, 0);

    public final void a(ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        int i12 = layoutParams.width;
        c cVar = this.j;
        ((ViewGroup.MarginLayoutParams) cVar).width = i12;
        int i13 = layoutParams.height;
        ((ViewGroup.MarginLayoutParams) cVar).height = i13;
        boolean z10 = false;
        boolean z11 = (cVar.f184b || i12 == 0) && this.f174a < 0.0f;
        if ((cVar.f183a || i13 == 0) && this.f175b < 0.0f) {
            z10 = true;
        }
        float f10 = this.f174a;
        if (f10 >= 0.0f) {
            layoutParams.width = Math.round(i10 * f10);
        }
        float f11 = this.f175b;
        if (f11 >= 0.0f) {
            layoutParams.height = Math.round(i11 * f11);
        }
        float f12 = this.f182i;
        if (f12 >= 0.0f) {
            if (z11) {
                layoutParams.width = Math.round(layoutParams.height * f12);
                cVar.f184b = true;
            }
            if (z10) {
                layoutParams.height = Math.round(layoutParams.width / this.f182i);
                cVar.f183a = true;
            }
        }
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.f174a), Float.valueOf(this.f175b), Float.valueOf(this.f176c), Float.valueOf(this.f177d), Float.valueOf(this.f178e), Float.valueOf(this.f179f), Float.valueOf(this.f180g), Float.valueOf(this.f181h));
    }
}
