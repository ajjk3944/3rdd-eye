package qh;

import gh.AbstractC5917b;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7510c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f59421a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC7510c f59422b = AbstractC5917b.f47920a.b();

    /* renamed from: qh.c$a */
    public static final class a extends AbstractC7510c implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // qh.AbstractC7510c
        public float c() {
            return AbstractC7510c.f59422b.c();
        }

        @Override // qh.AbstractC7510c
        public int d() {
            return AbstractC7510c.f59422b.d();
        }

        @Override // qh.AbstractC7510c
        public int g(int i10) {
            return AbstractC7510c.f59422b.g(i10);
        }

        private a() {
        }
    }

    public abstract float c();

    public abstract int d();

    public abstract int g(int i10);
}
