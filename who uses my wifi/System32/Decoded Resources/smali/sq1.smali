.class public final Lsq1;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzn:Lsq1;

.field private static volatile zzo:Ln64;


# instance fields
.field private zza:I

.field private zzb:Lx54;

.field private zzc:J

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:J

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;

.field private zzl:J

.field private zzm:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsq1;

    .line 2
    .line 3
    invoke-direct {v0}, Lsq1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsq1;->zzn:Lsq1;

    .line 7
    .line 8
    const-class v1, Lsq1;

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
    iput-object v0, p0, Lsq1;->zzb:Lx54;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lsq1;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lsq1;->zze:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lsq1;->zzf:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lsq1;->zzh:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lsq1;->zzj:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lsq1;->zzk:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method

.method public static A()Lrq1;
    .locals 1

    .line 1
    sget-object v0, Lsq1;->zzn:Lsq1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lrq1;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final B(Lar1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq1;->zzb:Lx54;

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
    iput-object v0, p0, Lsq1;->zzb:Lx54;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lsq1;->zzb:Lx54;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    sget-object v0, Lq64;->j:Lq64;

    .line 2
    .line 3
    iput-object v0, p0, Lsq1;->zzb:Lx54;

    .line 4
    .line 5
    return-void
.end method

.method public final synthetic D(J)V
    .locals 1

    .line 1
    iget v0, p0, Lsq1;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lsq1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lsq1;->zzc:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic E(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsq1;->zza:I

    .line 7
    .line 8
    or-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    iput v0, p0, Lsq1;->zza:I

    .line 11
    .line 12
    iput-object p1, p0, Lsq1;->zzd:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public final synthetic F(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lsq1;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lsq1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lsq1;->zze:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic G(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lsq1;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    iput v0, p0, Lsq1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lsq1;->zzf:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic H(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lsq1;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x20

    .line 7
    .line 8
    iput v0, p0, Lsq1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lsq1;->zzh:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic I(J)V
    .locals 1

    .line 1
    iget v0, p0, Lsq1;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    iput v0, p0, Lsq1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lsq1;->zzi:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic J(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lsq1;->zza:I

    .line 5
    .line 6
    or-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    iput v0, p0, Lsq1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lsq1;->zzj:Ljava/lang/String;

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
    iget v0, p0, Lsq1;->zza:I

    .line 5
    .line 6
    or-int/lit16 v0, v0, 0x100

    .line 7
    .line 8
    iput v0, p0, Lsq1;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lsq1;->zzk:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic L(J)V
    .locals 1

    .line 1
    iget v0, p0, Lsq1;->zza:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    iput v0, p0, Lsq1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lsq1;->zzl:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic M(J)V
    .locals 1

    .line 1
    iget v0, p0, Lsq1;->zza:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x400

    .line 4
    .line 5
    iput v0, p0, Lsq1;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lsq1;->zzm:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic N(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lsq1;->zzg:I

    .line 4
    .line 5
    iget p1, p0, Lsq1;->zza:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x10

    .line 8
    .line 9
    iput p1, p0, Lsq1;->zza:I

    .line 10
    .line 11
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 16

    .line 1
    invoke-static/range {p1 .. p1}, Lex0;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_5

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x6

    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    sget-object v0, Lsq1;->zzo:Ln64;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-class v1, Lsq1;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    sget-object v0, Lsq1;->zzo:Ln64;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lo54;

    .line 34
    .line 35
    sget-object v2, Lsq1;->zzn:Lsq1;

    .line 36
    .line 37
    invoke-direct {v0, v2}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lsq1;->zzo:Ln64;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit v1

    .line 46
    return-object v0

    .line 47
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw v0

    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    throw v0

    .line 52
    :cond_3
    sget-object v0, Lsq1;->zzn:Lsq1;

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    new-instance v0, Lrq1;

    .line 56
    .line 57
    sget-object v1, Lsq1;->zzn:Lsq1;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_5
    new-instance v0, Lsq1;

    .line 64
    .line 65
    invoke-direct {v0}, Lsq1;-><init>()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_6
    const-string v1, "zza"

    .line 70
    .line 71
    const-string v2, "zzb"

    .line 72
    .line 73
    const-class v3, Lar1;

    .line 74
    .line 75
    const-string v4, "zzc"

    .line 76
    .line 77
    const-string v5, "zzd"

    .line 78
    .line 79
    const-string v6, "zze"

    .line 80
    .line 81
    const-string v7, "zzf"

    .line 82
    .line 83
    const-string v8, "zzg"

    .line 84
    .line 85
    sget-object v9, Ltq1;->d:Ltq1;

    .line 86
    .line 87
    const-string v10, "zzh"

    .line 88
    .line 89
    const-string v11, "zzi"

    .line 90
    .line 91
    const-string v12, "zzj"

    .line 92
    .line 93
    const-string v13, "zzk"

    .line 94
    .line 95
    const-string v14, "zzl"

    .line 96
    .line 97
    const-string v15, "zzm"

    .line 98
    .line 99
    filled-new-array/range {v1 .. v15}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v1, Lsq1;->zzn:Lsq1;

    .line 104
    .line 105
    const-string v2, "\u0004\u000c\u0000\u0001\u0008?\u000c\u0000\u0001\u0000\u0008\u001b\u0015\u1002\u0000\u0016\u1008\u0001\u0017\u1008\u0002\u0018\u1008\u0003\u0019\u180c\u0004(\u1008\u0005)\u1002\u0006<\u1008\u0007=\u1008\u0008>\u1002\t?\u1002\n"

    .line 106
    .line 107
    new-instance v3, Lr64;

    .line 108
    .line 109
    invoke-direct {v3, v1, v2, v0}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v3

    .line 113
    :cond_7
    const/4 v0, 0x1

    .line 114
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
.end method
