package pb;

import java.io.IOException;

/* loaded from: classes.dex */
public class o extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f20396a;

    public o(int i10) {
        this.f20396a = i10;
    }

    public o(Exception exc, int i10) {
        super(exc);
        this.f20396a = i10;
    }

    public o(String str, Exception exc, int i10) {
        super(str, exc);
        this.f20396a = i10;
    }
}
