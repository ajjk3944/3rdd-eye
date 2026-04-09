package u3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d implements c, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23149a = 0;

    /* renamed from: d, reason: collision with root package name */
    public ClipData f23150d;

    /* renamed from: g, reason: collision with root package name */
    public int f23151g;

    /* renamed from: r, reason: collision with root package name */
    public int f23152r;

    /* renamed from: x, reason: collision with root package name */
    public Uri f23153x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f23154y;

    public /* synthetic */ d() {
    }

    @Override // u3.c
    public void a(Uri uri) {
        this.f23153x = uri;
    }

    @Override // u3.e
    public ClipData b() {
        return this.f23150d;
    }

    @Override // u3.c
    public f build() {
        return new f(new d(this));
    }

    @Override // u3.c
    public void c(int i10) {
        this.f23152r = i10;
    }

    @Override // u3.e
    public int h() {
        return this.f23151g;
    }

    @Override // u3.e
    public int o() {
        return this.f23152r;
    }

    @Override // u3.e
    public ContentInfo p() {
        return null;
    }

    @Override // u3.c
    public void setExtras(Bundle bundle) {
        this.f23154y = bundle;
    }

    public String toString() {
        String str;
        switch (this.f23149a) {
            case 1:
                Uri uri = this.f23153x;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f23150d.getDescription());
                sb2.append(", source=");
                int i10 = this.f23151g;
                sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i11 = this.f23152r;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return w.g.j(sb2, this.f23154y != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d(d dVar) {
        ClipData clipData = dVar.f23150d;
        clipData.getClass();
        this.f23150d = clipData;
        int i10 = dVar.f23151g;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f23151g = i10;
        int i11 = dVar.f23152r;
        if ((i11 & 1) == i11) {
            this.f23152r = i11;
            this.f23153x = dVar.f23153x;
            this.f23154y = dVar.f23154y;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
