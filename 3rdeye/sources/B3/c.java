package B3;

import c5.InterfaceC2067c;

/* compiled from: LogEventDropped.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f470a;

    /* renamed from: b, reason: collision with root package name */
    public final a f471b;

    /* compiled from: LogEventDropped.java */
    public enum a implements InterfaceC2067c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        a(int i) {
            this.number_ = i;
        }

        @Override // c5.InterfaceC2067c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        a aVar = a.REASON_UNKNOWN;
    }

    public c(long j4, a aVar) {
        this.f470a = j4;
        this.f471b = aVar;
    }
}
