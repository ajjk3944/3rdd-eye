package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import z.AbstractC8697u;

/* renamed from: z.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8702z extends AbstractC8697u {

    /* renamed from: f, reason: collision with root package name */
    public static final a f67030f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final C8702z f67031g = new C8702z(AbstractC8697u.a.Visible, 0, 0, null, null, 30, null);

    /* renamed from: h, reason: collision with root package name */
    private static final C8702z f67032h = new C8702z(AbstractC8697u.a.Clip, 0, 0, null, null, 30, null);

    /* renamed from: z.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8702z a() {
            return C8702z.f67032h;
        }

        private a() {
        }
    }

    /* synthetic */ C8702z(AbstractC8697u.a aVar, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : interfaceC6835l, (i12 & 16) != 0 ? null : interfaceC6835l2);
    }

    private C8702z(AbstractC8697u.a aVar, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        super(aVar, i10, i11, interfaceC6835l, interfaceC6835l2, null);
    }
}
