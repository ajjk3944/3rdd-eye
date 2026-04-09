package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.io.File;

/* loaded from: classes3.dex */
public class zm implements Comparable<zm> {

    /* renamed from: b, reason: collision with root package name */
    public final String f36546b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36548d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f36549e;

    /* renamed from: f, reason: collision with root package name */
    public final File f36550f;

    /* renamed from: g, reason: collision with root package name */
    public final long f36551g;

    public zm(String str, long j4, long j10, long j11, File file) {
        this.f36546b = str;
        this.f36547c = j4;
        this.f36548d = j10;
        this.f36549e = file != null;
        this.f36550f = file;
        this.f36551g = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zm zmVar) {
        zm zmVar2 = zmVar;
        if (!this.f36546b.equals(zmVar2.f36546b)) {
            return this.f36546b.compareTo(zmVar2.f36546b);
        }
        long j4 = this.f36547c - zmVar2.f36547c;
        if (j4 == 0) {
            return 0;
        }
        return j4 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f36547c);
        sb.append(", ");
        return C1094a9.f(sb, this.f36548d, "]");
    }
}
