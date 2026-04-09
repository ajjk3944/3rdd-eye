.class public final Lp04;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzj:Lp04;

.field private static volatile zzk:Ln64;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Lr04;

.field private zzd:La54;

.field private zze:La54;

.field private zzf:La54;

.field private zzg:La54;

.field private zzh:La54;

.field private zzi:La54;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp04;

    .line 2
    .line 3
    invoke-direct {v0}, Lp04;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp04;->zzj:Lp04;

    .line 7
    .line 8
    const-class v1, Lp04;

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
    sget-object v0, La54;->g:Ly44;

    .line 5
    .line 6
    iput-object v0, p0, Lp04;->zzd:La54;

    .line 7
    .line 8
    iput-object v0, p0, Lp04;->zze:La54;

    .line 9
    .line 10
    iput-object v0, p0, Lp04;->zzf:La54;

    .line 11
    .line 12
    iput-object v0, p0, Lp04;->zzg:La54;

    .line 13
    .line 14
    iput-object v0, p0, Lp04;->zzh:La54;

    .line 15
    .line 16
    iput-object v0, p0, Lp04;->zzi:La54;

    .line 17
    .line 18
    return-void
.end method

.method public static I(La54;Lh54;)Lp04;
    .locals 1

    .line 1
    sget-object v0, Lp04;->zzj:Lp04;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lp54;->m(Lp54;La54;Lh54;)Lp54;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lp04;

    .line 8
    .line 9
    return-object p0
.end method

.method public static J()Lo04;
    .locals 1

    .line 1
    sget-object v0, Lp04;->zzj:Lp04;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lo04;

    .line 8
    .line 9
    return-object v0
.end method

.method public static K()Ln64;
    .locals 1

    .line 1
    sget-object v0, Lp04;->zzj:Lp04;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->o()Ln64;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget v0, p0, Lp04;->zzb:I

    .line 2
    .line 3
    return v0
.end method

.method public final B()Lr04;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzc:Lr04;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lr04;->G()Lr04;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public final C()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzd:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zze:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzf:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzg:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzh:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()La54;
    .locals 1

    .line 1
    iget-object v0, p0, Lp04;->zzi:La54;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic L()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp04;->zzb:I

    .line 3
    .line 4
    return-void
.end method

.method public final synthetic M(Lr04;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzc:Lr04;

    .line 2
    .line 3
    iget p1, p0, Lp04;->zza:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lp04;->zza:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic N(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzd:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic O(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zze:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic P(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzf:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic Q(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzg:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic R(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzh:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic S(Ly44;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp04;->zzi:La54;

    .line 2
    .line 3
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {p1}, Lex0;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    if-eq p1, p2, :cond_6

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    if-eq p1, p2, :cond_5

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    if-eq p1, p2, :cond_4

    .line 15
    .line 16
    const/4 p2, 0x5

    .line 17
    if-eq p1, p2, :cond_3

    .line 18
    .line 19
    const/4 p2, 0x6

    .line 20
    if-ne p1, p2, :cond_2

    .line 21
    .line 22
    sget-object p1, Lp04;->zzk:Ln64;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const-class p2, Lp04;

    .line 27
    .line 28
    monitor-enter p2

    .line 29
    :try_start_0
    sget-object p1, Lp04;->zzk:Ln64;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lo54;

    .line 34
    .line 35
    sget-object v0, Lp04;->zzj:Lp04;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Lp04;->zzk:Ln64;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    monitor-exit p2

    .line 47
    return-object p1

    .line 48
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1

    .line 50
    :cond_1
    return-object p1

    .line 51
    :cond_2
    const/4 p1, 0x0

    .line 52
    throw p1

    .line 53
    :cond_3
    sget-object p1, Lp04;->zzj:Lp04;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Lo04;

    .line 57
    .line 58
    sget-object p2, Lp04;->zzj:Lp04;

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_5
    new-instance p1, Lp04;

    .line 65
    .line 66
    invoke-direct {p1}, Lp04;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_6
    const-string v0, "zza"

    .line 71
    .line 72
    const-string v1, "zzb"

    .line 73
    .line 74
    const-string v2, "zzc"

    .line 75
    .line 76
    const-string v3, "zzd"

    .line 77
    .line 78
    const-string v4, "zze"

    .line 79
    .line 80
    const-string v5, "zzf"

    .line 81
    .line 82
    const-string v6, "zzg"

    .line 83
    .line 84
    const-string v7, "zzh"

    .line 85
    .line 86
    const-string v8, "zzi"

    .line 87
    .line 88
    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    sget-object p2, Lp04;->zzj:Lp04;

    .line 93
    .line 94
    const-string v0, "\u0000\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\u0008\n"

    .line 95
    .line 96
    new-instance v1, Lr64;

    .line 97
    .line 98
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_7
    const/4 p1, 0x1

    .line 103
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1
.end method
