package jg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.liuzh.deviceinfo.R;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    public final List f27654b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27655c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27656d;

    public d(List list) {
        this.f27654b = list;
        kg.d dVar = null;
        int i4 = 0;
        for (Object obj : list) {
            int i10 = i4 + 1;
            if (i4 < 0) {
                cm.g.N();
                throw null;
            }
            e eVar = (e) obj;
            dVar = dVar == null ? eVar.f27657b : dVar;
            this.f27655c = eVar.size() + this.f27655c;
            if (!eVar.f27660a && this.f27660a) {
                this.f27660a = false;
            }
            eVar.f27658c = this;
            eVar.f27659d = i4;
            i4 = i10;
        }
        if (!(dVar instanceof kg.a) || this.f27660a) {
            return;
        }
        this.f27656d = true;
    }

    @Override // kg.d
    public final CharSequence a() {
        return "";
    }

    @Override // kg.d
    public final Drawable b(Context context) {
        nk.k.e(context, "context");
        List list = this.f27654b;
        if (list.isEmpty()) {
            return null;
        }
        kg.d dVar = ((e) list.get(0)).f27657b;
        if (dVar instanceof kg.b) {
            return context.getDrawable(R.drawable.ic_clean_app_cache);
        }
        if (dVar instanceof kg.a) {
            return context.getDrawable(R.drawable.ic_clean_apk);
        }
        if (!(dVar instanceof kg.e)) {
            return null;
        }
        int i4 = ((kg.e) dVar).f28292e;
        int i10 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? -1 : R.drawable.ic_clean_cache : R.drawable.ic_clean_image : R.drawable.ic_clean_folder : R.drawable.ic_clean_file : R.drawable.ic_clean_log_file;
        if (i10 != -1) {
            return context.getDrawable(i10);
        }
        return null;
    }

    @Override // kg.d
    public final CharSequence d() {
        return "";
    }

    @Override // jg.f
    public final Serializable e() {
        return ((e) zj.n.c0(this.f27654b)).e();
    }

    @Override // kg.d
    public final CharSequence name() {
        CharSequence charSequenceD;
        e eVar = (e) zj.n.d0(this.f27654b);
        return (eVar == null || (charSequenceD = eVar.f27657b.d()) == null) ? "" : charSequenceD;
    }

    @Override // kg.d
    public final long size() {
        return this.f27655c;
    }
}
