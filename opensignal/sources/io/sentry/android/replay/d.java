package io.sentry.android.replay;

import java.io.File;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final File f11902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11903b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11904c;

    public d(File file, int i10, long j) {
        this.f11902a = file;
        this.f11903b = i10;
        this.f11904c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f11902a, dVar.f11902a) && this.f11903b == dVar.f11903b && this.f11904c == dVar.f11904c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11904c) + c7.a.C(this.f11903b, this.f11902a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeneratedVideo(video=");
        sb2.append(this.f11902a);
        sb2.append(", frameCount=");
        sb2.append(this.f11903b);
        sb2.append(", duration=");
        return w.g.h(sb2, this.f11904c, ')');
    }
}
