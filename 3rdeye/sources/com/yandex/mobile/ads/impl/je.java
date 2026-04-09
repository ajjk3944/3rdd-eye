package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class je extends hy1 {
    @Override // com.yandex.mobile.ads.impl.hy1
    public final yz0 a(b01 b01Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            tf1 tf1Var = new tf1(byteBuffer.limit(), byteBuffer.array());
            tf1Var.d(12);
            int iD = (tf1Var.d() + tf1Var.b(12)) - 4;
            tf1Var.d(44);
            tf1Var.e(tf1Var.b(12));
            tf1Var.d(16);
            ArrayList arrayList = new ArrayList();
            while (tf1Var.d() < iD) {
                tf1Var.d(48);
                int iB = tf1Var.b(8);
                tf1Var.d(4);
                int iD2 = tf1Var.d() + tf1Var.b(12);
                String strA = null;
                String strA2 = null;
                while (tf1Var.d() < iD2) {
                    int iB2 = tf1Var.b(8);
                    int iB3 = tf1Var.b(8);
                    int iD3 = tf1Var.d() + iB3;
                    if (iB2 == 2) {
                        int iB4 = tf1Var.b(16);
                        tf1Var.d(8);
                        if (iB4 == 3) {
                            while (tf1Var.d() < iD3) {
                                strA = tf1Var.a(tf1Var.b(8), fo.f27408a);
                                int iB5 = tf1Var.b(8);
                                for (int i = 0; i < iB5; i++) {
                                    tf1Var.e(tf1Var.b(8));
                                }
                            }
                        }
                    } else if (iB2 == 21) {
                        strA2 = tf1Var.a(iB3, fo.f27408a);
                    }
                    tf1Var.c(iD3 * 8);
                }
                tf1Var.c(iD2 * 8);
                if (strA != null && strA2 != null) {
                    arrayList.add(new ie(iB, strA.concat(strA2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new yz0(arrayList);
            }
        }
        return null;
    }
}
