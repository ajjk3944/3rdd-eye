package U9;

import X9.f;
import X9.h;
import X9.i;
import X9.k;
import X9.l;
import Y9.l;
import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.N;
import ha.InterfaceC5970a;
import ka.InterfaceC6411a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import q2.InterfaceC7418f;

/* renamed from: U9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3620g extends AbstractC4003a {

    /* renamed from: e, reason: collision with root package name */
    private final com.ui.core.ui.sso.c f22203e;

    /* renamed from: f, reason: collision with root package name */
    private final C3621h f22204f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6411a f22205g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5970a f22206h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6824a f22207i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3620g(com.ui.core.ui.sso.c session, C3621h activityController, InterfaceC6411a vibrator, InterfaceC5970a clipboard, InterfaceC6824a onCreateAccountClicked, InterfaceC7418f owner, Bundle bundle) {
        super(owner, bundle);
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(activityController, "activityController");
        AbstractC6492s.i(vibrator, "vibrator");
        AbstractC6492s.i(clipboard, "clipboard");
        AbstractC6492s.i(onCreateAccountClicked, "onCreateAccountClicked");
        AbstractC6492s.i(owner, "owner");
        this.f22203e = session;
        this.f22204f = activityController;
        this.f22205g = vibrator;
        this.f22206h = clipboard;
        this.f22207i = onCreateAccountClicked;
    }

    @Override // androidx.lifecycle.AbstractC4003a
    protected N f(String key, Class modelClass, androidx.lifecycle.E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(handle, "handle");
        if (modelClass.isAssignableFrom(X9.h.class)) {
            return new X9.h(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(X9.k.class)) {
            return new X9.k(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(X9.f.class)) {
            return new X9.f(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(X9.l.class)) {
            return new X9.l(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(X9.i.class)) {
            return new X9.i(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(Y9.l.class)) {
            return new Y9.l(handle, this.f22203e, this.f22204f, this.f22205g);
        }
        if (modelClass.isAssignableFrom(aa.d.class)) {
            return new aa.f(this.f22203e, this.f22204f);
        }
        if (modelClass.isAssignableFrom(h.a.class)) {
            return new h.a(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(k.a.class)) {
            return new k.a(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(f.a.class)) {
            return new f.a(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(l.a.class)) {
            return new l.a(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(i.a.class)) {
            return new i.a(handle, this.f22203e, this.f22204f, this.f22205g, this.f22206h);
        }
        if (modelClass.isAssignableFrom(l.b.class)) {
            return new l.b(handle, this.f22203e, this.f22204f, this.f22205g);
        }
        if (modelClass.isAssignableFrom(V9.f.class)) {
            return new V9.g(this.f22204f, this.f22207i);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
