package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a extends com.bykv.vk.openvk.preload.a.a<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.a.a
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknow file type: ".concat(String.valueOf(packageType)));
    }
}
