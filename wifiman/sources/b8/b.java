package B8;

import android.graphics.Bitmap;
import com.ubnt.usurvey.R;
import ec.AbstractC5452a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f1226a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1227b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1228c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f1229d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f1230e;

    public b(int i10, int i11, a topBar, Integer num, Bitmap content) {
        AbstractC6492s.i(topBar, "topBar");
        AbstractC6492s.i(content, "content");
        this.f1226a = i10;
        this.f1227b = i11;
        this.f1228c = topBar;
        this.f1229d = num;
        this.f1230e = content;
    }

    public final Bitmap a() {
        return this.f1230e;
    }

    public final int b() {
        return this.f1227b;
    }

    public final a c() {
        return this.f1228c;
    }

    public final int d() {
        return this.f1226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1226a == bVar.f1226a && this.f1227b == bVar.f1227b && AbstractC6492s.d(this.f1228c, bVar.f1228c) && AbstractC6492s.d(this.f1229d, bVar.f1229d) && AbstractC6492s.d(this.f1230e, bVar.f1230e);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f1226a) * 31) + Integer.hashCode(this.f1227b)) * 31) + this.f1228c.hashCode()) * 31;
        Integer num = this.f1229d;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f1230e.hashCode();
    }

    public String toString() {
        return "Params(width=" + this.f1226a + ", height=" + this.f1227b + ", topBar=" + this.f1228c + ", footer=" + this.f1229d + ", content=" + this.f1230e + ")";
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1231a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5452a f1232b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5452a f1233c;

        public a(int i10, AbstractC5452a title, AbstractC5452a footer) {
            AbstractC6492s.i(title, "title");
            AbstractC6492s.i(footer, "footer");
            this.f1231a = i10;
            this.f1232b = title;
            this.f1233c = footer;
        }

        public final AbstractC5452a a() {
            return this.f1233c;
        }

        public final int b() {
            return this.f1231a;
        }

        public final AbstractC5452a c() {
            return this.f1232b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1231a == aVar.f1231a && AbstractC6492s.d(this.f1232b, aVar.f1232b) && AbstractC6492s.d(this.f1233c, aVar.f1233c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f1231a) * 31) + this.f1232b.hashCode()) * 31) + this.f1233c.hashCode();
        }

        public String toString() {
            return "TopBar(iconRes=" + this.f1231a + ", title=" + this.f1232b + ", footer=" + this.f1233c + ")";
        }

        public /* synthetic */ a(int i10, AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? R.drawable.app_logo_wifiman_256 : i10, (i11 & 2) != 0 ? new AbstractC5452a.C1741a(R.string.app_name, new Object[0]) : abstractC5452a, (i11 & 4) != 0 ? new AbstractC5452a.b("wifiman.com") : abstractC5452a2);
        }
    }

    public /* synthetic */ b(int i10, int i11, a aVar, Integer num, Bitmap bitmap, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1024 : i10, (i12 & 2) != 0 ? 576 : i11, (i12 & 4) != 0 ? new a(0, null, null, 7, null) : aVar, (i12 & 8) != 0 ? null : num, bitmap);
    }
}
