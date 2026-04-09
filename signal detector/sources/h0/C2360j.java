package h0;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2360j extends f0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20460a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f20461b;

    public C2360j(EditText editText) {
        this.f20461b = new WeakReference(editText);
    }

    @Override // f0.h
    public void a() {
        switch (this.f20460a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f20461b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // f0.h
    public final void b() {
        switch (this.f20460a) {
            case 0:
                k.a((EditText) this.f20461b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f20461b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    public C2360j(SwitchCompat switchCompat) {
        this.f20461b = new WeakReference(switchCompat);
    }
}
