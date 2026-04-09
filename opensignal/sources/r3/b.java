package r3;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import br.l;
import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import e3.d;
import oh.p;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: g, reason: collision with root package name */
    public final d f21224g;

    public b(LoadConfigActivity loadConfigActivity) {
        super(8, loadConfigActivity);
        this.f21224g = new d(this, loadConfigActivity);
    }

    @Override // oh.p
    public final void C() {
        LoadConfigActivity loadConfigActivity = (LoadConfigActivity) this.f19481d;
        Resources.Theme theme = loadConfigActivity.getTheme();
        l.d(theme, "activity.theme");
        I(theme, new TypedValue());
        ((ViewGroup) loadConfigActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f21224g);
    }
}
