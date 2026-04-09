package qh;

import java.util.Random;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: qh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7509b extends AbstractC7508a {

    /* renamed from: c, reason: collision with root package name */
    private final a f59420c = new a();

    /* renamed from: qh.b$a */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // qh.AbstractC7508a
    public Random h() {
        Object obj = this.f59420c.get();
        AbstractC6492s.h(obj, "get(...)");
        return (Random) obj;
    }
}
