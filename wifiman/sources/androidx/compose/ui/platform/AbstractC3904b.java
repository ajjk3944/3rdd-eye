package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3904b implements InterfaceC3919g {

    /* renamed from: a, reason: collision with root package name */
    protected String f29331a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f29332b = new int[2];

    protected final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f29332b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    protected final String d() {
        String str = this.f29331a;
        if (str != null) {
            return str;
        }
        AbstractC6492s.v("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f29331a = str;
    }
}
