package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class f0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    public byte f26064a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26065b;

    public f0() {
    }

    public f0(byte b10, Object obj) {
        this.f26064a = b10;
        this.f26065b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f26064a;
        Object obj = this.f26065b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((a) obj).h());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f26066a);
                objectOutput.writeObject(gVar.f26067b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.f26080a);
                objectOutput.writeObject(lVar.f26081b);
                objectOutput.writeObject(lVar.f26082c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).f26109a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.f26093a);
                objectOutput.writeInt(j$.time.temporal.r.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f26070a.h());
                objectOutput.writeInt(hVar.f26071b);
                objectOutput.writeInt(hVar.f26072c);
                objectOutput.writeInt(hVar.f26073d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objE;
        byte b10 = objectInput.readByte();
        this.f26064a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f26055a;
                objE = j$.com.android.tools.r8.a.E(objectInput.readUTF());
                break;
            case 2:
                objE = ((b) objectInput.readObject()).y((j$.time.i) objectInput.readObject());
                break;
            case 3:
                objE = ((e) objectInput.readObject()).m((ZoneOffset) objectInput.readObject()).r((j$.time.v) objectInput.readObject());
                break;
            case 4:
                j$.time.f fVar = y.f26103d;
                int i4 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                w.f26101c.getClass();
                objE = new y(j$.time.f.K(i4, b11, b12));
                break;
            case 5:
                z zVar = z.f26107d;
                objE = z.q(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i10 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                pVar.getClass();
                objE = new r(pVar, i10, b13, b14);
                break;
            case 7:
                int i11 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                b0.f26058c.getClass();
                objE = new d0(j$.time.f.K(i11 + 1911, b15, b16));
                break;
            case 8:
                int i12 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                h0.f26074c.getClass();
                objE = new j0(j$.time.f.K(i12 - 543, b17, b18));
                break;
            case 9:
                int i13 = h.f26069e;
                objE = new h(j$.com.android.tools.r8.a.E(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f26065b = objE;
    }

    private Object readResolve() {
        return this.f26065b;
    }
}
