.class public final Lcom/google/android/gms/internal/measurement/s2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/s2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/s2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/p5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/p5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzg:Ljava/lang/String;

.field private zzh:J

.field private zzi:J

.field private zzj:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/s2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/s2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    const-class v1, Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/s2;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/s2;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/s2;->Y()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method static synthetic I(Lcom/google/android/gms/internal/measurement/s2;ILcom/google/android/gms/internal/measurement/u2;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/s2;->Y()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic J(Lcom/google/android/gms/internal/measurement/s2;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/s2;->zzi:J

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/s2;Lcom/google/android/gms/internal/measurement/u2;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/s2;->Y()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/s2;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/s2;->Y()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/N3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic M(Lcom/google/android/gms/internal/measurement/s2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/s2;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic O(Lcom/google/android/gms/internal/measurement/s2;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/s2;->zzh:J

    return-void
.end method

.method public static R()Lcom/google/android/gms/internal/measurement/s2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s2$a;

    return-object v0
.end method

.method static bridge synthetic S()Lcom/google/android/gms/internal/measurement/s2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    return-object v0
.end method

.method private final Y()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/L4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D4;->n(Lcom/google/android/gms/internal/measurement/L4;)Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    :cond_0
    return-void
.end method


# virtual methods
.method public final F(I)Lcom/google/android/gms/internal/measurement/u2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/u2;

    return-object p1
.end method

.method public final N()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final P()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzi:J

    return-wide v0
.end method

.method public final Q()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzh:J

    return-wide v0
.end method

.method public final T()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final U()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzf:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final V()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/s2;->zzj:I

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/s2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/s2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/s2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/s2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    return-object p1

    :pswitch_3
    const-string v0, "zze"

    const-string v1, "zzf"

    const-class v2, Lcom/google/android/gms/internal/measurement/u2;

    const-string v3, "zzg"

    const-string v4, "zzh"

    const-string v5, "zzi"

    const-string v6, "zzj"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003"

    sget-object p3, Lcom/google/android/gms/internal/measurement/s2;->zzc:Lcom/google/android/gms/internal/measurement/s2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/s2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/s2$a;-><init>(Lcom/google/android/gms/internal/measurement/O2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/s2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/s2;-><init>()V

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
