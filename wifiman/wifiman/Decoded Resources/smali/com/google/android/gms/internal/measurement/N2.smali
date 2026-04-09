.class public final Lcom/google/android/gms/internal/measurement/N2;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/N2$a;,
        Lcom/google/android/gms/internal/measurement/N2$b;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/N2;

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

.field private zzg:Lcom/google/android/gms/internal/measurement/L4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/L4;"
        }
    .end annotation
.end field

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Z

.field private zzk:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/N2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/N2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/N2;->zzc:Lcom/google/android/gms/internal/measurement/N2;

    const-class v1, Lcom/google/android/gms/internal/measurement/N2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/D4;->z()Lcom/google/android/gms/internal/measurement/L4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzg:Lcom/google/android/gms/internal/measurement/L4;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzi:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic H()Lcom/google/android/gms/internal/measurement/N2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/N2;->zzc:Lcom/google/android/gms/internal/measurement/N2;

    return-object v0
.end method


# virtual methods
.method public final F()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzk:D

    return-wide v0
.end method

.method public final G()Lcom/google/android/gms/internal/measurement/N2$a;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzf:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/N2$a;->zza(I)Lcom/google/android/gms/internal/measurement/N2$a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/N2$a;->zza:Lcom/google/android/gms/internal/measurement/N2$a;

    :cond_0
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzg:Lcom/google/android/gms/internal/measurement/L4;

    return-object v0
.end method

.method public final L()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zzj:Z

    return v0
.end method

.method public final M()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zze:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zze:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/N2;->zze:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object p2, Lcom/google/android/gms/internal/measurement/P2;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/N2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/N2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/N2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/N2;->zzc:Lcom/google/android/gms/internal/measurement/N2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/N2;->zzd:Lcom/google/android/gms/internal/measurement/p5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/N2;->zzc:Lcom/google/android/gms/internal/measurement/N2;

    return-object p1

    :pswitch_3
    const-string v0, "zze"

    const-string v1, "zzf"

    invoke-static {}, Lcom/google/android/gms/internal/measurement/N2$a;->zzb()Lcom/google/android/gms/internal/measurement/H4;

    move-result-object v2

    const-string v3, "zzg"

    const-class v4, Lcom/google/android/gms/internal/measurement/N2;

    const-string v5, "zzh"

    const-string v6, "zzi"

    const-string v7, "zzj"

    const-string v8, "zzk"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004"

    sget-object p3, Lcom/google/android/gms/internal/measurement/N2;->zzc:Lcom/google/android/gms/internal/measurement/N2;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/N2$b;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/N2$b;-><init>(Lcom/google/android/gms/internal/measurement/Q2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/N2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/N2;-><init>()V

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
