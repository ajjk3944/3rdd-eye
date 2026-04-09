package kg;

import com.liuzh.deviceinfo.utilities.h;
import nk.k;
import yi.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f28288a;

    /* renamed from: b, reason: collision with root package name */
    public long f28289b;

    /* renamed from: c, reason: collision with root package name */
    public final aj.b f28290c;

    /* renamed from: d, reason: collision with root package name */
    public final yi.d f28291d;

    public c(String str, long j, aj.b bVar) {
        k.e(str, "path");
        this.f28288a = str;
        this.f28289b = j;
        this.f28290c = bVar;
        this.f28291d = g.f37630a.h(str);
    }

    @Override // kg.d
    public CharSequence a() {
        return this.f28288a;
    }

    @Override // kg.d
    public /* bridge */ boolean c() {
        return false;
    }

    @Override // kg.d
    public CharSequence name() {
        String name = this.f28291d.getName();
        if (name != null) {
            return name;
        }
        String strA = h.a(this.f28288a);
        k.d(strA, "getFileName(...)");
        return strA;
    }

    @Override // kg.d
    public final String path() {
        return this.f28288a;
    }

    @Override // kg.d
    public long size() {
        if (this.f28289b == -1) {
            this.f28289b = this.f28291d.getLength();
        }
        return Math.max(0L, this.f28289b);
    }
}
