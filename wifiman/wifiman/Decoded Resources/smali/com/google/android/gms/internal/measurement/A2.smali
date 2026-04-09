.class public final Lcom/google/android/gms/internal/measurement/A2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/A2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/A2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/p5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/p5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:Lcom/google/android/gms/internal/measurement/J4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/A2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/A2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    const-class v1, Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->y()Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/A2;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zze:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/A2;->zzf:I

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/A2;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/L4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D4;->m(Lcom/google/android/gms/internal/measurement/J4;)Lcom/google/android/gms/internal/measurement/J4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/N3;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static J()Lcom/google/android/gms/internal/measurement/A2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/A2$a;

    return-object v0
.end method

.method static bridge synthetic K()Lcom/google/android/gms/internal/measurement/A2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    return-object v0
.end method


# virtual methods
.method public final F(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/J4;->r(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzf:I

    return v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    return-object v0
.end method

.method public final M()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A2;->zzg:Lcom/google/android/gms/internal/measurement/J4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/A2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/A2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/A2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/A2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    return-object p1

    :pswitch_3
    const-string p1, "zze"

    const-string p2, "zzf"

    const-string p3, "zzg"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"

    sget-object p3, Lcom/google/android/gms/internal/measurement/A2;->zzc:Lcom/google/android/gms/internal/measurement/A2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/A2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/A2$a;-><init>(Lcom/google/android/gms/internal/measurement/O2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/A2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/A2;-><init>()V

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
