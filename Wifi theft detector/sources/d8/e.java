package d8;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class e extends r {

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f20808m = new AtomicBoolean(false);

    @Override // androidx.lifecycle.t, androidx.lifecycle.LiveData
    public void k(Object obj) {
        this.f20808m.set(true);
        super.k(obj);
    }
}
