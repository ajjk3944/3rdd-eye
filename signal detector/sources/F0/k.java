package f0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.InterfaceC0283e;
import androidx.lifecycle.InterfaceC0298u;

/* loaded from: classes.dex */
public final class k implements InterfaceC0283e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0300w f19997a;

    public k(EmojiCompatInitializer emojiCompatInitializer, C0300w c0300w) {
        this.f19997a = c0300w;
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final void a(InterfaceC0298u interfaceC0298u) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC2317b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(), 500L);
        this.f19997a.f(this);
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void b(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void e(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void onDestroy(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void onStart(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void onStop(InterfaceC0298u interfaceC0298u) {
    }
}
