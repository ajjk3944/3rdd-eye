package com.ubnt.mlkit.product;

import com.ubnt.mlkit.product.a;

/* loaded from: classes3.dex */
public final class b implements a {
    private final boolean b(a.b bVar, float f10) {
        return bVar.getMinRequiredConfidence$ar_object_detection_release() <= f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    @Override // com.ubnt.mlkit.product.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ubnt.mlkit.product.a.b a(java.lang.String r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.AbstractC6492s.i(r3, r0)
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1595611734: goto L6b;
                case -879122748: goto L5e;
                case 115556: goto L51;
                case 115646: goto L44;
                case 137785190: goto L37;
                case 610386568: goto L2a;
                case 1236235252: goto L1d;
                case 1731231116: goto L10;
                default: goto Le;
            }
        Le:
            goto L74
        L10:
            java.lang.String r0 = "amplifi_alien"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1a
            goto L74
        L1a:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.AMPLIFI_ALIEN
            goto L78
        L1d:
            java.lang.String r0 = "uap_flex"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L27
            goto L74
        L27:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.UNIFI_AP_FLEX
            goto L78
        L2a:
            java.lang.String r0 = "amplifi_mesh"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L74
        L34:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.AMPLIFI_MESHPOINT
            goto L78
        L37:
            java.lang.String r0 = "amplifi_instant"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto L74
        L41:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.AMPLIFI_INSTANT
            goto L78
        L44:
            java.lang.String r0 = "udm"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e
            goto L74
        L4e:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.UDM
            goto L78
        L51:
            java.lang.String r0 = "uap"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5b
            goto L74
        L5b:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.UNIFI_AP
            goto L78
        L5e:
            java.lang.String r0 = "amplifi"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L68
            goto L74
        L68:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.AMPLIFI
            goto L78
        L6b:
            java.lang.String r0 = "uap_inwall"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L76
        L74:
            r3 = r1
            goto L78
        L76:
            com.ubnt.mlkit.product.a$b r3 = com.ubnt.mlkit.product.a.b.UNIFI_AP_INWALL
        L78:
            if (r3 == 0) goto L81
            boolean r4 = r2.b(r3, r4)
            if (r4 == 0) goto L81
            r1 = r3
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ubnt.mlkit.product.b.a(java.lang.String, float):com.ubnt.mlkit.product.a$b");
    }
}
