package B2;

import android.view.View;

/* compiled from: RecordingFragment.java */
/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f427b;

    public n(l lVar) {
        this.f427b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f427b;
        lVar.f415d.dismiss();
        lVar.c();
    }
}
