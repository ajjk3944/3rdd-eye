package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
abstract class U2 {
    static String a(B1 b12) {
        StringBuilder sb2 = new StringBuilder(b12.m());
        for (int i10 = 0; i10 < b12.m(); i10++) {
            byte bG = b12.g(i10);
            if (bG == 34) {
                sb2.append("\\\"");
            } else if (bG == 39) {
                sb2.append("\\'");
            } else if (bG != 92) {
                switch (bG) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bG < 32 || bG > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bG >>> 6) & 3) + 48));
                            sb2.append((char) (((bG >>> 3) & 7) + 48));
                            sb2.append((char) ((bG & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bG);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
