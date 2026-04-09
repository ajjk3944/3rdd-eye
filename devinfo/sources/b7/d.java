package b7;

import android.net.NetworkRequest;
import android.os.Build;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.m1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import t6.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1977a;

    public /* synthetic */ d(int i4) {
        this.f1977a = i4;
    }

    public static final Object b(t5.m mVar, String str, ek.c cVar) {
        Object objA = mVar.a(str, new sl.b(2), cVar);
        return objA == dk.a.f22275a ? objA : yj.u.f37649a;
    }

    public final void a(d6.c cVar, Object obj) throws IOException {
        int i4;
        int i10;
        int[] iArrQ0;
        int[] iArrQ02;
        byte[] byteArray;
        byte[] byteArray2;
        int i11 = 3;
        switch (this.f1977a) {
            case 0:
                a aVar = (a) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(aVar, "entity");
                cVar.q(1, aVar.f1968a);
                cVar.q(2, aVar.f1969b);
                return;
            case 1:
                f fVar = (f) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(fVar, "entity");
                cVar.q(1, fVar.f1980a);
                cVar.a(2, fVar.f1981b.longValue());
                return;
            case 2:
                i iVar = (i) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(iVar, "entity");
                cVar.q(1, iVar.f1999a);
                cVar.a(2, iVar.f2000b);
                cVar.a(3, iVar.f2001c);
                return;
            case 3:
                nk.k.e(cVar, "statement");
                nk.k.e((m) obj, "entity");
                throw null;
            case 4:
                o oVar = (o) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(oVar, "entity");
                cVar.q(1, oVar.f2010a);
                t6.h hVar = t6.h.f34355b;
                cVar.b(2, jm.a.A(oVar.f2011b));
                return;
            case 5:
                r rVar = (r) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(rVar, "entity");
                cVar.q(1, rVar.f2030a);
                cVar.a(2, m1.C(rVar.f2031b));
                cVar.q(3, rVar.f2032c);
                cVar.q(4, rVar.f2033d);
                t6.h hVar2 = t6.h.f34355b;
                cVar.b(5, jm.a.A(rVar.f2034e));
                cVar.b(6, jm.a.A(rVar.f2035f));
                cVar.a(7, rVar.g);
                cVar.a(8, rVar.f2036h);
                cVar.a(9, rVar.f2037i);
                cVar.a(10, rVar.f2038k);
                t6.a aVar2 = rVar.f2039l;
                nk.k.e(aVar2, "backoffPolicy");
                int iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    i4 = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new ac.m();
                    }
                    i4 = 1;
                }
                cVar.a(11, i4);
                cVar.a(12, rVar.f2040m);
                cVar.a(13, rVar.f2041n);
                cVar.a(14, rVar.f2042o);
                cVar.a(15, rVar.f2043p);
                cVar.a(16, rVar.f2044q ? 1L : 0L);
                d0 d0Var = rVar.f2045r;
                nk.k.e(d0Var, "policy");
                int iOrdinal2 = d0Var.ordinal();
                if (iOrdinal2 == 0) {
                    i10 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new ac.m();
                    }
                    i10 = 1;
                }
                cVar.a(17, i10);
                cVar.a(18, rVar.f2046s);
                cVar.a(19, rVar.f2047t);
                cVar.a(20, rVar.f2048u);
                cVar.a(21, rVar.f2049v);
                cVar.a(22, rVar.f2050w);
                String str = rVar.f2051x;
                if (str == null) {
                    cVar.d(23);
                } else {
                    cVar.q(23, str);
                }
                Boolean bool = rVar.f2052y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    cVar.d(24);
                } else {
                    cVar.a(24, r9.intValue());
                }
                t6.e eVar = rVar.j;
                t6.w wVar = eVar.f34334a;
                nk.k.e(wVar, "networkType");
                int iOrdinal3 = wVar.ordinal();
                if (iOrdinal3 == 0) {
                    i11 = 0;
                } else if (iOrdinal3 == 1) {
                    i11 = 1;
                } else if (iOrdinal3 == 2) {
                    i11 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i11 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || wVar != t6.w.f34406f) {
                            throw new IllegalArgumentException("Could not convert " + wVar + " to int");
                        }
                        i11 = 5;
                    }
                }
                cVar.a(25, i11);
                c7.h hVar3 = eVar.f34335b;
                nk.k.e(hVar3, "requestCompat");
                int i12 = Build.VERSION.SDK_INT;
                if (i12 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) hVar3.f2782a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i12 >= 31) {
                                    iArrQ0 = c7.g.b(networkRequest);
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i13 = 0; i13 < 10; i13++) {
                                        int i14 = iArr[i13];
                                        if (c7.a.d(networkRequest, i14)) {
                                            arrayList.add(Integer.valueOf(i14));
                                        }
                                    }
                                    iArrQ0 = zj.n.q0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrQ02 = c7.g.a(networkRequest);
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i15 = 0; i15 < 30; i15++) {
                                        int i16 = iArr2[i15];
                                        if (c7.a.c(networkRequest, i16)) {
                                            arrayList2.add(Integer.valueOf(i16));
                                        }
                                    }
                                    iArrQ02 = zj.n.q0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrQ0.length);
                                for (int i17 : iArrQ0) {
                                    objectOutputStream.writeInt(i17);
                                }
                                objectOutputStream.writeInt(iArrQ02.length);
                                for (int i18 : iArrQ02) {
                                    objectOutputStream.writeInt(i18);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                nk.k.d(byteArray, "toByteArray(...)");
                            } finally {
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                cVar.b(26, byteArray);
                cVar.a(27, eVar.f34336c ? 1L : 0L);
                cVar.a(28, eVar.f34337d ? 1L : 0L);
                cVar.a(29, eVar.f34338e ? 1L : 0L);
                cVar.a(30, eVar.f34339f ? 1L : 0L);
                cVar.a(31, eVar.g);
                cVar.a(32, eVar.f34340h);
                Set<t6.d> set = eVar.f34341i;
                nk.k.e(set, "triggers");
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (t6.d dVar : set) {
                                objectOutputStream2.writeUTF(dVar.f34329a.toString());
                                objectOutputStream2.writeBoolean(dVar.f34330b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            nk.k.d(byteArray2, "toByteArray(...)");
                        } finally {
                        }
                    } finally {
                    }
                }
                cVar.b(33, byteArray2);
                return;
            default:
                z zVar = (z) obj;
                nk.k.e(cVar, "statement");
                nk.k.e(zVar, "entity");
                cVar.q(1, zVar.f2068a);
                cVar.q(2, zVar.f2069b);
                return;
        }
    }

    public void c(d6.a aVar, Object obj) {
        String str;
        nk.k.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        switch (this.f1977a) {
            case 0:
                str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                break;
            case 1:
                str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                break;
            case 2:
                str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                break;
            case 3:
                str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                break;
            case 4:
                str = "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                break;
            case 5:
                str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                break;
            default:
                str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                break;
        }
        d6.c cVarS = aVar.S(str);
        try {
            a(cVarS, obj);
            cVarS.P();
            d5.c(cVarS, null);
        } finally {
        }
    }
}
