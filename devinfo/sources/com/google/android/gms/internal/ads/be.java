package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    public final h91 f9653a;

    /* renamed from: b, reason: collision with root package name */
    public final fk0 f9654b;

    /* renamed from: c, reason: collision with root package name */
    public final vc f9655c;

    public be(Context context, Executor executor, vc vcVar, fk0 fk0Var) {
        this.f9654b = fk0Var;
        this.f9655c = vcVar;
        this.f9653a = yo0.z(executor, new ae(0, this, context));
    }

    public static String b(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i4 = fileInputStream.read(bArr); i4 != -1; i4 = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i4);
                }
                m61 m61VarF = m61.f13779f.f();
                byte[] bArrDigest = messageDigest.digest();
                String strG = m61VarF.g(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strG;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.vc r0 = r12.f9655c
            r1 = 31
            com.google.android.gms.internal.ads.fk0 r2 = r12.f9654b
            java.lang.String r3 = "E"
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r2.f11194b
            com.google.android.gms.internal.ads.h91 r2 = (com.google.android.gms.internal.ads.h91) r2
            boolean r4 = r0.D()
            if (r4 != 0) goto L3a
            if (r2 == 0) goto L3a
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L20
            boolean r4 = r2.isDone()
            if (r4 == 0) goto L3a
        L20:
            int r4 = r0.B()     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.get(r4, r6)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.md r2 = (com.google.android.gms.internal.ads.md) r2     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3a
            boolean r4 = r2.a0()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3a
            java.lang.String r2 = r2.v0()     // Catch: java.lang.Throwable -> L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto Lbd
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r1) goto L47
            goto Lbd
        L47:
            java.lang.String r5 = ""
            if (r4 >= r1) goto L50
            com.google.android.gms.internal.ads.s81 r1 = com.google.android.gms.internal.ads.yo0.e(r5)     // Catch: java.lang.Throwable -> Lbd
            goto Laf
        L50:
            java.lang.String r7 = r13.getPackageName()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.j61 r4 = com.google.android.gms.internal.ads.m61.f13779f     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.m61 r6 = r4.f()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"
            byte[] r6 = r6.h(r8)     // Catch: java.lang.Throwable -> Lab
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r10.<init>()     // Catch: java.lang.Throwable -> Lab
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r6)     // Catch: java.lang.Throwable -> Lab
            java.security.cert.Certificate r6 = r1.generateCertificate(r8)     // Catch: java.lang.Throwable -> Lab
            r10.add(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "user"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> Lab
            if (r6 != 0) goto L97
            com.google.android.gms.internal.ads.m61 r4 = r4.f()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"
            byte[] r4 = r4.h(r6)     // Catch: java.lang.Throwable -> Lab
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lab
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            java.security.cert.Certificate r1 = r1.generateCertificate(r6)     // Catch: java.lang.Throwable -> Lab
            r10.add(r1)     // Catch: java.lang.Throwable -> Lab
        L97:
            com.google.android.gms.internal.ads.zd r11 = new com.google.android.gms.internal.ads.zd     // Catch: java.lang.Throwable -> Lab
            r11.<init>()     // Catch: java.lang.Throwable -> Lab
            android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch: java.lang.Throwable -> Lab
            r8 = 0
            r9 = 8
            r6.requestChecksums(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r11.f19062b     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.d91 r1 = (com.google.android.gms.internal.ads.d91) r1     // Catch: java.lang.Throwable -> Lab
            goto Laf
        Lab:
            com.google.android.gms.internal.ads.s81 r1 = com.google.android.gms.internal.ads.yo0.e(r5)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
        Laf:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
            boolean r4 = com.google.android.gms.internal.ads.yr1.k(r1)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
            r5 = 1
            if (r5 == r4) goto Lbd
            r2 = r1
        Lbd:
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto Lcd
            boolean r0 = r0.A()
            if (r0 != 0) goto Lcd
            java.lang.String r2 = b(r13)     // Catch: java.lang.ClassCastException -> Lcd
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be.a(android.content.Context):java.lang.String");
    }
}
