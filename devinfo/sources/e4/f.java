package e4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22328a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f22329b;

    /* renamed from: c, reason: collision with root package name */
    public int f22330c;

    /* renamed from: d, reason: collision with root package name */
    public int f22331d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f22332e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f22333f;

    public /* synthetic */ f() {
    }

    @Override // e4.e
    public void a(Uri uri) {
        this.f22332e = uri;
    }

    @Override // e4.e
    public void b(int i4) {
        this.f22331d = i4;
    }

    @Override // e4.e
    public h build() {
        return new h(new f(this));
    }

    @Override // e4.g
    public int e() {
        return this.f22330c;
    }

    @Override // e4.g
    public ClipData f() {
        return this.f22329b;
    }

    @Override // e4.g
    public int g() {
        return this.f22331d;
    }

    @Override // e4.g
    public ContentInfo h() {
        return null;
    }

    @Override // e4.e
    public void setExtras(Bundle bundle) {
        this.f22333f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f22328a) {
            case 1:
                Uri uri = this.f22332e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f22329b.getDescription());
                sb2.append(", source=");
                int i4 = this.f22330c;
                sb2.append(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.f22331d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return d.h.w(sb2, this.f22333f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(f fVar) {
        ClipData clipData = fVar.f22329b;
        clipData.getClass();
        this.f22329b = clipData;
        int i4 = fVar.f22330c;
        if (i4 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i4 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f22330c = i4;
        int i10 = fVar.f22331d;
        if ((i10 & 1) == i10) {
            this.f22331d = i10;
            this.f22332e = fVar.f22332e;
            this.f22333f = fVar.f22333f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
