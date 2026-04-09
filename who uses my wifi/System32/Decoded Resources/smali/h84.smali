.class public final Lh84;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zze:Lh84;

.field private static volatile zzf:Ln64;


# instance fields
.field private zza:I

.field private zzb:La54;

.field private zzc:La54;

.field private zzd:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh84;

    .line 2
    .line 3
    invoke-direct {v0}, Lh84;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh84;->zze:Lh84;

    .line 7
    .line 8
    const-class v1, Lh84;

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
    iput-byte v0, p0, Lh84;->zzd:B

    .line 6
    .line 7
    sget-object v0, La54;->g:Ly44;

    .line 8
    .line 9
    iput-object v0, p0, Lh84;->zzb:La54;

    .line 10
    .line 11
    iput-object v0, p0, Lh84;->zzc:La54;

    .line 12
    .line 13
    return-void
.end method

.method public static A()Lg84;
    .locals 1

    .line 1
    sget-object v0, Lh84;->zze:Lh84;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lg84;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final synthetic B(Ly44;)V
    .locals 1

    .line 1
    iget v0, p0, Lh84;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lh84;->zza:I

    .line 6
    .line 7
    iput-object p1, p0, Lh84;->zzb:La54;

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic C(La54;)V
    .locals 1

    .line 1
    iget v0, p0, Lh84;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lh84;->zza:I

    .line 6
    .line 7
    iput-object p1, p0, Lh84;->zzc:La54;

    .line 8
    .line 9
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 2

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
    sget-object p1, Lh84;->zzf:Ln64;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-class p2, Lh84;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    sget-object p1, Lh84;->zzf:Ln64;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Lo54;

    .line 22
    .line 23
    sget-object v0, Lh84;->zze:Lh84;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 26
    .line 27
    .line 28
    sput-object p1, Lh84;->zzf:Ln64;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit p2

    .line 34
    return-object p1

    .line 35
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1

    .line 37
    :cond_1
    return-object p1

    .line 38
    :pswitch_1
    sget-object p1, Lh84;->zze:Lh84;

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_2
    new-instance p1, Lg84;

    .line 42
    .line 43
    sget-object p2, Lh84;->zze:Lh84;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_3
    new-instance p1, Lh84;

    .line 50
    .line 51
    invoke-direct {p1}, Lh84;-><init>()V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_4
    const-string p1, "zza"

    .line 56
    .line 57
    const-string p2, "zzb"

    .line 58
    .line 59
    const-string v0, "zzc"

    .line 60
    .line 61
    filled-new-array {p1, p2, v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    sget-object p2, Lh84;->zze:Lh84;

    .line 66
    .line 67
    const-string v0, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u150a\u0000\u0002\u100a\u0001"

    .line 68
    .line 69
    new-instance v1, Lr64;

    .line 70
    .line 71
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_5
    if-nez p2, :cond_2

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 p1, 0x1

    .line 80
    :goto_2
    iput-byte p1, p0, Lh84;->zzd:B

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_6
    iget-byte p1, p0, Lh84;->zzd:B

    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    nop

    .line 91
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
