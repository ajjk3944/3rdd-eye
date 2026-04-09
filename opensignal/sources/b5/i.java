package b5;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2434d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2435a;

    public i(int i10) {
        this.f2435a = i10;
    }

    public i(Exception exc, int i10) {
        super(exc);
        this.f2435a = i10;
    }

    public i(String str, Exception exc, int i10) {
        super(str, exc);
        this.f2435a = i10;
    }
}
