package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class dn {

    /* renamed from: a, reason: collision with root package name */
    public final int f26270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26271b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet<dy1> f26272c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f26273d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private iz f26274e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f26275a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26276b;

        public a(long j4, long j10) {
            this.f26275a = j4;
            this.f26276b = j10;
        }
    }

    public dn(int i, String str, iz izVar) {
        this.f26270a = i;
        this.f26271b = str;
        this.f26274e = izVar;
    }

    public final void a(dy1 dy1Var) {
        this.f26272c.add(dy1Var);
    }

    public final dy1 b(long j4, long j10) {
        dy1 dy1VarA = dy1.a(this.f26271b, j4);
        dy1 dy1VarFloor = this.f26272c.floor(dy1VarA);
        if (dy1VarFloor != null && dy1VarFloor.f36547c + dy1VarFloor.f36548d > j4) {
            return dy1VarFloor;
        }
        dy1 dy1VarCeiling = this.f26272c.ceiling(dy1VarA);
        if (dy1VarCeiling != null) {
            long j11 = dy1VarCeiling.f36547c - j4;
            j10 = j10 == -1 ? j11 : Math.min(j11, j10);
        }
        return dy1.a(this.f26271b, j4, j10);
    }

    public final boolean c() {
        return this.f26272c.isEmpty();
    }

    public final boolean d() {
        return this.f26273d.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dn.class == obj.getClass()) {
            dn dnVar = (dn) obj;
            if (this.f26270a == dnVar.f26270a && this.f26271b.equals(dnVar.f26271b) && this.f26272c.equals(dnVar.f26272c) && this.f26274e.equals(dnVar.f26274e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26274e.hashCode() + C4121h3.a(this.f26271b, this.f26270a * 31, 31);
    }

    public final boolean a(yr yrVar) {
        this.f26274e = this.f26274e.a(yrVar);
        return !r2.equals(r0);
    }

    public final boolean c(long j4, long j10) {
        for (int i = 0; i < this.f26273d.size(); i++) {
            a aVar = this.f26273d.get(i);
            long j11 = aVar.f26276b;
            if (j11 == -1) {
                if (j4 >= aVar.f26275a) {
                    return true;
                }
            } else if (j10 == -1) {
                continue;
            } else {
                long j12 = aVar.f26275a;
                if (j12 <= j4 && j4 + j10 <= j12 + j11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j4, long j10) {
        for (int i = 0; i < this.f26273d.size(); i++) {
            a aVar = this.f26273d.get(i);
            long j11 = aVar.f26275a;
            if (j11 <= j4) {
                long j12 = aVar.f26276b;
                if (j12 == -1 || j11 + j12 > j4) {
                    return false;
                }
            } else {
                if (j10 == -1 || j4 + j10 > j11) {
                    return false;
                }
            }
        }
        this.f26273d.add(new a(j4, j10));
        return true;
    }

    public final long a(long j4, long j10) {
        if (j4 < 0) {
            throw new IllegalArgumentException();
        }
        if (j10 >= 0) {
            dy1 dy1VarB = b(j4, j10);
            if (!dy1VarB.f36549e) {
                long j11 = dy1VarB.f36548d;
                return -Math.min(j11 != -1 ? j11 : Long.MAX_VALUE, j10);
            }
            long j12 = j4 + j10;
            long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
            long jMax = dy1VarB.f36547c + dy1VarB.f36548d;
            if (jMax < j13) {
                for (dy1 dy1Var : this.f26272c.tailSet(dy1VarB, false)) {
                    long j14 = dy1Var.f36547c;
                    if (j14 > jMax) {
                        break;
                    }
                    jMax = Math.max(jMax, j14 + dy1Var.f36548d);
                    if (jMax >= j13) {
                        break;
                    }
                }
            }
            return Math.min(jMax - j4, j10);
        }
        throw new IllegalArgumentException();
    }

    public final TreeSet<dy1> b() {
        return this.f26272c;
    }

    public final iz a() {
        return this.f26274e;
    }

    public final boolean a(zm zmVar) {
        if (!this.f26272c.remove(zmVar)) {
            return false;
        }
        File file = zmVar.f36550f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final dy1 a(dy1 dy1Var, long j4, boolean z10) {
        if (this.f26272c.remove(dy1Var)) {
            File file = dy1Var.f36550f;
            file.getClass();
            if (z10) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                long j10 = dy1Var.f36547c;
                int i = this.f26270a;
                int i10 = dy1.f26555k;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(".");
                sb.append(j10);
                sb.append(".");
                File file2 = new File(parentFile, C1094a9.f(sb, j4, ".v3.exo"));
                if (file.renameTo(file2)) {
                    file = file2;
                } else {
                    rs0.d("CachedContent", "Failed to rename " + file + " to " + file2);
                }
            }
            dy1 dy1VarA = dy1Var.a(file, j4);
            this.f26272c.add(dy1VarA);
            return dy1VarA;
        }
        throw new IllegalStateException();
    }

    public final void a(long j4) {
        for (int i = 0; i < this.f26273d.size(); i++) {
            if (this.f26273d.get(i).f26275a == j4) {
                this.f26273d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
