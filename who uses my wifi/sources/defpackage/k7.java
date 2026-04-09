package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k7 implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;
    public final Object i;

    public /* synthetic */ k7(Object obj, int i, Parcelable parcelable, int i2) {
        this.f = i2;
        this.i = obj;
        this.g = i;
        this.h = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ((TextView) this.h).setTypeface((Typeface) this.i, this.g);
                break;
            case 1:
                ((BottomSheetBehavior) this.i).L((View) this.h, this.g, false);
                break;
            case 2:
                ((nl) this.i).g.e(this.g, (Bundle) this.h);
                break;
            case 3:
                ((qz0) this.h).b((Intent) this.i, this.g);
                break;
            case 4:
                ((SystemForegroundService) this.i).j.notify(this.g, (Notification) this.h);
                break;
            case 5:
                Iterator it = ((CopyOnWriteArraySet) this.h).iterator();
                while (it.hasNext()) {
                    ks2 ks2Var = (ks2) this.i;
                    ht2 ht2Var = (ht2) it.next();
                    if (!ht2Var.d) {
                        int i = this.g;
                        if (i != -1) {
                            ht2Var.b.e(i);
                        }
                        ht2Var.c = true;
                        ks2Var.mo12c(ht2Var.a);
                    }
                }
                break;
            default:
                ((tp3) this.h).s(this.g, (n70) this.i);
                break;
        }
    }

    public /* synthetic */ k7(Object obj, int i, Object obj2, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
        this.i = obj2;
    }

    public /* synthetic */ k7(Object obj, Object obj2, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.g = i;
    }

    public k7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f = 1;
        this.i = bottomSheetBehavior;
        this.h = view;
        this.g = i;
    }
}
