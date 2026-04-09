package Xb;

import Yg.J;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ui.wifiman.db.A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m2.AbstractC6750h;
import m2.AbstractC6751i;
import m2.q;
import m2.t;
import m2.w;
import mh.InterfaceC6835l;
import o.C7028t;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;
import p2.AbstractC7210d;
import p2.AbstractC7211e;

/* loaded from: classes3.dex */
public final class g extends Xb.e {

    /* renamed from: b, reason: collision with root package name */
    private final q f24274b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6751i f24275c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6751i f24276d;

    /* renamed from: e, reason: collision with root package name */
    private final A f24277e = new A();

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC6751i f24278f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC6750h f24279g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC6750h f24280h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC6750h f24281i;

    /* renamed from: j, reason: collision with root package name */
    private final w f24282j;

    /* renamed from: k, reason: collision with root package name */
    private final w f24283k;

    /* renamed from: l, reason: collision with root package name */
    private final w f24284l;

    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24285a;

        a(t tVar) {
            this.f24285a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            int i11;
            String string2;
            int i12;
            int i13;
            g.this.f24274b.e();
            try {
                Cursor cursorB = AbstractC7208b.b(g.this.f24274b, this.f24285a, true, null);
                try {
                    int iD = AbstractC7207a.d(cursorB, "id");
                    int iD2 = AbstractC7207a.d(cursorB, "serverId");
                    int iD3 = AbstractC7207a.d(cursorB, "unifiControllerId");
                    int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                    int iD5 = AbstractC7207a.d(cursorB, "resultId");
                    int iD6 = AbstractC7207a.d(cursorB, "connection_type");
                    int iD7 = AbstractC7207a.d(cursorB, "ssid");
                    int iD8 = AbstractC7207a.d(cursorB, "topology");
                    int iD9 = AbstractC7207a.d(cursorB, "ap_name");
                    int iD10 = AbstractC7207a.d(cursorB, "wifi_mode");
                    int iD11 = AbstractC7207a.d(cursorB, "signal");
                    int iD12 = AbstractC7207a.d(cursorB, "signalAP");
                    int iD13 = AbstractC7207a.d(cursorB, "band_id");
                    int iD14 = AbstractC7207a.d(cursorB, "channel");
                    int iD15 = AbstractC7207a.d(cursorB, "channel_width");
                    int iD16 = AbstractC7207a.d(cursorB, "rate_download");
                    int iD17 = AbstractC7207a.d(cursorB, "rate_upload");
                    int iD18 = AbstractC7207a.d(cursorB, "wifi_experience");
                    int iD19 = AbstractC7207a.d(cursorB, "dns_servers");
                    C7028t c7028t = new C7028t();
                    while (cursorB.moveToNext()) {
                        int i14 = iD12;
                        int i15 = iD13;
                        long j10 = cursorB.getLong(iD);
                        if (c7028t.d(j10)) {
                            i13 = iD11;
                        } else {
                            i13 = iD11;
                            c7028t.k(j10, new ArrayList());
                        }
                        iD12 = i14;
                        iD13 = i15;
                        iD11 = i13;
                    }
                    int i16 = iD11;
                    int i17 = iD12;
                    int i18 = iD13;
                    cursorB.moveToPosition(-1);
                    g.this.x(c7028t);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Xb.b bVar = new Xb.b(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4));
                        long j11 = cursorB.getLong(iD5);
                        String string3 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                        String string4 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                        String string5 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                        String string6 = cursorB.isNull(iD9) ? null : cursorB.getString(iD9);
                        if (cursorB.isNull(iD10)) {
                            i10 = i16;
                            string = null;
                        } else {
                            string = cursorB.getString(iD10);
                            i10 = i16;
                        }
                        Integer numValueOf = cursorB.isNull(i10) ? null : Integer.valueOf(cursorB.getInt(i10));
                        int i19 = i17;
                        int i20 = iD2;
                        Integer numValueOf2 = cursorB.isNull(i19) ? null : Integer.valueOf(cursorB.getInt(i19));
                        int i21 = i18;
                        String string7 = cursorB.isNull(i21) ? null : cursorB.getString(i21);
                        int i22 = iD14;
                        Integer numValueOf3 = cursorB.isNull(i22) ? null : Integer.valueOf(cursorB.getInt(i22));
                        int i23 = iD15;
                        String string8 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                        int i24 = iD16;
                        Integer numValueOf4 = cursorB.isNull(i24) ? null : Integer.valueOf(cursorB.getInt(i24));
                        int i25 = iD17;
                        Integer numValueOf5 = cursorB.isNull(i25) ? null : Integer.valueOf(cursorB.getInt(i25));
                        int i26 = iD18;
                        Float fValueOf = cursorB.isNull(i26) ? null : Float.valueOf(cursorB.getFloat(i26));
                        int i27 = iD19;
                        if (cursorB.isNull(i27)) {
                            i11 = i27;
                            i12 = iD3;
                            string2 = null;
                        } else {
                            i11 = i27;
                            string2 = cursorB.getString(i27);
                            i12 = iD3;
                        }
                        arrayList.add(new Xb.d(bVar, new Xb.a(j11, string3, string4, string5, string6, string, numValueOf, numValueOf2, string7, numValueOf3, string8, numValueOf4, numValueOf5, fValueOf, g.this.f24277e.c(string2)), (ArrayList) c7028t.e(cursorB.getLong(iD))));
                        iD2 = i20;
                        i17 = i19;
                        iD3 = i12;
                        iD4 = iD4;
                        i16 = i10;
                        i18 = i21;
                        iD14 = i22;
                        iD15 = i23;
                        iD16 = i24;
                        iD17 = i25;
                        iD18 = i26;
                        iD19 = i11;
                    }
                    g.this.f24274b.A();
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorB.close();
                    throw th2;
                }
            } finally {
                g.this.f24274b.i();
            }
        }

        protected void finalize() {
            this.f24285a.s();
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24287a;

        b(t tVar) {
            this.f24287a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            int i11;
            String string2;
            int i12;
            int i13;
            g.this.f24274b.e();
            try {
                Cursor cursorB = AbstractC7208b.b(g.this.f24274b, this.f24287a, true, null);
                try {
                    int iD = AbstractC7207a.d(cursorB, "id");
                    int iD2 = AbstractC7207a.d(cursorB, "serverId");
                    int iD3 = AbstractC7207a.d(cursorB, "unifiControllerId");
                    int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                    int iD5 = AbstractC7207a.d(cursorB, "resultId");
                    int iD6 = AbstractC7207a.d(cursorB, "connection_type");
                    int iD7 = AbstractC7207a.d(cursorB, "ssid");
                    int iD8 = AbstractC7207a.d(cursorB, "topology");
                    int iD9 = AbstractC7207a.d(cursorB, "ap_name");
                    int iD10 = AbstractC7207a.d(cursorB, "wifi_mode");
                    int iD11 = AbstractC7207a.d(cursorB, "signal");
                    int iD12 = AbstractC7207a.d(cursorB, "signalAP");
                    int iD13 = AbstractC7207a.d(cursorB, "band_id");
                    int iD14 = AbstractC7207a.d(cursorB, "channel");
                    int iD15 = AbstractC7207a.d(cursorB, "channel_width");
                    int iD16 = AbstractC7207a.d(cursorB, "rate_download");
                    int iD17 = AbstractC7207a.d(cursorB, "rate_upload");
                    int iD18 = AbstractC7207a.d(cursorB, "wifi_experience");
                    int iD19 = AbstractC7207a.d(cursorB, "dns_servers");
                    C7028t c7028t = new C7028t();
                    while (cursorB.moveToNext()) {
                        int i14 = iD12;
                        int i15 = iD13;
                        long j10 = cursorB.getLong(iD);
                        if (c7028t.d(j10)) {
                            i13 = iD11;
                        } else {
                            i13 = iD11;
                            c7028t.k(j10, new ArrayList());
                        }
                        iD12 = i14;
                        iD13 = i15;
                        iD11 = i13;
                    }
                    int i16 = iD11;
                    int i17 = iD12;
                    int i18 = iD13;
                    cursorB.moveToPosition(-1);
                    g.this.x(c7028t);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Xb.b bVar = new Xb.b(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4));
                        long j11 = cursorB.getLong(iD5);
                        String string3 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                        String string4 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                        String string5 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                        String string6 = cursorB.isNull(iD9) ? null : cursorB.getString(iD9);
                        if (cursorB.isNull(iD10)) {
                            i10 = i16;
                            string = null;
                        } else {
                            string = cursorB.getString(iD10);
                            i10 = i16;
                        }
                        Integer numValueOf = cursorB.isNull(i10) ? null : Integer.valueOf(cursorB.getInt(i10));
                        int i19 = i17;
                        int i20 = iD2;
                        Integer numValueOf2 = cursorB.isNull(i19) ? null : Integer.valueOf(cursorB.getInt(i19));
                        int i21 = i18;
                        String string7 = cursorB.isNull(i21) ? null : cursorB.getString(i21);
                        int i22 = iD14;
                        Integer numValueOf3 = cursorB.isNull(i22) ? null : Integer.valueOf(cursorB.getInt(i22));
                        int i23 = iD15;
                        String string8 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                        int i24 = iD16;
                        Integer numValueOf4 = cursorB.isNull(i24) ? null : Integer.valueOf(cursorB.getInt(i24));
                        int i25 = iD17;
                        Integer numValueOf5 = cursorB.isNull(i25) ? null : Integer.valueOf(cursorB.getInt(i25));
                        int i26 = iD18;
                        Float fValueOf = cursorB.isNull(i26) ? null : Float.valueOf(cursorB.getFloat(i26));
                        int i27 = iD19;
                        if (cursorB.isNull(i27)) {
                            i11 = i27;
                            i12 = iD3;
                            string2 = null;
                        } else {
                            i11 = i27;
                            string2 = cursorB.getString(i27);
                            i12 = iD3;
                        }
                        arrayList.add(new Xb.d(bVar, new Xb.a(j11, string3, string4, string5, string6, string, numValueOf, numValueOf2, string7, numValueOf3, string8, numValueOf4, numValueOf5, fValueOf, g.this.f24277e.c(string2)), (ArrayList) c7028t.e(cursorB.getLong(iD))));
                        iD2 = i20;
                        i17 = i19;
                        iD3 = i12;
                        iD4 = iD4;
                        i16 = i10;
                        i18 = i21;
                        iD14 = i22;
                        iD15 = i23;
                        iD16 = i24;
                        iD17 = i25;
                        iD18 = i26;
                        iD19 = i11;
                    }
                    g.this.f24274b.A();
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorB.close();
                    throw th2;
                }
            } finally {
                g.this.f24274b.i();
            }
        }

        protected void finalize() {
            this.f24287a.s();
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24289a;

        c(t tVar) {
            this.f24289a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            int i11;
            String string2;
            int i12;
            int i13;
            g.this.f24274b.e();
            try {
                Cursor cursorB = AbstractC7208b.b(g.this.f24274b, this.f24289a, true, null);
                try {
                    int iD = AbstractC7207a.d(cursorB, "id");
                    int iD2 = AbstractC7207a.d(cursorB, "serverId");
                    int iD3 = AbstractC7207a.d(cursorB, "unifiControllerId");
                    int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                    int iD5 = AbstractC7207a.d(cursorB, "resultId");
                    int iD6 = AbstractC7207a.d(cursorB, "connection_type");
                    int iD7 = AbstractC7207a.d(cursorB, "ssid");
                    int iD8 = AbstractC7207a.d(cursorB, "topology");
                    int iD9 = AbstractC7207a.d(cursorB, "ap_name");
                    int iD10 = AbstractC7207a.d(cursorB, "wifi_mode");
                    int iD11 = AbstractC7207a.d(cursorB, "signal");
                    int iD12 = AbstractC7207a.d(cursorB, "signalAP");
                    int iD13 = AbstractC7207a.d(cursorB, "band_id");
                    int iD14 = AbstractC7207a.d(cursorB, "channel");
                    int iD15 = AbstractC7207a.d(cursorB, "channel_width");
                    int iD16 = AbstractC7207a.d(cursorB, "rate_download");
                    int iD17 = AbstractC7207a.d(cursorB, "rate_upload");
                    int iD18 = AbstractC7207a.d(cursorB, "wifi_experience");
                    int iD19 = AbstractC7207a.d(cursorB, "dns_servers");
                    C7028t c7028t = new C7028t();
                    while (cursorB.moveToNext()) {
                        int i14 = iD12;
                        int i15 = iD13;
                        long j10 = cursorB.getLong(iD);
                        if (c7028t.d(j10)) {
                            i13 = iD11;
                        } else {
                            i13 = iD11;
                            c7028t.k(j10, new ArrayList());
                        }
                        iD12 = i14;
                        iD13 = i15;
                        iD11 = i13;
                    }
                    int i16 = iD11;
                    int i17 = iD12;
                    int i18 = iD13;
                    cursorB.moveToPosition(-1);
                    g.this.x(c7028t);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Xb.b bVar = new Xb.b(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4));
                        long j11 = cursorB.getLong(iD5);
                        String string3 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                        String string4 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                        String string5 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                        String string6 = cursorB.isNull(iD9) ? null : cursorB.getString(iD9);
                        if (cursorB.isNull(iD10)) {
                            i10 = i16;
                            string = null;
                        } else {
                            string = cursorB.getString(iD10);
                            i10 = i16;
                        }
                        Integer numValueOf = cursorB.isNull(i10) ? null : Integer.valueOf(cursorB.getInt(i10));
                        int i19 = i17;
                        int i20 = iD2;
                        Integer numValueOf2 = cursorB.isNull(i19) ? null : Integer.valueOf(cursorB.getInt(i19));
                        int i21 = i18;
                        String string7 = cursorB.isNull(i21) ? null : cursorB.getString(i21);
                        int i22 = iD14;
                        Integer numValueOf3 = cursorB.isNull(i22) ? null : Integer.valueOf(cursorB.getInt(i22));
                        int i23 = iD15;
                        String string8 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                        int i24 = iD16;
                        Integer numValueOf4 = cursorB.isNull(i24) ? null : Integer.valueOf(cursorB.getInt(i24));
                        int i25 = iD17;
                        Integer numValueOf5 = cursorB.isNull(i25) ? null : Integer.valueOf(cursorB.getInt(i25));
                        int i26 = iD18;
                        Float fValueOf = cursorB.isNull(i26) ? null : Float.valueOf(cursorB.getFloat(i26));
                        int i27 = iD19;
                        if (cursorB.isNull(i27)) {
                            i11 = i27;
                            i12 = iD3;
                            string2 = null;
                        } else {
                            i11 = i27;
                            string2 = cursorB.getString(i27);
                            i12 = iD3;
                        }
                        arrayList.add(new Xb.d(bVar, new Xb.a(j11, string3, string4, string5, string6, string, numValueOf, numValueOf2, string7, numValueOf3, string8, numValueOf4, numValueOf5, fValueOf, g.this.f24277e.c(string2)), (ArrayList) c7028t.e(cursorB.getLong(iD))));
                        iD2 = i20;
                        i17 = i19;
                        iD3 = i12;
                        iD4 = iD4;
                        i16 = i10;
                        i18 = i21;
                        iD14 = i22;
                        iD15 = i23;
                        iD16 = i24;
                        iD17 = i25;
                        iD18 = i26;
                        iD19 = i11;
                    }
                    g.this.f24274b.A();
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorB.close();
                    throw th2;
                }
            } finally {
                g.this.f24274b.i();
            }
        }

        protected void finalize() {
            this.f24289a.s();
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24291a;

        d(t tVar) {
            this.f24291a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            int i11;
            String string2;
            int i12;
            int i13;
            g.this.f24274b.e();
            try {
                Cursor cursorB = AbstractC7208b.b(g.this.f24274b, this.f24291a, true, null);
                try {
                    int iD = AbstractC7207a.d(cursorB, "id");
                    int iD2 = AbstractC7207a.d(cursorB, "serverId");
                    int iD3 = AbstractC7207a.d(cursorB, "unifiControllerId");
                    int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                    int iD5 = AbstractC7207a.d(cursorB, "resultId");
                    int iD6 = AbstractC7207a.d(cursorB, "connection_type");
                    int iD7 = AbstractC7207a.d(cursorB, "ssid");
                    int iD8 = AbstractC7207a.d(cursorB, "topology");
                    int iD9 = AbstractC7207a.d(cursorB, "ap_name");
                    int iD10 = AbstractC7207a.d(cursorB, "wifi_mode");
                    int iD11 = AbstractC7207a.d(cursorB, "signal");
                    int iD12 = AbstractC7207a.d(cursorB, "signalAP");
                    int iD13 = AbstractC7207a.d(cursorB, "band_id");
                    int iD14 = AbstractC7207a.d(cursorB, "channel");
                    int iD15 = AbstractC7207a.d(cursorB, "channel_width");
                    int iD16 = AbstractC7207a.d(cursorB, "rate_download");
                    int iD17 = AbstractC7207a.d(cursorB, "rate_upload");
                    int iD18 = AbstractC7207a.d(cursorB, "wifi_experience");
                    int iD19 = AbstractC7207a.d(cursorB, "dns_servers");
                    C7028t c7028t = new C7028t();
                    while (cursorB.moveToNext()) {
                        int i14 = iD12;
                        int i15 = iD13;
                        long j10 = cursorB.getLong(iD);
                        if (c7028t.d(j10)) {
                            i13 = iD11;
                        } else {
                            i13 = iD11;
                            c7028t.k(j10, new ArrayList());
                        }
                        iD12 = i14;
                        iD13 = i15;
                        iD11 = i13;
                    }
                    int i16 = iD11;
                    int i17 = iD12;
                    int i18 = iD13;
                    cursorB.moveToPosition(-1);
                    g.this.x(c7028t);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Xb.b bVar = new Xb.b(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4));
                        long j11 = cursorB.getLong(iD5);
                        String string3 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                        String string4 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                        String string5 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                        String string6 = cursorB.isNull(iD9) ? null : cursorB.getString(iD9);
                        if (cursorB.isNull(iD10)) {
                            i10 = i16;
                            string = null;
                        } else {
                            string = cursorB.getString(iD10);
                            i10 = i16;
                        }
                        Integer numValueOf = cursorB.isNull(i10) ? null : Integer.valueOf(cursorB.getInt(i10));
                        int i19 = i17;
                        int i20 = iD2;
                        Integer numValueOf2 = cursorB.isNull(i19) ? null : Integer.valueOf(cursorB.getInt(i19));
                        int i21 = i18;
                        String string7 = cursorB.isNull(i21) ? null : cursorB.getString(i21);
                        int i22 = iD14;
                        Integer numValueOf3 = cursorB.isNull(i22) ? null : Integer.valueOf(cursorB.getInt(i22));
                        int i23 = iD15;
                        String string8 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                        int i24 = iD16;
                        Integer numValueOf4 = cursorB.isNull(i24) ? null : Integer.valueOf(cursorB.getInt(i24));
                        int i25 = iD17;
                        Integer numValueOf5 = cursorB.isNull(i25) ? null : Integer.valueOf(cursorB.getInt(i25));
                        int i26 = iD18;
                        Float fValueOf = cursorB.isNull(i26) ? null : Float.valueOf(cursorB.getFloat(i26));
                        int i27 = iD19;
                        if (cursorB.isNull(i27)) {
                            i11 = i27;
                            i12 = iD3;
                            string2 = null;
                        } else {
                            i11 = i27;
                            string2 = cursorB.getString(i27);
                            i12 = iD3;
                        }
                        arrayList.add(new Xb.d(bVar, new Xb.a(j11, string3, string4, string5, string6, string, numValueOf, numValueOf2, string7, numValueOf3, string8, numValueOf4, numValueOf5, fValueOf, g.this.f24277e.c(string2)), (ArrayList) c7028t.e(cursorB.getLong(iD))));
                        iD2 = i20;
                        i17 = i19;
                        iD3 = i12;
                        iD4 = iD4;
                        i16 = i10;
                        i18 = i21;
                        iD14 = i22;
                        iD15 = i23;
                        iD16 = i24;
                        iD17 = i25;
                        iD18 = i26;
                        iD19 = i11;
                    }
                    g.this.f24274b.A();
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorB.close();
                    throw th2;
                }
            } finally {
                g.this.f24274b.i();
            }
        }

        protected void finalize() {
            this.f24291a.s();
        }
    }

    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24293a;

        e(t tVar) {
            this.f24293a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            int i11;
            String string2;
            int i12;
            int i13;
            g.this.f24274b.e();
            try {
                Cursor cursorB = AbstractC7208b.b(g.this.f24274b, this.f24293a, true, null);
                try {
                    int iD = AbstractC7207a.d(cursorB, "id");
                    int iD2 = AbstractC7207a.d(cursorB, "serverId");
                    int iD3 = AbstractC7207a.d(cursorB, "unifiControllerId");
                    int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                    int iD5 = AbstractC7207a.d(cursorB, "resultId");
                    int iD6 = AbstractC7207a.d(cursorB, "connection_type");
                    int iD7 = AbstractC7207a.d(cursorB, "ssid");
                    int iD8 = AbstractC7207a.d(cursorB, "topology");
                    int iD9 = AbstractC7207a.d(cursorB, "ap_name");
                    int iD10 = AbstractC7207a.d(cursorB, "wifi_mode");
                    int iD11 = AbstractC7207a.d(cursorB, "signal");
                    int iD12 = AbstractC7207a.d(cursorB, "signalAP");
                    int iD13 = AbstractC7207a.d(cursorB, "band_id");
                    int iD14 = AbstractC7207a.d(cursorB, "channel");
                    int iD15 = AbstractC7207a.d(cursorB, "channel_width");
                    int iD16 = AbstractC7207a.d(cursorB, "rate_download");
                    int iD17 = AbstractC7207a.d(cursorB, "rate_upload");
                    int iD18 = AbstractC7207a.d(cursorB, "wifi_experience");
                    int iD19 = AbstractC7207a.d(cursorB, "dns_servers");
                    C7028t c7028t = new C7028t();
                    while (cursorB.moveToNext()) {
                        int i14 = iD12;
                        int i15 = iD13;
                        long j10 = cursorB.getLong(iD);
                        if (c7028t.d(j10)) {
                            i13 = iD11;
                        } else {
                            i13 = iD11;
                            c7028t.k(j10, new ArrayList());
                        }
                        iD12 = i14;
                        iD13 = i15;
                        iD11 = i13;
                    }
                    int i16 = iD11;
                    int i17 = iD12;
                    int i18 = iD13;
                    cursorB.moveToPosition(-1);
                    g.this.x(c7028t);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        Xb.b bVar = new Xb.b(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4));
                        long j11 = cursorB.getLong(iD5);
                        String string3 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                        String string4 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                        String string5 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                        String string6 = cursorB.isNull(iD9) ? null : cursorB.getString(iD9);
                        if (cursorB.isNull(iD10)) {
                            i10 = i16;
                            string = null;
                        } else {
                            string = cursorB.getString(iD10);
                            i10 = i16;
                        }
                        Integer numValueOf = cursorB.isNull(i10) ? null : Integer.valueOf(cursorB.getInt(i10));
                        int i19 = i17;
                        int i20 = iD2;
                        Integer numValueOf2 = cursorB.isNull(i19) ? null : Integer.valueOf(cursorB.getInt(i19));
                        int i21 = i18;
                        String string7 = cursorB.isNull(i21) ? null : cursorB.getString(i21);
                        int i22 = iD14;
                        Integer numValueOf3 = cursorB.isNull(i22) ? null : Integer.valueOf(cursorB.getInt(i22));
                        int i23 = iD15;
                        String string8 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                        int i24 = iD16;
                        Integer numValueOf4 = cursorB.isNull(i24) ? null : Integer.valueOf(cursorB.getInt(i24));
                        int i25 = iD17;
                        Integer numValueOf5 = cursorB.isNull(i25) ? null : Integer.valueOf(cursorB.getInt(i25));
                        int i26 = iD18;
                        Float fValueOf = cursorB.isNull(i26) ? null : Float.valueOf(cursorB.getFloat(i26));
                        int i27 = iD19;
                        if (cursorB.isNull(i27)) {
                            i11 = i27;
                            i12 = iD3;
                            string2 = null;
                        } else {
                            i11 = i27;
                            string2 = cursorB.getString(i27);
                            i12 = iD3;
                        }
                        arrayList.add(new Xb.d(bVar, new Xb.a(j11, string3, string4, string5, string6, string, numValueOf, numValueOf2, string7, numValueOf3, string8, numValueOf4, numValueOf5, fValueOf, g.this.f24277e.c(string2)), (ArrayList) c7028t.e(cursorB.getLong(iD))));
                        iD2 = i20;
                        i17 = i19;
                        iD3 = i12;
                        iD4 = iD4;
                        i16 = i10;
                        i18 = i21;
                        iD14 = i22;
                        iD15 = i23;
                        iD16 = i24;
                        iD17 = i25;
                        iD18 = i26;
                        iD19 = i11;
                    }
                    g.this.f24274b.A();
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorB.close();
                    throw th2;
                }
            } finally {
                g.this.f24274b.i();
            }
        }

        protected void finalize() {
            this.f24293a.s();
        }
    }

    class f extends AbstractC6751i {
        f(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `speedTestId` (`id`,`serverId`,`unifiControllerId`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.d());
            if (bVar.c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.c());
            }
            if (bVar.f() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, bVar.f());
            }
            supportSQLiteStatement.bindLong(4, bVar.e());
        }
    }

    /* renamed from: Xb.g$g, reason: collision with other inner class name */
    class C0919g extends AbstractC6751i {
        C0919g(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `speedTestEnv` (`resultId`,`connection_type`,`ssid`,`topology`,`ap_name`,`wifi_mode`,`signal`,`signalAP`,`band_id`,`channel`,`channel_width`,`rate_download`,`rate_upload`,`wifi_experience`,`dns_servers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.m());
            if (aVar.g() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, aVar.g());
            }
            if (aVar.p() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aVar.p());
            }
            if (aVar.q() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, aVar.q());
            }
            if (aVar.c() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, aVar.c());
            }
            if (aVar.u() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, aVar.u());
            }
            if (aVar.n() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, aVar.n().intValue());
            }
            if (aVar.o() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, aVar.o().intValue());
            }
            if (aVar.d() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aVar.d());
            }
            if (aVar.e() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, aVar.e().intValue());
            }
            if (aVar.f() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, aVar.f());
            }
            if (aVar.k() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, aVar.k().intValue());
            }
            if (aVar.l() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, aVar.l().intValue());
            }
            if (aVar.t() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindDouble(14, aVar.t().floatValue());
            }
            String strD = g.this.f24277e.d(aVar.h());
            if (strD == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, strD);
            }
        }
    }

    class h extends AbstractC6751i {
        h(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `speedTestMeasurement` (`id`,`resultId`,`speedtest_type`,`latency`,`jitter`,`downloadBits`,`download_bits_history`,`uploadBits`,`upload_bits_history`,`endpoint_type`,`server_ip`,`server_name`,`server_provider`,`server_provider_url`,`server_location_city`,`server_location_country`,`server_product_id`,`server_product_image_engine`,`server_product_image_url`,`server_product`,`server_wifi_experience`,`server_a2a_device_type`,`server_provider_secondary`,`public_ip_provider`,`public_ip_provider_image`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.h());
            supportSQLiteStatement.bindLong(2, cVar.m());
            supportSQLiteStatement.bindString(3, cVar.B());
            if (cVar.l() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, cVar.l().intValue());
            }
            if (cVar.k() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, cVar.k().intValue());
            }
            if (cVar.d() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, cVar.d().longValue());
            }
            String strB = g.this.f24277e.b(cVar.e());
            if (strB == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, strB);
            }
            if (cVar.C() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, cVar.C().longValue());
            }
            String strB2 = g.this.f24277e.b(cVar.D());
            if (strB2 == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, strB2);
            }
            supportSQLiteStatement.bindString(10, cVar.g());
            supportSQLiteStatement.bindString(11, cVar.o());
            if (cVar.r() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, cVar.r());
            }
            if (cVar.w() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, cVar.w());
            }
            if (cVar.x() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, cVar.x());
            }
            if (cVar.p() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, cVar.p());
            }
            if (cVar.q() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, cVar.q());
            }
            if (cVar.t() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, cVar.t().intValue());
            }
            if (cVar.u() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindLong(18, cVar.u().intValue());
            }
            if (cVar.v() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, cVar.v());
            }
            if (cVar.s() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, cVar.s());
            }
            if (cVar.z() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindLong(21, cVar.z().intValue());
            }
            if (cVar.n() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, cVar.n());
            }
            if (cVar.y() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, cVar.y());
            }
            if (cVar.i() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, cVar.i());
            }
            if (cVar.j() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindString(25, cVar.j());
            }
        }
    }

    class i extends AbstractC6750h {
        i(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `speedTestId` SET `id` = ?,`serverId` = ?,`unifiControllerId` = ?,`timestamp` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.d());
            if (bVar.c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.c());
            }
            if (bVar.f() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, bVar.f());
            }
            supportSQLiteStatement.bindLong(4, bVar.e());
            supportSQLiteStatement.bindLong(5, bVar.d());
        }
    }

    class j extends AbstractC6750h {
        j(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `speedTestEnv` SET `resultId` = ?,`connection_type` = ?,`ssid` = ?,`topology` = ?,`ap_name` = ?,`wifi_mode` = ?,`signal` = ?,`signalAP` = ?,`band_id` = ?,`channel` = ?,`channel_width` = ?,`rate_download` = ?,`rate_upload` = ?,`wifi_experience` = ?,`dns_servers` = ? WHERE `resultId` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.m());
            if (aVar.g() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, aVar.g());
            }
            if (aVar.p() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aVar.p());
            }
            if (aVar.q() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, aVar.q());
            }
            if (aVar.c() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, aVar.c());
            }
            if (aVar.u() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, aVar.u());
            }
            if (aVar.n() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, aVar.n().intValue());
            }
            if (aVar.o() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, aVar.o().intValue());
            }
            if (aVar.d() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aVar.d());
            }
            if (aVar.e() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, aVar.e().intValue());
            }
            if (aVar.f() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, aVar.f());
            }
            if (aVar.k() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, aVar.k().intValue());
            }
            if (aVar.l() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, aVar.l().intValue());
            }
            if (aVar.t() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindDouble(14, aVar.t().floatValue());
            }
            String strD = g.this.f24277e.d(aVar.h());
            if (strD == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, strD);
            }
            supportSQLiteStatement.bindLong(16, aVar.m());
        }
    }

    class k extends AbstractC6750h {
        k(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `speedTestMeasurement` SET `id` = ?,`resultId` = ?,`speedtest_type` = ?,`latency` = ?,`jitter` = ?,`downloadBits` = ?,`download_bits_history` = ?,`uploadBits` = ?,`upload_bits_history` = ?,`endpoint_type` = ?,`server_ip` = ?,`server_name` = ?,`server_provider` = ?,`server_provider_url` = ?,`server_location_city` = ?,`server_location_country` = ?,`server_product_id` = ?,`server_product_image_engine` = ?,`server_product_image_url` = ?,`server_product` = ?,`server_wifi_experience` = ?,`server_a2a_device_type` = ?,`server_provider_secondary` = ?,`public_ip_provider` = ?,`public_ip_provider_image` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Xb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.h());
            supportSQLiteStatement.bindLong(2, cVar.m());
            supportSQLiteStatement.bindString(3, cVar.B());
            if (cVar.l() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, cVar.l().intValue());
            }
            if (cVar.k() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, cVar.k().intValue());
            }
            if (cVar.d() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, cVar.d().longValue());
            }
            String strB = g.this.f24277e.b(cVar.e());
            if (strB == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, strB);
            }
            if (cVar.C() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, cVar.C().longValue());
            }
            String strB2 = g.this.f24277e.b(cVar.D());
            if (strB2 == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, strB2);
            }
            supportSQLiteStatement.bindString(10, cVar.g());
            supportSQLiteStatement.bindString(11, cVar.o());
            if (cVar.r() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, cVar.r());
            }
            if (cVar.w() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, cVar.w());
            }
            if (cVar.x() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, cVar.x());
            }
            if (cVar.p() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, cVar.p());
            }
            if (cVar.q() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, cVar.q());
            }
            if (cVar.t() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, cVar.t().intValue());
            }
            if (cVar.u() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindLong(18, cVar.u().intValue());
            }
            if (cVar.v() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, cVar.v());
            }
            if (cVar.s() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, cVar.s());
            }
            if (cVar.z() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindLong(21, cVar.z().intValue());
            }
            if (cVar.n() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, cVar.n());
            }
            if (cVar.y() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, cVar.y());
            }
            if (cVar.i() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, cVar.i());
            }
            if (cVar.j() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindString(25, cVar.j());
            }
            supportSQLiteStatement.bindLong(26, cVar.h());
        }
    }

    class l extends w {
        l(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM speedTestId";
        }
    }

    class m extends w {
        m(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM speedTestEnv";
        }
    }

    class n extends w {
        n(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM speedTestMeasurement";
        }
    }

    public g(q qVar) {
        this.f24274b = qVar;
        this.f24275c = new f(qVar);
        this.f24276d = new C0919g(qVar);
        this.f24278f = new h(qVar);
        this.f24279g = new i(qVar);
        this.f24280h = new j(qVar);
        this.f24281i = new k(qVar);
        this.f24282j = new l(qVar);
        this.f24283k = new m(qVar);
        this.f24284l = new n(qVar);
    }

    public static List B() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ J C(C7028t c7028t) {
        x(c7028t);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(C7028t c7028t) {
        if (c7028t.h()) {
            return;
        }
        if (c7028t.o() > 999) {
            AbstractC7210d.a(c7028t, true, new InterfaceC6835l() { // from class: Xb.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return this.f24273a.C((C7028t) obj);
                }
            });
            return;
        }
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("SELECT `id`,`resultId`,`speedtest_type`,`latency`,`jitter`,`downloadBits`,`download_bits_history`,`uploadBits`,`upload_bits_history`,`endpoint_type`,`server_ip`,`server_name`,`server_provider`,`server_provider_url`,`server_location_city`,`server_location_country`,`server_product_id`,`server_product_image_engine`,`server_product_image_url`,`server_product`,`server_wifi_experience`,`server_a2a_device_type`,`server_provider_secondary`,`public_ip_provider`,`public_ip_provider_image` FROM `speedTestMeasurement` WHERE `resultId` IN (");
        int iO = c7028t.o();
        AbstractC7211e.a(sbB, iO);
        sbB.append(")");
        t tVarJ = t.j(sbB.toString(), iO);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 0; i12 < c7028t.o(); i12++) {
            tVarJ.bindLong(i11, c7028t.i(i12));
            i11++;
        }
        Cursor cursorB = AbstractC7208b.b(this.f24274b, tVarJ, false, null);
        try {
            int iC = AbstractC7207a.c(cursorB, "resultId");
            if (iC == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                ArrayList arrayList = (ArrayList) c7028t.e(cursorB.getLong(iC));
                if (arrayList != null) {
                    arrayList.add(new Xb.c(cursorB.getLong(i10), cursorB.getLong(1), cursorB.getString(2), cursorB.isNull(3) ? null : Integer.valueOf(cursorB.getInt(3)), cursorB.isNull(4) ? null : Integer.valueOf(cursorB.getInt(4)), cursorB.isNull(5) ? null : Long.valueOf(cursorB.getLong(5)), this.f24277e.a(cursorB.isNull(6) ? null : cursorB.getString(6)), cursorB.isNull(7) ? null : Long.valueOf(cursorB.getLong(7)), this.f24277e.a(cursorB.isNull(8) ? null : cursorB.getString(8)), cursorB.getString(9), cursorB.getString(10), cursorB.isNull(11) ? null : cursorB.getString(11), cursorB.isNull(12) ? null : cursorB.getString(12), cursorB.isNull(13) ? null : cursorB.getString(13), cursorB.isNull(14) ? null : cursorB.getString(14), cursorB.isNull(15) ? null : cursorB.getString(15), cursorB.isNull(16) ? null : Integer.valueOf(cursorB.getInt(16)), cursorB.isNull(17) ? null : Integer.valueOf(cursorB.getInt(17)), cursorB.isNull(18) ? null : cursorB.getString(18), cursorB.isNull(19) ? null : cursorB.getString(19), cursorB.isNull(20) ? null : Integer.valueOf(cursorB.getInt(20)), cursorB.isNull(21) ? null : cursorB.getString(21), cursorB.isNull(22) ? null : cursorB.getString(22), cursorB.isNull(23) ? null : cursorB.getString(23), cursorB.isNull(24) ? null : cursorB.getString(24)));
                }
                i10 = 0;
            }
        } finally {
            cursorB.close();
        }
    }

    @Override // Xb.e
    public gg.i a() {
        return AbstractC7061d.d(this.f24274b, true, new String[]{"speedTestMeasurement", "speedTestId", "speedTestEnv"}, new a(t.j("SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId ORDER BY speedTestId.timestamp DESC", 0)));
    }

    @Override // Xb.e
    public gg.i b(int i10) {
        t tVarJ = t.j("SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId ORDER BY speedTestId.timestamp DESC LIMIT ?", 1);
        tVarJ.bindLong(1, i10);
        return AbstractC7061d.d(this.f24274b, true, new String[]{"speedTestMeasurement", "speedTestId", "speedTestEnv"}, new b(tVarJ));
    }

    @Override // Xb.e
    public gg.i d(String str) {
        t tVarJ = t.j("SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestEnv.connection_type = ? ORDER BY speedTestId.timestamp DESC", 1);
        tVarJ.bindString(1, str);
        return AbstractC7061d.d(this.f24274b, true, new String[]{"speedTestMeasurement", "speedTestId", "speedTestEnv"}, new c(tVarJ));
    }

    @Override // Xb.e
    public gg.i f(String str, String str2, int i10) {
        t tVarJ = t.j("SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestEnv.connection_type = ? AND speedTestEnv.ssid = ? ORDER BY speedTestId.timestamp DESC LIMIT ?", 3);
        tVarJ.bindString(1, str);
        if (str2 == null) {
            tVarJ.bindNull(2);
        } else {
            tVarJ.bindString(2, str2);
        }
        tVarJ.bindLong(3, i10);
        return AbstractC7061d.d(this.f24274b, true, new String[]{"speedTestMeasurement", "speedTestId", "speedTestEnv"}, new d(tVarJ));
    }

    @Override // Xb.e
    public boolean g(long... jArr) {
        this.f24274b.e();
        try {
            boolean zG = super.g(jArr);
            this.f24274b.A();
            return zG;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int h(long... jArr) {
        this.f24274b.d();
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("DELETE FROM speedTestEnv WHERE resultId in (");
        AbstractC7211e.a(sbB, jArr.length);
        sbB.append(")");
        SupportSQLiteStatement supportSQLiteStatementF = this.f24274b.f(sbB.toString());
        int i10 = 1;
        for (long j10 : jArr) {
            supportSQLiteStatementF.bindLong(i10, j10);
            i10++;
        }
        this.f24274b.e();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementF.executeUpdateDelete();
            this.f24274b.A();
            return iExecuteUpdateDelete;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int i(long... jArr) {
        this.f24274b.d();
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("DELETE FROM speedTestId WHERE id in (");
        AbstractC7211e.a(sbB, jArr.length);
        sbB.append(")");
        SupportSQLiteStatement supportSQLiteStatementF = this.f24274b.f(sbB.toString());
        int i10 = 1;
        for (long j10 : jArr) {
            supportSQLiteStatementF.bindLong(i10, j10);
            i10++;
        }
        this.f24274b.e();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementF.executeUpdateDelete();
            this.f24274b.A();
            return iExecuteUpdateDelete;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int j(long... jArr) {
        this.f24274b.d();
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("DELETE FROM speedTestMeasurement WHERE resultId in (");
        AbstractC7211e.a(sbB, jArr.length);
        sbB.append(")");
        SupportSQLiteStatement supportSQLiteStatementF = this.f24274b.f(sbB.toString());
        int i10 = 1;
        for (long j10 : jArr) {
            supportSQLiteStatementF.bindLong(i10, j10);
            i10++;
        }
        this.f24274b.e();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementF.executeUpdateDelete();
            this.f24274b.A();
            return iExecuteUpdateDelete;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    public gg.i k(long j10) {
        t tVarJ = t.j("SELECT speedTestId.*, speedTestEnv.* FROM speedTestId INNER JOIN speedTestEnv ON speedTestId.id = speedTestEnv.resultId WHERE speedTestId.id = ?", 1);
        tVarJ.bindLong(1, j10);
        return AbstractC7061d.d(this.f24274b, true, new String[]{"speedTestMeasurement", "speedTestId", "speedTestEnv"}, new e(tVarJ));
    }

    @Override // Xb.e
    public Xb.d l(Xb.d dVar) {
        this.f24274b.e();
        try {
            Xb.d dVarL = super.l(dVar);
            this.f24274b.A();
            return dVarL;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected long m(Xb.a aVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            long jM = this.f24276d.m(aVar);
            this.f24274b.A();
            return jM;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected long n(Xb.b bVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            long jM = this.f24275c.m(bVar);
            this.f24274b.A();
            return jM;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected long o(Xb.c cVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            long jM = this.f24278f.m(cVar);
            this.f24274b.A();
            return jM;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    public boolean p(Xb.d dVar) {
        this.f24274b.e();
        try {
            boolean zP = super.p(dVar);
            this.f24274b.A();
            return zP;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int q(Xb.a aVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            int iJ = this.f24280h.j(aVar);
            this.f24274b.A();
            return iJ;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int r(Xb.b bVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            int iJ = this.f24279g.j(bVar);
            this.f24274b.A();
            return iJ;
        } finally {
            this.f24274b.i();
        }
    }

    @Override // Xb.e
    protected int s(Xb.c cVar) {
        this.f24274b.d();
        this.f24274b.e();
        try {
            int iJ = this.f24281i.j(cVar);
            this.f24274b.A();
            return iJ;
        } finally {
            this.f24274b.i();
        }
    }
}
