package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gs extends pr {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public gs(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // defpackage.pr
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pr
    public final void b() {
        switch (this.a) {
            case 0:
                hs.a((EditText) this.b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public gs(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
