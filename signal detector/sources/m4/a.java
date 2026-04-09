package m4;

import g4.InterfaceC2336A;
import g4.m;
import g4.p;
import g4.z;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import n4.C2689a;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class a extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final C0112a f21978b = new C0112a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21979a;

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    public class C0112a implements InterfaceC2336A {
        @Override // g4.InterfaceC2336A
        public final z a(m mVar, C2689a c2689a) {
            if (c2689a.f22327a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        Date date;
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        synchronized (this) {
            TimeZone timeZone = this.f21979a.getTimeZone();
            try {
                try {
                    date = new Date(this.f21979a.parse(strZ).getTime());
                } catch (ParseException e6) {
                    throw new p("Failed parsing '" + strZ + "' as SQL Date; at path " + c2762a.n(true), e6);
                }
            } finally {
                this.f21979a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c2764c.o();
            return;
        }
        synchronized (this) {
            str = this.f21979a.format((java.util.Date) date);
        }
        c2764c.w(str);
    }

    private a() {
        this.f21979a = new SimpleDateFormat("MMM d, yyyy");
    }
}
