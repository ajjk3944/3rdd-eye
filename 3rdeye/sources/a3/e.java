package a3;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.ActivityC1762o;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Set<Activity> f14115b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f14116c;

    @Override // a3.f
    public final void a(ActivityC1762o activityC1762o) {
        if (!this.f14116c && this.f14115b.add(activityC1762o)) {
            View decorView = activityC1762o.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}
