package Y0;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import r.BinderC2862e;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4240b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4241c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4242d;

    public /* synthetic */ g(int i, int i3, Object obj, Object obj2) {
        this.f4239a = i3;
        this.f4241c = obj;
        this.f4242d = obj2;
        this.f4240b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4239a) {
            case 0:
                ((h) this.f4241c).a((Intent) this.f4242d, this.f4240b);
                break;
            case 1:
                ((SystemForegroundService) this.f4242d).f5697e.notify(this.f4240b, (Notification) this.f4241c);
                break;
            case 2:
                ((BottomSheetBehavior) this.f4242d).L((View) this.f4241c, this.f4240b, false);
                break;
            case 3:
                ((TextView) this.f4241c).setTypeface((Typeface) this.f4242d, this.f4240b);
                break;
            default:
                ((BinderC2862e) this.f4242d).f23313b.e(this.f4240b, (Bundle) this.f4241c);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i, Parcelable parcelable, int i3) {
        this.f4239a = i3;
        this.f4242d = obj;
        this.f4240b = i;
        this.f4241c = parcelable;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f4239a = 2;
        this.f4242d = bottomSheetBehavior;
        this.f4241c = view;
        this.f4240b = i;
    }
}
