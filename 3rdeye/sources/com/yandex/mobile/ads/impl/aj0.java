package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.rq1;
import com.yandex.mobile.ads.impl.yc1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class aj0 {

    /* renamed from: a, reason: collision with root package name */
    private final cq1 f24694a;

    /* renamed from: b, reason: collision with root package name */
    private final b f24695b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f24696c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, a> f24697d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f24698e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private Runnable f24699f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final op1<?> f24700a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f24701b;

        /* renamed from: c, reason: collision with root package name */
        private fi2 f24702c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f24703d;

        public a(fj0 fj0Var, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.f24703d = arrayList;
            this.f24700a = fj0Var;
            arrayList.add(cVar);
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f24704a;

        /* renamed from: b, reason: collision with root package name */
        private final d f24705b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24706c;

        public c(Bitmap bitmap, String str, d dVar) {
            this.f24704a = bitmap;
            this.f24706c = str;
            this.f24705b = dVar;
        }

        public final void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.f24705b == null) {
                return;
            }
            a aVar = (a) aj0.this.f24696c.get(this.f24706c);
            if (aVar != null) {
                aVar.f24703d.remove(this);
                if (aVar.f24703d.size() == 0) {
                    aVar.f24700a.a();
                    aj0.this.f24696c.remove(this.f24706c);
                    return;
                }
                return;
            }
            a aVar2 = (a) aj0.this.f24697d.get(this.f24706c);
            if (aVar2 != null) {
                aVar2.f24703d.remove(this);
                if (aVar2.f24703d.size() == 0) {
                    aVar2.f24700a.a();
                }
                if (aVar2.f24703d.size() == 0) {
                    aj0.this.f24697d.remove(this.f24706c);
                }
            }
        }

        public final Bitmap b() {
            return this.f24704a;
        }
    }

    public interface d extends rq1.a {
        void a(c cVar, boolean z10);
    }

    public aj0(cq1 cq1Var, yc1.b bVar) {
        this.f24694a = cq1Var;
        this.f24695b = bVar;
    }

    public String a(String str, int i, int i10, ImageView.ScaleType scaleType) {
        throw null;
    }

    public final c a(String str, d dVar, int i, int i10) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String strA = a(str, i, i10, scaleType);
            Bitmap bitmapA = this.f24695b.a(strA);
            if (bitmapA != null) {
                c cVar = new c(bitmapA, null, null);
                dVar.a(cVar, true);
                return cVar;
            }
            c cVar2 = new c(null, strA, dVar);
            dVar.a(cVar2, true);
            a aVar = this.f24696c.get(strA);
            if (aVar == null) {
                aVar = this.f24697d.get(strA);
            }
            if (aVar != null) {
                aVar.f24703d.add(cVar2);
                return cVar2;
            }
            fj0 fj0Var = new fj0(str, new xi0(this, strA), i, i10, scaleType, Bitmap.Config.RGB_565, new yi0(this, strA));
            this.f24694a.a(fj0Var);
            this.f24696c.put(strA, new a(fj0Var, cVar2));
            return cVar2;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
