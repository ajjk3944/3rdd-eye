package x3;

import A2.C0117e;
import R.C0175b;
import android.view.View;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3003h extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3004i f24120f;

    public C3003h(C3004i c3004i, int i, boolean z6) {
        this.f24120f = c3004i;
        this.f24118d = i;
        this.f24119e = z6;
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        this.f3302a.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
        q qVar = this.f24120f.f24124d;
        int i = this.f24118d;
        int i3 = i;
        for (int i6 = 0; i6 < i; i6++) {
            if (qVar.f24148e.getItemViewType(i6) == 2 || qVar.f24148e.getItemViewType(i6) == 3) {
                i3--;
            }
        }
        dVar.j(C0117e.w(this.f24119e, view.isSelected(), i3, 1, 1, 1));
    }
}
