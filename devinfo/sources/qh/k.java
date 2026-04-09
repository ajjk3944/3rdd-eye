package qh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import b5.u0;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f32412b;

    public /* synthetic */ k(KeyEvent.Callback callback, int i4) {
        this.f32411a = i4;
        this.f32412b = callback;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i4 = this.f32411a;
        KeyEvent.Callback callback = this.f32412b;
        switch (i4) {
            case 0:
                int i10 = SettingsActivity.J;
                u.A((TextView) callback, view.getContext());
                break;
            default:
                int i11 = MainActivity.N;
                u0 u0VarS = ((MainActivity) callback).s();
                nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                i7.b.y(u0VarS);
                break;
        }
        return true;
    }
}
