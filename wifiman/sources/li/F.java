package Li;

import dh.InterfaceC5384i;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final Ni.C f11853a = new Ni.C("NO_VALUE");

    public static final y a(int i10, int i11, Ki.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == Ki.a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = MPv3.MAX_MESSAGE_ID;
            }
            return new E(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ y b(int i10, int i11, Ki.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = Ki.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final InterfaceC3220g e(D d10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == Ki.a.SUSPEND) ? d10 : new Mi.g(d10, interfaceC5384i, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
