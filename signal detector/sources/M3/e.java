package M3;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i) {
        super(pVar);
        this.f2845e = i;
    }

    @Override // M3.q
    public void r() {
        switch (this.f2845e) {
            case 0:
                p pVar = this.f2896b;
                pVar.f2874C = null;
                CheckableImageButton checkableImageButton = pVar.f2888g;
                checkableImageButton.setOnLongClickListener(null);
                com.bumptech.glide.d.V(checkableImageButton, null);
                break;
        }
    }
}
