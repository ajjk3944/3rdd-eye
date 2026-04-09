package A2;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0791Wd;
import com.google.android.gms.internal.ads.C2202yv;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0825Yd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q2.C2841s;

/* renamed from: A2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116d implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0825Yd f241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0126n f243d;

    public /* synthetic */ C0116d(BinderC0126n binderC0126n, InterfaceC0825Yd interfaceC0825Yd, boolean z6, int i) {
        this.f240a = i;
        this.f241b = interfaceC0825Yd;
        this.f242c = z6;
        this.f243d = binderC0126n;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public final void mo11d(Object obj) {
        switch (this.f240a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    C0791Wd c0791Wd = (C0791Wd) this.f241b;
                    Parcel parcelH0 = c0791Wd.h0();
                    parcelH0.writeTypedList(arrayList);
                    c0791Wd.I0(parcelH0, 1);
                    BinderC0126n binderC0126n = this.f243d;
                    boolean z6 = binderC0126n.f300n;
                    C2202yv c2202yv = binderC0126n.f299m;
                    if (!z6 && !this.f242c) {
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        Uri uri = (Uri) obj2;
                        if (BinderC0126n.O3(uri, binderC0126n.f281N, binderC0126n.f282O)) {
                            c2202yv.b(BinderC0126n.R3(uri, binderC0126n.f279K, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) C2841s.f23267e.f23270c.a(H9.l8)).booleanValue()) {
                                c2202yv.b(uri.toString(), null, null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                    return;
                }
            default:
                List<Uri> list = (List) obj;
                try {
                    BinderC0126n binderC0126n2 = this.f243d;
                    binderC0126n2.getClass();
                    ArrayList arrayList2 = binderC0126n2.M;
                    ArrayList arrayList3 = binderC0126n2.f280L;
                    C2202yv c2202yv2 = binderC0126n2.f299m;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (BinderC0126n.O3((Uri) it.next(), arrayList3, arrayList2)) {
                                binderC0126n2.f276H.getAndIncrement();
                            }
                        }
                    }
                    C0791Wd c0791Wd2 = (C0791Wd) this.f241b;
                    Parcel parcelH02 = c0791Wd2.h0();
                    parcelH02.writeTypedList(list);
                    c0791Wd2.I0(parcelH02, 1);
                    if (!binderC0126n2.f271C && !this.f242c) {
                    }
                    for (Uri uri2 : list) {
                        if (BinderC0126n.O3(uri2, arrayList3, arrayList2)) {
                            c2202yv2.b(BinderC0126n.R3(uri2, binderC0126n2.f279K, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) C2841s.f23267e.f23270c.a(H9.l8)).booleanValue()) {
                                c2202yv2.b(uri2.toString(), null, null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final void u(Throwable th) {
        switch (this.f240a) {
            case 0:
                try {
                    InterfaceC0825Yd interfaceC0825Yd = this.f241b;
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String string = sb.toString();
                    C0791Wd c0791Wd = (C0791Wd) interfaceC0825Yd;
                    Parcel parcelH0 = c0791Wd.h0();
                    parcelH0.writeString(string);
                    c0791Wd.I0(parcelH0, 2);
                    break;
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                    return;
                }
            default:
                try {
                    InterfaceC0825Yd interfaceC0825Yd2 = this.f241b;
                    String message2 = th.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message2);
                    String string2 = sb2.toString();
                    C0791Wd c0791Wd2 = (C0791Wd) interfaceC0825Yd2;
                    Parcel parcelH02 = c0791Wd2.h0();
                    parcelH02.writeString(string2);
                    c0791Wd2.I0(parcelH02, 2);
                    break;
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                }
        }
    }
}
