package pu;

import br.l;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20644b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f20643a = str;
        this.f20644b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f20643a;
        l.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f20644b);
        return thread;
    }
}
