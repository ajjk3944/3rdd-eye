package hf;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10664b;

    public k(l lVar, long j) {
        this.f10664b = lVar;
        this.f10663a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f10663a);
        this.f10664b.k.l(bundle);
        return null;
    }
}
