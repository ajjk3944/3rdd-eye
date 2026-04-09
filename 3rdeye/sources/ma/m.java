package ma;

import g0.C4356c;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;
import ra.f;

/* compiled from: Ser.java */
/* loaded from: classes3.dex */
public final class m implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    public byte f44134b;

    /* renamed from: c, reason: collision with root package name */
    public Object f44135c;

    public m() {
    }

    public static Serializable a(byte b10, ObjectInput objectInput) throws IOException {
        if (b10 == 64) {
            int i = i.f44117d;
            byte b11 = objectInput.readByte();
            byte b12 = objectInput.readByte();
            h hVarOf = h.of(b11);
            com.google.gson.internal.c.v(hVarOf, "month");
            qa.a.DAY_OF_MONTH.checkValidValue(b12);
            if (b12 <= hVarOf.maxLength()) {
                return new i(hVarOf.getValue(), b12);
            }
            StringBuilder sbJ = C4356c.j(b12, "Illegal value for DayOfMonth field, value ", " is not valid for month ");
            sbJ.append(hVarOf.name());
            throw new a(sbJ.toString());
        }
        switch (b10) {
            case 1:
                c cVar = c.f44087d;
                long j4 = objectInput.readLong();
                long j10 = objectInput.readInt();
                return c.a(com.google.gson.internal.c.p(1000000000, j10), com.google.gson.internal.c.B(j4, com.google.gson.internal.c.o(j10, 1000000000L)));
            case 2:
                d dVar = d.f44090d;
                return d.m0(objectInput.readLong(), objectInput.readInt());
            case 3:
                e eVar = e.f44095f;
                return e.C0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                f fVar = f.f44102e;
                e eVar2 = e.f44095f;
                return f.u0(e.C0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.s0(objectInput));
            case 5:
                return g.s0(objectInput);
            case 6:
                f fVar2 = f.f44102e;
                e eVar3 = e.f44095f;
                f fVarU0 = f.u0(e.C0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.s0(objectInput));
                q qVarL = q.l(objectInput);
                p pVar = (p) a(objectInput.readByte(), objectInput);
                com.google.gson.internal.c.v(pVar, "zone");
                if (!(pVar instanceof q) || qVarL.equals(pVar)) {
                    return new s(fVarU0, pVar, qVarL);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                Pattern pattern = r.f44152e;
                String utf = objectInput.readUTF();
                if (utf.equals("Z") || utf.startsWith("+") || utf.startsWith("-")) {
                    throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(utf));
                }
                if (utf.equals("UTC") || utf.equals("GMT") || utf.equals("UT")) {
                    q qVar = q.f44148g;
                    qVar.getClass();
                    return new r(utf, new f.a(qVar));
                }
                if (utf.startsWith("UTC+") || utf.startsWith("GMT+") || utf.startsWith("UTC-") || utf.startsWith("GMT-")) {
                    q qVarH = q.h(utf.substring(3));
                    if (qVarH.f44150c == 0) {
                        return new r(utf.substring(0, 3), new f.a(qVarH));
                    }
                    return new r(utf.substring(0, 3) + qVarH.f44151d, new f.a(qVarH));
                }
                if (!utf.startsWith("UT+") && !utf.startsWith("UT-")) {
                    return r.g(utf, false);
                }
                q qVarH2 = q.h(utf.substring(2));
                if (qVarH2.f44150c == 0) {
                    return new r("UT", new f.a(qVarH2));
                }
                return new r("UT" + qVarH2.f44151d, new f.a(qVarH2));
            case 8:
                return q.l(objectInput);
            default:
                switch (b10) {
                    case 66:
                        int i10 = k.f44125d;
                        return new k(g.s0(objectInput), q.l(objectInput));
                    case 67:
                        int i11 = n.f44136c;
                        return n.i0(objectInput.readInt());
                    case 68:
                        int i12 = o.f44140d;
                        int i13 = objectInput.readInt();
                        byte b13 = objectInput.readByte();
                        qa.a.YEAR.checkValidValue(i13);
                        qa.a.MONTH_OF_YEAR.checkValidValue(b13);
                        return new o(i13, b13);
                    case 69:
                        int i14 = j.f44121e;
                        e eVar4 = e.f44095f;
                        return new j(f.u0(e.C0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), g.s0(objectInput)), q.l(objectInput));
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f44135c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        this.f44134b = b10;
        this.f44135c = a(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f44134b;
        Object obj = this.f44135c;
        objectOutput.writeByte(b10);
        if (b10 == 64) {
            i iVar = (i) obj;
            objectOutput.writeByte(iVar.f44118b);
            objectOutput.writeByte(iVar.f44119c);
            return;
        }
        switch (b10) {
            case 1:
                c cVar = (c) obj;
                objectOutput.writeLong(cVar.f44088b);
                objectOutput.writeInt(cVar.f44089c);
                return;
            case 2:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f44091b);
                objectOutput.writeInt(dVar.f44092c);
                return;
            case 3:
                e eVar = (e) obj;
                objectOutput.writeInt(eVar.f44097c);
                objectOutput.writeByte(eVar.f44098d);
                objectOutput.writeByte(eVar.f44099e);
                return;
            case 4:
                f fVar = (f) obj;
                e eVar2 = fVar.f44104c;
                objectOutput.writeInt(eVar2.f44097c);
                objectOutput.writeByte(eVar2.f44098d);
                objectOutput.writeByte(eVar2.f44099e);
                fVar.f44105d.x0(objectOutput);
                return;
            case 5:
                ((g) obj).x0(objectOutput);
                return;
            case 6:
                s sVar = (s) obj;
                f fVar2 = sVar.f44155c;
                e eVar3 = fVar2.f44104c;
                objectOutput.writeInt(eVar3.f44097c);
                objectOutput.writeByte(eVar3.f44098d);
                objectOutput.writeByte(eVar3.f44099e);
                fVar2.f44105d.x0(objectOutput);
                sVar.f44156d.m(objectOutput);
                sVar.f44157e.f(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((r) obj).f44153c);
                return;
            case 8:
                ((q) obj).m(objectOutput);
                return;
            default:
                switch (b10) {
                    case 66:
                        k kVar = (k) obj;
                        kVar.f44126b.x0(objectOutput);
                        kVar.f44127c.m(objectOutput);
                        return;
                    case 67:
                        objectOutput.writeInt(((n) obj).f44137b);
                        return;
                    case 68:
                        o oVar = (o) obj;
                        objectOutput.writeInt(oVar.f44141b);
                        objectOutput.writeByte(oVar.f44142c);
                        return;
                    case 69:
                        j jVar = (j) obj;
                        f fVar3 = jVar.f44122c;
                        e eVar4 = fVar3.f44104c;
                        objectOutput.writeInt(eVar4.f44097c);
                        objectOutput.writeByte(eVar4.f44098d);
                        objectOutput.writeByte(eVar4.f44099e);
                        fVar3.f44105d.x0(objectOutput);
                        jVar.f44123d.m(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    public m(byte b10, Object obj) {
        this.f44134b = b10;
        this.f44135c = obj;
    }
}
