package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f6660e.iterator();
        while (it.hasNext()) {
            List<File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.f6659d, it.next()));
            if (listB != null && listB.size() > this.f6658c.f6650a) {
                for (File file : listB.subList(0, listB.size() - this.f6658c.f6650a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f6658c.f6651b != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
