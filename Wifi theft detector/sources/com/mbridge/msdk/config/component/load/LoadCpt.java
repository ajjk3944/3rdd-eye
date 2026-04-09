package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.config.component.load.downloader.g;
import com.mbridge.msdk.config.component.load.downloader.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {

    /* renamed from: l, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.model.a f13369l;

    /* renamed from: h, reason: collision with root package name */
    private final String f13365h = "LoadCpt";

    /* renamed from: i, reason: collision with root package name */
    final String f13366i = "1000001";

    /* renamed from: j, reason: collision with root package name */
    final String f13367j = "1000002";

    /* renamed from: k, reason: collision with root package name */
    final String f13368k = "1000003";

    /* renamed from: m, reason: collision with root package name */
    int f13370m = 0;

    /* renamed from: n, reason: collision with root package name */
    final h<Object> f13371n = new a();

    public class a implements h<Object> {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void b(b<Object> bVar) {
            HashMap map = new HashMap();
            map.put(c.a("file_size"), String.valueOf(bVar.a()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void c(b<Object> bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void d(b<Object> bVar) {
            HashMap map = new HashMap();
            map.put(c.a("percent"), String.valueOf(bVar.b()));
            map.put(c.a("file_size"), String.valueOf(bVar.a()));
            map.put(c.a("file_path"), bVar.e());
            map.put(c.a("md5"), bVar.f());
            try {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.f13369l.d());
                if (bVarE != null && bVarE.b().contains("zip") && bVar.b() >= 100.0f) {
                    if (TextUtils.isEmpty(bVarE.d())) {
                        map.put(c.a("file_path"), bVarE.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.b(bVar.e(), com.mbridge.msdk.config.component.common.file.a.g(LoadCpt.this.f13369l.d()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put(c.a("file_path"), com.mbridge.msdk.config.component.common.file.a.j(LoadCpt.this.f13369l.d()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", map));
            } catch (Exception e10) {
                LoadCpt.this.a("912005", "1000002", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap map = new HashMap();
            map.put(c.a("percent"), String.valueOf(bVar.b()));
            map.put(c.a("file_size"), String.valueOf(bVar.a()));
            map.put(c.a("code"), "1000002");
            map.put(c.a("reason"), aVar.a().getMessage());
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.h
        public void a(b<Object> bVar, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.g()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f13370m) {
                return;
            }
            loadCpt.f13370m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put(c.a("percent"), String.valueOf(currentDownloadRate));
            map.put(c.a("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", map));
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f13369l.d());
            if (bVarE == null) {
                return;
            }
            int iB = (int) (this.f13369l.b() * 100.0f);
            com.mbridge.msdk.config.component.load.model.a aVar = this.f13369l;
            g.a().a(new b<>(aVar, aVar.d(), bVarE.a(), iB)).b(this.f13369l.f()).a(this.f13369l.f()).c(this.f13369l.f()).a(com.mbridge.msdk.config.component.load.downloader.c.HIGH).withHttpRetryCounter(this.f13369l.e()).a(this.f13371n).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).build().n();
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
            HashMap map = new HashMap();
            map.put(c.a("code"), "");
            map.put(c.a("reason"), th.getMessage());
            a(a("912005", map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f13092f = "912001";
        this.f13369l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.f13369l.a())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.f13369l.a().equals(c.a("310"))) {
            j();
        }
        if (this.f13369l.a().equals(c.a("311"))) {
            i();
        }
    }

    public void h() {
        try {
            if (g.a().b()) {
                return;
            }
            g.a().a(new f.b().a(this.f13369l.c()).a());
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
        }
    }

    public void i() {
        if (this.f13369l != null) {
            String strB = g.a().b(this.f13369l.d());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            g.a().a(strB);
        }
    }

    public void j() {
        if (this.f13369l != null) {
            g();
        }
    }
}
