package j4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import bc.y;

/* loaded from: classes.dex */
public final class i implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f13217a;

    public i(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.o oVar) {
        this.f13217a = oVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(androidx.lifecycle.v vVar) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new y(1), 500L);
        this.f13217a.m1(this);
    }
}
