package P6;

/* renamed from: P6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3421i {

    /* renamed from: a, reason: collision with root package name */
    private final int f18075a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18076b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18077c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18078d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18079e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18080f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18081g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f18082h = a();

    public C3421i(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f18075a = i10;
        this.f18076b = i11;
        this.f18077c = i12;
        this.f18078d = i13;
        this.f18079e = i14;
        this.f18080f = i15;
        this.f18081g = i16;
    }

    private int[] a() {
        return new int[]{this.f18075a, this.f18076b, this.f18077c, this.f18078d, this.f18079e, this.f18080f, this.f18081g};
    }

    private static boolean b(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private String d(int i10) {
        if (i10 == this.f18076b) {
            return "READ";
        }
        if (i10 == this.f18078d) {
            return "WRITE";
        }
        if (i10 == this.f18077c) {
            return "WRITE_NO_RESPONSE";
        }
        if (i10 == this.f18081g) {
            return "SIGNED_WRITE";
        }
        if (i10 == this.f18080f) {
            return "INDICATE";
        }
        if (i10 == this.f18075a) {
            return "BROADCAST";
        }
        if (i10 == this.f18079e) {
            return "NOTIFY";
        }
        if (i10 == 0) {
            return "";
        }
        I6.q.d("Unknown property specified (%d)", Integer.valueOf(i10));
        return "UNKNOWN (" + i10 + " -> check android.bluetooth.BluetoothGattCharacteristic)";
    }

    public String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        for (int i11 : this.f18082h) {
            if (b(i10, i11)) {
                sb2.append(d(i11));
                sb2.append(" ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
