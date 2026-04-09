package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19229i = 0;

    /* renamed from: h, reason: collision with root package name */
    private Handler f19230h = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19232b;

        public a(Object obj, String str) {
            this.f19231a = obj;
            this.f19232b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f19231a, this.f19232b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19235b;

        public b(Object obj, String str) {
            this.f19234a = obj;
            this.f19235b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f19234a, this.f19235b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19238b;

        public c(Object obj, String str) {
            this.f19237a = obj;
            this.f19238b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f19237a, this.f19238b);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19240a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19241b;

        public d(Object obj, String str) {
            this.f19240a = obj;
            this.f19241b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f19240a, this.f19241b);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19244b;

        public e(Object obj, String str) {
            this.f19243a = obj;
            this.f19244b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f19243a, this.f19244b);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19247b;

        public f(Object obj, String str) {
            this.f19246a = obj;
            this.f19247b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f19246a, this.f19247b);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19250b;

        public g(Object obj, String str) {
            this.f19249a = obj;
            this.f19250b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f19249a, this.f19250b);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19253b;

        public h(Object obj, String str) {
            this.f19252a = obj;
            this.f19253b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            RewardSignal.super.openURL(this.f19252a, this.f19253b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (v0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f19230h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (v0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f19230h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (v0.h()) {
            super.install(obj, str);
        } else {
            this.f19230h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f19230h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) throws JSONException {
        if (v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f19230h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (v0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.f19230h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f19230h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f19230h.post(new e(obj, str));
        }
    }
}
