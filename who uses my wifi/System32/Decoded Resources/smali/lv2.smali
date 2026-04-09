.class public final Llv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;
.implements Ltz2;
.implements Lqq2;
.implements Lp93;
.implements Lzc;
.implements Lkx3;
.implements Lpx2;
.implements Lvs2;
.implements Lws2;
.implements Lnp2;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xb

    iput v0, p0, Llv2;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Llv2;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv2;->g:Ljava/lang/Object;

    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, p0, Llv2;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Llv2;->f:I

    iput-object p1, p0, Llv2;->g:Ljava/lang/Object;

    iput-object p2, p0, Llv2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p3, p0, Llv2;->f:I

    iput-object p1, p0, Llv2;->h:Ljava/lang/Object;

    iput-object p2, p0, Llv2;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, Llv2;->f:I

    iput-object p2, p0, Llv2;->g:Ljava/lang/Object;

    iput-object p3, p0, Llv2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmv2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Llv2;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv2;->h:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llv2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt83;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Llv2;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llv2;->h:Ljava/lang/Object;

    return-void
.end method

.method private final j(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Llv2;->f:I

    packed-switch v0, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Llv2;->h()Lwt2;

    move-result-object v0

    return-object v0

    .line 2
    :pswitch_0
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    check-cast v0, Le51;

    iget v1, v0, Le51;->g:I

    iget v0, v0, Le51;->h:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    const-string v1, "Google"

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    new-instance v2, Lof0;

    invoke-direct {v2, v1, v0}, Lof0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    check-cast v0, Landroid/webkit/WebView;

    .line 7
    new-instance v1, Lcc3;

    invoke-direct {v1, v2, v0}, Lcc3;-><init>(Lof0;Landroid/webkit/WebView;)V

    return-object v1

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    const-string v1, "Version is null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    const-string v1, "Name is null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public a()V
    .locals 3

    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    check-cast v0, Lb23;

    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    check-cast v1, Luz1;

    .line 12
    iget-object v0, v0, Lb23;->d:Ljava/lang/Object;

    check-cast v0, Lvz1;

    .line 13
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    move-result-object v2

    .line 14
    invoke-static {v2, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v2, v1}, Lsb1;->M0(Landroid/os/Parcel;I)V

    return-void
.end method

.method public b(I[B)[B
    .locals 2

    .line 1
    array-length v0, p2

    .line 2
    const/16 v1, 0x40

    .line 3
    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Llx3;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Llx3;->b(I[B)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lwt2;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lwt2;->b(I[B)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwt2;

    .line 4
    .line 5
    iget-object v0, v0, Lwt2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lkh4;

    .line 8
    .line 9
    check-cast p1, Lrh4;

    .line 10
    .line 11
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lhh4;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {p1, v2, v0, v1}, Lrh4;->p(ILkh4;Lhh4;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public synthetic e(Ljava/lang/Object;Lof4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmd4;

    .line 4
    .line 5
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf74;

    .line 8
    .line 9
    check-cast p1, Lbd4;

    .line 10
    .line 11
    iget-object v0, v0, Lmd4;->j:Landroid/util/SparseArray;

    .line 12
    .line 13
    new-instance v2, Lmr2;

    .line 14
    .line 15
    invoke-direct {v2, p2, v0}, Lmr2;-><init>(Lof4;Landroid/util/SparseArray;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1, v2}, Lbd4;->m(Lf74;Lmr2;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public f(Lyc;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lvf3;

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1f

    .line 12
    .line 13
    const-string v4, ""

    .line 14
    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v4}, Lyc;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v4

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "X.509"

    .line 26
    .line 27
    invoke-static {v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v1}, Lvf3;->O()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"

    .line 36
    .line 37
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const/4 v6, 0x0

    .line 42
    move v7, v6

    .line 43
    :goto_0
    const/4 v8, 0x2

    .line 44
    if-ge v7, v8, :cond_2

    .line 45
    .line 46
    aget-object v9, v5, v7

    .line 47
    .line 48
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-nez v10, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v9, v4

    .line 59
    :goto_1
    sget-object v5, Ljo3;->f:Lgo3;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljo3;->f()Ljo3;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7, v9}, Ljo3;->h(Ljava/lang/String;)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    new-instance v9, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v10, Ljava/io/ByteArrayInputStream;

    .line 75
    .line 76
    invoke-direct {v10, v7}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v10}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    sget-object v7, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 87
    .line 88
    const-string v10, "user"

    .line 89
    .line 90
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_5

    .line 95
    .line 96
    invoke-virtual {v1}, Lvf3;->P()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v7, "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"

    .line 101
    .line 102
    filled-new-array {v1, v7}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_2
    if-ge v6, v8, :cond_4

    .line 107
    .line 108
    aget-object v7, v1, v6

    .line 109
    .line 110
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-nez v10, :cond_3

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object v7, v4

    .line 121
    :goto_3
    invoke-virtual {v5}, Ljo3;->f()Ljo3;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1, v7}, Ljo3;->h(Ljava/lang/String;)[B

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v5, Ljava/io/ByteArrayInputStream;

    .line 130
    .line 131
    invoke-direct {v5, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v1, Lfs1;

    .line 146
    .line 147
    const/4 v3, 0x2

    .line 148
    invoke-direct {v1, v3, p1}, Lfs1;-><init>(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v2, v9, v1}, Llb;->D(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/util/ArrayList;Lfs1;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return-object v4

    .line 155
    :catch_0
    invoke-virtual {p1, v4}, Lyc;->a(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-object v4
.end method

.method public g(Lir3;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw3;

    .line 4
    .line 5
    invoke-virtual {p1}, Lir3;->a()Lgi2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lew3;

    .line 12
    .line 13
    invoke-interface {v1}, Lew3;->d()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, p1, v1}, Ldw3;->a(Lgi2;Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public h()Lwt2;
    .locals 5

    .line 1
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lax0;

    .line 4
    .line 5
    iget-object v0, v0, Lax0;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/app/Application;

    .line 8
    .line 9
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lls2;

    .line 12
    .line 13
    invoke-virtual {v1}, Lls2;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lmo1;

    .line 18
    .line 19
    new-instance v2, Lwt2;

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v2, v0, v1, v3, v4}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 25
    .line 26
    .line 27
    return-object v2
.end method

.method public i(La83;)V
    .locals 2

    .line 1
    const-string v0, "aai"

    .line 2
    .line 3
    iget-object v1, p1, La83;->w:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "request_id"

    .line 9
    .line 10
    iget-object v1, p1, La83;->n0:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget p1, p1, La83;->b:I

    .line 16
    .line 17
    invoke-static {p1}, La83;->a(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "ad_format"

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)Leg4;
    .locals 4

    .line 1
    sget-object v0, Llf4;->l:Li63;

    .line 2
    .line 3
    sget-object v0, Lhg4;->C:Lhg4;

    .line 4
    .line 5
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 6
    .line 7
    iget-object v0, p0, Llv2;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v2, Lw72;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v0, v1, p1, v3}, Lw72;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx34;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lf74;->r1()Ln70;

    .line 22
    .line 23
    .line 24
    sget-object p1, Leg4;->f:Leg4;

    .line 25
    .line 26
    return-object p1
.end method

.method public m()V
    .locals 2

    .line 1
    new-instance v0, Lkv2;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lkv2;-><init>(Llv2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lmv2;

    .line 10
    .line 11
    iget-object v1, v1, Lmv2;->b:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public n()Leg4;
    .locals 4

    .line 1
    sget-object v0, Lmz1;->Ne:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, Leg4;->f:Leg4;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lmv2;

    .line 24
    .line 25
    iget-object v2, p0, Llv2;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    iget-object v0, v0, Lmv2;->a:Lpv2;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    const-string v0, "Empty paramMap."

    .line 41
    .line 42
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_0
    iget-object v1, v0, Lpv2;->f:Lgs3;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lgs3;->a(Ljava/util/Map;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Lpv2;->d:Lug4;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, v1, v2}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :cond_1
    invoke-virtual {p0}, Llv2;->m()V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method

.method public o()V
    .locals 2

    .line 1
    new-instance v0, Lkv2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lkv2;-><init>(Llv2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Llv2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lmv2;

    .line 10
    .line 11
    iget-object v1, v1, Lmv2;->b:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Llv2;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :sswitch_0
    check-cast p1, Ljava/lang/Void;

    .line 8
    .line 9
    iget-object p1, p0, Llv2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lpj4;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    const/4 p1, 0x0

    .line 16
    :try_start_0
    iput-object p1, v0, Lpj4;->j:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, v0, Lpj4;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ljava/util/ArrayDeque;

    .line 21
    .line 22
    iget-object v1, p0, Llv2;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La73;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget p1, v0, Lpj4;->f:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-ne p1, v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Lpj4;->d()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1

    .line 44
    :sswitch_1
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lda2;

    .line 47
    .line 48
    iget-object v1, p0, Llv2;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lfa2;

    .line 51
    .line 52
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 53
    .line 54
    :try_start_1
    sget-object v2, Lmz1;->m2:Liz1;

    .line 55
    .line 56
    sget-object v3, Ltw1;->e:Ltw1;

    .line 57
    .line 58
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 59
    .line 60
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    sget-object v2, Lmz1;->n2:Liz1;

    .line 73
    .line 74
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    iget-object v2, v1, Lfa2;->r:Landroid/os/Bundle;

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    const-string v3, "binder-call-start"

    .line 93
    .line 94
    sget-object v4, Lhg4;->C:Lhg4;

    .line 95
    .line 96
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    :cond_1
    invoke-interface {v0, p1, v1}, Lda2;->p1(Landroid/os/ParcelFileDescriptor;Lfa2;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-interface {v0, p1}, Lda2;->v1(Landroid/os/ParcelFileDescriptor;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 117
    .line 118
    .line 119
    :goto_2
    return-void

    .line 120
    nop

    .line 121
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public q(ZLandroid/content/Context;Lan2;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p3, p0, Llv2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Lc03;

    .line 4
    .line 5
    iget-object p3, p3, Lc03;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Lu83;

    .line 8
    .line 9
    invoke-virtual {p3, p1}, Lu83;->b(Z)V
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :try_start_1
    iget-object p1, p3, Lu83;->a:Lw62;

    .line 13
    .line 14
    new-instance p3, Loi0;

    .line 15
    .line 16
    invoke-direct {p3, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p3}, Lw62;->z3(Lu10;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_2
    new-instance p2, Ln83;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance p2, Lpq2;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p2
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget v0, p0, Llv2;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Laa3;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-interface {v0, p1}, Laa3;->b(Z)Laa3;

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Llv2;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lda3;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lda3;->a(Laa3;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_0
    iget-object p1, p0, Llv2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Lpj4;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    const/4 p1, 0x0

    .line 32
    :try_start_0
    iput-object p1, v0, Lpj4;->j:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1

    .line 39
    :sswitch_1
    :try_start_1
    iget-object v0, p0, Llv2;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lda2;

    .line 42
    .line 43
    invoke-static {p1}, Lzt0;->A(Ljava/lang/Throwable;)Lnx2;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lyc0;->s(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    iget-object p1, v1, Lnx2;->g:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    new-instance v2, Lwu1;

    .line 65
    .line 66
    iget v1, v1, Lnx2;->f:I

    .line 67
    .line 68
    invoke-direct {v2, p1, v1}, Lwu1;-><init>(Ljava/lang/String;I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v2}, Lda2;->O2(Lwu1;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    invoke-static {}, Lgi2;->R()Z

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method
