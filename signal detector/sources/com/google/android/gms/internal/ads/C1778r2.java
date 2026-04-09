package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778r2 implements Q0, InterfaceC1223gl {

    /* renamed from: c, reason: collision with root package name */
    public static final C1778r2 f16452c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1778r2 f16453d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16454a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16455b;

    static {
        int i = 0;
        f16452c = new C1778r2(i, true);
        f16453d = new C1778r2(i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        InterfaceC1005cl interfaceC1005cl = (InterfaceC1005cl) obj;
        switch (this.f16454a) {
            case 2:
                interfaceC1005cl.x(this.f16455b);
                break;
            default:
                interfaceC1005cl.A(this.f16455b);
                break;
        }
    }

    public String toString() {
        switch (this.f16454a) {
            case 0:
                boolean z6 = !this.f16455b;
                StringBuilder sb = new StringBuilder(String.valueOf(z6).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z6);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1778r2(int i, boolean z6) {
        this.f16454a = i;
        this.f16455b = z6;
    }
}
