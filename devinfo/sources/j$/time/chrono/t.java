package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final t f26098c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n q(int i4) {
        if (i4 == 0) {
            return u.BCE;
        }
        if (i4 == 1) {
            return u.CE;
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        return j$.time.f.E(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final e u(LocalDateTime localDateTime) {
        return LocalDateTime.D(localDateTime);
    }

    public static boolean j(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
