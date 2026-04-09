package o9;

import java.util.Random;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b extends o9.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f23702c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // o9.a
    public Random l() {
        Object obj = this.f23702c.get();
        p.d(obj, "get(...)");
        return (Random) obj;
    }
}
