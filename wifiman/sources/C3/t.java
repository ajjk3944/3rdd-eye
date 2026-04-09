package C3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class t extends AbstractC8026a {

    /* renamed from: a, reason: collision with root package name */
    private final int f2227a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2228b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2229c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2230d;

    /* renamed from: e, reason: collision with root package name */
    private final List f2231e;

    /* renamed from: f, reason: collision with root package name */
    private final t f2232f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2553m f2226g = new C2553m(null);
    public static final Parcelable.Creator<t> CREATOR = new I();

    static {
        Process.myUid();
        Process.myPid();
    }

    public t(int i10, String packageName, String str, String str2, List list, t tVar) {
        AbstractC6492s.i(packageName, "packageName");
        if (tVar != null && tVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f2227a = i10;
        this.f2228b = packageName;
        this.f2229c = str;
        this.f2230d = str2 == null ? tVar != null ? tVar.f2230d : null : str2;
        if (list == null) {
            list = tVar != null ? tVar.f2231e : null;
            if (list == null) {
                list = F.C();
                AbstractC6492s.h(list, "of(...)");
            }
        }
        AbstractC6492s.i(list, "<this>");
        F F10 = F.F(list);
        AbstractC6492s.h(F10, "copyOf(...)");
        this.f2231e = F10;
        this.f2232f = tVar;
    }

    public final boolean b() {
        return this.f2232f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f2227a == tVar.f2227a && AbstractC6492s.d(this.f2228b, tVar.f2228b) && AbstractC6492s.d(this.f2229c, tVar.f2229c) && AbstractC6492s.d(this.f2230d, tVar.f2230d) && AbstractC6492s.d(this.f2232f, tVar.f2232f) && AbstractC6492s.d(this.f2231e, tVar.f2231e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2227a), this.f2228b, this.f2229c, this.f2230d, this.f2232f});
    }

    public final String toString() {
        int length = this.f2228b.length() + 18;
        String str = this.f2229c;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f2227a);
        sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        sb2.append(this.f2228b);
        String str2 = this.f2229c;
        if (str2 != null) {
            sb2.append("[");
            if (kotlin.text.t.P(str2, this.f2228b, false, 2, null)) {
                sb2.append((CharSequence) str2, this.f2228b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f2230d != null) {
            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            String str3 = this.f2230d;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC6492s.i(dest, "dest");
        int i11 = this.f2227a;
        int iA = t3.b.a(dest);
        t3.b.k(dest, 1, i11);
        t3.b.q(dest, 3, this.f2228b, false);
        t3.b.q(dest, 4, this.f2229c, false);
        t3.b.q(dest, 6, this.f2230d, false);
        t3.b.p(dest, 7, this.f2232f, i10, false);
        t3.b.t(dest, 8, this.f2231e, false);
        t3.b.b(dest, iA);
    }
}
