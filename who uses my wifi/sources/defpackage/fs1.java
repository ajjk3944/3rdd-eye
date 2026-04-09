package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fs1 implements PackageManager$OnChecksumsReadyListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (list == null) {
                    ((wq3) obj).d("");
                    break;
                } else {
                    try {
                        int size = list.size();
                        while (i2 < size) {
                            ApkChecksum apkChecksumF = lb.f(list.get(i2));
                            if (apkChecksumF.getType() == 8) {
                                jo3 jo3VarF = jo3.f.f();
                                byte[] value = apkChecksumF.getValue();
                                ((wq3) obj).d(jo3VarF.g(value.length, value));
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    ((wq3) obj).d("");
                    break;
                }
            case 1:
                wq3 wq3Var = (wq3) obj;
                if (list == null) {
                    wq3Var.d(null);
                    break;
                } else {
                    try {
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ApkChecksum apkChecksumF2 = lb.f(list.get(i3));
                            if (apkChecksumF2.getType() == 8) {
                                byte[] value2 = apkChecksumF2.getValue();
                                char[] cArr = lt1.a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i2 < value2.length) {
                                    byte b = value2[i2];
                                    char[] cArr3 = lt1.a;
                                    int i4 = i2 + i2;
                                    cArr2[i4] = cArr3[(b & 255) >>> 4];
                                    cArr2[i4 + 1] = cArr3[b & 15];
                                    i2++;
                                }
                                wq3Var.d(new String(cArr2));
                                break;
                            }
                        }
                        wq3Var.d(null);
                        break;
                    } catch (Throwable unused2) {
                        wq3Var.d(null);
                        return;
                    }
                }
            default:
                yc ycVar = (yc) obj;
                if (list == null) {
                    ycVar.a("");
                    break;
                } else {
                    try {
                        int size3 = list.size();
                        while (i2 < size3) {
                            ApkChecksum apkChecksumF3 = lb.f(list.get(i2));
                            if (apkChecksumF3.getType() == 8) {
                                jo3 jo3VarF2 = jo3.f.f();
                                byte[] value3 = apkChecksumF3.getValue();
                                ycVar.a(jo3VarF2.g(value3.length, value3));
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    ycVar.a("");
                    break;
                }
        }
    }

    public fs1() {
        this.a = 0;
        this.b = new wq3();
    }
}
