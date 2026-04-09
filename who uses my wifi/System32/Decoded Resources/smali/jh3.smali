.class public final Ljh3;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zze:Ljh3;

.field private static volatile zzf:Ln64;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Ljava/lang/Object;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljh3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljh3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljh3;->zze:Ljh3;

    .line 7
    .line 8
    const-class v1, Ljh3;

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
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ljh3;->zzb:I

    .line 6
    .line 7
    return-void
.end method

.method public static D()Lzg3;
    .locals 1

    .line 1
    sget-object v0, Ljh3;->zze:Ljh3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lzg3;

    .line 8
    .line 9
    return-object v0
.end method

.method public static E()Ljh3;
    .locals 1

    .line 1
    sget-object v0, Ljh3;->zze:Ljh3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()Lfv1;
    .locals 2

    .line 1
    iget v0, p0, Ljh3;->zzb:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ljh3;->zzc:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfv1;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lfv1;->I()Lfv1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final B()Ldv1;
    .locals 2

    .line 1
    iget v0, p0, Ljh3;->zzb:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ljh3;->zzc:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldv1;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Ldv1;->C()Ldv1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final C()Lav1;
    .locals 1

    .line 1
    iget v0, p0, Ljh3;->zzd:I

    .line 2
    .line 3
    invoke-static {v0}, Lav1;->b(I)Lav1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lav1;->g:Lav1;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public final synthetic F(Lfv1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljh3;->zzc:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Ljh3;->zzb:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic G(Ldv1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljh3;->zzc:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    iput p1, p0, Ljh3;->zzb:I

    .line 8
    .line 9
    return-void
.end method

.method public final H(Lav1;)V
    .locals 0

    .line 1
    iget p1, p1, Lav1;->f:I

    .line 2
    .line 3
    iput p1, p0, Ljh3;->zzd:I

    .line 4
    .line 5
    iget p1, p0, Ljh3;->zza:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput p1, p0, Ljh3;->zza:I

    .line 10
    .line 11
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
    sget-object p1, Ljh3;->zzf:Ln64;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const-class p2, Ljh3;

    .line 27
    .line 28
    monitor-enter p2

    .line 29
    :try_start_0
    sget-object p1, Ljh3;->zzf:Ln64;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lo54;

    .line 34
    .line 35
    sget-object v0, Ljh3;->zze:Ljh3;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Ljh3;->zzf:Ln64;

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
    sget-object p1, Ljh3;->zze:Ljh3;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Lzg3;

    .line 57
    .line 58
    sget-object p2, Ljh3;->zze:Ljh3;

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_5
    new-instance p1, Ljh3;

    .line 65
    .line 66
    invoke-direct {p1}, Ljh3;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_6
    const-string v0, "zzc"

    .line 71
    .line 72
    const-string v1, "zzb"

    .line 73
    .line 74
    const-string v2, "zza"

    .line 75
    .line 76
    const-class v3, Lfv1;

    .line 77
    .line 78
    const-class v4, Ldv1;

    .line 79
    .line 80
    const-string v5, "zzd"

    .line 81
    .line 82
    sget-object v6, Ltq1;->n:Ltq1;

    .line 83
    .line 84
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object p2, Ljh3;->zze:Ljh3;

    .line 89
    .line 90
    const-string v0, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u180c\u0000"

    .line 91
    .line 92
    new-instance v1, Lr64;

    .line 93
    .line 94
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_7
    const/4 p1, 0x1

    .line 99
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1
.end method
