package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes2.dex */
public final class LogEventDropped {

    /* renamed from: c, reason: collision with root package name */
    public static final LogEventDropped f9744c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f9745a;

    /* renamed from: b, reason: collision with root package name */
    public final Reason f9746b;

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f9755a = 0;

        /* renamed from: b, reason: collision with root package name */
        public Reason f9756b = Reason.REASON_UNKNOWN;

        public LogEventDropped a() {
            return new LogEventDropped(this.f9755a, this.f9756b);
        }

        public a b(long j10) {
            this.f9755a = j10;
            return this;
        }

        public a c(Reason reason) {
            this.f9756b = reason;
            return this;
        }
    }

    public LogEventDropped(long j10, Reason reason) {
        this.f9745a = j10;
        this.f9746b = reason;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9745a;
    }

    public Reason b() {
        return this.f9746b;
    }
}
