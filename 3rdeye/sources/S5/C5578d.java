package s5;

import android.content.Context;
import java.util.HashMap;

/* compiled from: ConfigStorageClient.java */
/* renamed from: s5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5578d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f46080c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f46081a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46082b;

    public C5578d(Context context, String str) {
        this.f46081a = context;
        this.f46082b = str;
    }

    public final synchronized void a() {
        this.f46081a.deleteFile(this.f46082b);
    }
}
