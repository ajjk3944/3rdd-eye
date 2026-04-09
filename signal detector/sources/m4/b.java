package m4;

import g4.InterfaceC2336A;
import g4.m;
import g4.p;
import g4.z;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import n4.C2689a;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class b extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21980b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f21981a;

    public class a implements InterfaceC2336A {
        @Override // g4.InterfaceC2336A
        public final z a(m mVar, C2689a c2689a) {
            if (c2689a.f22327a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i) {
        this();
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        Time time;
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        synchronized (this) {
            TimeZone timeZone = this.f21981a.getTimeZone();
            try {
                try {
                    time = new Time(this.f21981a.parse(strZ).getTime());
                } catch (ParseException e6) {
                    throw new p("Failed parsing '" + strZ + "' as SQL Time; at path " + c2762a.n(true), e6);
                }
            } finally {
                this.f21981a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c2764c.o();
            return;
        }
        synchronized (this) {
            str = this.f21981a.format((Date) time);
        }
        c2764c.w(str);
    }

    private b() {
        this.f21981a = new SimpleDateFormat("hh:mm:ss a");
    }
}
