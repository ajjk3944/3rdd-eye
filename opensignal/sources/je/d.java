package je;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, int i10) {
        super(mVar);
        this.f13619e = i10;
    }

    @Override // je.n
    public void q() {
        switch (this.f13619e) {
            case 0:
                m mVar = this.f13649b;
                mVar.K = null;
                CheckableImageButton checkableImageButton = mVar.B;
                checkableImageButton.setOnLongClickListener(null);
                vc.e.O(checkableImageButton, null);
                break;
        }
    }
}
