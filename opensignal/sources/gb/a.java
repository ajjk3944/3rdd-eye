package gb;

import java.util.List;

/* loaded from: classes.dex */
public final class a extends eb.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9427n = 1;

    /* renamed from: o, reason: collision with root package name */
    public final Object f9428o;

    public a(List list) {
        super(0);
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f9428o = new j(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // eb.c
    public final eb.e f(byte[] r51, int r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.a.f(byte[], int, boolean):eb.e");
    }

    public a() {
        super(0);
        this.f9428o = new fb.f();
    }
}
