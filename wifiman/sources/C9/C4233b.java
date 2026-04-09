package c9;

import Yg.H;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4233b implements InterfaceC4232a {

    /* renamed from: a, reason: collision with root package name */
    private volatile short f33897a;

    public /* synthetic */ C4233b(short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10);
    }

    @Override // c9.InterfaceC4232a
    public short a() {
        short s10;
        synchronized (this) {
            try {
                s10 = this.f33897a;
            } finally {
                this.f33897a = H.b((short) (this.f33897a + 1));
            }
        }
        return s10;
    }

    @Override // c9.InterfaceC4232a
    public short b() {
        return this.f33897a;
    }

    private C4233b(short s10) {
        this.f33897a = s10;
    }

    public /* synthetic */ C4233b(short s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? (short) 0 : s10, null);
    }
}
