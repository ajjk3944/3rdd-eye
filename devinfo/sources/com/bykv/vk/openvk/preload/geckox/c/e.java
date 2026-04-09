package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e extends com.bykv.vk.openvk.preload.a.d<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: d, reason: collision with root package name */
    private File f6728d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f6729e;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<Map<String, List<Pair<String, Long>>>> bVar, String str) throws Throwable {
        Long lA;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", str);
        HashMap map = new HashMap();
        for (String str2 : this.f6729e) {
            File file = new File(this.f6728d, str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(file2)) != null) {
                        arrayList.add(new Pair(str3, lA));
                    }
                }
            }
            map.put(str2, arrayList);
        }
        return bVar.a((com.bykv.vk.openvk.preload.a.b<Map<String, List<Pair<String, Long>>>>) map);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f6728d = (File) objArr[0];
        this.f6729e = (List) objArr[1];
    }
}
