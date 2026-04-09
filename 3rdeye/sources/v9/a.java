package V9;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13052b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f13051a = str;
        this.f13052b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f13051a;
        l.f(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f13052b);
        return thread;
    }
}
