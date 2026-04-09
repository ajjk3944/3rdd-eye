package d1;

import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.mp.PduHandle;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5281a {

    /* renamed from: a, reason: collision with root package name */
    String f45714a;

    /* renamed from: b, reason: collision with root package name */
    private int f45715b;

    /* renamed from: c, reason: collision with root package name */
    private int f45716c;

    /* renamed from: d, reason: collision with root package name */
    private float f45717d;

    /* renamed from: e, reason: collision with root package name */
    private String f45718e;

    /* renamed from: f, reason: collision with root package name */
    boolean f45719f;

    public C5281a(C5281a c5281a) {
        this.f45716c = PduHandle.NONE;
        this.f45717d = Float.NaN;
        this.f45718e = null;
        this.f45714a = c5281a.f45714a;
        this.f45715b = c5281a.f45715b;
        this.f45716c = c5281a.f45716c;
        this.f45717d = c5281a.f45717d;
        this.f45718e = c5281a.f45718e;
        this.f45719f = c5281a.f45719f;
    }

    public static String a(int i10) {
        return MqttTopic.MULTI_LEVEL_WILDCARD + ("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8);
    }

    public C5281a b() {
        return new C5281a(this);
    }

    public boolean c() {
        return this.f45719f;
    }

    public float d() {
        return this.f45717d;
    }

    public int e() {
        return this.f45716c;
    }

    public String f() {
        return this.f45714a;
    }

    public String g() {
        return this.f45718e;
    }

    public int h() {
        return this.f45715b;
    }

    public void i(float f10) {
        this.f45717d = f10;
    }

    public void j(int i10) {
        this.f45716c = i10;
    }

    public String toString() {
        String str = this.f45714a + ':';
        switch (this.f45715b) {
            case 900:
                return str + this.f45716c;
            case 901:
                return str + this.f45717d;
            case 902:
                return str + a(this.f45716c);
            case 903:
                return str + this.f45718e;
            case 904:
                return str + Boolean.valueOf(this.f45719f);
            case 905:
                return str + this.f45717d;
            default:
                return str + "????";
        }
    }

    public C5281a(String str, int i10, int i11) {
        this.f45716c = PduHandle.NONE;
        this.f45717d = Float.NaN;
        this.f45718e = null;
        this.f45714a = str;
        this.f45715b = i10;
        if (i10 == 901) {
            this.f45717d = i11;
        } else {
            this.f45716c = i11;
        }
    }

    public C5281a(String str, int i10, float f10) {
        this.f45716c = PduHandle.NONE;
        this.f45718e = null;
        this.f45714a = str;
        this.f45715b = i10;
        this.f45717d = f10;
    }
}
