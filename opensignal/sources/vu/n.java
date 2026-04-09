package vu;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f24020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, q qVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f24019e = i11;
        this.f24020f = qVar;
        this.f24021g = i10;
    }

    @Override // ru.a
    public final long a() {
        switch (this.f24019e) {
            case 0:
                this.f24020f.G.getClass();
                try {
                    this.f24020f.S.y(this.f24021g, c.CANCEL);
                    synchronized (this.f24020f) {
                        this.f24020f.U.remove(Integer.valueOf(this.f24021g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f24020f.G.getClass();
                try {
                    this.f24020f.S.y(this.f24021g, c.CANCEL);
                    synchronized (this.f24020f) {
                        this.f24020f.U.remove(Integer.valueOf(this.f24021g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                this.f24020f.G.getClass();
                synchronized (this.f24020f) {
                    this.f24020f.U.remove(Integer.valueOf(this.f24021g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f24019e = 0;
        this.f24020f = qVar;
        this.f24021g = i10;
    }
}
