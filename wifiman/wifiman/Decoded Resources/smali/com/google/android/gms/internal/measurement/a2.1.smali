.class public final Lcom/google/android/gms/internal/measurement/a2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/a2$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/a2;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/p5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/p5;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:J

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzj:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzk:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzl:Ljava/lang/String;

.field private zzm:Z

.field private zzn:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzo:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzp:Ljava/lang/String;

.field private zzq:Ljava/lang/String;

.field private zzr:Lcom/google/android/gms/internal/measurement/X1;

.field private zzs:Lcom/google/android/gms/internal/measurement/c2;

.field private zzt:Lcom/google/android/gms/internal/measurement/f2;

.field private zzu:Lcom/google/android/gms/internal/measurement/d2;

.field private zzv:Lcom/google/android/gms/internal/measurement/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/a2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    const-class v1, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzi:Lcom/google/android/gms/internal/measurement/L4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/L4;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzl:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzn:Lcom/google/android/gms/internal/measurement/L4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/a2;->zzo:Lcom/google/android/gms/internal/measurement/L4;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzp:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzq:Ljava/lang/String;

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/L4;

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/measurement/a2;ILcom/google/android/gms/internal/measurement/Z1;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/L4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/D4;->n(Lcom/google/android/gms/internal/measurement/L4;)Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic J(Lcom/google/android/gms/internal/measurement/a2;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzn:Lcom/google/android/gms/internal/measurement/L4;

    return-void
.end method

.method public static M()Lcom/google/android/gms/internal/measurement/a2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->u()Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2$a;

    return-object v0
.end method

.method static bridge synthetic N()Lcom/google/android/gms/internal/measurement/a2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    return-object v0
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/a2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    return-object v0
.end method


# virtual methods
.method public final F(I)Lcom/google/android/gms/internal/measurement/Z1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/Z1;

    return-object p1
.end method

.method public final I()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzj:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final K()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzf:J

    return-wide v0
.end method

.method public final L()Lcom/google/android/gms/internal/measurement/X1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzr:Lcom/google/android/gms/internal/measurement/X1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/X1;->G()Lcom/google/android/gms/internal/measurement/X1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final P()Lcom/google/android/gms/internal/measurement/f2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzt:Lcom/google/android/gms/internal/measurement/f2;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/f2;->G()Lcom/google/android/gms/internal/measurement/f2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzp:Ljava/lang/String;

    return-object v0
.end method

.method public final S()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzk:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final T()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzo:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final U()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzn:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final V()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzi:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final W()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Z()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zze:I

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a2;->zzn:Lcom/google/android/gms/internal/measurement/L4;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    sget-object v0, Lcom/google/android/gms/internal/measurement/i2;->a:[I

    const/4 v1, 0x1

    add-int/lit8 v2, p1, -0x1

    aget v0, v0, v2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    throw v2

    :pswitch_0
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/measurement/a2;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object v2, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    return-object v0

    :pswitch_2
    sget-object v0, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    return-object v0

    :pswitch_3
    const-string v1, "zze"

    const-string v2, "zzf"

    const-string v3, "zzg"

    const-string v4, "zzh"

    const-string v5, "zzi"

    const-class v6, Lcom/google/android/gms/internal/measurement/e2;

    const-string v7, "zzj"

    const-class v8, Lcom/google/android/gms/internal/measurement/Z1;

    const-string v9, "zzk"

    const-class v10, Lcom/google/android/gms/internal/measurement/P1;

    const-string v11, "zzl"

    const-string v12, "zzm"

    const-string v13, "zzn"

    const-class v14, Lcom/google/android/gms/internal/measurement/M2;

    const-string v15, "zzo"

    const-class v16, Lcom/google/android/gms/internal/measurement/Y1;

    const-string v17, "zzp"

    const-string v18, "zzq"

    const-string v19, "zzr"

    const-string v20, "zzs"

    const-string v21, "zzt"

    const-string v22, "zzu"

    const-string v23, "zzv"

    filled-new-array/range {v1 .. v23}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\u0008\u0011\u1009\t\u0012\u1009\n\u0013\u1009\u000b"

    sget-object v2, Lcom/google/android/gms/internal/measurement/a2;->zzc:Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/google/android/gms/internal/measurement/a2$a;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/a2$a;-><init>(Lcom/google/android/gms/internal/measurement/l2;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/a2;-><init>()V

    return-object v0

    nop

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
