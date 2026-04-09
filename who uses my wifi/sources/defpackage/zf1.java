package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zf1 implements iq3 {
    public final /* synthetic */ int f;
    public final /* synthetic */ j92 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ cr1 i;

    public /* synthetic */ zf1(cr1 cr1Var, j92 j92Var, boolean z, int i) {
        this.f = i;
        this.g = j92Var;
        this.h = z;
        this.i = cr1Var;
    }

    @Override // defpackage.iq3
    public final void p(Object obj) {
        switch (this.f) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    h92 h92Var = (h92) this.g;
                    Parcel parcelU = h92Var.U();
                    parcelU.writeTypedList(arrayList);
                    h92Var.M0(parcelU, 1);
                    cr1 cr1Var = this.i;
                    boolean z = cr1Var.s;
                    eb3 eb3Var = cr1Var.r;
                    if (!z && !this.h) {
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        Uri uri = (Uri) obj2;
                        if (cr1.F3(uri, cr1Var.E, cr1Var.F)) {
                            eb3Var.b(cr1.I3(uri, cr1Var.B, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) tw1.e.c.a(mz1.Q7)).booleanValue()) {
                                eb3Var.b(uri.toString(), null, null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e) {
                    gi2.c0("", e);
                    return;
                }
            default:
                List<Uri> list = (List) obj;
                try {
                    cr1 cr1Var2 = this.i;
                    cr1Var2.getClass();
                    ArrayList arrayList2 = cr1Var2.D;
                    ArrayList arrayList3 = cr1Var2.C;
                    eb3 eb3Var2 = cr1Var2.r;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (cr1.F3((Uri) it.next(), arrayList3, arrayList2)) {
                                cr1Var2.y.getAndIncrement();
                            }
                        }
                    }
                    h92 h92Var2 = (h92) this.g;
                    Parcel parcelU2 = h92Var2.U();
                    parcelU2.writeTypedList(list);
                    h92Var2.M0(parcelU2, 1);
                    if (!cr1Var2.t && !this.h) {
                    }
                    for (Uri uri2 : list) {
                        if (cr1.F3(uri2, arrayList3, arrayList2)) {
                            eb3Var2.b(cr1.I3(uri2, cr1Var2.B, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) tw1.e.c.a(mz1.Q7)).booleanValue()) {
                                eb3Var2.b(uri2.toString(), null, null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e2) {
                    gi2.c0("", e2);
                }
                break;
        }
    }

    @Override // defpackage.iq3
    public final void s(Throwable th) {
        switch (this.f) {
            case 0:
                try {
                    j92 j92Var = this.g;
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String string = sb.toString();
                    h92 h92Var = (h92) j92Var;
                    Parcel parcelU = h92Var.U();
                    parcelU.writeString(string);
                    h92Var.M0(parcelU, 2);
                    break;
                } catch (RemoteException e) {
                    gi2.c0("", e);
                    return;
                }
            default:
                try {
                    j92 j92Var2 = this.g;
                    String message2 = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message2);
                    String string2 = sb2.toString();
                    h92 h92Var2 = (h92) j92Var2;
                    Parcel parcelU2 = h92Var2.U();
                    parcelU2.writeString(string2);
                    h92Var2.M0(parcelU2, 2);
                    break;
                } catch (RemoteException e2) {
                    gi2.c0("", e2);
                }
        }
    }
}
