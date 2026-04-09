package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15854c = "a";

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15855a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private boolean f15856b;

    /* renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    public class RunnableC0279a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f15857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f15859c;

        public RunnableC0279a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f15857a = bVar;
            this.f15858b = str;
            this.f15859c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f15857a;
            if (bVar != null) {
                bVar.a(this.f15858b, this.f15859c, a.this.f15856b);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f15861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f15862b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f15861a = bVar;
            this.f15862b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15861a != null) {
                this.f15862b.a(a.this.f15856b);
                this.f15861a.a(this.f15862b);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f15864a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15866c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f15864a = bVar;
            this.f15865b = str;
            this.f15866c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f15864a;
            if (bVar != null) {
                bVar.a(this.f15865b, this.f15866c, a.this.f15856b);
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f15868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f15869b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f15868a = bVar;
            this.f15869b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15868a != null) {
                this.f15869b.a(a.this.f15856b);
                this.f15868a.b(this.f15869b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f15854c, "postResourceFail unitId=" + bVar2);
        this.f15855a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f15856b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f15854c, "postCampaignSuccess unitId=" + str);
        this.f15855a.post(new RunnableC0279a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f15855a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f15854c, "postResourceSuccess unitId=" + str);
        this.f15855a.post(new c(bVar, str, i10));
    }
}
