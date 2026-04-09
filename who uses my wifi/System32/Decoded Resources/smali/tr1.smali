.class public final Ltr1;
.super Lp54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field private static final zzl:Ltr1;

.field private static volatile zzm:Ln64;


# instance fields
.field private zza:I

.field private zzb:J

.field private zzc:I

.field private zzd:Z

.field private zze:Lt54;

.field private zzf:J

.field private zzg:Z

.field private zzh:Lx54;

.field private zzi:I

.field private zzj:I

.field private zzk:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltr1;

    .line 2
    .line 3
    invoke-direct {v0}, Ltr1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltr1;->zzl:Ltr1;

    .line 7
    .line 8
    const-class v1, Ltr1;

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
    sget-object v0, Lq54;->j:Lq54;

    .line 5
    .line 6
    iput-object v0, p0, Ltr1;->zze:Lt54;

    .line 7
    .line 8
    sget-object v0, Lq64;->j:Lq64;

    .line 9
    .line 10
    iput-object v0, p0, Ltr1;->zzh:Lx54;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
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
    sget-object v0, Ltr1;->zzm:Ln64;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-class v1, Ltr1;

    .line 27
    .line 28
    monitor-enter v1

    .line 29
    :try_start_0
    sget-object v0, Ltr1;->zzm:Ln64;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lo54;

    .line 34
    .line 35
    sget-object v2, Ltr1;->zzl:Ltr1;

    .line 36
    .line 37
    invoke-direct {v0, v2}, Lo54;-><init>(Lp54;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Ltr1;->zzm:Ln64;

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
    sget-object v0, Ltr1;->zzl:Ltr1;

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    new-instance v0, Lvq1;

    .line 56
    .line 57
    sget-object v1, Ltr1;->zzl:Ltr1;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ln54;-><init>(Lp54;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_5
    new-instance v0, Ltr1;

    .line 64
    .line 65
    invoke-direct {v0}, Ltr1;-><init>()V

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
    const-string v3, "zzc"

    .line 74
    .line 75
    const-string v4, "zzd"

    .line 76
    .line 77
    const-string v5, "zze"

    .line 78
    .line 79
    const-string v6, "zzf"

    .line 80
    .line 81
    const-string v7, "zzg"

    .line 82
    .line 83
    const-string v8, "zzh"

    .line 84
    .line 85
    const-class v9, Lwr1;

    .line 86
    .line 87
    const-string v10, "zzi"

    .line 88
    .line 89
    sget-object v11, Ltq1;->B:Ltq1;

    .line 90
    .line 91
    const-string v12, "zzj"

    .line 92
    .line 93
    sget-object v13, Ltq1;->D:Ltq1;

    .line 94
    .line 95
    const-string v14, "zzk"

    .line 96
    .line 97
    sget-object v15, Ltq1;->C:Ltq1;

    .line 98
    .line 99
    filled-new-array/range {v1 .. v15}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v1, Ltr1;->zzl:Ltr1;

    .line 104
    .line 105
    const-string v2, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u0016\u0005\u1003\u0003\u0006\u1007\u0004\u0007\u001b\u0008\u180c\u0005\t\u180c\u0006\n\u180c\u0007"

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
