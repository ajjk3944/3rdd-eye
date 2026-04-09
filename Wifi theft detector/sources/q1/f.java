package q1;

import java.io.File;
import u1.c;

/* loaded from: classes.dex */
public class f implements c.InterfaceC0488c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23998a;

    /* renamed from: b, reason: collision with root package name */
    public final File f23999b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0488c f24000c;

    public f(String str, File file, c.InterfaceC0488c interfaceC0488c) {
        this.f23998a = str;
        this.f23999b = file;
        this.f24000c = interfaceC0488c;
    }

    @Override // u1.c.InterfaceC0488c
    public u1.c a(c.b bVar) {
        return new e(bVar.f24488a, this.f23998a, this.f23999b, bVar.f24490c.f24487a, this.f24000c.a(bVar));
    }
}
