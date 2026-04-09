.class public final Lde3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lo93;
.implements Lzc;
.implements Lnp2;


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public f:Z

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lde3;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde3;->g:Ljava/lang/Object;

    sget-object p1, Lae4;->c:Lae4;

    iput-object p1, p0, Lde3;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lav1;Lsd3;Z)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lde3;->f:Z

    iput-object p1, p0, Lde3;->g:Ljava/lang/Object;

    .line 5
    iget p2, p2, Lav1;->f:I

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lde3;->i:Ljava/lang/Object;

    const-string p2, "pcvmspf"

    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lde3;->h:Ljava/lang/Object;

    iput-object p3, p0, Lde3;->j:Ljava/lang/Object;

    iput-boolean p4, p0, Lde3;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lhg3;Ljava/lang/String;ZLjava/lang/String;[B)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde3;->g:Ljava/lang/Object;

    iput-object p2, p0, Lde3;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lde3;->f:Z

    iput-object p4, p0, Lde3;->h:Ljava/lang/Object;

    iput-object p5, p0, Lde3;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput-object p1, p0, Lde3;->g:Ljava/lang/Object;

    iput-object p2, p0, Lde3;->h:Ljava/lang/Object;

    iput-object p3, p0, Lde3;->i:Ljava/lang/Object;

    iput-object p4, p0, Lde3;->j:Ljava/lang/Object;

    iput-boolean p5, p0, Lde3;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnb;ZLjava/util/ArrayList;Lhx1;Lmx1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde3;->g:Ljava/lang/Object;

    iput-boolean p2, p0, Lde3;->f:Z

    iput-object p3, p0, Lde3;->h:Ljava/lang/Object;

    iput-object p4, p0, Lde3;->i:Ljava/lang/Object;

    iput-object p5, p0, Lde3;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyb3;Lbc3;Ldc3;Ldc3;Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde3;->i:Ljava/lang/Object;

    iput-object p2, p0, Lde3;->j:Ljava/lang/Object;

    iput-object p3, p0, Lde3;->g:Ljava/lang/Object;

    iput-object p4, p0, Lde3;->h:Ljava/lang/Object;

    iput-boolean p5, p0, Lde3;->f:Z

    return-void
.end method

.method public static b(Lyb3;Lbc3;Ldc3;Ldc3;Z)Lde3;
    .locals 8

    .line 1
    sget-object v0, Ldc3;->i:Ldc3;

    .line 2
    .line 3
    if-eq p2, v0, :cond_4

    .line 4
    .line 5
    sget-object v0, Lyb3;->g:Lyb3;

    .line 6
    .line 7
    const-string v1, "ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript"

    .line 8
    .line 9
    sget-object v2, Ldc3;->g:Ldc3;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    if-eq p2, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    sget-object v0, Lbc3;->g:Lbc3;

    .line 23
    .line 24
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    if-eq p2, v2, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_3
    :goto_1
    new-instance v2, Lde3;

    .line 36
    .line 37
    move-object v3, p0

    .line 38
    move-object v4, p1

    .line 39
    move-object v5, p2

    .line 40
    move-object v6, p3

    .line 41
    move v7, p4

    .line 42
    invoke-direct/range {v2 .. v7}, Lde3;-><init>(Lyb3;Lbc3;Ldc3;Ldc3;Z)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string p1, "Impression owner is none"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method public static n(Lbv1;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lfv1;->H()Lev1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lbv1;->A()Lfv1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lfv1;->A()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ln54;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 17
    .line 18
    check-cast v2, Lfv1;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lfv1;->J(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lbv1;->A()Lfv1;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lfv1;->B()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ln54;->b()V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 35
    .line 36
    check-cast v2, Lfv1;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lfv1;->K(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lbv1;->A()Lfv1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lfv1;->D()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0}, Ln54;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 53
    .line 54
    check-cast v3, Lfv1;

    .line 55
    .line 56
    invoke-virtual {v3, v1, v2}, Lfv1;->M(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lbv1;->A()Lfv1;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Lfv1;->E()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    invoke-virtual {v0}, Ln54;->b()V

    .line 68
    .line 69
    .line 70
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 71
    .line 72
    check-cast v3, Lfv1;

    .line 73
    .line 74
    invoke-virtual {v3, v1, v2}, Lfv1;->N(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lbv1;->A()Lfv1;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Lfv1;->C()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    invoke-virtual {v0}, Ln54;->b()V

    .line 86
    .line 87
    .line 88
    iget-object p0, v0, Ln54;->g:Lp54;

    .line 89
    .line 90
    check-cast p0, Lfv1;

    .line 91
    .line 92
    invoke-virtual {p0, v1, v2}, Lfv1;->L(J)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lfv1;

    .line 100
    .line 101
    invoke-virtual {p0}, Ls44;->b()[B

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Luk2;->c([B)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public static o([B)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcs1;->A()Lbs1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ln54;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 13
    .line 14
    check-cast v1, Lcs1;

    .line 15
    .line 16
    const/4 v2, 0x5

    .line 17
    invoke-virtual {v1, v2}, Lcs1;->E(I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    array-length v2, p0

    .line 22
    invoke-static {p0, v1, v2}, La54;->n([BII)Ly44;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0}, Ln54;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 30
    .line 31
    check-cast v1, Lcs1;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lcs1;->B(Ly44;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lcs1;

    .line 41
    .line 42
    invoke-virtual {p0}, Ls44;->b()[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lde3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lge3;

    .line 5
    .line 6
    invoke-interface {v0}, Lge3;->d()Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "f"

    .line 11
    .line 12
    const-string v2, "q"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v1, "ctx"

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "aid"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lde3;->q(Ljava/util/Map;)[B

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-boolean v1, p0, Lde3;->f:Z

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    invoke-static {p1}, Lde3;->o([B)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    .line 47
    return-object p1

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    check-cast v0, Lnb;

    iget-object v0, v0, Lnb;->g:Ljava/lang/Object;

    check-cast v0, Lgz2;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 1
    iget-object v1, v0, Le6;->a:Ljava/lang/Object;

    check-cast v1, Lra4;

    .line 2
    invoke-virtual {v1}, Lra4;->s()Z

    move-result v1

    if-nez v1, :cond_5

    .line 3
    iget-object v1, p0, Lde3;->j:Ljava/lang/Object;

    check-cast v1, Lmx1;

    iget-object v2, p0, Lde3;->i:Ljava/lang/Object;

    check-cast v2, Lhx1;

    iget-object v3, p0, Lde3;->h:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-boolean v4, p0, Lde3;->f:Z

    .line 4
    invoke-static {}, Lkx1;->Q()Ljx1;

    move-result-object v5

    .line 5
    invoke-virtual {v5}, Ln54;->b()V

    .line 6
    iget-object v6, v5, Ln54;->g:Lp54;

    .line 7
    check-cast v6, Lkx1;

    invoke-virtual {v6, v3}, Lkx1;->E(Ljava/util/ArrayList;)V

    .line 8
    iget-object v3, v0, Lgz2;->c:Landroid/content/Context;

    .line 9
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "airplane_mode_on"

    const/4 v8, 0x0

    .line 10
    invoke-static {v6, v7, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v6

    const/4 v7, 0x1

    const/4 v9, 0x2

    if-eqz v6, :cond_0

    move v6, v9

    goto :goto_0

    :cond_0
    move v6, v7

    .line 11
    :goto_0
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v10, v5, Ln54;->g:Lp54;

    .line 12
    check-cast v10, Lkx1;

    invoke-virtual {v10, v6}, Lkx1;->H(I)V

    .line 13
    iget-object v6, v0, Lgz2;->e:Landroid/telephony/TelephonyManager;

    .line 14
    sget-object v10, Lhg4;->C:Lhg4;

    iget-object v11, v10, Lhg4;->f:Lnh4;

    .line 15
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    const-string v11, "android.permission.ACCESS_NETWORK_STATE"

    .line 17
    invoke-static {v3, v11}, Llf4;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 18
    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->isDataEnabled()Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v9

    goto :goto_1

    :cond_1
    move v6, v7

    .line 19
    :goto_1
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v11, v5, Ln54;->g:Lp54;

    .line 20
    check-cast v11, Lkx1;

    invoke-virtual {v11, v6}, Lkx1;->I(I)V

    .line 21
    iget-object v6, v0, Lgz2;->f:Lez2;

    .line 22
    iget-object v11, v6, Lez2;->h:Ljava/lang/Object;

    .line 23
    monitor-enter v11

    :try_start_0
    iget-wide v12, v6, Lez2;->c:J

    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 24
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v11, v5, Ln54;->g:Lp54;

    .line 25
    check-cast v11, Lkx1;

    invoke-virtual {v11, v12, v13}, Lkx1;->C(J)V

    .line 26
    monitor-enter v6

    .line 27
    :try_start_1
    iget-object v11, v6, Lez2;->j:Ljava/lang/Object;

    monitor-enter v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-wide v12, v6, Lez2;->e:J

    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v6

    .line 28
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v11, v5, Ln54;->g:Lp54;

    .line 29
    check-cast v11, Lkx1;

    invoke-virtual {v11, v12, v13}, Lkx1;->D(J)V

    .line 30
    iget-object v12, v6, Lez2;->g:Ljava/lang/Object;

    monitor-enter v12

    :try_start_3
    iget v11, v6, Lez2;->b:I

    monitor-exit v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v12, v5, Ln54;->g:Lp54;

    .line 32
    check-cast v12, Lkx1;

    invoke-virtual {v12, v11}, Lkx1;->J(I)V

    .line 33
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v11, v5, Ln54;->g:Lp54;

    .line 34
    check-cast v11, Lkx1;

    invoke-virtual {v11, v1}, Lkx1;->L(Lmx1;)V

    .line 35
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v1, v5, Ln54;->g:Lp54;

    .line 36
    check-cast v1, Lkx1;

    invoke-virtual {v1, v2}, Lkx1;->F(Lhx1;)V

    .line 37
    iget v1, v0, Lgz2;->g:I

    .line 38
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v2, v5, Ln54;->g:Lp54;

    .line 39
    check-cast v2, Lkx1;

    invoke-virtual {v2, v1}, Lkx1;->K(I)V

    if-eqz v4, :cond_2

    move v1, v9

    goto :goto_2

    :cond_2
    move v1, v7

    .line 40
    :goto_2
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v2, v5, Ln54;->g:Lp54;

    .line 41
    check-cast v2, Lkx1;

    invoke-virtual {v2, v1}, Lkx1;->B(I)V

    .line 42
    invoke-virtual {v6}, Lez2;->a()J

    move-result-wide v1

    .line 43
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v6, v5, Ln54;->g:Lp54;

    .line 44
    check-cast v6, Lkx1;

    invoke-virtual {v6, v1, v2}, Lkx1;->M(J)V

    .line 45
    iget-object v1, v10, Lhg4;->k:Lym;

    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 48
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v6, v5, Ln54;->g:Lp54;

    .line 49
    check-cast v6, Lkx1;

    invoke-virtual {v6, v1, v2}, Lkx1;->A(J)V

    .line 50
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "wifi_on"

    .line 51
    invoke-static {v1, v2, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v1

    if-eqz v1, :cond_3

    move v7, v9

    .line 52
    :cond_3
    invoke-virtual {v5}, Ln54;->b()V

    iget-object v1, v5, Ln54;->g:Lp54;

    .line 53
    check-cast v1, Lkx1;

    invoke-virtual {v1, v7}, Lkx1;->G(I)V

    .line 54
    invoke-virtual {v5}, Ln54;->d()Lp54;

    move-result-object v1

    check-cast v1, Lkx1;

    .line 55
    invoke-virtual {v1}, Ls44;->b()[B

    move-result-object v1

    .line 56
    const-string v2, "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'completed_requests\'"

    .line 57
    invoke-virtual {p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    if-nez v4, :cond_4

    .line 58
    const-string v2, "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'failed_requests\'"

    .line 59
    invoke-virtual {p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 60
    :cond_4
    iget-object v0, v0, Lgz2;->f:Lez2;

    .line 61
    invoke-virtual {v0}, Lez2;->a()J

    move-result-wide v2

    .line 62
    invoke-static {p1, v2, v3, v1}, Lwl2;->R(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 63
    :try_start_4
    monitor-exit v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 64
    :try_start_5
    monitor-exit v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1

    :catchall_2
    move-exception p1

    .line 65
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    .line 66
    :try_start_7
    monitor-exit v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1

    :cond_5
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    check-cast v0, Lwt2;

    iget-object v0, v0, Lwt2;->g:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkh4;

    move-object v1, p1

    check-cast v1, Lrh4;

    .line 67
    iget-object p1, p0, Lde3;->h:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lch4;

    iget-object p1, p0, Lde3;->i:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lhh4;

    iget-object p1, p0, Lde3;->j:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/io/IOException;

    iget-boolean v7, p0, Lde3;->f:Z

    const/4 v2, 0x0

    invoke-interface/range {v1 .. v7}, Lrh4;->o(ILkh4;Lch4;Lhh4;Ljava/io/IOException;Z)V

    return-void
.end method

.method public d(Lbv1;Lus0;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    sget-object v4, Lde3;->k:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v4

    .line 10
    const/4 v0, 0x1

    .line 11
    :try_start_0
    invoke-virtual {v1, v0}, Lde3;->r(I)Lfv1;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual/range {p1 .. p1}, Lbv1;->A()Lfv1;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-virtual {v6}, Lfv1;->A()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const/4 v7, 0x0

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Lfv1;->A()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    const/16 v0, 0xfae

    .line 37
    .line 38
    invoke-virtual {v1, v0, v2, v3}, Lde3;->p(IJ)V

    .line 39
    .line 40
    .line 41
    monitor-exit v4

    .line 42
    return v7

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    const-string v5, "d:"

    .line 47
    .line 48
    const-string v8, ",f:"

    .line 49
    .line 50
    const-string v9, "cw:"

    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v10

    .line 56
    invoke-virtual {v1, v6}, Lde3;->j(Ljava/lang/String;)Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    const/16 v14, 0xfaf

    .line 65
    .line 66
    if-eqz v13, :cond_3

    .line 67
    .line 68
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    const-string v13, "1"

    .line 73
    .line 74
    const-string v15, "0"

    .line 75
    .line 76
    if-eq v0, v9, :cond_1

    .line 77
    .line 78
    move-object v13, v15

    .line 79
    :cond_1
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    const-string v12, "1"

    .line 84
    .line 85
    const-string v15, "0"

    .line 86
    .line 87
    if-eq v0, v9, :cond_2

    .line 88
    .line 89
    move-object v12, v15

    .line 90
    :cond_2
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    add-int/lit8 v9, v9, 0x5

    .line 95
    .line 96
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    add-int/2addr v9, v15

    .line 101
    new-instance v15, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v15, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget-object v8, v1, Lde3;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v8, Lsd3;

    .line 125
    .line 126
    const/16 v9, 0xfb7

    .line 127
    .line 128
    invoke-interface {v8, v9, v10, v11, v5}, Lsd3;->j(IJLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v14, v10, v11}, Lde3;->p(IJ)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_5

    .line 140
    .line 141
    invoke-virtual {v12}, Ljava/io/File;->canWrite()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const-string v3, "1"

    .line 146
    .line 147
    const-string v5, "0"

    .line 148
    .line 149
    if-eq v0, v2, :cond_4

    .line 150
    .line 151
    move-object v3, v5

    .line 152
    :cond_4
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v2, v1, Lde3;->j:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, Lsd3;

    .line 159
    .line 160
    const/16 v3, 0xfb8

    .line 161
    .line 162
    invoke-interface {v2, v3, v10, v11, v0}, Lsd3;->j(IJLjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v14, v10, v11}, Lde3;->p(IJ)V

    .line 166
    .line 167
    .line 168
    monitor-exit v4

    .line 169
    return v7

    .line 170
    :cond_5
    :goto_0
    invoke-virtual {v1, v6}, Lde3;->j(Ljava/lang/String;)Ljava/io/File;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    new-instance v6, Ljava/io/File;

    .line 175
    .line 176
    const-string v8, "pcam.jar"

    .line 177
    .line 178
    invoke-direct {v6, v5, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    new-instance v8, Ljava/io/File;

    .line 182
    .line 183
    const-string v9, "pcbc"

    .line 184
    .line 185
    invoke-direct {v8, v5, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {p1 .. p1}, Lbv1;->B()La54;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v9}, La54;->p()[B

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-static {v6, v9}, Luk2;->P(Ljava/io/File;[B)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-nez v9, :cond_6

    .line 201
    .line 202
    const/16 v0, 0xfb0

    .line 203
    .line 204
    invoke-virtual {v1, v0, v2, v3}, Lde3;->p(IJ)V

    .line 205
    .line 206
    .line 207
    monitor-exit v4

    .line 208
    return v7

    .line 209
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lbv1;->C()La54;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-virtual {v9}, La54;->p()[B

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-static {v8, v9}, Luk2;->P(Ljava/io/File;[B)Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-nez v8, :cond_7

    .line 222
    .line 223
    const/16 v0, 0xfb1

    .line 224
    .line 225
    invoke-virtual {v1, v0, v2, v3}, Lde3;->p(IJ)V

    .line 226
    .line 227
    .line 228
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    return v7

    .line 230
    :cond_7
    if-eqz p2, :cond_8

    .line 231
    .line 232
    :try_start_1
    invoke-static {v6}, Lfd3;->a(Ljava/io/File;)Z

    .line 233
    .line 234
    .line 235
    move-result v6
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    goto :goto_1

    .line 237
    :catch_0
    move v6, v7

    .line 238
    :goto_1
    if-nez v6, :cond_8

    .line 239
    .line 240
    const/16 v0, 0xfb2

    .line 241
    .line 242
    :try_start_2
    invoke-virtual {v1, v0, v2, v3}, Lde3;->p(IJ)V

    .line 243
    .line 244
    .line 245
    invoke-static {v5}, Luk2;->a0(Ljava/io/File;)Z

    .line 246
    .line 247
    .line 248
    monitor-exit v4

    .line 249
    goto :goto_2

    .line 250
    :cond_8
    invoke-static/range {p1 .. p1}, Lde3;->n(Lbv1;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 255
    .line 256
    .line 257
    move-result-wide v8

    .line 258
    iget-object v6, v1, Lde3;->h:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v6, Landroid/content/SharedPreferences;

    .line 261
    .line 262
    iget-object v10, v1, Lde3;->i:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v10, Ljava/lang/String;

    .line 265
    .line 266
    const-string v11, "LATMTD"

    .line 267
    .line 268
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    const/4 v11, 0x0

    .line 277
    invoke-interface {v6, v10, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    iget-object v11, v1, Lde3;->i:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v11, Ljava/lang/String;

    .line 288
    .line 289
    const-string v12, "LATMTD"

    .line 290
    .line 291
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    invoke-interface {v6, v11, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 300
    .line 301
    .line 302
    if-eqz v10, :cond_9

    .line 303
    .line 304
    iget-object v5, v1, Lde3;->i:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v5, Ljava/lang/String;

    .line 307
    .line 308
    const-string v11, "FBAMTD"

    .line 309
    .line 310
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v11, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-interface {v6, v5, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 319
    .line 320
    .line 321
    :cond_9
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-nez v5, :cond_a

    .line 326
    .line 327
    const/16 v0, 0xfb3

    .line 328
    .line 329
    invoke-virtual {v1, v0, v8, v9}, Lde3;->p(IJ)V

    .line 330
    .line 331
    .line 332
    monitor-exit v4

    .line 333
    :goto_2
    return v7

    .line 334
    :cond_a
    new-instance v5, Ljava/util/HashSet;

    .line 335
    .line 336
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v0}, Lde3;->r(I)Lfv1;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    if-eqz v6, :cond_b

    .line 344
    .line 345
    invoke-virtual {v6}, Lfv1;->A()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    :cond_b
    const/4 v6, 0x2

    .line 353
    invoke-virtual {v1, v6}, Lde3;->r(I)Lfv1;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    if-eqz v6, :cond_c

    .line 358
    .line 359
    invoke-virtual {v6}, Lfv1;->A()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    :cond_c
    new-instance v6, Ljava/io/File;

    .line 367
    .line 368
    iget-object v8, v1, Lde3;->g:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v8, Landroid/content/Context;

    .line 371
    .line 372
    const-string v9, "pccache"

    .line 373
    .line 374
    invoke-virtual {v8, v9, v7}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    iget-object v9, v1, Lde3;->i:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v9, Ljava/lang/String;

    .line 381
    .line 382
    invoke-direct {v6, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 386
    .line 387
    .line 388
    move-result-object v6

    .line 389
    array-length v8, v6

    .line 390
    :goto_3
    if-ge v7, v8, :cond_e

    .line 391
    .line 392
    aget-object v9, v6, v7

    .line 393
    .line 394
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    if-nez v10, :cond_d

    .line 403
    .line 404
    invoke-static {v9}, Luk2;->a0(Ljava/io/File;)Z

    .line 405
    .line 406
    .line 407
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_e
    const/16 v5, 0x1396

    .line 411
    .line 412
    invoke-virtual {v1, v5, v2, v3}, Lde3;->p(IJ)V

    .line 413
    .line 414
    .line 415
    monitor-exit v4

    .line 416
    return v0

    .line 417
    :goto_4
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 418
    throw v0
.end method

.method public declared-synchronized e(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lde3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lge3;

    .line 5
    .line 6
    invoke-interface {v0}, Lge3;->h()Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "f"

    .line 11
    .line 12
    const-string v2, "v"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v1, "ctx"

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "aid"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const-string p1, "view"

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string p1, "act"

    .line 34
    .line 35
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lde3;->q(Ljava/util/Map;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-boolean p2, p0, Lde3;->f:Z

    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    invoke-static {p1}, Lde3;->o([B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    monitor-exit p0

    .line 57
    return-object p1

    .line 58
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
.end method

.method public synthetic f(Lyc;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Lhg3;

    .line 5
    .line 6
    iget-object v0, p0, Lde3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v5, p0, Lde3;->f:Z

    .line 12
    .line 13
    iget-object v0, p0, Lde3;->h:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v6, v0

    .line 16
    check-cast v6, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p0, Lde3;->j:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v7, v0

    .line 21
    check-cast v7, [B

    .line 22
    .line 23
    new-instance v1, Lfg3;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    invoke-direct/range {v1 .. v7}, Lfg3;-><init>(Lhg3;Ljava/lang/String;Lyc;ZLjava/lang/String;[B)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v2, Lhg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const-string p1, ""

    .line 35
    .line 36
    return-object p1
.end method

.method public g(Lbv1;)Z
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lde3;->k:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3}, Lfv1;->A()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p0, v3}, Lde3;->j(Ljava/lang/String;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Ljava/io/File;

    .line 21
    .line 22
    const-string v5, "pcbc"

    .line 23
    .line 24
    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lbv1;->C()La54;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, La54;->p()[B

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v4, v3}, Luk2;->P(Ljava/io/File;[B)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    const/16 p1, 0xfb4

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0, v1}, Lde3;->p(IJ)V

    .line 44
    .line 45
    .line 46
    monitor-exit v2

    .line 47
    const/4 p1, 0x0

    .line 48
    return p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {p1}, Lde3;->n(Lbv1;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v3, p0, Lde3;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Landroid/content/SharedPreferences;

    .line 58
    .line 59
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v4, p0, Lde3;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    const-string v5, "LATMTD"

    .line 68
    .line 69
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v3, v4, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    const/16 v3, 0x1397

    .line 87
    .line 88
    invoke-virtual {p0, v3, v0, v1}, Lde3;->p(IJ)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    const/16 v3, 0xfb5

    .line 93
    .line 94
    invoke-virtual {p0, v3, v0, v1}, Lde3;->p(IJ)V

    .line 95
    .line 96
    .line 97
    :goto_0
    monitor-exit v2

    .line 98
    return p1

    .line 99
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw p1
.end method

.method public declared-synchronized h(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lde3;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lge3;

    .line 5
    .line 6
    invoke-interface {v0}, Lge3;->l()Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "f"

    .line 11
    .line 12
    const-string v2, "c"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v1, "ctx"

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "cs"

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p1, "aid"

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string p1, "view"

    .line 34
    .line 35
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string p1, "act"

    .line 39
    .line 40
    invoke-virtual {v0, p1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lde3;->q(Ljava/util/Map;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-boolean p2, p0, Lde3;->f:Z

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :goto_0
    invoke-static {p1}, Lde3;->o([B)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit p0

    .line 62
    return-object p1

    .line 63
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1
.end method

.method public declared-synchronized i(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    iget-object v2, p0, Lde3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Lge3;

    .line 9
    .line 10
    invoke-interface {v2}, Lge3;->b()Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "aid"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v3, "evt"

    .line 21
    .line 22
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lde3;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "he"

    .line 32
    .line 33
    const-class v5, Ljava/util/Map;

    .line 34
    .line 35
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v3, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lde3;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lgd3;

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v2, v0

    .line 59
    const/16 v0, 0xbbb

    .line 60
    .line 61
    invoke-virtual {p1, v0, v2, v3}, Lgd3;->b(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    :try_start_1
    new-instance v0, Lee3;

    .line 70
    .line 71
    const/16 v1, 0x7d5

    .line 72
    .line 73
    invoke-direct {v0, v1, p1}, Lee3;-><init>(ILjava/lang/Exception;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1
.end method

.method public j(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "pccache"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lde3;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    new-instance v2, Ljava/io/File;

    .line 17
    .line 18
    new-instance v3, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v2
.end method

.method public declared-synchronized k()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "init"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    .line 26
    return v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    :try_start_1
    new-instance v1, Lee3;

    .line 31
    .line 32
    const/16 v2, 0x7d1

    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Lee3;-><init>(ILjava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
.end method

.method public declared-synchronized l()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    iget-object v2, p0, Lde3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "close"

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lde3;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lgd3;

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    sub-long/2addr v3, v0

    .line 31
    const/16 v0, 0xbb9

    .line 32
    .line 33
    invoke-virtual {v2, v0, v3, v4}, Lgd3;->b(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    :try_start_1
    new-instance v1, Lee3;

    .line 42
    .line 43
    const/16 v2, 0x7d3

    .line 44
    .line 45
    invoke-direct {v1, v2, v0}, Lee3;-><init>(ILjava/lang/Exception;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v0
.end method

.method public declared-synchronized m()I
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lde3;->g:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "lcs"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    .line 26
    return v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    :try_start_1
    new-instance v1, Lee3;

    .line 31
    .line 32
    const/16 v2, 0x7d6

    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Lee3;-><init>(ILjava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
.end method

.method public p(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lde3;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd3;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lsd3;->o(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized q(Ljava/util/Map;)[B
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_1
    iget-object v3, p0, Lde3;->g:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const-string v5, "xss"

    .line 14
    .line 15
    const-class v6, Ljava/util/Map;

    .line 16
    .line 17
    const-class v7, Ljava/util/Map;

    .line 18
    .line 19
    filled-new-array {v6, v7}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v4, v3, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, [B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    :try_start_2
    iget-object v3, p0, Lde3;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lgd3;

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    sub-long/2addr v4, v0

    .line 51
    const/16 v0, 0x7d7

    .line 52
    .line 53
    invoke-virtual {v3, v0, v4, v5, p1}, Lgd3;->c(IJLjava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-object v2

    .line 58
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    throw p1
.end method

.method public r(I)Lfv1;
    .locals 5

    .line 1
    iget-object v0, p0, Lde3;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lde3;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne p1, v2, :cond_0

    .line 12
    .line 13
    const-string p1, "LATMTD"

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v1, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "FBAMTD"

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {v1, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :try_start_0
    invoke-static {p1}, Luk2;->x(Ljava/lang/String;)[B

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    array-length v2, p1

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static {p1, v4, v2}, La54;->n([BII)Ly44;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-boolean v2, p0, Lde3;->f:Z

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget-object v2, Lh54;->a:Lh54;

    .line 64
    .line 65
    sget v2, Lu44;->a:I

    .line 66
    .line 67
    sget-object v2, Lh54;->b:Lh54;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {}, Lh54;->a()Lh54;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :goto_1
    invoke-static {p1, v2}, Lfv1;->G(Ly44;Lh54;)Lfv1;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    return-object p1

    .line 79
    :catch_0
    const/16 p1, 0x7f0

    .line 80
    .line 81
    invoke-virtual {p0, p1, v0, v1}, Lde3;->p(IJ)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catch_1
    const/16 p1, 0x7ed

    .line 86
    .line 87
    invoke-virtual {p0, p1, v0, v1}, Lde3;->p(IJ)V

    .line 88
    .line 89
    .line 90
    :catch_2
    :goto_2
    return-object v3
.end method
