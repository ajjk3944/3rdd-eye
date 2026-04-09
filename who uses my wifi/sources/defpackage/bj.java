package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bj implements aj, cj {
    public final /* synthetic */ int f = 0;
    public ClipData g;
    public int h;
    public int i;
    public Uri j;
    public Bundle k;

    public /* synthetic */ bj() {
    }

    @Override // defpackage.aj
    public dj build() {
        return new dj(new bj(this));
    }

    @Override // defpackage.cj
    public ClipData d() {
        return this.g;
    }

    @Override // defpackage.cj
    public int f() {
        return this.i;
    }

    @Override // defpackage.cj
    public ContentInfo i() {
        return null;
    }

    @Override // defpackage.cj
    public int j() {
        return this.h;
    }

    @Override // defpackage.aj
    public void k(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.aj
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    @Override // defpackage.aj
    public void t(int i) {
        this.i = i;
    }

    public String toString() {
        String str;
        switch (this.f) {
            case 1:
                Uri uri = this.j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.g.getDescription());
                sb.append(", source=");
                int i = this.h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ex0.k(sb, this.k != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public bj(bj bjVar) {
        ClipData clipData = bjVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = bjVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.h = i;
        int i2 = bjVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = bjVar.j;
            this.k = bjVar.k;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
