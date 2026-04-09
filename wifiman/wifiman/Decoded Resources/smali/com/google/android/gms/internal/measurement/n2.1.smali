.class public final Lcom/google/android/gms/internal/measurement/n2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/n2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/n2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/p5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/p5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:J

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/n2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/n2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    const-class v1, Lcom/google/android/gms/internal/measurement/n2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzj:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzk:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzl:Ljava/lang/String;

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzh:Ljava/lang/String;

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/n2;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzi:J

    return-void
.end method

.method static synthetic I(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzh:Ljava/lang/String;

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/n2;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzm:J

    return-void
.end method

.method static synthetic M(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static N()Lcom/google/android/gms/internal/measurement/n2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n2$a;

    return-object v0
.end method

.method static synthetic O(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzf:Ljava/lang/String;

    return-void
.end method

.method static synthetic P(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzf:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic Q()Lcom/google/android/gms/internal/measurement/n2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    return-object v0
.end method

.method static synthetic R(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzl:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzl:Ljava/lang/String;

    return-void
.end method

.method static synthetic S(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzl:Ljava/lang/String;

    return-void
.end method

.method public static T()Lcom/google/android/gms/internal/measurement/n2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    return-object v0
.end method

.method static synthetic U(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzk:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzk:Ljava/lang/String;

    return-void
.end method

.method static synthetic V(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzk:Ljava/lang/String;

    return-void
.end method

.method static synthetic X(Lcom/google/android/gms/internal/measurement/n2;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/n2;->zzj:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzj:Ljava/lang/String;

    return-void
.end method

.method static synthetic Y(Lcom/google/android/gms/internal/measurement/n2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n2;->zzj:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final F()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzi:J

    return-wide v0
.end method

.method public final J()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzm:J

    return-wide v0
.end method

.method public final W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final Z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final b0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzl:Ljava/lang/String;

    return-object v0
.end method

.method public final c0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzk:Ljava/lang/String;

    return-object v0
.end method

.method public final d0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zzj:Ljava/lang/String;

    return-object v0
.end method

.method public final e0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g0()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/n2;->zze:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object p2, Lcom/google/android/gms/internal/measurement/m2;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    throw p2

    :pswitch_0
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/n2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/n2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/n2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/n2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    return-object p1

    :pswitch_3
    const-string v0, "zze"

    const-string v1, "zzf"

    const-string v2, "zzg"

    const-string v3, "zzh"

    const-string v4, "zzi"

    const-string v5, "zzj"

    const-string v6, "zzk"

    const-string v7, "zzl"

    const-string v8, "zzm"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\u0008\u1002\u0007"

    sget-object p3, Lcom/google/android/gms/internal/measurement/n2;->zzc:Lcom/google/android/gms/internal/measurement/n2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/n2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/n2$a;-><init>(Lcom/google/android/gms/internal/measurement/O2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/n2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/n2;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
