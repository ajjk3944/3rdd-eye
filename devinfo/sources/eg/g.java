package eg;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23461a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f23462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23463c;

    public /* synthetic */ g(i iVar, String str) {
        this.f23462b = iVar;
        this.f23463c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        String str;
        switch (this.f23461a) {
            case 0:
                boolean zEquals = this.f23463c.equals("video");
                i iVar = this.f23462b;
                String str2 = "N/A";
                try {
                    if (zEquals) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            str = iVar.f23465p0;
                        } catch (Exception unused) {
                            if (wi.h.f36760e) {
                                if (!(mediaMetadataRetriever instanceof AutoCloseable)) {
                                    if (mediaMetadataRetriever instanceof ExecutorService) {
                                        throw null;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                if (!wi.h.f36760e) {
                                    mediaMetadataRetriever.release();
                                } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                                    mediaMetadataRetriever.close();
                                } else {
                                    if (mediaMetadataRetriever instanceof ExecutorService) {
                                        throw null;
                                    }
                                    mediaMetadataRetriever.release();
                                }
                            } catch (Throwable unused2) {
                            }
                            throw th2;
                        }
                        if (str == null) {
                            nk.k.k("filePath");
                            throw null;
                        }
                        mediaMetadataRetriever.setDataSource(str);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(18) + "x" + strExtractMetadata;
                        if (wi.h.f36760e) {
                            if (!(mediaMetadataRetriever instanceof AutoCloseable)) {
                                if (mediaMetadataRetriever instanceof ExecutorService) {
                                    throw null;
                                }
                                mediaMetadataRetriever.release();
                            }
                            mediaMetadataRetriever.close();
                        }
                        mediaMetadataRetriever.release();
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        String str3 = iVar.f23465p0;
                        if (str3 == null) {
                            nk.k.k("filePath");
                            throw null;
                        }
                        FileInputStream fileInputStream = new FileInputStream(str3);
                        try {
                            BitmapFactory.decodeStream(fileInputStream, null, options);
                            String str4 = options.outWidth + "x" + options.outHeight;
                            fileInputStream.close();
                            str2 = str4;
                        } finally {
                        }
                    }
                } catch (Exception unused3) {
                }
                bi.d.b(new g(iVar, str2));
                return;
            default:
                i iVar2 = this.f23462b;
                if (iVar2.C || i0.l(iVar2.n())) {
                    return;
                }
                qg.f fVar = iVar2.f23466q0;
                if (fVar != null) {
                    fVar.f32378u.setText(this.f23463c);
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
        }
    }

    public /* synthetic */ g(String str, i iVar) {
        this.f23463c = str;
        this.f23462b = iVar;
    }
}
