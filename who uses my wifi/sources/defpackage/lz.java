package defpackage;

import android.widget.Toast;
import com.phuongpn.whousemywifi.networkscanner.SettingsActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class lz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(bw bwVar) {
        switch (this.a) {
            case 0:
                ((mz) this.b).a(bwVar);
                break;
            default:
                SettingsActivity.a aVar = (SettingsActivity.a) this.b;
                if (bwVar != null) {
                    Toast.makeText(aVar.G(), bwVar.a, 0).show();
                    break;
                }
                break;
        }
    }
}
