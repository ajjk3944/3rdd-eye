package s;

import android.os.Handler;
import android.os.Looper;
import b.InterfaceC1808a;

/* compiled from: CustomTabsClient.java */
/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5541e extends InterfaceC1808a.AbstractBinderC0273a {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f45881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5537a f45882c;

    public BinderC5541e(C5537a c5537a) {
        this.f45882c = c5537a;
        attachInterface(this, InterfaceC1808a.f17050j8);
        this.f45881b = new Handler(Looper.getMainLooper());
    }
}
