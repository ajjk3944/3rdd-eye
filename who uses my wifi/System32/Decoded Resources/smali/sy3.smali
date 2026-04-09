.class public final Lsy3;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zza:Lsy3;

.field private static volatile zzb:Ln64;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsy3;

    .line 2
    .line 3
    invoke-direct {v0}, Lp54;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsy3;->zza:Lsy3;

    .line 7
    .line 8
    const-class v1, Lsy3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lp54;->u(Ljava/lang/Class;Lp54;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static A(La54;Lh54;)V
    .locals 1

    .line 1
    sget-object v0, Lsy3;->zza:Lsy3;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lp54;->m(Lp54;La54;Lh54;)Lp54;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lsy3;

    .line 8
    .line 9
    return-void
.end method

.method public static B()Lsy3;
    .locals 1

    .line 1
    sget-object v0, Lsy3;->zza:Lsy3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
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
    const/4 v0, 0x0

    .line 9
    if-eq p1, p2, :cond_6

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    if-eq p1, p2, :cond_5

    .line 13
    .line 14
    const/4 p2, 0x4

    .line 15
    if-eq p1, p2, :cond_4

    .line 16
    .line 17
    const/4 p2, 0x5

    .line 18
    if-eq p1, p2, :cond_3

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    sget-object p1, Lsy3;->zzb:Ln64;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-class p2, Lsy3;

    .line 28
    .line 29
    monitor-enter p2

    .line 30
    :try_start_0
    sget-object p1, Lsy3;->zzb:Ln64;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lo54;

    .line 35
    .line 36
    sget-object v0, Lsy3;->zza:Lsy3;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 39
    .line 40
    .line 41
    sput-object p1, Lsy3;->zzb:Ln64;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

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
    throw v0

    .line 52
    :cond_3
    sget-object p1, Lsy3;->zza:Lsy3;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_4
    new-instance p1, Ljy1;

    .line 56
    .line 57
    sget-object p2, Lsy3;->zza:Lsy3;

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_5
    new-instance p1, Lsy3;

    .line 64
    .line 65
    invoke-direct {p1}, Lp54;-><init>()V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_6
    sget-object p1, Lsy3;->zza:Lsy3;

    .line 70
    .line 71
    const-string p2, "\u0000\u0000"

    .line 72
    .line 73
    new-instance v1, Lr64;

    .line 74
    .line 75
    invoke-direct {v1, p1, p2, v0}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_7
    const/4 p1, 0x1

    .line 80
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1
.end method
