package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f18830d;

    /* renamed from: a, reason: collision with root package name */
    private View f18831a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f18832b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f18833c;

    /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    public class RunnableC0338a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f18834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18836c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f18837d;

        /* renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        public class RunnableC0339a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.b f18839a;

            public RunnableC0339a(a.b bVar) {
                this.f18839a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f18831a == null || this.f18839a.build() == null) {
                    return;
                }
                a.this.f18831a.setBackground(this.f18839a.build());
            }
        }

        public RunnableC0338a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f18834a = bitmap;
            this.f18835b = i10;
            this.f18836c = f10;
            this.f18837d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f18834a, 10);
                Bitmap bitmapA2 = a0.a(this.f18834a, 10);
                a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f18835b).b(bitmapA).a(bitmapA2);
                if (this.f18835b == 2) {
                    float f10 = this.f18836c;
                    float f11 = this.f18837d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f18837d);
                    } else {
                        bVarA.b(f11).a(this.f18836c);
                    }
                } else {
                    bVarA.b(this.f18836c).a(this.f18837d);
                }
                if (a.this.f18831a != null) {
                    a.this.f18831a.post(new RunnableC0339a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f18831a != null) {
            this.f18831a = null;
        }
        Bitmap bitmap = this.f18832b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f18832b.recycle();
            this.f18832b = null;
        }
        Bitmap bitmap2 = this.f18833c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f18833c.recycle();
        this.f18833c = null;
    }

    public static a a() {
        a aVar;
        if (f18830d != null) {
            return f18830d;
        }
        synchronized (a.class) {
            try {
                if (f18830d == null) {
                    f18830d = new a();
                }
                aVar = f18830d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f18831a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md52 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md52) && map.containsKey(md52)) {
                bitmap = map.get(md52);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
            } catch (Exception e10) {
                e = e10;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
            try {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0338a(bitmap, i10, f10, f11));
            } catch (Exception e11) {
                e = e11;
                q0.a("ChoiceOneDrawBitBg", e.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
