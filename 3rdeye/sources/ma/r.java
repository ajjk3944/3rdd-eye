package ma;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;
import ra.f;

/* compiled from: ZoneRegion.java */
/* loaded from: classes3.dex */
public final class r extends p {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f44152e = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: c, reason: collision with root package name */
    public final String f44153c;

    /* renamed from: d, reason: collision with root package name */
    public final transient ra.f f44154d;

    public r(String str, ra.f fVar) {
        this.f44153c = str;
        this.f44154d = fVar;
    }

    public static r g(String str, boolean z10) {
        ra.f aVar;
        if (str.length() < 2 || !f44152e.matcher(str).matches()) {
            throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        try {
            aVar = ra.i.a(str, true);
        } catch (ra.g e4) {
            if (str.equals("GMT0")) {
                q qVar = q.f44148g;
                qVar.getClass();
                aVar = new f.a(qVar);
            } else {
                if (z10) {
                    throw e4;
                }
                aVar = null;
            }
        }
        return new r(str, aVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 7, this);
    }

    @Override // ma.p
    public final String b() {
        return this.f44153c;
    }

    @Override // ma.p
    public final ra.f c() {
        ra.f fVar = this.f44154d;
        return fVar != null ? fVar : ra.i.a(this.f44153c, false);
    }

    @Override // ma.p
    public final void f(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f44153c);
    }
}
