package yi;

import android.content.Context;
import d.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final zi.b f37623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37624b;

    public a(zi.b bVar, String str) {
        k.e(str, "filepath");
        this.f37623a = bVar;
        this.f37624b = str;
    }

    @Override // yi.d
    public final boolean a() {
        zi.b bVar = this.f37623a;
        return bVar != null && bVar.a();
    }

    @Override // yi.d
    public final String b() {
        return this.f37624b;
    }

    @Override // yi.d
    public final boolean c() {
        zi.b bVar = this.f37623a;
        return bVar != null && bVar.c();
    }

    @Override // yi.d
    public final long d() {
        zi.b bVar = this.f37623a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0L;
    }

    @Override // yi.d
    public final boolean e() {
        zi.b bVar = this.f37623a;
        return bVar != null && bVar.e();
    }

    @Override // yi.d
    public final ArrayList f() {
        zi.b bVar;
        zi.b[] bVarArrB;
        if (!isDirectory() || (bVar = this.f37623a) == null || (bVarArrB = bVar.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(bVarArrB.length);
        for (zi.b bVar2 : bVarArrB) {
            arrayList.add(new a(bVar2, h.E(this.f37624b, File.separator, bVar2.getName())));
        }
        return arrayList;
    }

    @Override // yi.d
    public final InputStream g() throws FileNotFoundException {
        zi.b bVar = this.f37623a;
        if (bVar == null) {
            return null;
        }
        try {
            Context context = pk.a.f32022a;
            k.b(context);
            return context.getContentResolver().openInputStream(bVar.f());
        } catch (Exception e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // yi.d
    public final long getLength() {
        zi.b bVar = this.f37623a;
        if (bVar != null) {
            return bVar.getLength();
        }
        return 0L;
    }

    @Override // yi.d
    public final String getName() {
        String name;
        zi.b bVar = this.f37623a;
        return (bVar == null || (name = bVar.getName()) == null) ? "" : name;
    }

    @Override // yi.d
    public final boolean isDirectory() {
        zi.b bVar = this.f37623a;
        return bVar != null && bVar.isDirectory();
    }
}
