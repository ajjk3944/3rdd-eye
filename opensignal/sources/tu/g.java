package tu;

import cv.i;
import cv.z;
import java.util.regex.Pattern;
import ou.e0;
import ou.v;

/* loaded from: classes.dex */
public final class g extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23023a;

    /* renamed from: d, reason: collision with root package name */
    public final long f23024d;

    /* renamed from: g, reason: collision with root package name */
    public final z f23025g;

    public g(String str, long j, z zVar) {
        this.f23023a = str;
        this.f23024d = j;
        this.f23025g = zVar;
    }

    @Override // ou.e0
    public final long b() {
        return this.f23024d;
    }

    @Override // ou.e0
    public final v f() {
        String str = this.f23023a;
        if (str == null) {
            return null;
        }
        Pattern pattern = v.f19976c;
        try {
            return ou.d.e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // ou.e0
    public final i h() {
        return this.f23025g;
    }
}
