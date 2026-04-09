package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dl extends vs {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl(us usVar, int i) {
        super(usVar);
        this.e = i;
    }

    @Override // defpackage.vs
    public void q() {
        switch (this.e) {
            case 0:
                us usVar = this.b;
                usVar.t = null;
                CheckableImageButton checkableImageButton = usVar.l;
                checkableImageButton.setOnLongClickListener(null);
                bd2.w(checkableImageButton, null);
                break;
        }
    }
}
