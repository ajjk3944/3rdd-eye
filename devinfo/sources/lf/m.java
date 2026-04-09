package lf;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f28801c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f28802a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28803b;

    public m(Context context, String str) {
        this.f28802a = context;
        this.f28803b = str;
    }

    public final synchronized void a() {
        this.f28802a.deleteFile(this.f28803b);
    }
}
