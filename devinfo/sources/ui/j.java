package ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.gms.internal.measurement.j4;
import com.liuzh.deviceinfo.R;
import java.text.SimpleDateFormat;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class j extends b5.z {
    public k Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f35394a0;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        View viewInflate = layoutInflater.inflate(R.layout.appi_appinfo_certificate, viewGroup, false);
        this.f35394a0 = viewInflate;
        dj.b.n((ScrollView) viewInflate, (z2.k) a.a.f3c.f189b);
        if (this.Z == null) {
            return this.f35394a0;
        }
        c0();
        return this.f35394a0;
    }

    public final void c0() {
        View view = this.f35394a0;
        if (view == null) {
            return;
        }
        k kVar = this.Z;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content);
        kVar.getClass();
        List list = ti.e.f34667a;
        String str = a.a.s() ? "yyyy-MM-dd a hh:mm" : "dd/MM/yy hh:mm a";
        Context context = pk.a.f32022a;
        nk.k.b(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, j4.q(context));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_sign_algorithm, kVar.f35398a, R.string.appi_sign_algorithm_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_start_date, simpleDateFormat.format(kVar.f35401d), R.string.appi_start_date_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_end_date, simpleDateFormat.format(kVar.f35402e), R.string.appi_end_date_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_public_key_md5, kVar.f35400c, R.string.appi_public_key_md5_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_cert_md5, kVar.f35399b, R.string.appi_cert_md5_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_serial_number, kVar.f35403f, R.string.appi_serial_number_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_issuer_name, kVar.g, R.string.appi_issuer_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_issuer_organization, kVar.f35404h, R.string.appi_issuer_organization_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_issuer_country, kVar.f35405i, R.string.appi_issuer_country_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_subject_name, kVar.j, R.string.appi_subject_name_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_subject_organization, kVar.f35406k, R.string.appi_subject_organization_description);
        r5.c.b(layoutInflaterFrom, linearLayout, R.string.appi_subject_country, kVar.f35407l, R.string.appi_subject_country_description);
    }
}
