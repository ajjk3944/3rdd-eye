package com.bykv.vk.openvk.preload.geckox.net;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

/* loaded from: classes.dex */
public interface INetWork {
    Response doGet(String str);

    Response doPost(String str, String str2);

    Response doPost(String str, List<Pair<String, String>> list);

    void downloadFile(String str, long j6, BufferOutputStream bufferOutputStream);

    void syncDoGet(String str);
}
