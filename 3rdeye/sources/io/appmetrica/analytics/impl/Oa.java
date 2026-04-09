package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Oa extends O2 {

    /* renamed from: b, reason: collision with root package name */
    public final La f39932b;

    /* renamed from: c, reason: collision with root package name */
    public final La f39933c;

    /* renamed from: d, reason: collision with root package name */
    public final Na f39934d;

    public Oa(int i, int i10, int i11) {
        this(i, new La(i10), new La(i11));
    }

    public Oa(int i, La la2, La la3) {
        super(i);
        this.f39934d = new Na();
        this.f39932b = la2;
        this.f39933c = la3;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Ma
    public final Gn a(Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f39934d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i10 = 0;
            boolean z10 = false;
            int i11 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                Gn gnA = this.f39932b.a((String) entry.getKey());
                Gn gnA2 = this.f39933c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) gnA2.f39550a) + StringUtils.getUtf8BytesLength((String) gnA.f39550a);
                if (z10 || utf8BytesLength2 + i11 > this.f39918a) {
                    i10++;
                    bytesTruncated += utf8BytesLength;
                    z10 = true;
                } else {
                    bytesTruncated = gnA2.f39551b.getBytesTruncated() + gnA.f39551b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) gnA2.f39550a) + StringUtils.getUtf8BytesLength((String) gnA.f39550a) + i11;
                    map2.put((String) gnA.f39550a, (String) gnA2.f39550a);
                    i11 = utf8BytesLength3;
                }
                i++;
            }
            i = i10;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new Gn(map2, new I4(i, bytesTruncated));
    }
}
