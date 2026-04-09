package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class fi1 implements yp3 {
    public static final /* synthetic */ fi1 b = new fi1(0);
    public static final /* synthetic */ fi1 c = new fi1(1);
    public static final /* synthetic */ fi1 d = new fi1(3);
    public static final /* synthetic */ fi1 e = new fi1(4);
    public static final /* synthetic */ fi1 f = new fi1(5);
    public static final /* synthetic */ fi1 g = new fi1(6);
    public static final /* synthetic */ fi1 h = new fi1(7);
    public static final /* synthetic */ fi1 i = new fi1(9);
    public static final /* synthetic */ fi1 j = new fi1(10);
    public static final /* synthetic */ fi1 k = new fi1(11);
    public static final /* synthetic */ fi1 l = new fi1(12);
    public static final /* synthetic */ fi1 m = new fi1(13);
    public static final /* synthetic */ fi1 n = new fi1(14);
    public static final /* synthetic */ fi1 o = new fi1(16);
    public final /* synthetic */ int a;

    public /* synthetic */ fi1(int i2) {
        this.a = i2;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws IOException {
        int i2 = -1;
        String str = "";
        int i3 = 0;
        String str2 = null;
        int i4 = 1;
        switch (this.a) {
            case 0:
                return (n70) ((ki2) obj).b.d();
            case 1:
                Throwable th = (Throwable) obj;
                if (((Boolean) tw1.e.c.a(mz1.jb)).booleanValue()) {
                    hg4.C.h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    hg4.C.h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                vm3 vm3Var = xm3.g;
                return pu1.r(new az(sn3.j));
            case 2:
                gi2.R();
                return lq3.g;
            case 3:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return pu1.B(cause);
            case 4:
                return pu1.B(new hx2(5));
            case 5:
                return pu1.r(((ny2) obj).a);
            case 6:
                return lq3.g;
            case 7:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return pu1.B(cause2);
            case 8:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                md2.a.execute(new sz2((InputStream) obj, parcelFileDescriptorArrCreatePipe[1], 8));
                return pu1.r(parcelFileDescriptor);
            case 9:
                return ((Throwable) obj) instanceof TimeoutException ? pu1.r(new j33(Integer.toString(17), i4)) : pu1.r(new j33(str2, i4));
            case 10:
                return pu1.r(new j33((String) obj, i4));
            case 11:
                h8 h8Var = (h8) obj;
                return h8Var == null ? pu1.r(new t33(str2, i2, i3)) : pu1.r(new t33(h8Var.a, h8Var.b, i3));
            case 12:
                az azVar = (az) obj;
                if (azVar == null) {
                    return pu1.r(new t33(str, i4, i4));
                }
                t74 t74VarA = u74.A();
                for (j21 j21Var : azVar.a) {
                    r74 r74VarA = s74.A();
                    int i5 = j21Var.c;
                    r74VarA.b();
                    ((s74) r74VarA.g).B(i5);
                    long j2 = j21Var.b;
                    r74VarA.b();
                    ((s74) r74VarA.g).C(j2);
                    long j3 = j21Var.a;
                    r74VarA.b();
                    ((s74) r74VarA.g).D(j3);
                    s74 s74Var = (s74) r74VarA.d();
                    t74VarA.b();
                    ((u74) t74VarA.g).B(s74Var);
                }
                return pu1.r(new t33(Base64.encodeToString(((u74) t74VarA.d()).b(), 1), i4, i4));
            case 13:
                h8 h8Var2 = (h8) obj;
                int i6 = 2;
                return h8Var2 == null ? pu1.r(new t33(str2, i2, i6)) : pu1.r(new t33(h8Var2.a, h8Var2.b, i6));
            case 14:
                return lq3.g;
            case 15:
                return pu1.r("");
            default:
                kh3 kh3Var = (kh3) obj;
                return pu1.P(kh3Var.d(), new vn1(9, kh3Var), dq3.f);
        }
    }
}
