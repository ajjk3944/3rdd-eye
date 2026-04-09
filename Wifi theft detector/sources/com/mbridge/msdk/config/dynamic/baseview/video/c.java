package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private Context f13974b;

    /* renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f13975c;

    /* renamed from: d, reason: collision with root package name */
    private String f13976d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f13977e;

    /* renamed from: a, reason: collision with root package name */
    private int f13973a = 5000;

    /* renamed from: f, reason: collision with root package name */
    private long f13978f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f13979g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f13980h = 0;

    /* renamed from: i, reason: collision with root package name */
    private long f13981i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f13982j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f13983k = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b();
        }
    }

    public c(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f13974b = context;
        this.f13975c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f13976d);
            if (file.exists()) {
                a(file);
                return;
            }
            q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f13978f < this.f13973a) {
                this.f13982j.postDelayed(this.f13983k, 1000L);
            } else {
                a("resource buffer exception file is not found");
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f13978f = 0L;
        this.f13979g = 0L;
        this.f13980h = 0L;
        this.f13981i = 0L;
    }

    private void e() {
        if (this.f13975c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f13977e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f13974b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f13976d));
            this.f13975c.setRepeatMode(0);
            this.f13975c.prepare(extractorMediaSourceCreateMediaSource);
            this.f13975c.seekTo(this.f13979g);
            this.f13975c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.f13979g = 0L;
        this.f13980h = 0L;
        this.f13981i = 0L;
        this.f13974b = null;
        this.f13975c = null;
        this.f13977e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13977e = aVar;
        if (i10 > 0) {
            this.f13973a = i10 * 1000;
        }
        this.f13976d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f13977e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f13978f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f13975c;
        if (simpleExoPlayer != null) {
            this.f13979g = simpleExoPlayer.getCurrentPosition();
        }
        this.f13982j.post(this.f13983k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f13980h;
        boolean z10 = false;
        boolean z11 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f13981i;
        if (j11 != 0 && jLastModified != j11) {
            z10 = true;
        }
        this.f13980h = length;
        this.f13981i = jLastModified;
        if (z11 || z10) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f13978f < this.f13973a) {
            this.f13982j.postDelayed(this.f13983k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f13982j.removeCallbacks(this.f13983k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f13977e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f13977e.onPlayError(str);
        }
    }
}
