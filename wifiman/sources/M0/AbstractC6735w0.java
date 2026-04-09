package m0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6735w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52966b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ColorFilter f52967a;

    /* renamed from: m0.w0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC6735w0 b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = AbstractC6697d0.f52884a.z();
            }
            return aVar.a(j10, i10);
        }

        public final AbstractC6735w0 a(long j10, int i10) {
            return new C6699e0(j10, i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public AbstractC6735w0(ColorFilter colorFilter) {
        this.f52967a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f52967a;
    }
}
