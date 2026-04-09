package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xb0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ xb0(cc0 cc0Var, c cVar, int i) {
        this.f = i;
        this.h = cc0Var;
        this.g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f) {
            case 0:
                cc0 cc0Var = (cc0) this.h;
                int iL0 = ((LinearLayoutManager) cc0Var.g0.getLayoutManager()).L0();
                Calendar calendarA = g41.a(((c) this.g).i.f.f);
                calendarA.add(2, iL0 - 1);
                cc0Var.N(new we0(calendarA));
                break;
            case 1:
                cc0 cc0Var2 = (cc0) this.h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) cc0Var2.g0.getLayoutManager();
                View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int iH = viewN0 == null ? -1 : ho0.H(viewN0);
                Calendar calendarA2 = g41.a(((c) this.g).i.f.f);
                calendarA2.add(2, iH + 1);
                cc0Var2.N(new we0(calendarA2));
                break;
            default:
                h21 h21Var = (h21) this.h;
                Window.Callback callback = h21Var.k;
                if (callback != null && h21Var.l) {
                    callback.onMenuItemSelected(0, (s1) this.g);
                    break;
                }
                break;
        }
    }

    public xb0(h21 h21Var) {
        this.f = 2;
        this.h = h21Var;
        Context context = h21Var.a.getContext();
        CharSequence charSequence = h21Var.h;
        s1 s1Var = new s1();
        s1Var.e = 4096;
        s1Var.g = 4096;
        s1Var.l = null;
        s1Var.m = null;
        s1Var.n = false;
        s1Var.o = false;
        s1Var.p = 16;
        s1Var.i = context;
        s1Var.a = charSequence;
        this.g = s1Var;
    }
}
