package b4;

import com.applovin.impl.b8;
import com.applovin.impl.c8;
import com.liuzh.deviceinfo.card.CpuCard;
import i0.q;
import j0.b1;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import me.f0;
import me.q1;
import u0.m0;
import ui.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1669a;

    public /* synthetic */ b(int i4) {
        this.f1669a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1669a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b10 = bArr[i4];
                    byte b11 = bArr2[i4];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                return b8.a((c8) obj, (c8) obj2);
            case 2:
                return ((e0) obj).f35360a.compareToIgnoreCase(((e0) obj2).f35360a);
            case 3:
                return -Integer.compare(((e0) obj).f35362c, ((e0) obj2).f35362c);
            case 4:
                i2.e0 e0Var = (i2.e0) obj;
                i2.e0 e0Var2 = (i2.e0) obj2;
                float f10 = e0Var.H.f25687p.E;
                float f11 = e0Var2.H.f25687p.E;
                return f10 == f11 ? nk.k.f(e0Var.w(), e0Var2.w()) : Float.compare(f10, f11);
            case 5:
                int i10 = CpuCard.f21169b;
                return Integer.compare(((Integer) ((Map.Entry) obj).getValue()).intValue(), ((Integer) ((Map.Entry) obj2).getValue()).intValue());
            case 6:
                return nk.k.f(((b1) obj2).f26870a, ((b1) obj).f26870a);
            case 7:
                return nk.k.f(((q) obj).f25479a, ((q) obj2).f25479a);
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((f0) ((q1) obj)).f29127a.compareTo(((f0) ((q1) obj2)).f29127a);
            case 10:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 11:
                String name = ((File) obj).getName();
                int i11 = pe.a.f31741f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 12:
                yj.i iVar = (yj.i) obj;
                yj.i iVar2 = (yj.i) obj2;
                return (((Number) iVar.f37639b).intValue() - ((Number) iVar.f37638a).intValue()) - (((Number) iVar2.f37639b).intValue() - ((Number) iVar2.f37638a).intValue());
            default:
                return nk.k.f(((m0) obj).f34865b, ((m0) obj2).f34865b);
        }
    }
}
