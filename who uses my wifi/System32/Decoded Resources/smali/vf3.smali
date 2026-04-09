.class public final Lvf3;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzx:Lvf3;

.field private static volatile zzy:Ln64;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Z

.field private zzd:Ljava/lang/String;

.field private zze:Z

.field private zzf:Lag3;

.field private zzg:Z

.field private zzh:J

.field private zzi:J

.field private zzj:Lcg3;

.field private zzk:J

.field private zzl:J

.field private zzm:J

.field private zzn:Ljava/lang/String;

.field private zzo:Ljava/lang/String;

.field private zzp:J

.field private zzu:J

.field private zzv:Z

.field private zzw:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvf3;

    .line 2
    .line 3
    invoke-direct {v0}, Lvf3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvf3;->zzx:Lvf3;

    .line 7
    .line 8
    const-class v1, Lvf3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lp54;->u(Ljava/lang/Class;Lp54;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lp54;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lvf3;->zzc:Z

    .line 6
    .line 7
    const-string v0, "unknown_host"

    .line 8
    .line 9
    iput-object v0, p0, Lvf3;->zzd:Ljava/lang/String;

    .line 10
    .line 11
    const-wide/16 v0, 0x64

    .line 12
    .line 13
    iput-wide v0, p0, Lvf3;->zzh:J

    .line 14
    .line 15
    const-wide/16 v0, 0x7d0

    .line 16
    .line 17
    iput-wide v0, p0, Lvf3;->zzi:J

    .line 18
    .line 19
    const-wide/16 v0, 0xc8

    .line 20
    .line 21
    iput-wide v0, p0, Lvf3;->zzk:J

    .line 22
    .line 23
    iput-wide v0, p0, Lvf3;->zzl:J

    .line 24
    .line 25
    const-wide/16 v0, 0x4e20

    .line 26
    .line 27
    iput-wide v0, p0, Lvf3;->zzm:J

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    .line 31
    iput-object v0, p0, Lvf3;->zzn:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v0, p0, Lvf3;->zzo:Ljava/lang/String;

    .line 34
    .line 35
    const-wide/16 v0, 0x1f4

    .line 36
    .line 37
    iput-wide v0, p0, Lvf3;->zzp:J

    .line 38
    .line 39
    const-wide/16 v0, 0xbb8

    .line 40
    .line 41
    iput-wide v0, p0, Lvf3;->zzu:J

    .line 42
    .line 43
    return-void
.end method

.method public static U()Luf3;
    .locals 1

    .line 1
    sget-object v0, Lvf3;->zzx:Lvf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp54;->r()Ln54;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Luf3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final synthetic A(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lvf3;->zza:I

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    or-int/2addr v0, v1

    .line 6
    iput v0, p0, Lvf3;->zza:I

    .line 7
    .line 8
    iput-boolean p1, p0, Lvf3;->zzv:Z

    .line 9
    .line 10
    return-void
.end method

.method public final B()I
    .locals 4

    .line 1
    iget v0, p0, Lvf3;->zzb:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v2, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move v2, v1

    .line 21
    :cond_3
    :goto_0
    if-nez v2, :cond_4

    .line 22
    .line 23
    return v1

    .line 24
    :cond_4
    return v2
.end method

.method public final synthetic C(I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lvf3;->zzb:I

    .line 4
    .line 5
    iget p1, p0, Lvf3;->zza:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput p1, p0, Lvf3;->zza:I

    .line 10
    .line 11
    return-void
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvf3;->zzc:Z

    .line 2
    .line 3
    return v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvf3;->zzd:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvf3;->zze:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G()Lag3;
    .locals 1

    .line 1
    iget-object v0, p0, Lvf3;->zzf:Lag3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lag3;->F()Lag3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvf3;->zzg:Z

    .line 2
    .line 3
    return v0
.end method

.method public final I()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzh:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final J()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzi:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final K()Lcg3;
    .locals 1

    .line 1
    iget-object v0, p0, Lvf3;->zzj:Lcg3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcg3;->F()Lcg3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public final L()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzk:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final M()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzl:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final N()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzm:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvf3;->zzn:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lvf3;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final R()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lvf3;->zzu:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final S()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvf3;->zzv:Z

    .line 2
    .line 3
    return v0
.end method

.method public final T()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvf3;->zzw:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic V(Z)V
    .locals 1

    .line 1
    iget v0, p0, Lvf3;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lvf3;->zza:I

    .line 6
    .line 7
    iput-boolean p1, p0, Lvf3;->zzc:Z

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic W(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lvf3;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lvf3;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lvf3;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic X(Lag3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvf3;->zzf:Lag3;

    .line 2
    .line 3
    iget p1, p0, Lvf3;->zza:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lvf3;->zza:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic Y(J)V
    .locals 1

    .line 1
    iget v0, p0, Lvf3;->zza:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    iput v0, p0, Lvf3;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lvf3;->zzh:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic Z(J)V
    .locals 1

    .line 1
    iget v0, p0, Lvf3;->zza:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    iput v0, p0, Lvf3;->zza:I

    .line 6
    .line 7
    iput-wide p1, p0, Lvf3;->zzi:J

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic a0(Lcg3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvf3;->zzj:Lcg3;

    .line 2
    .line 3
    iget p1, p0, Lvf3;->zza:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x100

    .line 6
    .line 7
    iput p1, p0, Lvf3;->zza:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic b0(J)V
    .locals 2

    .line 1
    iget v0, p0, Lvf3;->zza:I

    .line 2
    .line 3
    const v1, 0x8000

    .line 4
    .line 5
    .line 6
    or-int/2addr v0, v1

    .line 7
    iput v0, p0, Lvf3;->zza:I

    .line 8
    .line 9
    iput-wide p1, p0, Lvf3;->zzu:J

    .line 10
    .line 11
    return-void
.end method

.method public final w(ILp54;)Ljava/lang/Object;
    .locals 22

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
    sget-object v0, Lvf3;->zzy:Ln64;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-class v1, Lvf3;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    sget-object v0, Lvf3;->zzy:Ln64;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lo54;

    .line 34
    .line 35
    sget-object v2, Lvf3;->zzx:Lvf3;

    .line 36
    .line 37
    invoke-direct {v0, v2}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lvf3;->zzy:Ln64;

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
    sget-object v0, Lvf3;->zzx:Lvf3;

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    new-instance v0, Luf3;

    .line 56
    .line 57
    sget-object v1, Lvf3;->zzx:Lvf3;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_5
    new-instance v0, Lvf3;

    .line 64
    .line 65
    invoke-direct {v0}, Lvf3;-><init>()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_6
    const-string v2, "zza"

    .line 70
    .line 71
    const-string v3, "zzb"

    .line 72
    .line 73
    sget-object v4, Ltq1;->z:Ltq1;

    .line 74
    .line 75
    const-string v5, "zzd"

    .line 76
    .line 77
    const-string v6, "zze"

    .line 78
    .line 79
    const-string v7, "zzf"

    .line 80
    .line 81
    const-string v8, "zzg"

    .line 82
    .line 83
    const-string v9, "zzi"

    .line 84
    .line 85
    const-string v10, "zzj"

    .line 86
    .line 87
    const-string v11, "zzc"

    .line 88
    .line 89
    const-string v12, "zzk"

    .line 90
    .line 91
    const-string v13, "zzl"

    .line 92
    .line 93
    const-string v14, "zzm"

    .line 94
    .line 95
    const-string v15, "zzn"

    .line 96
    .line 97
    const-string v16, "zzo"

    .line 98
    .line 99
    const-string v17, "zzp"

    .line 100
    .line 101
    const-string v18, "zzu"

    .line 102
    .line 103
    const-string v19, "zzv"

    .line 104
    .line 105
    const-string v20, "zzh"

    .line 106
    .line 107
    const-string v21, "zzw"

    .line 108
    .line 109
    filled-new-array/range {v2 .. v21}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v1, Lvf3;->zzx:Lvf3;

    .line 114
    .line 115
    const-string v2, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001\u180c\u0000\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u1009\u0004\u0006\u1007\u0005\u0007\u1002\u0007\u0008\u1009\u0008\t\u1007\u0001\n\u1002\t\u000b\u1002\n\u000c\u1002\u000b\r\u1008\u000c\u000e\u1008\r\u000f\u1002\u000e\u0010\u1002\u000f\u0011\u1007\u0010\u0012\u1002\u0006\u0013\u1007\u0011"

    .line 116
    .line 117
    new-instance v3, Lr64;

    .line 118
    .line 119
    invoke-direct {v3, v1, v2, v0}, Lr64;-><init>(Ls44;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_7
    const/4 v0, 0x1

    .line 124
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0
.end method
