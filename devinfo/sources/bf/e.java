package bf;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import de.m;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements g, h {

    /* renamed from: a, reason: collision with root package name */
    public final m f2157a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2158b;

    /* renamed from: c, reason: collision with root package name */
    public final cf.b f2159c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2160d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2161e;

    public e(Context context, String str, Set set, cf.b bVar, Executor executor) {
        this.f2157a = new m(new c(0, context, str));
        this.f2160d = set;
        this.f2161e = executor;
        this.f2159c = bVar;
        this.f2158b = context;
    }

    public final Task a() {
        if (!com.bumptech.glide.f.n(this.f2158b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f2161e, new d(this, 0));
    }

    public final void b() {
        if (this.f2160d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!com.bumptech.glide.f.n(this.f2158b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f2161e, new d(this, 1));
        }
    }
}
