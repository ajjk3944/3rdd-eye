package m4;

import g4.z;
import java.sql.Timestamp;
import java.util.Date;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final c f21982b = new c();

    /* renamed from: a, reason: collision with root package name */
    public final z f21983a;

    public d(z zVar) {
        this.f21983a = zVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) {
        Date date = (Date) this.f21983a.b(c2762a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) {
        this.f21983a.c(c2764c, (Timestamp) obj);
    }
}
