.class public final Lfv1;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzg:Lfv1;

.field private static volatile zzh:Ln64;


# instance fields
.field private zza:I

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:J

.field private zze:J

.field private zzf:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfv1;

    .line 2
    .line 3
    invoke-direct {v0}, Lfv1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfv1;->zzg:Lfv1;

    .line 7
    .line 8
    const-class v1, Lfv1;

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
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lfv1;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lfv1;->zzc:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static F(Ly44;)Lfv1;
    .locals 2

    .line 1
    sget-object v0, Lfv1;->zzg:Lfv1;

    .line 2
    .line 3
    sget-object v1, Lh54;->a:Lh54;

    .line 4
    .line 5
    sget v1, Lu44;->a:I

    .line 6
    .line 7
    sget-object v1, Lh54;->b:Lh54;

    .line 8
    .line 9
    invoke-static {v0, p0, v1}, Lp54;->m(Lp54;La54;Lh54;)Lp54;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lp54;->z(Lp54;)V

    .line 14
    .line 15
    .line 16
    check-cast p0, Lfv1;

    .line 17
    .line 18
    return-object p0
.end method

.method public static G(Ly44;Lh54;)Lfv1;
    .locals 1

    .line 1
    sget-object v0, Lfv1;->zzg:Lfv1;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lp54;->m(Lp54;La54;Lh54;)Lp54;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfv1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static H()Lev1;
    .locals 1

    .line 1
    sget-object v0, Lfv1;->zzg:Lfv1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lev1;

    .line 8
    .line 9
    return-object v0
.end method

.method public static I()Lfv1;
    .locals 1

    .line 1
    sget-object v0, Lfv1;->zzg:Lfv1;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfv1;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfv1;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lfv1;->zzd:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final D()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lfv1;->zze:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final E()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lfv1;->zzf:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final synthetic J(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lfv1;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lfv1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lfv1;->zzb:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic K(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lfv1;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lfv1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lfv1;->zzc:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic L(J)V
    .locals 1

    .line 1
    iget v0, p0, Lfv1;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lfv1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lfv1;->zzd:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic M(J)V
    .locals 1

    .line 1
    iget v0, p0, Lfv1;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, Lfv1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lfv1;->zze:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic N(J)V
    .locals 1

    .line 1
    iget v0, p0, Lfv1;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    iput v0, p0, Lfv1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lfv1;->zzf:J

    .line 8
    .line 9
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 6

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
    sget-object p1, Lfv1;->zzh:Ln64;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const-class p2, Lfv1;

    .line 27
    .line 28
    monitor-enter p2

    .line 29
    :try_start_0
    sget-object p1, Lfv1;->zzh:Ln64;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lo54;

    .line 34
    .line 35
    sget-object v0, Lfv1;->zzg:Lfv1;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Lfv1;->zzh:Ln64;

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
    sget-object p1, Lfv1;->zzg:Lfv1;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Lev1;

    .line 57
    .line 58
    sget-object p2, Lfv1;->zzg:Lfv1;

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_5
    new-instance p1, Lfv1;

    .line 65
    .line 66
    invoke-direct {p1}, Lfv1;-><init>()V

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
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object p2, Lfv1;->zzg:Lfv1;

    .line 87
    .line 88
    const-string v0, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004"

    .line 89
    .line 90
    new-instance v1, Lr64;

    .line 91
    .line 92
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_7
    const/4 p1, 0x1

    .line 97
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
.end method
