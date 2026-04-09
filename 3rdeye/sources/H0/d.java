package H0;

import java.util.Comparator;
import java.util.List;
import z6.C5865d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1978b;

    public /* synthetic */ d(int i) {
        this.f1978b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1978b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b10 = bArr[i];
                    byte b11 = bArr2[i];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                C5865d c5865d = (C5865d) obj;
                C5865d c5865d2 = (C5865d) obj2;
                long j4 = c5865d.f48458a;
                long j10 = c5865d2.f48458a;
                if (j4 != j10) {
                    return (int) (j4 - j10);
                }
                List<b9.l<String, String>> list = c5865d.f48459b;
                int size = list.size();
                List<b9.l<String, String>> list2 = c5865d2.f48459b;
                int iMin = Math.min(size, list2.size());
                for (int i10 = 0; i10 < iMin; i10++) {
                    b9.l<String, String> lVar = list.get(i10);
                    b9.l<String, String> lVar2 = list2.get(i10);
                    int iCompareTo = lVar.f18083b.compareTo(lVar2.f18083b);
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                    int iCompareTo2 = lVar.f18084c.compareTo(lVar2.f18084c);
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                return list.size() - list2.size();
        }
    }
}
