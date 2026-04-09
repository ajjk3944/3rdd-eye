package dv;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h7.y;
import java.util.Comparator;
import java.util.WeakHashMap;
import rr.p;
import u3.i0;
import u3.z;

/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7621a;

    public /* synthetic */ h(int i10) {
        this.f7621a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7621a) {
            case 0:
                break;
            case 1:
                WeakHashMap weakHashMap = i0.f23177a;
                float f10 = z.f((View) obj);
                float f11 = z.f((View) obj2);
                if (f10 <= f11) {
                    if (f10 >= f11) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                y yVar = (y) obj;
                y yVar2 = (y) obj2;
                RecyclerView recyclerView = yVar.f10271d;
                if ((recyclerView == null) == (yVar2.f10271d == null)) {
                    boolean z10 = yVar.f10268a;
                    if (z10 == yVar2.f10268a) {
                        int i10 = yVar2.f10269b - yVar.f10269b;
                        if (i10 == 0) {
                            int i11 = yVar.f10270c - yVar2.f10270c;
                            if (i11 == 0) {
                                break;
                            }
                        }
                    } else if (!z10) {
                    }
                } else if (recyclerView == null) {
                }
                break;
            case 4:
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Integer numB = p.b((as.p) obj, (as.p) obj2);
                if (numB != null) {
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                double d6 = ((sm.d) obj).f22125h;
                double d10 = ((sm.d) obj2).f22125h;
                if (d6 >= d10) {
                    if (d6 <= d10) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 23:
                double d11 = ((sm.d) obj).f22122e;
                double d12 = ((sm.d) obj2).f22122e;
                if (d11 >= d12) {
                    if (d11 <= d12) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 24:
                double d13 = ((sm.d) obj).f22122e;
                double d14 = ((sm.d) obj2).f22122e;
                if (d13 >= d14) {
                    if (d13 <= d14) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 25:
                double d15 = ((sm.d) obj).f22123f;
                double d16 = ((sm.d) obj2).f22123f;
                if (d15 >= d16) {
                    if (d15 <= d16) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 26:
                double d17 = ((sm.d) obj).f22123f;
                double d18 = ((sm.d) obj2).f22123f;
                if (d17 >= d18) {
                    if (d17 <= d18) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 27:
                double d19 = ((sm.d) obj).f22124g;
                double d20 = ((sm.d) obj2).f22124g;
                if (d19 >= d20) {
                    if (d19 <= d20) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 28:
                double d21 = ((sm.d) obj).f22124g;
                double d22 = ((sm.d) obj2).f22124g;
                if (d21 >= d22) {
                    if (d21 <= d22) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                double d23 = ((sm.d) obj).f22125h;
                double d24 = ((sm.d) obj2).f22125h;
                if (d23 >= d24) {
                    if (d23 <= d24) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return 0;
    }
}
