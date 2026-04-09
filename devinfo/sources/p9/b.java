package p9;

import java.text.DecimalFormat;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31507a;

    /* renamed from: b, reason: collision with root package name */
    public DecimalFormat f31508b;

    public b() {
        this.f31507a = 1;
        this.f31508b = new DecimalFormat("0.00");
    }

    @Override // p9.d
    public String a(float f10) {
        switch (this.f31507a) {
            case 1:
                String str = this.f31508b.format(Float.valueOf(f10));
                k.d(str, "format(...)");
                return str;
            default:
                return super.a(f10);
        }
    }

    @Override // p9.d
    public final String b(float f10) {
        switch (this.f31507a) {
            case 0:
                return this.f31508b.format(f10);
            default:
                String str = this.f31508b.format(Float.valueOf(f10));
                k.d(str, "format(...)");
                return str;
        }
    }

    public void d(int i4) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f31508b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public b(int i4) {
        this.f31507a = 0;
        d(i4);
    }
}
