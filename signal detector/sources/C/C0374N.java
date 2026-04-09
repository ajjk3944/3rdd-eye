package c;

import android.content.res.Resources;

/* renamed from: c.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374N extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0374N f5814b = new C0374N(1);

    @Override // p5.l
    public final Object f(Object obj) {
        Resources resources = (Resources) obj;
        q5.i.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
