package hq;

import br.l;
import java.util.Date;
import kotlin.Metadata;
import ku.k0;
import ku.p0;
import ku.r0;
import ku.y0;
import mu.y;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fBK\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0018\u0010\u0017R*\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0019\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lhq/c;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;Ljava/lang/Number;)V", "", "(Ljava/lang/String;Z)V", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "", "seen1", "", "timestampMs", "throttledToMs", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lku/y0;)V", "Ljava/lang/String;", "getKey$annotations", "()V", "getValue$annotations", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "e", "(Ljava/lang/Long;)V", "getTimestampMs$survicate_sdk_release$annotations", "b", "d", "getThrottledToMs$survicate_sdk_release$annotations", "Companion", "hq/a", "hq/b", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class c {
    public static final b Companion = new b();
    public static final String USER_ID = "user_id";
    public static final String USER_KEY = "user_key";
    public final String key;
    private Long throttledToMs;
    private Long timestampMs;
    public final String value;

    @lq.c
    public /* synthetic */ c(int i10, String str, String str2, Long l10, Long l11, y0 y0Var) {
        if (3 != (i10 & 3)) {
            p0.f(i10, 3, a.f10862a.getDescriptor());
            throw null;
        }
        this.key = str;
        this.value = str2;
        if ((i10 & 4) == 0) {
            this.timestampMs = null;
        } else {
            this.timestampMs = l10;
        }
        if ((i10 & 8) == 0) {
            this.throttledToMs = null;
        } else {
            this.throttledToMs = l11;
        }
    }

    public static final /* synthetic */ void f(c cVar, ju.b bVar, r0 r0Var) {
        y yVar = (y) bVar;
        yVar.x(r0Var, 0, cVar.key);
        yVar.x(r0Var, 1, cVar.value);
        if (yVar.n(r0Var) || cVar.timestampMs != null) {
            yVar.i(r0Var, 2, k0.f14571a, cVar.timestampMs);
        }
        if (!yVar.n(r0Var) && cVar.throttledToMs == null) {
            return;
        }
        yVar.i(r0Var, 3, k0.f14571a, cVar.throttledToMs);
    }

    public final c a() {
        c cVar = new c(this.key, this.value);
        cVar.timestampMs = this.timestampMs;
        cVar.throttledToMs = this.throttledToMs;
        return cVar;
    }

    /* renamed from: b, reason: from getter */
    public final Long getThrottledToMs() {
        return this.throttledToMs;
    }

    /* renamed from: c, reason: from getter */
    public final Long getTimestampMs() {
        return this.timestampMs;
    }

    public final void d(Long l10) {
        this.throttledToMs = l10;
    }

    public final void e(Long l10) {
        this.timestampMs = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.timestampMs, cVar.timestampMs) && l.a(this.throttledToMs, cVar.throttledToMs) && l.a(this.key, cVar.key) && l.a(this.value, cVar.value);
    }

    public final int hashCode() {
        Long l10 = this.timestampMs;
        int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
        Long l11 = this.throttledToMs;
        return this.value.hashCode() + c7.a.g(this.key, (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31, 31);
    }

    public c(String str, String str2) {
        l.e(str, "key");
        this.key = str;
        this.value = str2 == null ? "" : str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, Number number) {
        this(str, number.toString());
        l.e(str, "key");
        l.e(number, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10) {
        this(str, String.valueOf(z10));
        l.e(str, "key");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, Date date) {
        this(str, a.a.H(date));
        l.e(str, "key");
        l.e(date, "value");
    }
}
