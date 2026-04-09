package h7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements l7.f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24902a;

    public c(int i4) {
        switch (i4) {
            case 2:
                this.f24902a = new ArrayList();
                break;
            default:
                this.f24902a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.f24902a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            Matrix matrix = r7.j.f32892a;
            if (uVar != null && !uVar.f25010a) {
                r7.j.a(path, uVar.f25013d.l() / 100.0f, uVar.f25014e.l() / 100.0f, uVar.f25015f.l() / 360.0f);
            }
        }
    }

    @Override // l7.f
    public i7.e g() {
        ArrayList arrayList = this.f24902a;
        return ((s7.a) arrayList.get(0)).c() ? new i7.j(1, arrayList) : new i7.m(arrayList);
    }

    @Override // l7.f
    public List h() {
        return this.f24902a;
    }

    @Override // l7.f
    public boolean j() {
        ArrayList arrayList = this.f24902a;
        return arrayList.size() == 1 && ((s7.a) arrayList.get(0)).c();
    }

    public c(ArrayList arrayList) {
        this.f24902a = arrayList;
    }
}
