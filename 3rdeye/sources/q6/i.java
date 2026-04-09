package Q6;

import H6.C0675l;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import b9.C1992A;

/* compiled from: ErrorView.kt */
/* loaded from: classes.dex */
public final class i implements j6.d {

    /* renamed from: b, reason: collision with root package name */
    public final C0675l f11337b;

    /* renamed from: c, reason: collision with root package name */
    public final g f11338c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11339d;

    /* renamed from: e, reason: collision with root package name */
    public r7.g f11340e;

    /* renamed from: f, reason: collision with root package name */
    public a f11341f;

    /* renamed from: g, reason: collision with root package name */
    public j f11342g;

    /* renamed from: h, reason: collision with root package name */
    public final e f11343h;

    public i(C0675l root, g errorModel, boolean z10) {
        kotlin.jvm.internal.l.f(root, "root");
        kotlin.jvm.internal.l.f(errorModel, "errorModel");
        this.f11337b = root;
        this.f11338c = errorModel;
        this.f11339d = z10;
        C9.r rVar = new C9.r(this, 8);
        errorModel.f11330d.add(rVar);
        rVar.invoke(errorModel.i);
        this.f11343h = new e(errorModel, rVar);
    }

    public static final Object a(i iVar, String str) {
        C0675l c0675l = iVar.f11337b;
        Object systemService = c0675l.getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return C1992A.f18074a;
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(str)));
            Toast.makeText(c0675l.getContext(), "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            return C1992A.f18074a;
        } catch (Exception e4) {
            return b9.n.a(new RuntimeException("Failed paste report to clipboard!", e4));
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f11343h.close();
        r7.g gVar = this.f11340e;
        C0675l c0675l = this.f11337b;
        c0675l.removeView(gVar);
        c0675l.removeView(this.f11341f);
    }
}
