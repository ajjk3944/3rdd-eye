package on;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lon/h;", "", "value", "<init>", "(Ljava/lang/Object;)V", "", "(Ljava/lang/String;)V", "", "(Z)V", "", "(Ljava/lang/Number;)V", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Companion", "on/g", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final g Companion = new g();
    private final Object value;

    private h(Object obj) {
        this.value = obj;
    }

    /* renamed from: a, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.IntegrationPayload");
        return br.l.a(this.value, ((h) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        this((Object) str);
        br.l.e(str, "value");
    }

    public h(boolean z10) {
        this(Boolean.valueOf(z10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Number number) {
        this((Object) number);
        br.l.e(number, "value");
    }
}
