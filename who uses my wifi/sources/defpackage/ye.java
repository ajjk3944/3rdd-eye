package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ye extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public ye(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        bf bfVar = this.a.j;
        if (bfVar != null) {
            bfVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
