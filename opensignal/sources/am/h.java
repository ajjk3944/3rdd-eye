package am;

import android.text.style.ClickableSpan;
import android.view.View;
import com.staircase3.opensignal.activities.SettingsActivity;

/* loaded from: classes.dex */
public final class h extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f871a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f872d;

    public h(h2.l lVar) {
        this.f872d = lVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f871a) {
            case 0:
                br.l.e(view, "widget");
                f fVar = ((i) this.f872d).f874v;
                if (fVar != null) {
                    fVar.g(29072020, SettingsActivity.y(fVar.X(), fVar.g0().f27453i, true));
                    break;
                }
                break;
            default:
                ((h2.l) this.f872d).getClass();
                break;
        }
    }

    public h(i iVar) {
        this.f872d = iVar;
    }
}
