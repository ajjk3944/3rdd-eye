package d8;

import cv.w;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7151a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7152b = new long[2];

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7153c = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7154d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public boolean f7155e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7156f;

    /* renamed from: g, reason: collision with root package name */
    public a f7157g;

    /* renamed from: h, reason: collision with root package name */
    public int f7158h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f7159i;

    public b(f fVar, String str) {
        this.f7159i = fVar;
        this.f7151a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f7153c.add(this.f7159i.f7166a.d(sb2.toString()));
            sb2.append(".tmp");
            this.f7154d.add(this.f7159i.f7166a.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f7155e || this.f7157g != null || this.f7156f) {
            return null;
        }
        ArrayList arrayList = this.f7153c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            f fVar = this.f7159i;
            if (i10 >= size) {
                this.f7158h++;
                return new c(fVar, this);
            }
            if (!fVar.L.f((w) arrayList.get(i10))) {
                try {
                    fVar.R(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
