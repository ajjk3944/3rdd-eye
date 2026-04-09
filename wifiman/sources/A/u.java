package A;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public abstract class u implements B.A {

    /* renamed from: a, reason: collision with root package name */
    private final m f200a;

    /* renamed from: b, reason: collision with root package name */
    private final B.x f201b;

    /* renamed from: c, reason: collision with root package name */
    private final long f202c;

    public /* synthetic */ u(long j10, boolean z10, m mVar, B.x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, mVar, xVar);
    }

    public static /* synthetic */ t e(u uVar, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i11 & 2) != 0) {
            j10 = uVar.f202c;
        }
        return uVar.d(i10, j10);
    }

    public abstract t b(int i10, Object obj, Object obj2, List list, long j10);

    @Override // B.A
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t a(int i10, int i11, int i12, long j10) {
        return d(i10, j10);
    }

    public final t d(int i10, long j10) {
        return b(i10, this.f200a.b(i10), this.f200a.d(i10), this.f201b.M0(i10, j10), j10);
    }

    public final long f() {
        return this.f202c;
    }

    public final androidx.compose.foundation.lazy.layout.c g() {
        return this.f200a.f();
    }

    private u(long j10, boolean z10, m mVar, B.x xVar) {
        this.f200a = mVar;
        this.f201b = xVar;
        this.f202c = Y0.c.b(0, z10 ? Y0.b.l(j10) : Integer.MAX_VALUE, 0, z10 ? MPv3.MAX_MESSAGE_ID : Y0.b.k(j10), 5, null);
    }
}
