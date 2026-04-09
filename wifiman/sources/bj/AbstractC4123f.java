package bj;

import Zg.C3681m;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4123f {

    /* renamed from: a, reason: collision with root package name */
    private final C3681m f33441a = new C3681m();

    /* renamed from: b, reason: collision with root package name */
    private int f33442b;

    protected final void a(char[] array) {
        AbstractC6492s.i(array, "array");
        synchronized (this) {
            try {
                if (this.f33442b + array.length < AbstractC4121d.f33439a) {
                    this.f33442b += array.length;
                    this.f33441a.addLast(array);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f33441a.U0();
            if (cArr != null) {
                this.f33442b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
