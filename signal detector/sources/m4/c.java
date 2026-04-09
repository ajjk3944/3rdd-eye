package m4;

import g4.InterfaceC2336A;
import g4.m;
import g4.z;
import java.sql.Timestamp;
import java.util.Date;
import n4.C2689a;

/* loaded from: classes.dex */
public class c implements InterfaceC2336A {
    @Override // g4.InterfaceC2336A
    public final z a(m mVar, C2689a c2689a) {
        if (c2689a.f22327a != Timestamp.class) {
            return null;
        }
        mVar.getClass();
        return new d(mVar.b(new C2689a(Date.class)));
    }
}
