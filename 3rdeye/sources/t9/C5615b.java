package t9;

import java.util.Random;
import kotlin.jvm.internal.l;

/* compiled from: PlatformRandom.kt */
/* renamed from: t9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5615b extends AbstractC5614a {

    /* renamed from: d, reason: collision with root package name */
    public final a f46466d = new a();

    /* compiled from: PlatformRandom.kt */
    /* renamed from: t9.b$a */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // t9.AbstractC5614a
    public final Random d() {
        Random random = this.f46466d.get();
        l.e(random, "get(...)");
        return random;
    }
}
