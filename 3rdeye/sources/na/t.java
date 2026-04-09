package na;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Ser.java */
/* loaded from: classes3.dex */
public final class t implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    public byte f44484b;

    /* renamed from: c, reason: collision with root package name */
    public Object f44485c;

    public t() {
    }

    private Object readResolve() {
        return this.f44485c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        Object oVar;
        Object objK0;
        byte b10 = objectInput.readByte();
        this.f44484b = b10;
        switch (b10) {
            case 1:
                ma.e eVar = o.f44470f;
                int i = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                n.f44468e.getClass();
                oVar = new o(ma.e.C0(i, b11, b12));
                objK0 = oVar;
                this.f44485c = objK0;
                return;
            case 2:
                p pVar = p.f44475f;
                objK0 = p.k0(objectInput.readByte());
                this.f44485c = objK0;
                return;
            case 3:
                int[] iArr = j.f44442j;
                int i10 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                i.f44435d.getClass();
                objK0 = i10 >= 1 ? j.D0(k.AH, i10, b13, b14) : j.D0(k.BEFORE_AH, 1 - i10, b13, b14);
                this.f44485c = objK0;
                return;
            case 4:
                objK0 = k.readExternal(objectInput);
                this.f44485c = objK0;
                return;
            case 5:
                int i11 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                q.f44480d.getClass();
                oVar = new r(ma.e.C0(i11 + 1911, b15, b16));
                objK0 = oVar;
                this.f44485c = objK0;
                return;
            case 6:
                objK0 = s.readExternal(objectInput);
                this.f44485c = objK0;
                return;
            case 7:
                int i12 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                u.f44486d.getClass();
                oVar = new v(ma.e.C0(i12 - 543, b17, b18));
                objK0 = oVar;
                this.f44485c = objK0;
                return;
            case 8:
                objK0 = w.readExternal(objectInput);
                this.f44485c = objK0;
                return;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                ConcurrentHashMap<String, g> concurrentHashMap = g.f44433b;
                String utf = objectInput.readUTF();
                ConcurrentHashMap<String, g> concurrentHashMap2 = g.f44433b;
                boolean zIsEmpty = concurrentHashMap2.isEmpty();
                ConcurrentHashMap<String, g> concurrentHashMap3 = g.f44434c;
                if (zIsEmpty) {
                    g.j(l.f44466d);
                    g.j(u.f44486d);
                    g.j(q.f44480d);
                    g.j(n.f44468e);
                    i iVar = i.f44435d;
                    g.j(iVar);
                    concurrentHashMap2.putIfAbsent("Hijrah", iVar);
                    concurrentHashMap3.putIfAbsent("islamic", iVar);
                    try {
                        for (g gVar : Arrays.asList(new g[0])) {
                            concurrentHashMap2.putIfAbsent(gVar.h(), gVar);
                            concurrentHashMap3.putIfAbsent(gVar.g(), gVar);
                        }
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                }
                g gVar2 = concurrentHashMap2.get(utf);
                if (gVar2 == null && (gVar2 = concurrentHashMap3.get(utf)) == null) {
                    throw new ma.a(androidx.work.s.d("Unknown chronology: ", utf));
                }
                objK0 = gVar2;
                this.f44485c = objK0;
                return;
            case 12:
                objK0 = ((b) objectInput.readObject()).i0((ma.g) objectInput.readObject());
                this.f44485c = objK0;
                return;
            case 13:
                objK0 = ((c) objectInput.readObject()).i0((ma.q) objectInput.readObject()).u0((ma.p) objectInput.readObject());
                this.f44485c = objK0;
                return;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f44484b;
        Object obj = this.f44485c;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                o oVar = (o) obj;
                oVar.getClass();
                objectOutput.writeInt(oVar.get(qa.a.YEAR));
                objectOutput.writeByte(oVar.get(qa.a.MONTH_OF_YEAR));
                objectOutput.writeByte(oVar.get(qa.a.DAY_OF_MONTH));
                return;
            case 2:
                objectOutput.writeByte(((p) obj).f44477c);
                return;
            case 3:
                j jVar = (j) obj;
                jVar.getClass();
                objectOutput.writeInt(jVar.get(qa.a.YEAR));
                objectOutput.writeByte(jVar.get(qa.a.MONTH_OF_YEAR));
                objectOutput.writeByte(jVar.get(qa.a.DAY_OF_MONTH));
                return;
            case 4:
                ((k) obj).writeExternal(objectOutput);
                return;
            case 5:
                r rVar = (r) obj;
                rVar.getClass();
                objectOutput.writeInt(rVar.get(qa.a.YEAR));
                objectOutput.writeByte(rVar.get(qa.a.MONTH_OF_YEAR));
                objectOutput.writeByte(rVar.get(qa.a.DAY_OF_MONTH));
                return;
            case 6:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 7:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(vVar.get(qa.a.YEAR));
                objectOutput.writeByte(vVar.get(qa.a.MONTH_OF_YEAR));
                objectOutput.writeByte(vVar.get(qa.a.DAY_OF_MONTH));
                return;
            case 8:
                ((w) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((g) obj).h());
                return;
            case 12:
                d dVar = (d) obj;
                objectOutput.writeObject(dVar.f44425c);
                objectOutput.writeObject(dVar.f44426d);
                return;
            case 13:
                f fVar = (f) obj;
                objectOutput.writeObject(fVar.f44429c);
                objectOutput.writeObject(fVar.f44430d);
                objectOutput.writeObject(fVar.f44431e);
                return;
        }
    }

    public t(byte b10, Object obj) {
        this.f44484b = b10;
        this.f44485c = obj;
    }
}
