package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class w extends v {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26235c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: a, reason: collision with root package name */
    public final String f26236a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.zone.f f26237b;

    public static w G(String str) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i4 == 0) && ((cCharAt < '0' || cCharAt > '9' || i4 == 0) && ((cCharAt != '~' || i4 == 0) && ((cCharAt != '.' || i4 == 0) && ((cCharAt != '_' || i4 == 0) && ((cCharAt != '+' || i4 == 0) && (cCharAt != '-' || i4 == 0))))))))) {
                    throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g unused) {
                fVarA = null;
            }
            return new w(str, fVarA);
        }
        throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public w(String str, j$.time.zone.f fVar) {
        this.f26236a = str;
        this.f26237b = fVar;
    }

    @Override // j$.time.v
    public final String h() {
        return this.f26236a;
    }

    @Override // j$.time.v
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f26237b;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f26236a);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.v
    public final void F(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f26236a);
    }
}
