.class public final Lte3;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzb:Lte3;

.field private static volatile zzc:Ln64;


# instance fields
.field private zza:Lg64;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lte3;

    .line 2
    .line 3
    invoke-direct {v0}, Lte3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lte3;->zzb:Lte3;

    .line 7
    .line 8
    const-class v1, Lte3;

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
    sget-object v0, Lg64;->g:Lg64;

    .line 5
    .line 6
    iput-object v0, p0, Lte3;->zza:Lg64;

    .line 7
    .line 8
    return-void
.end method

.method public static C(Ljava/io/FileInputStream;)Lte3;
    .locals 2

    .line 1
    sget-object v0, Lte3;->zzb:Lte3;

    .line 2
    .line 3
    new-instance v1, Ld54;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ld54;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh54;->a:Lh54;

    .line 9
    .line 10
    sget p0, Lu44;->a:I

    .line 11
    .line 12
    sget-object p0, Lh54;->b:Lh54;

    .line 13
    .line 14
    invoke-static {v0, v1, p0}, Lp54;->l(Lp54;Lm0;Lh54;)Lp54;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lp54;->z(Lp54;)V

    .line 19
    .line 20
    .line 21
    check-cast p0, Lte3;

    .line 22
    .line 23
    return-object p0
.end method

.method public static D()Lte3;
    .locals 1

    .line 1
    sget-object v0, Lte3;->zzb:Lte3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    iget-object v0, p0, Lte3;->zza:Lg64;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final B()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lte3;->zza:Lg64;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final E()Lg64;
    .locals 2

    .line 1
    iget-object v0, p0, Lte3;->zza:Lg64;

    .line 2
    .line 3
    iget-boolean v1, v0, Lg64;->f:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg64;->a()Lg64;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lte3;->zza:Lg64;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lte3;->zza:Lg64;

    .line 14
    .line 15
    return-object v0
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
    sget-object p1, Lte3;->zzc:Ln64;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    const-class p2, Lte3;

    .line 27
    .line 28
    monitor-enter p2

    .line 29
    :try_start_0
    sget-object p1, Lte3;->zzc:Ln64;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lo54;

    .line 34
    .line 35
    sget-object v0, Lte3;->zzb:Lte3;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Lte3;->zzc:Ln64;

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
    sget-object p1, Lte3;->zzb:Lte3;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_4
    new-instance p1, Lre3;

    .line 56
    .line 57
    sget-object p2, Lte3;->zzb:Lte3;

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_5
    new-instance p1, Lte3;

    .line 64
    .line 65
    invoke-direct {p1}, Lte3;-><init>()V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_6
    const-string p1, "zza"

    .line 70
    .line 71
    sget-object p2, Lse3;->a:Lf64;

    .line 72
    .line 73
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p2, Lte3;->zzb:Lte3;

    .line 78
    .line 79
    const-string v0, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    .line 80
    .line 81
    new-instance v1, Lr64;

    .line 82
    .line 83
    invoke-direct {v1, p2, v0, p1}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_7
    const/4 p1, 0x1

    .line 88
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method
