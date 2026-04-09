package r5;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.R;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void a(x5.a aVar, d6.a aVar2) {
        nk.k.e(aVar2, "connection");
        if (aVar2 instanceof w5.a) {
            aVar.c(((w5.a) aVar2).f36470a);
        }
    }

    public static void b(LayoutInflater layoutInflater, ViewGroup viewGroup, final int i4, final String str, final int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.appi_app_info_normal_item, viewGroup, false);
        ((TextView) viewInflate.findViewById(android.R.id.title)).setText(i4);
        ((TextView) viewInflate.findViewById(android.R.id.summary)).setText(str);
        viewGroup.addView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: ui.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t7.m mVar = new t7.m(view.getContext());
                String str2 = view.getContext().getString(i4) + ": " + str;
                i.b bVar = (i.b) mVar.f34474c;
                bVar.f25233d = str2;
                bVar.f25235f = view.getContext().getString(i10);
                mVar.w(android.R.string.ok, null);
                ((z2.k) a.a.f3c.f189b).d(mVar.A());
            }
        });
        viewInflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: ui.a0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                nh.a.c(view.getContext(), view.getContext().getString(i4), str, true);
                return true;
            }
        });
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int d(float f10, int i4, int i10) {
        return (Float.floatToIntBits(f10) + i4) * i10;
    }

    public static int e(int i4, int i10) {
        return String.valueOf(i4).length() + i10;
    }

    public static int f(int i4, int i10, String str) {
        return str.length() + i4 + i10;
    }

    public static Bundle g(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String h(int i4, String str, String str2) {
        return str + i4 + str2;
    }

    public static String i(int i4, String str, String str2, int i10, String str3) {
        return str + i4 + str2 + i10 + str3;
    }

    public static String j(int i4, String str, StringBuilder sb2) {
        sb2.append(i4);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, float f10, char c9) {
        sb2.append(f10);
        sb2.append(c9);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, char c9) {
        sb2.append(str);
        sb2.append(c9);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder n(int i4, String str, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static vb.a p(Parcel parcel) {
        vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
        parcel.recycle();
        return aVarR0;
    }

    public static void q(int i4, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(i10);
    }

    public static void r(Context context, int i4, StringBuilder sb2, String str) {
        sb2.append(context.getString(i4));
        sb2.append(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            a3.a.k((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    public static void t(boolean z3, l0 l0Var) {
        l0Var.h(new ng.a(z3));
    }

    public static /* synthetic */ String u(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String v(int i4) {
        switch (i4) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i4) {
        switch (i4) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
