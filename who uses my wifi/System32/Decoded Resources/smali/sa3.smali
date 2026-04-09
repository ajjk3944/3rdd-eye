.class public final Lsa3;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzc:Lsa3;

.field private static volatile zzd:Ln64;


# instance fields
.field private zza:Lx54;

.field private zzb:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsa3;

    .line 2
    .line 3
    invoke-direct {v0}, Lsa3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsa3;->zzc:Lsa3;

    .line 7
    .line 8
    const-class v1, Lsa3;

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
    sget-object v0, Lq64;->j:Lq64;

    .line 5
    .line 6
    iput-object v0, p0, Lsa3;->zza:Lx54;

    .line 7
    .line 8
    return-void
.end method

.method public static A()Lra3;
    .locals 1

    .line 1
    sget-object v0, Lsa3;->zzc:Lsa3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lra3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final B(Lz93;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsa3;->zza:Lx54;

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
    iput-object v0, p0, Lsa3;->zza:Lx54;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lsa3;->zza:Lx54;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final synthetic C(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lsa3;->zzb:J

    .line 2
    .line 3
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
    sget-object p1, Lsa3;->zzd:Ln64;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const-class p2, Lsa3;

    .line 27
    .line 28
    monitor-enter p2

    .line 29
    :try_start_0
    sget-object p1, Lsa3;->zzd:Ln64;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lo54;

    .line 34
    .line 35
    sget-object v0, Lsa3;->zzc:Lsa3;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Lsa3;->zzd:Ln64;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p2

    .line 46
    return-object p1

    .line 47
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_1
    return-object p1

    .line 50
    :cond_2
    const/4 p1, 0x0

    .line 51
    throw p1

    .line 52
    :cond_3
    sget-object p1, Lsa3;->zzc:Lsa3;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_4
    new-instance p1, Lra3;

    .line 56
    .line 57
    sget-object p2, Lsa3;->zzc:Lsa3;

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_5
    new-instance p1, Lsa3;

    .line 64
    .line 65
    invoke-direct {p1}, Lsa3;-><init>()V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_6
    const-string p1, "zza"

    .line 70
    .line 71
    const-class p2, Lz93;

    .line 72
    .line 73
    const-string v0, "zzb"

    .line 74
    .line 75
    filled-new-array {p1, p2, v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Lsa3;->zzc:Lsa3;

    .line 80
    .line 81
    const-string v0, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002"

    .line 82
    .line 83
    new-instance v1, Lr64;

    .line 84
    .line 85
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_7
    const/4 p1, 0x1

    .line 90
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1
.end method
