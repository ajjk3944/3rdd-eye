package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zs extends c0 implements ys, Serializable {
    public final Enum[] f;

    public zs(Enum[] enumArr) {
        this.f = enumArr;
    }

    @Override // defpackage.c0
    public final int a() {
        return this.f.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // defpackage.c0, java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1a
        L5:
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r0 = r4.ordinal()
            if (r0 < 0) goto L15
            java.lang.Enum[] r1 = r3.f
            int r2 = r1.length
            if (r0 >= r2) goto L15
            r0 = r1[r0]
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != r4) goto L1a
            r4 = 1
            return r4
        L1a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // defpackage.c0, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L16
            java.lang.Enum[] r2 = r4.f
            int r3 = r2.length
            if (r0 >= r3) goto L16
            r2 = r2[r0]
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != r5) goto L1a
            return r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.indexOf(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // defpackage.c0, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int lastIndexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L16
            java.lang.Enum[] r2 = r4.f
            int r3 = r2.length
            if (r0 >= r3) goto L16
            r2 = r2[r0]
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != r5) goto L1a
            return r0
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs.lastIndexOf(java.lang.Object):int");
    }
}
