.class public final Lbu1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lws2;
.implements Lch3;
.implements Lk73;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, Lbu1;->f:I

    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x7f080072

    const v0, 0x7f080028

    const v1, 0x7f080074

    .line 29
    filled-new-array {v1, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    const/4 p1, 0x7

    .line 30
    new-array v0, p1, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 31
    new-array p1, p1, [I

    fill-array-data p1, :array_1

    iput-object p1, p0, Lbu1;->i:Ljava/lang/Object;

    const p1, 0x7f080037

    const v0, 0x7f080058

    const v1, 0x7f080059

    .line 32
    filled-new-array {v1, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lbu1;->j:Ljava/lang/Object;

    const p1, 0x7f08006b

    const v0, 0x7f080075

    .line 33
    filled-new-array {p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lbu1;->k:Ljava/lang/Object;

    const p1, 0x7f08002c

    const v0, 0x7f080032

    const v1, 0x7f08002b

    const v2, 0x7f080031

    .line 34
    filled-new-array {v1, v2, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lbu1;->l:Ljava/lang/Object;

    return-void

    .line 35
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    sget-object p1, Lcs3;->j:Lcs3;

    iput-object p1, p0, Lbu1;->l:Ljava/lang/Object;

    return-void

    .line 36
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    new-instance p1, Lfu1;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu1;->i:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 4
        0x7f080040
        0x7f080063
        0x7f080047
        0x7f080042
        0x7f080043
        0x7f080046
        0x7f080045
    .end array-data

    :array_1
    .array-data 4
        0x7f080071
        0x7f080073
        0x7f080039
        0x7f08006d
        0x7f08006e
        0x7f08006f
        0x7f080070
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0xd

    iput v0, p0, Lbu1;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->h:Ljava/lang/Object;

    new-instance p2, Ljava/util/TreeMap;

    .line 5
    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    iput-object p2, p0, Lbu1;->i:Ljava/lang/Object;

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "-"

    .line 7
    :try_start_0
    invoke-static {p1}, Lza1;->a(Landroid/content/Context;)Lzj0;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 8
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    const-string v0, "Unable to get package version name for reporting"

    .line 10
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "-missing"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 12
    :goto_0
    iput-object p1, p0, Lbu1;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lbu1;->f:I

    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p4, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object p5, p0, Lbu1;->k:Ljava/lang/Object;

    iput-object p6, p0, Lbu1;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lbu1;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lbu1;->f:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    .line 22
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p2, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->j:Ljava/lang/Object;

    sget-object p2, Lzv0;->b:Lzv0;

    iput-object p2, p0, Lbu1;->k:Ljava/lang/Object;

    new-instance p2, Ljava/util/HashSet;

    .line 23
    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 24
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_1

    .line 25
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    return-void

    .line 26
    :cond_1
    invoke-static {p1}, Lex0;->e(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 27
    throw p1
.end method

.method public constructor <init>(Lmr2;Lxb4;Lpj4;Ljava/lang/String;Lld2;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lbu1;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p4, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object p5, p0, Lbu1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsm2;Lcn2;Lyp2;Lvp2;Lxj2;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lbu1;->f:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p4, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object p5, p0, Lbu1;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsw1;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lbu1;->f:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    sget-object p1, Lxm3;->g:Lvm3;

    .line 14
    sget-object p1, Lsn3;->j:Lsn3;

    .line 15
    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    sget-object p1, Lxn3;->l:Lxn3;

    iput-object p1, p0, Lbu1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lth2;Landroid/content/Context;Lt83;Lk83;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lbu1;->f:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object p4, p0, Lbu1;->g:Ljava/lang/Object;

    invoke-virtual {p1}, Lth2;->c()Lea3;

    move-result-object p1

    iput-object p1, p0, Lbu1;->k:Ljava/lang/Object;

    .line 17
    iget-object p1, p3, Lt83;->h:Ljava/lang/Object;

    check-cast p1, Ls23;

    .line 18
    iput-object p1, p4, Lk83;->r:Ls23;

    return-void
.end method

.method public constructor <init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lbu1;->f:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lbu1;->l:Ljava/lang/Object;

    iput-object p2, p0, Lbu1;->g:Ljava/lang/Object;

    iput-object p3, p0, Lbu1;->h:Ljava/lang/Object;

    iput-object p4, p0, Lbu1;->i:Ljava/lang/Object;

    iput-object p5, p0, Lbu1;->j:Ljava/lang/Object;

    iput-object p6, p0, Lbu1;->k:Ljava/lang/Object;

    return-void
.end method

.method public static D(Lf74;Lxm3;Lkh4;Lsw1;)Lkh4;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lf74;->K1()Loz1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lf74;->N1()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Loz1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0, v1}, Loz1;->f(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-virtual {p0}, Lf74;->S1()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Loz1;->g()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v0, v1, p3, v5}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p0}, Lf74;->Q1()J

    .line 41
    .line 42
    .line 43
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-ge v5, p3, :cond_4

    .line 53
    .line 54
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lkh4;

    .line 59
    .line 60
    invoke-virtual {p0}, Lf74;->S1()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p0}, Lf74;->d()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p0}, Lf74;->T1()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-static {p3, v2, v0, v1, v4}, Lbu1;->G(Lkh4;Ljava/lang/Object;ZII)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    return-object p3

    .line 79
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, Lf74;->S1()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {p0}, Lf74;->d()I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    invoke-virtual {p0}, Lf74;->T1()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-static {p2, v2, p1, p3, p0}, Lbu1;->G(Lkh4;Ljava/lang/Object;ZII)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_5
    return-object v3
.end method

.method public static F(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "action"

    .line 7
    .line 8
    const-string v2, "no_ads_fallback"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "flow"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lsv1;->f:Lsv1;

    .line 19
    .line 20
    iget-object v1, p1, Lsv1;->a:Lj63;

    .line 21
    .line 22
    iget-object p1, p1, Lsv1;->d:Le51;

    .line 23
    .line 24
    iget-object p1, p1, Le51;->f:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, Ll92;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v2, v1, p0, v3}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1, v0, v2}, Lj63;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lpx2;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static G(Lkh4;Ljava/lang/Object;ZII)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lkh4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lkh4;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    if-ne v1, p3, :cond_2

    .line 15
    .line 16
    iget p0, p0, Lkh4;->c:I

    .line 17
    .line 18
    if-ne p0, p4, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, -0x1

    .line 22
    if-ne v1, p1, :cond_2

    .line 23
    .line 24
    iget p0, p0, Lkh4;->e:I

    .line 25
    .line 26
    if-ne p0, p1, :cond_2

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public static b([II)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-ne v3, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method

.method public static c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    const v0, 0x7f040110

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Ln11;->c(Landroid/content/Context;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f04010b

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Ln11;->b(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    sget-object v1, Ln11;->b:[I

    .line 16
    .line 17
    sget-object v2, Ln11;->d:[I

    .line 18
    .line 19
    invoke-static {v0, p1}, Lhg;->b(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, Ln11;->c:[I

    .line 24
    .line 25
    invoke-static {v0, p1}, Lhg;->b(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v5, Ln11;->f:[I

    .line 30
    .line 31
    filled-new-array {v1, v2, v4, v5}, [[I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {p0, v3, v0, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public static e(Lzp0;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const v0, 0x7f080067

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lzp0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f080068

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v1}, Lzp0;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of p1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p1, p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, p2, :cond_0

    .line 39
    .line 40
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 41
    .line 42
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 53
    .line 54
    invoke-static {p2, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v2, Landroid/graphics/Canvas;

    .line 59
    .line 60
    invoke-direct {v2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 75
    .line 76
    invoke-direct {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v2

    .line 80
    :goto_0
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    .line 83
    .line 84
    .line 85
    instance-of v2, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-ne v2, p2, :cond_1

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ne v2, p2, :cond_1

    .line 100
    .line 101
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 105
    .line 106
    invoke-static {p2, p2, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Landroid/graphics/Canvas;

    .line 111
    .line 112
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 122
    .line 123
    invoke-direct {p0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    .line 127
    .line 128
    const/4 v2, 0x3

    .line 129
    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    aput-object v0, v2, v1

    .line 132
    .line 133
    const/4 v0, 0x1

    .line 134
    aput-object p0, v2, v0

    .line 135
    .line 136
    const/4 p0, 0x2

    .line 137
    aput-object p1, v2, p0

    .line 138
    .line 139
    invoke-direct {p2, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    const/high16 p1, 0x1020000

    .line 143
    .line 144
    invoke-virtual {p2, v1, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 145
    .line 146
    .line 147
    const p1, 0x102000f

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 151
    .line 152
    .line 153
    const p1, 0x102000d

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, p0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 157
    .line 158
    .line 159
    return-object p2
.end method

.method public static g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    sget-object p2, Ll6;->b:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    :cond_0
    invoke-static {p1, p2}, Ll6;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public A()Lq93;
    .locals 5

    .line 1
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu93;

    .line 4
    .line 5
    new-instance v1, Lq93;

    .line 6
    .line 7
    iget-object v2, p0, Lbu1;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, p0, Lbu1;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Ls93;

    .line 20
    .line 21
    iget-object v3, v3, Ls93;->f:Ljava/lang/String;

    .line 22
    .line 23
    :cond_0
    iget-object v4, p0, Lbu1;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ln70;

    .line 26
    .line 27
    invoke-direct {v1, v2, v3, v4}, Lq93;-><init>(Ljava/lang/Object;Ljava/lang/String;Ln70;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Lu93;->c:Lt93;

    .line 31
    .line 32
    new-instance v2, Lf23;

    .line 33
    .line 34
    const/16 v3, 0x1c

    .line 35
    .line 36
    invoke-direct {v2, v3, v1}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lf74;->P1(Ldp2;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ln70;

    .line 45
    .line 46
    new-instance v2, Lsz2;

    .line 47
    .line 48
    const/16 v3, 0x9

    .line 49
    .line 50
    invoke-direct {v2, p0, v1, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    sget-object v3, Lmd2;->g:Lld2;

    .line 54
    .line 55
    invoke-interface {v0, v2, v3}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lwt2;

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    invoke-direct {v0, p0, v1, v2}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Ljq3;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {v2, v1, v0, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method

.method public B(Loz1;)V
    .locals 3

    .line 1
    new-instance v0, Lso1;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lso1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lbu1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lxm3;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lbu1;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lkh4;

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, p1}, Lbu1;->C(Lso1;Lkh4;Loz1;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lkh4;

    .line 27
    .line 28
    iget-object v2, p0, Lbu1;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lkh4;

    .line 31
    .line 32
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lkh4;

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1, p1}, Lbu1;->C(Lso1;Lkh4;Loz1;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lkh4;

    .line 48
    .line 49
    iget-object v2, p0, Lbu1;->k:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lkh4;

    .line 52
    .line 53
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lkh4;

    .line 62
    .line 63
    iget-object v2, p0, Lbu1;->l:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lkh4;

    .line 66
    .line 67
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lkh4;

    .line 76
    .line 77
    invoke-virtual {p0, v0, v1, p1}, Lbu1;->C(Lso1;Lkh4;Loz1;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/4 v1, 0x0

    .line 82
    :goto_0
    iget-object v2, p0, Lbu1;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lxm3;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ge v1, v2, :cond_2

    .line 91
    .line 92
    iget-object v2, p0, Lbu1;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Lxm3;

    .line 95
    .line 96
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lkh4;

    .line 101
    .line 102
    invoke-virtual {p0, v0, v2, p1}, Lbu1;->C(Lso1;Lkh4;Loz1;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    iget-object v1, p0, Lbu1;->h:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lxm3;

    .line 111
    .line 112
    iget-object v2, p0, Lbu1;->j:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lkh4;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lxm3;->contains(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_3

    .line 121
    .line 122
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Lkh4;

    .line 125
    .line 126
    invoke-virtual {p0, v0, v1, p1}, Lbu1;->C(Lso1;Lkh4;Loz1;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lso1;->u()Lxn3;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, Lbu1;->i:Ljava/lang/Object;

    .line 134
    .line 135
    return-void
.end method

.method public C(Lso1;Lkh4;Loz1;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p2, Lkh4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Loz1;->e(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p2, p3}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object p3, p0, Lbu1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p3, Lxn3;

    .line 20
    .line 21
    invoke-virtual {p3, p2}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    check-cast p3, Loz1;

    .line 26
    .line 27
    if-eqz p3, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, p2, p3}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    return-void
.end method

.method public E()V
    .locals 8

    .line 1
    iget-object v1, p0, Lbu1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lvw1;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v5, Lkf3;

    .line 18
    .line 19
    const/16 v0, 0xf

    .line 20
    .line 21
    invoke-direct {v5, v0, p0}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v6, Lof3;

    .line 25
    .line 26
    const/16 v0, 0xb

    .line 27
    .line 28
    invoke-direct {v6, v0, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :try_start_1
    new-instance v2, Lvw1;

    .line 33
    .line 34
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, v0

    .line 37
    check-cast v3, Landroid/content/Context;

    .line 38
    .line 39
    sget-object v0, Lhg4;->C:Lhg4;

    .line 40
    .line 41
    iget-object v0, v0, Lhg4;->t:Lr2;

    .line 42
    .line 43
    invoke-virtual {v0}, Lr2;->a()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-direct/range {v2 .. v7}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    :try_start_2
    monitor-exit p0

    .line 52
    iput-object v2, p0, Lbu1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v2}, Lw9;->n()V

    .line 55
    .line 56
    .line 57
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :try_start_4
    throw v0

    .line 64
    :cond_1
    :goto_0
    monitor-exit v1

    .line 65
    return-void

    .line 66
    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 67
    throw v0
.end method

.method public a()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lbu1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbu1;->p()Lgi1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Leu2;

    .line 14
    .line 15
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v2, v0

    .line 20
    check-cast v2, Landroid/app/Application;

    .line 21
    .line 22
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Leu2;

    .line 25
    .line 26
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljf1;

    .line 31
    .line 32
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lls2;

    .line 35
    .line 36
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v3, v0

    .line 41
    check-cast v3, Laa2;

    .line 42
    .line 43
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Leu2;

    .line 46
    .line 47
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v4, v0

    .line 52
    check-cast v4, Lmo1;

    .line 53
    .line 54
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lax0;

    .line 57
    .line 58
    iget-object v0, v0, Lax0;->f:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v5, v0

    .line 61
    check-cast v5, Lz52;

    .line 62
    .line 63
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v6, v0

    .line 66
    check-cast v6, Lvq2;

    .line 67
    .line 68
    new-instance v1, Lbw1;

    .line 69
    .line 70
    invoke-direct/range {v1 .. v6}, Lbw1;-><init>(Landroid/app/Application;Laa2;Lmo1;Lz52;Lvq2;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lsm2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lsm2;->C()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    const v0, 0x7f08003c

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    const p2, 0x7f060015

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const v0, 0x7f08006a

    .line 15
    .line 16
    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    const p2, 0x7f060018

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    const v0, 0x7f080069

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-ne p2, v0, :cond_3

    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    new-array v0, p2, [[I

    .line 35
    .line 36
    new-array p2, p2, [I

    .line 37
    .line 38
    const v2, 0x7f040144

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2}, Ln11;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x2

    .line 46
    const v5, 0x7f04010f

    .line 47
    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    sget-object v2, Ln11;->b:[I

    .line 59
    .line 60
    aput-object v2, v0, v1

    .line 61
    .line 62
    invoke-virtual {v3, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aput v2, p2, v1

    .line 67
    .line 68
    sget-object v1, Ln11;->e:[I

    .line 69
    .line 70
    aput-object v1, v0, v6

    .line 71
    .line 72
    invoke-static {p1, v5}, Ln11;->c(Landroid/content/Context;I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    aput p1, p2, v6

    .line 77
    .line 78
    sget-object p1, Ln11;->f:[I

    .line 79
    .line 80
    aput-object p1, v0, v4

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    aput p1, p2, v4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object v3, Ln11;->b:[I

    .line 90
    .line 91
    aput-object v3, v0, v1

    .line 92
    .line 93
    invoke-static {p1, v2}, Ln11;->b(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    aput v3, p2, v1

    .line 98
    .line 99
    sget-object v1, Ln11;->e:[I

    .line 100
    .line 101
    aput-object v1, v0, v6

    .line 102
    .line 103
    invoke-static {p1, v5}, Ln11;->c(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    aput v1, p2, v6

    .line 108
    .line 109
    sget-object v1, Ln11;->f:[I

    .line 110
    .line 111
    aput-object v1, v0, v4

    .line 112
    .line 113
    invoke-static {p1, v2}, Ln11;->c(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    aput p1, p2, v4

    .line 118
    .line 119
    :goto_0
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 122
    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_3
    const v0, 0x7f080030

    .line 126
    .line 127
    .line 128
    if-ne p2, v0, :cond_4

    .line 129
    .line 130
    const p2, 0x7f04010b

    .line 131
    .line 132
    .line 133
    invoke-static {p1, p2}, Ln11;->c(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    invoke-static {p1, p2}, Lbu1;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :cond_4
    const v0, 0x7f08002a

    .line 143
    .line 144
    .line 145
    if-ne p2, v0, :cond_5

    .line 146
    .line 147
    invoke-static {p1, v1}, Lbu1;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :cond_5
    const v0, 0x7f08002f

    .line 153
    .line 154
    .line 155
    if-ne p2, v0, :cond_6

    .line 156
    .line 157
    const p2, 0x7f040109

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p2}, Ln11;->c(Landroid/content/Context;I)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-static {p1, p2}, Lbu1;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :cond_6
    const v0, 0x7f080065

    .line 170
    .line 171
    .line 172
    if-eq p2, v0, :cond_c

    .line 173
    .line 174
    const v0, 0x7f080066

    .line 175
    .line 176
    .line 177
    if-ne p2, v0, :cond_7

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_7
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, [I

    .line 183
    .line 184
    invoke-static {v0, p2}, Lbu1;->b([II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_8

    .line 189
    .line 190
    const p2, 0x7f040111

    .line 191
    .line 192
    .line 193
    invoke-static {p1, p2}, Ln11;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :cond_8
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, [I

    .line 201
    .line 202
    invoke-static {v0, p2}, Lbu1;->b([II)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    const p2, 0x7f060014

    .line 209
    .line 210
    .line 211
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :cond_9
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, [I

    .line 219
    .line 220
    invoke-static {v0, p2}, Lbu1;->b([II)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    const p2, 0x7f060013

    .line 227
    .line 228
    .line 229
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    return-object p1

    .line 234
    :cond_a
    const v0, 0x7f080062

    .line 235
    .line 236
    .line 237
    if-ne p2, v0, :cond_b

    .line 238
    .line 239
    const p2, 0x7f060016

    .line 240
    .line 241
    .line 242
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    return-object p1

    .line 247
    :cond_b
    const/4 p1, 0x0

    .line 248
    return-object p1

    .line 249
    :cond_c
    :goto_1
    const p2, 0x7f060017

    .line 250
    .line 251
    .line 252
    invoke-static {p1, p2}, Lob1;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcn2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcn2;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lyp2;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    sget-object v1, Lsd2;->A:Lsd2;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1

    .line 33
    :cond_0
    return-void
.end method

.method public i(Llv2;Lj73;)Ln70;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Llv2;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Li73;

    .line 5
    .line 6
    invoke-interface {p2, v0}, Lj73;->h(Li73;)Lyh2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v4, Lb73;

    .line 11
    .line 12
    iget-object v5, p0, Lbu1;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v5, Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v4, v5}, Lb73;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget v5, v0, Lyh2;->a:I

    .line 20
    .line 21
    packed-switch v5, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iput-object v4, v0, Lyh2;->d:Lb73;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    iput-object v4, v0, Lyh2;->d:Lb73;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Lyh2;->c()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Llm2;

    .line 34
    .line 35
    invoke-interface {v0}, Llm2;->d()Ll83;

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Llm2;->d()Ll83;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Llm2;->d()Ll83;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v4, v4, Ll83;->d:Lpc4;

    .line 46
    .line 47
    iget-object v5, v4, Lpc4;->x:Lec2;

    .line 48
    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    iget-object v4, v4, Lpc4;->C:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    :cond_0
    move-object v5, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-interface {v0}, Llm2;->d()Ll83;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object v5, v4, Ll83;->d:Lpc4;

    .line 62
    .line 63
    iget-object v6, v4, Ll83;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v8, v4, Ll83;->k:Lvi4;

    .line 66
    .line 67
    iget-object v4, p0, Lbu1;->l:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v7, v4

    .line 70
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 71
    .line 72
    new-instance v2, La73;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    move-object v4, p1

    .line 76
    move-object v3, p2

    .line 77
    invoke-direct/range {v2 .. v9}, La73;-><init>(Lj73;Llv2;Lpc4;Ljava/lang/String;Ljava/util/concurrent/Executor;Lvi4;Lf93;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, p0, Lbu1;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v3, Lxb4;

    .line 83
    .line 84
    invoke-virtual {v3, v0}, Lxb4;->A(Llm2;)Lgq3;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v3}, Lgq3;->r(Ln70;)Lgq3;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    move-object v5, v0

    .line 93
    new-instance v0, Ls03;

    .line 94
    .line 95
    const/4 v6, 0x1

    .line 96
    move-object v1, p0

    .line 97
    move-object v4, p2

    .line 98
    move-object v3, v2

    .line 99
    move-object v2, p1

    .line 100
    invoke-direct/range {v0 .. v6}, Ls03;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v8, v0, v7}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit p0

    .line 108
    return-object v0

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_2

    .line 111
    :goto_1
    :try_start_1
    iput-object v5, p0, Lbu1;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lmr2;

    .line 116
    .line 117
    invoke-virtual {v0, p1, p2, v5}, Lmr2;->w(Llv2;Lj73;Llm2;)Ln70;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    monitor-exit p0

    .line 122
    return-object v0

    .line 123
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    throw v0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lmz1;->Ma:Liz1;

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
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    const-string v2, "objectId"

    .line 19
    .line 20
    iget-object v3, p0, Lbu1;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/lang/Long;

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v2, "eventCategory"

    .line 28
    .line 29
    iget-object v3, p0, Lbu1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v2, "event"

    .line 37
    .line 38
    iget-object v3, p0, Lbu1;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string v2, "errorCode"

    .line 46
    .line 47
    iget-object v3, p0, Lbu1;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    const-string v2, "rewardType"

    .line 55
    .line 56
    iget-object v3, p0, Lbu1;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    const-string v2, "rewardAmount"

    .line 64
    .line 65
    iget-object v3, p0, Lbu1;->l:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    const-string v2, "Could not convert parameters to JSON."

    .line 74
    .line 75
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    add-int/lit8 v2, v2, 0xe

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    add-int/2addr v3, v2

    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x2

    .line 104
    .line 105
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 106
    .line 107
    .line 108
    const-string v3, "(\"h5adsEvent\","

    .line 109
    .line 110
    const-string v4, ");"

    .line 111
    .line 112
    invoke-static {v2, v0, v3, v1, v4}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0
.end method

.method public k(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 25
    .line 26
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lbu1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Llm2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0
.end method

.method public declared-synchronized m(Landroid/view/View;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lxj2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lxj2;->D0()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lvp2;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lvp2;->U1(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    throw p1
.end method

.method public n(Landroid/content/Context;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lbu1;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lbu1;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p1, Lmz1;->F4:Liz1;

    .line 24
    .line 25
    sget-object v1, Ltw1;->e:Ltw1;

    .line 26
    .line 27
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lbu1;->E()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object p1, Lmz1;->E4:Liz1;

    .line 46
    .line 47
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    new-instance p1, Lqw1;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lqw1;-><init>(Lbu1;)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lhg4;->C:Lhg4;

    .line 67
    .line 68
    iget-object v1, v1, Lhg4;->g:Lwy0;

    .line 69
    .line 70
    invoke-virtual {v1, p1}, Lwy0;->f(Lwv1;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public o(Lpc4;Ljava/lang/String;Lm54;Ly23;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lbu1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lt83;

    .line 8
    .line 9
    iget-object v3, v2, Lt83;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ls23;

    .line 12
    .line 13
    iget-object v4, v1, Lbu1;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lth2;

    .line 16
    .line 17
    sget-object v5, Lhg4;->C:Lhg4;

    .line 18
    .line 19
    iget-object v6, v5, Lhg4;->c:Llf4;

    .line 20
    .line 21
    iget-object v6, v1, Lbu1;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v6}, Llf4;->h(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    iget-object v7, v0, Lpc4;->x:Lec2;

    .line 33
    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v0, "Failed to load the ad because app ID is missing."

    .line 38
    .line 39
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v2, La33;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v2, v1, v3}, La33;-><init>(Lbu1;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return v8

    .line 56
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 57
    .line 58
    const-string v0, "Ad unit ID should not be null for NativeAdLoader."

    .line 59
    .line 60
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v2, La33;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-direct {v2, v1, v3}, La33;-><init>(Lbu1;I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    return v8

    .line 77
    :cond_2
    iget-boolean v7, v0, Lpc4;->k:Z

    .line 78
    .line 79
    invoke-static {v6, v7}, Lyc0;->v(Landroid/content/Context;Z)V

    .line 80
    .line 81
    .line 82
    sget-object v8, Lmz1;->I9:Liz1;

    .line 83
    .line 84
    sget-object v9, Ltw1;->e:Ltw1;

    .line 85
    .line 86
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 87
    .line 88
    invoke-virtual {v9, v8}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    const/4 v9, 0x1

    .line 99
    if-eqz v8, :cond_3

    .line 100
    .line 101
    if-eqz v7, :cond_3

    .line 102
    .line 103
    iget-object v7, v4, Lth2;->z:Lba4;

    .line 104
    .line 105
    invoke-virtual {v7}, Lba4;->d()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Lzw2;

    .line 110
    .line 111
    invoke-virtual {v7, v9}, Lzw2;->b(Z)V

    .line 112
    .line 113
    .line 114
    :cond_3
    move-object/from16 v7, p3

    .line 115
    .line 116
    check-cast v7, Lz23;

    .line 117
    .line 118
    iget v7, v7, Lz23;->g:I

    .line 119
    .line 120
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 126
    .line 127
    .line 128
    move-result-wide v10

    .line 129
    new-instance v5, Landroid/util/Pair;

    .line 130
    .line 131
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const-string v10, "api-call"

    .line 136
    .line 137
    invoke-direct {v5, v10, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance v10, Landroid/util/Pair;

    .line 141
    .line 142
    const-string v11, "dynamite-enter"

    .line 143
    .line 144
    invoke-direct {v10, v11, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    filled-new-array {v5, v10}, [Landroid/util/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v5}, Lbd2;->C([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    iget-object v8, v1, Lbu1;->g:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v8, Lk83;

    .line 158
    .line 159
    iput-object v0, v8, Lk83;->a:Lpc4;

    .line 160
    .line 161
    iput-object v5, v8, Lk83;->t:Landroid/os/Bundle;

    .line 162
    .line 163
    iput v7, v8, Lk83;->m:I

    .line 164
    .line 165
    invoke-virtual {v8}, Lk83;->a()Ll83;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-static {v5}, Lqb1;->N(Ll83;)I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    const/16 v8, 0x8

    .line 174
    .line 175
    invoke-static {v6, v7, v8, v0}, Laa3;->g(Landroid/content/Context;IILpc4;)Laa3;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    iget-object v10, v5, Ll83;->o:Lwi2;

    .line 180
    .line 181
    if-eqz v10, :cond_4

    .line 182
    .line 183
    invoke-virtual {v3, v10}, Ls23;->p(Lwi2;)V

    .line 184
    .line 185
    .line 186
    :cond_4
    iget-object v12, v4, Lth2;->b:Lth2;

    .line 187
    .line 188
    new-instance v10, Lmm2;

    .line 189
    .line 190
    invoke-direct {v10}, Lmm2;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object v6, v10, Lmm2;->a:Landroid/content/Context;

    .line 194
    .line 195
    iput-object v5, v10, Lmm2;->b:Ljava/lang/Object;

    .line 196
    .line 197
    new-instance v5, Lmm2;

    .line 198
    .line 199
    invoke-direct {v5, v10}, Lmm2;-><init>(Lmm2;)V

    .line 200
    .line 201
    .line 202
    new-instance v6, Lep2;

    .line 203
    .line 204
    invoke-direct {v6}, Lep2;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v6, v3, v10}, Lep2;->b(Lb8;Ljava/util/concurrent/Executor;)V

    .line 212
    .line 213
    .line 214
    new-instance v10, Lfp2;

    .line 215
    .line 216
    invoke-direct {v10, v6}, Lfp2;-><init>(Lep2;)V

    .line 217
    .line 218
    .line 219
    new-instance v14, Lvq2;

    .line 220
    .line 221
    iget-object v2, v2, Lt83;->g:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, Lyr2;

    .line 224
    .line 225
    invoke-virtual {v3}, Ls23;->l()Ld32;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    const/4 v6, 0x0

    .line 230
    invoke-direct {v14, v2, v3, v6}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 231
    .line 232
    .line 233
    new-instance v13, Lug0;

    .line 234
    .line 235
    const/16 v2, 0x13

    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    invoke-direct {v13, v2, v3}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    new-instance v11, Lsh2;

    .line 242
    .line 243
    new-instance v15, Ltv2;

    .line 244
    .line 245
    const/4 v2, 0x0

    .line 246
    invoke-direct {v15, v2, v6}, Ltv2;-><init>(IB)V

    .line 247
    .line 248
    .line 249
    new-instance v2, Lf23;

    .line 250
    .line 251
    const/16 v6, 0x19

    .line 252
    .line 253
    invoke-direct {v2, v6}, Lf23;-><init>(I)V

    .line 254
    .line 255
    .line 256
    const/16 v19, 0x0

    .line 257
    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    move-object/from16 v18, v2

    .line 261
    .line 262
    move-object/from16 v17, v5

    .line 263
    .line 264
    move-object/from16 v16, v10

    .line 265
    .line 266
    invoke-direct/range {v11 .. v20}, Lsh2;-><init>(Lth2;Lug0;Lvq2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 267
    .line 268
    .line 269
    sget-object v2, Ln02;->c:Lso1;

    .line 270
    .line 271
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_5

    .line 282
    .line 283
    iget-object v2, v11, Lsh2;->e:Lba4;

    .line 284
    .line 285
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    move-object v3, v2

    .line 290
    check-cast v3, Lda3;

    .line 291
    .line 292
    invoke-virtual {v3, v8}, Lda3;->i(I)V

    .line 293
    .line 294
    .line 295
    iget-object v2, v0, Lpc4;->u:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v3, v2}, Lda3;->c(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v0, v0, Lpc4;->r:Landroid/os/Bundle;

    .line 301
    .line 302
    invoke-virtual {v3, v0}, Lda3;->d(Landroid/os/Bundle;)V

    .line 303
    .line 304
    .line 305
    :cond_5
    iget-object v0, v4, Lth2;->L:Lba4;

    .line 306
    .line 307
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Lv83;

    .line 312
    .line 313
    invoke-virtual {v0, v9}, Lv83;->a(I)V

    .line 314
    .line 315
    .line 316
    new-instance v8, Lkl2;

    .line 317
    .line 318
    sget-object v10, Lmd2;->a:Lld2;

    .line 319
    .line 320
    invoke-static {v10}, Li41;->M(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object v0, v4, Lth2;->d:Lba4;

    .line 324
    .line 325
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 330
    .line 331
    iget-object v2, v11, Lsh2;->n:Lba4;

    .line 332
    .line 333
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Lnl2;

    .line 338
    .line 339
    invoke-virtual {v2}, Lnl2;->b()Lq93;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-virtual {v2, v4}, Lnl2;->c(Ln70;)Lq93;

    .line 344
    .line 345
    .line 346
    move-result-object v12

    .line 347
    invoke-direct {v8, v10, v0, v12}, Lkl2;-><init>(Lld2;Ljava/util/concurrent/ScheduledExecutorService;Lq93;)V

    .line 348
    .line 349
    .line 350
    iput-object v8, v1, Lbu1;->l:Ljava/lang/Object;

    .line 351
    .line 352
    new-instance v0, Lg4;

    .line 353
    .line 354
    move-object/from16 v2, p4

    .line 355
    .line 356
    check-cast v2, Lf23;

    .line 357
    .line 358
    const/16 v6, 0xc

    .line 359
    .line 360
    move-object v4, v7

    .line 361
    const/4 v7, 0x0

    .line 362
    move-object v5, v11

    .line 363
    invoke-direct/range {v0 .. v7}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 364
    .line 365
    .line 366
    new-instance v1, Lvq2;

    .line 367
    .line 368
    const/16 v2, 0x1d

    .line 369
    .line 370
    const/4 v3, 0x0

    .line 371
    invoke-direct {v1, v8, v0, v2, v3}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 372
    .line 373
    .line 374
    new-instance v0, Ljq3;

    .line 375
    .line 376
    const/4 v2, 0x0

    .line 377
    invoke-direct {v0, v12, v1, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v10}, Lq93;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 381
    .line 382
    .line 383
    return v9
.end method

.method public p()Lgi1;
    .locals 10

    .line 1
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Leu2;

    .line 4
    .line 5
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroid/app/Application;

    .line 11
    .line 12
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lls2;

    .line 15
    .line 16
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Laa2;

    .line 22
    .line 23
    sget-object v4, Lok2;->a:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {v4}, Lpu1;->s(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v5, Lok2;->b:Ldk2;

    .line 29
    .line 30
    invoke-static {v5}, Lpu1;->s(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Leu2;

    .line 36
    .line 37
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v6, v0

    .line 42
    check-cast v6, Llx2;

    .line 43
    .line 44
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Leu2;

    .line 47
    .line 48
    check-cast v0, Lxn1;

    .line 49
    .line 50
    invoke-virtual {v0}, Lxn1;->b()Lp21;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lzs1;

    .line 57
    .line 58
    invoke-virtual {v0}, Lzs1;->a()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v8, v0

    .line 63
    check-cast v8, Lbw1;

    .line 64
    .line 65
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Leu2;

    .line 68
    .line 69
    invoke-interface {v0}, Leu2;->a()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v9, v0

    .line 74
    check-cast v9, Lmo1;

    .line 75
    .line 76
    new-instance v1, Lgi1;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v9}, Lgi1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v1
.end method

.method public q(Lo93;)Lbu1;
    .locals 2

    .line 1
    new-instance v0, Lu42;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lbu1;->s(Lyp3;)Lbu1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public r(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lbu1;->h:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"

    .line 23
    .line 24
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public s(Lyp3;)Lbu1;
    .locals 8

    .line 1
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Lu93;

    .line 5
    .line 6
    iget-object v0, v2, Lu93;->a:Lpq3;

    .line 7
    .line 8
    new-instance v1, Lbu1;

    .line 9
    .line 10
    iget-object v3, p0, Lbu1;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Ln70;

    .line 13
    .line 14
    move-object v4, v3

    .line 15
    iget-object v3, p0, Lbu1;->g:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v5, p0, Lbu1;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Lbu1;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Ln70;

    .line 24
    .line 25
    iget-object v7, p0, Lbu1;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v4, p1, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    move-object v4, v5

    .line 34
    move-object v5, v6

    .line 35
    move-object v6, v7

    .line 36
    move-object v7, p1

    .line 37
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public t(Lww1;)Luw1;
    .locals 3

    .line 1
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lxw1;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance p1, Luw1;

    .line 11
    .line 12
    invoke-direct {p1}, Luw1;-><init>()V

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_1
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lvw1;

    .line 22
    .line 23
    invoke-virtual {v1}, Lvw1;->z()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lxw1;

    .line 32
    .line 33
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2, p1}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x2

    .line 41
    invoke-virtual {v1, v2, p1}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v1, Luw1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 46
    .line 47
    invoke-static {p1, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Luw1;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    return-object v1

    .line 58
    :cond_1
    :try_start_3
    iget-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lxw1;

    .line 61
    .line 62
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2, p1}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    invoke-virtual {v1, v2, p1}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v1, Luw1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 75
    .line 76
    invoke-static {p1, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Luw1;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    .line 84
    .line 85
    :try_start_4
    monitor-exit v0

    .line 86
    return-object v1

    .line 87
    :catch_0
    move-exception p1

    .line 88
    const-string v1, "Unable to call into cache service."

    .line 89
    .line 90
    invoke-static {v1, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Luw1;

    .line 94
    .line 95
    invoke-direct {p1}, Luw1;-><init>()V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return-object p1

    .line 100
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    throw p1
.end method

.method public u(I)V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lbu1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v1, "Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes"

    .line 27
    .line 28
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public v(I)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 23
    .line 24
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public w(Le93;Llv2;)Ln70;
    .locals 2

    .line 1
    iget-object v0, p1, Le93;->a:Llm2;

    .line 2
    .line 3
    iput-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p1, Le93;->c:Lel2;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Llm2;->h()Lh73;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p1, Le93;->c:Lel2;

    .line 16
    .line 17
    iget-object p2, p2, Lel2;->e:Lh73;

    .line 18
    .line 19
    iget-object v0, p1, Le93;->a:Llm2;

    .line 20
    .line 21
    invoke-interface {v0}, Llm2;->h()Lh73;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p2, v0}, Lh73;->p(Lh73;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p1, Le93;->c:Lel2;

    .line 29
    .line 30
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-interface {v0}, Llm2;->a()Lnl2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p1, Le93;->b:Lh83;

    .line 40
    .line 41
    iput-object v1, v0, Lnl2;->g:Lh83;

    .line 42
    .line 43
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lmr2;

    .line 46
    .line 47
    iget-object p1, p1, Le93;->a:Llm2;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, p2, v1, p1}, Lmr2;->w(Llv2;Lj73;Llm2;)Ln70;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public x()Lds3;
    .locals 10

    .line 1
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    .line 23
    if-eqz v0, :cond_b

    .line 24
    .line 25
    iget-object v1, p0, Lbu1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lbs3;

    .line 28
    .line 29
    if-eqz v1, :cond_a

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, Lbu1;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lbs3;

    .line 38
    .line 39
    sget-object v3, Lbs3;->h:Lbs3;

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    const/16 v2, 0x14

    .line 44
    .line 45
    if-gt v1, v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 49
    .line 50
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 55
    .line 56
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_1
    sget-object v3, Lbs3;->i:Lbs3;

    .line 65
    .line 66
    if-ne v2, v3, :cond_3

    .line 67
    .line 68
    const/16 v2, 0x1c

    .line 69
    .line 70
    if-gt v1, v2, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 74
    .line 75
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 80
    .line 81
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_3
    sget-object v3, Lbs3;->j:Lbs3;

    .line 90
    .line 91
    if-ne v2, v3, :cond_5

    .line 92
    .line 93
    const/16 v2, 0x20

    .line 94
    .line 95
    if-gt v1, v2, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 105
    .line 106
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_5
    sget-object v3, Lbs3;->k:Lbs3;

    .line 115
    .line 116
    if-ne v2, v3, :cond_7

    .line 117
    .line 118
    const/16 v2, 0x30

    .line 119
    .line 120
    if-gt v1, v2, :cond_6

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 124
    .line 125
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 130
    .line 131
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_7
    sget-object v3, Lbs3;->l:Lbs3;

    .line 140
    .line 141
    if-ne v2, v3, :cond_9

    .line 142
    .line 143
    const/16 v2, 0x40

    .line 144
    .line 145
    if-gt v1, v2, :cond_8

    .line 146
    .line 147
    :goto_0
    new-instance v3, Lds3;

    .line 148
    .line 149
    iget-object v0, p0, Lbu1;->g:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    iget-object v0, p0, Lbu1;->h:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    iget-object v0, p0, Lbu1;->j:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    iget-object v0, p0, Lbu1;->l:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v8, v0

    .line 184
    check-cast v8, Lcs3;

    .line 185
    .line 186
    iget-object v0, p0, Lbu1;->k:Ljava/lang/Object;

    .line 187
    .line 188
    move-object v9, v0

    .line 189
    check-cast v9, Lbs3;

    .line 190
    .line 191
    invoke-direct/range {v3 .. v9}, Lds3;-><init>(IIIILcs3;Lbs3;)V

    .line 192
    .line 193
    .line 194
    return-object v3

    .line 195
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 196
    .line 197
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 202
    .line 203
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 212
    .line 213
    const-string v1, "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 220
    .line 221
    const-string v1, "hash type is not set"

    .line 222
    .line 223
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 228
    .line 229
    const-string v1, "tag size is not set"

    .line 230
    .line 231
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 236
    .line 237
    const-string v1, "iv size is not set"

    .line 238
    .line 239
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 244
    .line 245
    const-string v1, "HMAC key size is not set"

    .line 246
    .line 247
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 252
    .line 253
    const-string v1, "AES key size is not set"

    .line 254
    .line 255
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0
.end method

.method public synthetic y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbu1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lvw1;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v1}, Lw9;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lvw1;

    .line 23
    .line 24
    invoke-virtual {v1}, Lw9;->f()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lvw1;

    .line 33
    .line 34
    invoke-virtual {v1}, Lw9;->k()V

    .line 35
    .line 36
    .line 37
    :cond_2
    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lbu1;->j:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, Lbu1;->l:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw v1
.end method

.method public z(J)Lbu1;
    .locals 9

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    new-instance v1, Lbu1;

    .line 4
    .line 5
    iget-object v2, p0, Lbu1;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lu93;

    .line 8
    .line 9
    iget-object v3, v2, Lu93;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    iget-object v4, p0, Lbu1;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Ln70;

    .line 14
    .line 15
    move-object v5, v3

    .line 16
    iget-object v3, p0, Lbu1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v6, p0, Lbu1;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v6, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v7, p0, Lbu1;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v7, Ln70;

    .line 25
    .line 26
    iget-object v8, p0, Lbu1;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v8, Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v4, p1, p2, v0, v5}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v4, v6

    .line 35
    move-object v5, v7

    .line 36
    move-object v6, v8

    .line 37
    move-object v7, p1

    .line 38
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method
