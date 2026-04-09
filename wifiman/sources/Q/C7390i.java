package q;

import T.C0;
import T.InterfaceC3543m0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7390i {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.compose.animation.i f58280a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.compose.animation.k f58281b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3543m0 f58282c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7403v f58283d;

    public C7390i(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, float f10, InterfaceC7403v interfaceC7403v) {
        this.f58280a = iVar;
        this.f58281b = kVar;
        this.f58282c = C0.a(f10);
        this.f58283d = interfaceC7403v;
    }

    public final androidx.compose.animation.k a() {
        return this.f58281b;
    }

    public final InterfaceC7403v b() {
        return this.f58283d;
    }

    public final androidx.compose.animation.i c() {
        return this.f58280a;
    }

    public final float d() {
        return this.f58282c.c();
    }

    public /* synthetic */ C7390i(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, float f10, InterfaceC7403v interfaceC7403v, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, kVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : interfaceC7403v);
    }
}
