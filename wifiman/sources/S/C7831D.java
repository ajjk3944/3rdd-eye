package s;

import E0.A0;
import E0.B0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: s.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7831D extends e.c implements A0 {

    /* renamed from: p, reason: collision with root package name */
    public static final a f60622p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f60623q = 8;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f60624n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f60625o = f60622p;

    /* renamed from: s.D$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7831D(InterfaceC6835l interfaceC6835l) {
        this.f60624n = interfaceC6835l;
    }

    public final void D2(C0.r rVar) {
        this.f60624n.invoke(rVar);
        C7831D c7831d = (C7831D) B0.b(this);
        if (c7831d != null) {
            c7831d.D2(rVar);
        }
    }

    @Override // E0.A0
    public Object W() {
        return this.f60625o;
    }
}
