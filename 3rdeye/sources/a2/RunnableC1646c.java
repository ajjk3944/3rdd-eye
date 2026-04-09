package a2;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import s.BinderC5541e;

/* compiled from: SystemForegroundService.java */
/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1646c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f14107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14108e;

    public /* synthetic */ RunnableC1646c(Object obj, int i, Parcelable parcelable, int i10) {
        this.f14105b = i10;
        this.f14108e = obj;
        this.f14106c = i;
        this.f14107d = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14105b) {
            case 0:
                ((SystemForegroundService) this.f14108e).f16927f.notify(this.f14106c, (Notification) this.f14107d);
                break;
            default:
                ((BinderC5541e) this.f14108e).f45882c.onNavigationEvent(this.f14106c, (Bundle) this.f14107d);
                break;
        }
    }
}
