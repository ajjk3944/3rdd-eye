package z;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8697u {

    /* renamed from: a, reason: collision with root package name */
    private final a f66974a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66975b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66976c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f66977d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f66978e;

    /* renamed from: z.u$a */
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    /* renamed from: z.u$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66979a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66979a = iArr;
        }
    }

    public /* synthetic */ AbstractC8697u(a aVar, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, interfaceC6835l, interfaceC6835l2);
    }

    public final void a(C8698v c8698v, List list) {
        InterfaceC6835l interfaceC6835l = this.f66977d;
        InterfaceC6839p interfaceC6839p = interfaceC6835l != null ? (InterfaceC6839p) interfaceC6835l.invoke(c8698v) : null;
        InterfaceC6835l interfaceC6835l2 = this.f66978e;
        InterfaceC6839p interfaceC6839p2 = interfaceC6835l2 != null ? (InterfaceC6839p) interfaceC6835l2.invoke(c8698v) : null;
        int i10 = b.f66979a[this.f66974a.ordinal()];
        if (i10 == 1) {
            if (interfaceC6839p != null) {
                list.add(interfaceC6839p);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (interfaceC6839p != null) {
                list.add(interfaceC6839p);
            }
            if (interfaceC6839p2 != null) {
                list.add(interfaceC6839p2);
            }
        }
    }

    public final C8698v b() {
        return new C8698v(this.f66974a, this.f66975b, this.f66976c);
    }

    private AbstractC8697u(a aVar, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f66974a = aVar;
        this.f66975b = i10;
        this.f66976c = i11;
        this.f66977d = interfaceC6835l;
        this.f66978e = interfaceC6835l2;
    }
}
