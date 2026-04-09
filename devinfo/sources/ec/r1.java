package ec;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import com.applovin.impl.n9;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23042c;

    /* renamed from: d, reason: collision with root package name */
    public long f23043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23045f;

    public /* synthetic */ r1(Object obj, String str, String str2, Object obj2, long j, int i4) {
        this.f23040a = i4;
        this.f23041b = str;
        this.f23042c = str2;
        this.f23044e = obj2;
        this.f23043d = j;
        this.f23045f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i4;
        char c9;
        BufferedOutputStream bufferedOutputStream;
        OutputStream outputStreamOpenOutputStream;
        Uri uri;
        final ti.l lVar;
        Handler handler;
        int i10;
        int i11;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i12 = this.f23040a;
        Object obj = this.f23044e;
        BufferedInputStream bufferedInputStream3 = null;
        Object obj2 = this.f23041b;
        Object obj3 = this.f23042c;
        Object obj4 = this.f23045f;
        final int i13 = 0;
        switch (i12) {
            case 0:
                String str = (String) obj3;
                u1 u1Var = (u1) obj4;
                String str2 = (String) obj2;
                if (str2 == null) {
                    g4 g4Var = u1Var.f23089a;
                    g4Var.b().B();
                    String str3 = g4Var.G;
                    if (str3 == null || str3.equals(str)) {
                        g4Var.G = str;
                        g4Var.F = null;
                        return;
                    }
                    return;
                }
                y2 y2Var = new y2((String) obj, str2, this.f23043d);
                g4 g4Var2 = u1Var.f23089a;
                g4Var2.b().B();
                String str4 = g4Var2.G;
                if (str4 != null) {
                    str4.equals(str);
                }
                g4Var2.G = str;
                g4Var2.F = y2Var;
                return;
            case 1:
                ((q2) obj4).M(this.f23043d, this.f23044e, (String) obj2, (String) obj3);
                return;
            case 2:
                b3 b3Var = (b3) obj4;
                Bundle bundle = (Bundle) obj2;
                long j = this.f23043d;
                b3Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                l4 l4Var = ((o1) b3Var.f218b).f22956i;
                o1.k(l4Var);
                b3Var.L((y2) obj3, (y2) obj, j, true, l4Var.J("screen_view", bundle, null, false));
                return;
            default:
                Uri uri2 = (Uri) obj4;
                String[] strArr = (String[]) obj;
                final ti.l lVar2 = (ti.l) obj3;
                Handler handler2 = new Handler(Looper.getMainLooper());
                File file = new File((String) obj2);
                if (!file.exists()) {
                    handler2.post(new Runnable() { // from class: ti.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    lVar2.c();
                                    break;
                                default:
                                    lVar2.success();
                                    break;
                            }
                        }
                    });
                    return;
                }
                this.f23043d = file.length();
                int length = strArr == null ? 0 : strArr.length;
                File[] fileArr = new File[length];
                if (strArr != null) {
                    for (int i14 = 0; i14 < strArr.length; i14++) {
                        File file2 = new File(strArr[i14]);
                        fileArr[i14] = file2;
                        this.f23043d = file2.length() + this.f23043d;
                    }
                }
                Context context = pk.a.f32022a;
                nk.k.b(context);
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    handler2.post(new Runnable() { // from class: ti.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    lVar2.c();
                                    break;
                                default:
                                    lVar2.success();
                                    break;
                            }
                        }
                    });
                    return;
                }
                final int i15 = 1;
                try {
                    outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
                    boolean z3 = length > 0;
                    if (z3) {
                        try {
                            PipedOutputStream pipedOutputStream = new PipedOutputStream();
                            new ti.k(this, pipedOutputStream, handler2, file, fileArr).start();
                            bufferedInputStream = new BufferedInputStream(new PipedInputStream(pipedOutputStream));
                        } catch (IOException unused) {
                            bufferedOutputStream = null;
                            i4 = 0;
                            uri = uri2;
                            lVar = lVar2;
                            c9 = 2;
                            handler = handler2;
                            i10 = 3;
                            Closeable[] closeableArr = new Closeable[i10];
                            closeableArr[i4] = bufferedInputStream3;
                            closeableArr[1] = bufferedOutputStream;
                            closeableArr[c9] = outputStreamOpenOutputStream;
                            wd.b.e(closeableArr);
                            try {
                                DocumentsContract.deleteDocument(contentResolver, uri);
                            } catch (Exception unused2) {
                            }
                            final int i16 = i4;
                            handler.post(new Runnable() { // from class: ti.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            lVar.c();
                                            break;
                                        default:
                                            lVar.success();
                                            break;
                                    }
                                }
                            });
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = null;
                            i4 = 0;
                            i11 = 3;
                            c9 = 2;
                            Closeable[] closeableArr2 = new Closeable[i11];
                            closeableArr2[i4] = bufferedInputStream3;
                            closeableArr2[1] = bufferedOutputStream;
                            closeableArr2[c9] = outputStreamOpenOutputStream;
                            wd.b.e(closeableArr2);
                            throw th;
                        }
                    } else {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        } catch (IOException unused3) {
                            i4 = 0;
                            uri = uri2;
                            lVar = lVar2;
                            c9 = 2;
                            handler = handler2;
                            bufferedOutputStream = null;
                            i10 = 3;
                            Closeable[] closeableArr3 = new Closeable[i10];
                            closeableArr3[i4] = bufferedInputStream3;
                            closeableArr3[1] = bufferedOutputStream;
                            closeableArr3[c9] = outputStreamOpenOutputStream;
                            wd.b.e(closeableArr3);
                            DocumentsContract.deleteDocument(contentResolver, uri);
                            final int i162 = i4;
                            handler.post(new Runnable() { // from class: ti.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i162) {
                                        case 0:
                                            lVar.c();
                                            break;
                                        default:
                                            lVar.success();
                                            break;
                                    }
                                }
                            });
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            i4 = 0;
                            c9 = 2;
                            bufferedOutputStream = null;
                            i11 = 3;
                            Closeable[] closeableArr22 = new Closeable[i11];
                            closeableArr22[i4] = bufferedInputStream3;
                            closeableArr22[1] = bufferedOutputStream;
                            closeableArr22[c9] = outputStreamOpenOutputStream;
                            wd.b.e(closeableArr22);
                            throw th;
                        }
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStreamOpenOutputStream);
                        try {
                            byte[] bArr = new byte[524288];
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j8 = 0;
                            while (true) {
                                int i17 = bufferedInputStream.read(bArr);
                                if (i17 == -1) {
                                    BufferedInputStream bufferedInputStream4 = bufferedInputStream;
                                    BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                                    int i18 = i13;
                                    final ti.l lVar3 = lVar2;
                                    bufferedOutputStream3.flush();
                                    handler2.post(new Runnable() { // from class: ti.j
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    lVar3.c();
                                                    break;
                                                default:
                                                    lVar3.success();
                                                    break;
                                            }
                                        }
                                    });
                                    Closeable[] closeableArr4 = new Closeable[3];
                                    closeableArr4[i18] = bufferedInputStream4;
                                    closeableArr4[1] = bufferedOutputStream3;
                                    closeableArr4[2] = outputStreamOpenOutputStream;
                                    wd.b.e(closeableArr4);
                                    return;
                                }
                                if (lVar2.stop()) {
                                    throw new IOException("task stopped");
                                }
                                bufferedOutputStream2.write(bArr, i13, i17);
                                if (!z3) {
                                    i4 = i13;
                                    uri = uri2;
                                    j8 += i17;
                                    try {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        if (jCurrentTimeMillis2 - jCurrentTimeMillis < 1000) {
                                            c9 = 2;
                                            try {
                                                if (j8 != this.f23043d) {
                                                    i13 = i4;
                                                    uri2 = uri;
                                                }
                                            } catch (IOException unused4) {
                                                bufferedInputStream3 = bufferedInputStream;
                                                bufferedOutputStream = bufferedOutputStream2;
                                                lVar = lVar2;
                                                handler = handler2;
                                                i10 = 3;
                                                Closeable[] closeableArr32 = new Closeable[i10];
                                                closeableArr32[i4] = bufferedInputStream3;
                                                closeableArr32[1] = bufferedOutputStream;
                                                closeableArr32[c9] = outputStreamOpenOutputStream;
                                                wd.b.e(closeableArr32);
                                                DocumentsContract.deleteDocument(contentResolver, uri);
                                                final int i1622 = i4;
                                                handler.post(new Runnable() { // from class: ti.j
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        switch (i1622) {
                                                            case 0:
                                                                lVar.c();
                                                                break;
                                                            default:
                                                                lVar.success();
                                                                break;
                                                        }
                                                    }
                                                });
                                                return;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                bufferedInputStream3 = bufferedInputStream;
                                                bufferedOutputStream = bufferedOutputStream2;
                                                i11 = 3;
                                                Closeable[] closeableArr222 = new Closeable[i11];
                                                closeableArr222[i4] = bufferedInputStream3;
                                                closeableArr222[1] = bufferedOutputStream;
                                                closeableArr222[c9] = outputStreamOpenOutputStream;
                                                wd.b.e(closeableArr222);
                                                throw th;
                                            }
                                        } else {
                                            c9 = 2;
                                        }
                                        try {
                                            bufferedInputStream2 = bufferedInputStream;
                                            bufferedOutputStream = bufferedOutputStream2;
                                            lVar = lVar2;
                                            handler = handler2;
                                        } catch (IOException unused5) {
                                            bufferedInputStream2 = bufferedInputStream;
                                            bufferedOutputStream = bufferedOutputStream2;
                                            lVar = lVar2;
                                            handler = handler2;
                                            bufferedInputStream3 = bufferedInputStream2;
                                            i10 = 3;
                                            Closeable[] closeableArr322 = new Closeable[i10];
                                            closeableArr322[i4] = bufferedInputStream3;
                                            closeableArr322[1] = bufferedOutputStream;
                                            closeableArr322[c9] = outputStreamOpenOutputStream;
                                            wd.b.e(closeableArr322);
                                            DocumentsContract.deleteDocument(contentResolver, uri);
                                            final int i16222 = i4;
                                            handler.post(new Runnable() { // from class: ti.j
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i16222) {
                                                        case 0:
                                                            lVar.c();
                                                            break;
                                                        default:
                                                            lVar.success();
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bufferedInputStream2 = bufferedInputStream;
                                            bufferedOutputStream = bufferedOutputStream2;
                                        }
                                        try {
                                            handler.post(new n9(this, lVar, j8, 1));
                                            j8 = j8;
                                            jCurrentTimeMillis = jCurrentTimeMillis2;
                                            handler2 = handler;
                                            bufferedOutputStream2 = bufferedOutputStream;
                                            i13 = i4;
                                            uri2 = uri;
                                            lVar2 = lVar;
                                            bufferedInputStream = bufferedInputStream2;
                                        } catch (IOException unused6) {
                                            bufferedInputStream3 = bufferedInputStream2;
                                            i10 = 3;
                                            Closeable[] closeableArr3222 = new Closeable[i10];
                                            closeableArr3222[i4] = bufferedInputStream3;
                                            closeableArr3222[1] = bufferedOutputStream;
                                            closeableArr3222[c9] = outputStreamOpenOutputStream;
                                            wd.b.e(closeableArr3222);
                                            DocumentsContract.deleteDocument(contentResolver, uri);
                                            final int i162222 = i4;
                                            handler.post(new Runnable() { // from class: ti.j
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i162222) {
                                                        case 0:
                                                            lVar.c();
                                                            break;
                                                        default:
                                                            lVar.success();
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            bufferedInputStream3 = bufferedInputStream2;
                                            i11 = 3;
                                            Closeable[] closeableArr2222 = new Closeable[i11];
                                            closeableArr2222[i4] = bufferedInputStream3;
                                            closeableArr2222[1] = bufferedOutputStream;
                                            closeableArr2222[c9] = outputStreamOpenOutputStream;
                                            wd.b.e(closeableArr2222);
                                            throw th;
                                        }
                                    } catch (IOException unused7) {
                                        bufferedInputStream2 = bufferedInputStream;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        lVar = lVar2;
                                        c9 = 2;
                                        handler = handler2;
                                        bufferedInputStream3 = bufferedInputStream2;
                                        i10 = 3;
                                        Closeable[] closeableArr32222 = new Closeable[i10];
                                        closeableArr32222[i4] = bufferedInputStream3;
                                        closeableArr32222[1] = bufferedOutputStream;
                                        closeableArr32222[c9] = outputStreamOpenOutputStream;
                                        wd.b.e(closeableArr32222);
                                        DocumentsContract.deleteDocument(contentResolver, uri);
                                        final int i1622222 = i4;
                                        handler.post(new Runnable() { // from class: ti.j
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i1622222) {
                                                    case 0:
                                                        lVar.c();
                                                        break;
                                                    default:
                                                        lVar.success();
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bufferedInputStream2 = bufferedInputStream;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        c9 = 2;
                                        bufferedInputStream3 = bufferedInputStream2;
                                        i11 = 3;
                                        Closeable[] closeableArr22222 = new Closeable[i11];
                                        closeableArr22222[i4] = bufferedInputStream3;
                                        closeableArr22222[1] = bufferedOutputStream;
                                        closeableArr22222[c9] = outputStreamOpenOutputStream;
                                        wd.b.e(closeableArr22222);
                                        throw th;
                                    }
                                }
                            }
                        } catch (IOException unused8) {
                            bufferedInputStream2 = bufferedInputStream;
                            bufferedOutputStream = bufferedOutputStream2;
                            i4 = i13;
                            uri = uri2;
                        } catch (Throwable th8) {
                            th = th8;
                            bufferedInputStream2 = bufferedInputStream;
                            bufferedOutputStream = bufferedOutputStream2;
                            i4 = i13;
                        }
                    } catch (IOException unused9) {
                        bufferedInputStream2 = bufferedInputStream;
                        i4 = 0;
                        uri = uri2;
                        lVar = lVar2;
                        c9 = 2;
                        handler = handler2;
                        bufferedOutputStream = null;
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream2 = bufferedInputStream;
                        i4 = 0;
                        c9 = 2;
                        bufferedOutputStream = null;
                    }
                } catch (IOException unused10) {
                    i4 = 0;
                    uri = uri2;
                    lVar = lVar2;
                    c9 = 2;
                    handler = handler2;
                    i10 = 3;
                    bufferedOutputStream = null;
                    outputStreamOpenOutputStream = null;
                } catch (Throwable th10) {
                    th = th10;
                    i4 = 0;
                    c9 = 2;
                    bufferedOutputStream = null;
                    outputStreamOpenOutputStream = null;
                }
        }
    }

    public r1(b3 b3Var, Bundle bundle, y2 y2Var, y2 y2Var2, long j) {
        this.f23040a = 2;
        this.f23041b = bundle;
        this.f23042c = y2Var;
        this.f23044e = y2Var2;
        this.f23043d = j;
        Objects.requireNonNull(b3Var);
        this.f23045f = b3Var;
    }

    public r1(String str, ti.l lVar, String[] strArr, Uri uri) {
        this.f23040a = 3;
        this.f23041b = str;
        this.f23042c = lVar;
        this.f23044e = strArr;
        this.f23045f = uri;
    }
}
