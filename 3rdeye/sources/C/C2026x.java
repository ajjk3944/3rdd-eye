package c;

import android.content.res.Resources;

/* compiled from: EdgeToEdge.kt */
/* renamed from: c.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2026x extends kotlin.jvm.internal.m implements p9.l<Resources, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public static final C2026x f18327g = new C2026x(1);

    @Override // p9.l
    public final Boolean invoke(Resources resources) {
        Resources resources2 = resources;
        kotlin.jvm.internal.l.f(resources2, "resources");
        return Boolean.valueOf((resources2.getConfiguration().uiMode & 48) == 32);
    }
}
