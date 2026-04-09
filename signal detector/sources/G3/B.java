package G3;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class B extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1525b;

    public /* synthetic */ B(int i, Object obj) {
        this.f1524a = i;
        this.f1525b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f1524a) {
            case 0:
                C c6 = (C) this.f1525b;
                if (c6.f1521c != null && !c6.f1522d.isEmpty()) {
                    RectF rectF = c6.f1522d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c6.f1527g);
                    break;
                }
                break;
            case 1:
                Path path = ((D) this.f1525b).f1523e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                    break;
                }
                break;
            default:
                p3.d dVar = ((Chip) this.f1525b).f18247e;
                if (dVar == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    dVar.getOutline(outline);
                    break;
                }
        }
    }
}
