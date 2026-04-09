package R;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: R.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177d implements InterfaceC0176c, InterfaceC0178e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3311a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f3312b;

    /* renamed from: c, reason: collision with root package name */
    public int f3313c;

    /* renamed from: d, reason: collision with root package name */
    public int f3314d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f3315e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f3316f;

    public /* synthetic */ C0177d() {
    }

    @Override // R.InterfaceC0178e
    public ClipData b() {
        return this.f3312b;
    }

    @Override // R.InterfaceC0176c
    public C0179f build() {
        return new C0179f(new C0177d(this));
    }

    @Override // R.InterfaceC0176c
    public void c(Uri uri) {
        this.f3315e = uri;
    }

    @Override // R.InterfaceC0178e
    public int f() {
        return this.f3314d;
    }

    @Override // R.InterfaceC0176c
    public void g(int i) {
        this.f3314d = i;
    }

    @Override // R.InterfaceC0178e
    public ContentInfo h() {
        return null;
    }

    @Override // R.InterfaceC0178e
    public int j() {
        return this.f3313c;
    }

    @Override // R.InterfaceC0176c
    public void setExtras(Bundle bundle) {
        this.f3316f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f3311a) {
            case 1:
                Uri uri = this.f3315e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3312b.getDescription());
                sb.append(", source=");
                int i = this.f3313c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f3314d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return A.f.p(sb, this.f3316f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0177d(C0177d c0177d) {
        ClipData clipData = c0177d.f3312b;
        clipData.getClass();
        this.f3312b = clipData;
        int i = c0177d.f3313c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f3313c = i;
        int i3 = c0177d.f3314d;
        if ((i3 & 1) == i3) {
            this.f3314d = i3;
            this.f3315e = c0177d.f3315e;
            this.f3316f = c0177d.f3316f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
