.class public final Lcom/google/android/gms/internal/measurement/p2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/p2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/p2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/p5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/p5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Z

.field private zzg:Z

.field private zzh:Z

.field private zzi:Z

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/p2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/p2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    const-class v1, Lcom/google/android/gms/internal/measurement/p2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    return-void
.end method

.method public static F()Lcom/google/android/gms/internal/measurement/p2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/p2$a;

    return-object v0
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzk:Z

    return-void
.end method

.method static bridge synthetic H()Lcom/google/android/gms/internal/measurement/p2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    return-object v0
.end method

.method static synthetic I(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzj:Z

    return-void
.end method

.method public static J()Lcom/google/android/gms/internal/measurement/p2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    return-object v0
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzf:Z

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzl:Z

    return-void
.end method

.method static synthetic N(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzg:Z

    return-void
.end method

.method static synthetic P(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzh:Z

    return-void
.end method

.method static synthetic R(Lcom/google/android/gms/internal/measurement/p2;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zze:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/p2;->zzi:Z

    return-void
.end method


# virtual methods
.method public final M()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzk:Z

    return v0
.end method

.method public final O()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzj:Z

    return v0
.end method

.method public final Q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzf:Z

    return v0
.end method

.method public final S()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzl:Z

    return v0
.end method

.method public final T()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzg:Z

    return v0
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzh:Z

    return v0
.end method

.method public final V()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/p2;->zzi:Z

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/p2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/p2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/p2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/p2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

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

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006"

    sget-object p3, Lcom/google/android/gms/internal/measurement/p2;->zzc:Lcom/google/android/gms/internal/measurement/p2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/p2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/p2$a;-><init>(Lcom/google/android/gms/internal/measurement/O2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/p2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/p2;-><init>()V

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
