.class public final Lk84;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzh:Lk84;

.field private static volatile zzi:Ln64;


# instance fields
.field private zza:I

.field private zzb:Lj84;

.field private zzc:Lx54;

.field private zzd:La54;

.field private zze:La54;

.field private zzf:I

.field private zzg:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk84;

    .line 2
    .line 3
    invoke-direct {v0}, Lk84;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk84;->zzh:Lk84;

    .line 7
    .line 8
    const-class v1, Lk84;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lp54;->u(Ljava/lang/Class;Lp54;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp54;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lk84;->zzg:B

    .line 6
    .line 7
    sget-object v0, Lq64;->j:Lq64;

    .line 8
    .line 9
    iput-object v0, p0, Lk84;->zzc:Lx54;

    .line 10
    .line 11
    sget-object v0, La54;->g:Ly44;

    .line 12
    .line 13
    iput-object v0, p0, Lk84;->zzd:La54;

    .line 14
    .line 15
    iput-object v0, p0, Lk84;->zze:La54;

    .line 16
    .line 17
    return-void
.end method

.method public static A()Li84;
    .locals 1

    .line 1
    sget-object v0, Lk84;->zzh:Lk84;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li84;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final B(Lh84;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk84;->zzc:Lx54;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lt44;

    .line 5
    .line 6
    iget-boolean v1, v1, Lt44;->f:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v1, v1

    .line 15
    invoke-interface {v0, v1}, Lx54;->z(I)Lx54;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lk84;->zzc:Lx54;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lk84;->zzc:Lx54;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lex0;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    throw v0

    .line 10
    :pswitch_0
    sget-object p1, Lk84;->zzi:Ln64;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-class p2, Lk84;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    sget-object p1, Lk84;->zzi:Ln64;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Lo54;

    .line 22
    .line 23
    sget-object v0, Lk84;->zzh:Lk84;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 26
    .line 27
    .line 28
    sput-object p1, Lk84;->zzi:Ln64;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    move-object p1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p2

    .line 35
    return-object p1

    .line 36
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p1

    .line 38
    :cond_1
    return-object p1

    .line 39
    :pswitch_1
    sget-object p1, Lk84;->zzh:Lk84;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    new-instance p1, Li84;

    .line 43
    .line 44
    sget-object p2, Lk84;->zzh:Lk84;

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_3
    new-instance p1, Lk84;

    .line 51
    .line 52
    invoke-direct {p1}, Lk84;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_4
    const-string v0, "zza"

    .line 57
    .line 58
    const-string v1, "zzb"

    .line 59
    .line 60
    const-string v2, "zzc"

    .line 61
    .line 62
    const-class v3, Lh84;

    .line 63
    .line 64
    const-string v4, "zzd"

    .line 65
    .line 66
    const-string v5, "zze"

    .line 67
    .line 68
    const-string v6, "zzf"

    .line 69
    .line 70
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, Lk84;->zzh:Lk84;

    .line 75
    .line 76
    const-string v0, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003"

    .line 77
    .line 78
    new-instance v1, Lr64;

    .line 79
    .line 80
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :pswitch_5
    if-nez p2, :cond_2

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 p1, 0x1

    .line 89
    :goto_2
    iput-byte p1, p0, Lk84;->zzg:B

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_6
    iget-byte p1, p0, Lk84;->zzg:B

    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
