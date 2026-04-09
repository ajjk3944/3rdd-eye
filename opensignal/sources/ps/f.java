package ps;

import br.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends ns.a {

    /* renamed from: g, reason: collision with root package name */
    public static final f f20634g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f20635h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20636f;

    static {
        f fVar = new f(new int[]{1, 8, 0}, false);
        f20634g = fVar;
        int i10 = fVar.f18521c;
        int i11 = fVar.f18520b;
        f20635h = (i11 == 1 && i10 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i11, i10 + 1, 0}, false);
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.e(iArr, "versionArray");
        this.f20636f = z10;
    }

    public final boolean b(f fVar) {
        l.e(fVar, "metadataVersionFromLanguageVersion");
        f fVar2 = f20634g;
        int i10 = this.f18521c;
        int i11 = this.f18520b;
        if (i11 == 2 && i10 == 0 && fVar2.f18520b == 1 && fVar2.f18521c == 8) {
            return true;
        }
        if (!this.f20636f) {
            fVar2 = f20635h;
        }
        int i12 = fVar2.f18520b;
        int i13 = fVar.f18520b;
        if (i12 > i13 || (i12 >= i13 && fVar2.f18521c > fVar.f18521c)) {
            fVar = fVar2;
        }
        boolean z10 = false;
        if ((i11 == 1 && i10 == 0) || i11 == 0) {
            return false;
        }
        int i14 = fVar.f18520b;
        if (i11 > i14 || (i11 >= i14 && i10 > fVar.f18521c)) {
            z10 = true;
        }
        return !z10;
    }
}
