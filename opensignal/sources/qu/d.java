package qu;

import br.l;
import cv.f0;
import cv.h0;
import cv.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21071a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f21072b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21073c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21075e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21076f;

    /* renamed from: g, reason: collision with root package name */
    public d8.a f21077g;

    /* renamed from: h, reason: collision with root package name */
    public int f21078h;

    /* renamed from: i, reason: collision with root package name */
    public long f21079i;
    public final /* synthetic */ g j;

    public d(g gVar, String str) {
        l.e(str, "key");
        this.j = gVar;
        this.f21071a = str;
        gVar.getClass();
        this.f21072b = new long[2];
        this.f21073c = new ArrayList();
        this.f21074d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f21073c.add(new File(this.j.f21086a, sb2.toString()));
            sb2.append(".tmp");
            this.f21074d.add(new File(this.j.f21086a, sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [qu.c] */
    public final e a() throws IOException {
        byte[] bArr = pu.b.f20645a;
        if (!this.f21075e) {
            return null;
        }
        g gVar = this.j;
        if (!gVar.G && (this.f21077g != null || this.f21076f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f21072b.clone();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                File file = (File) this.f21073c.get(i10);
                l.e(file, "file");
                Logger logger = u.f6739a;
                cv.c cVar = new cv.c(xu.d.j(file, new FileInputStream(file)), h0.f6707d);
                if (!gVar.G) {
                    this.f21078h++;
                    cVar = new c(cVar, gVar, this);
                }
                arrayList.add(cVar);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pu.b.d((f0) it.next());
                }
                try {
                    gVar.Y(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new e(this.j, this.f21071a, this.f21079i, arrayList, jArr);
    }
}
