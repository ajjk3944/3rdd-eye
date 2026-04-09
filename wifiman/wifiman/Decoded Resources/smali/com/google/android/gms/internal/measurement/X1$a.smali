.class public final Lcom/google/android/gms/internal/measurement/X1$a;
.super Lcom/google/android/gms/internal/measurement/D4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/X1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/X1$a$a;
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/X1$a;

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

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/X1$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/X1$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/X1$a;->zzc:Lcom/google/android/gms/internal/measurement/X1$a;

    const-class v1, Lcom/google/android/gms/internal/measurement/X1$a;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/D4;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/D4;-><init>()V

    return-void
.end method

.method static bridge synthetic F()Lcom/google/android/gms/internal/measurement/X1$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/X1$a;->zzc:Lcom/google/android/gms/internal/measurement/X1$a;

    return-object v0
.end method


# virtual methods
.method public final G()Lcom/google/android/gms/internal/measurement/X1$d;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/X1$a;->zzg:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/X1$d;->zza(I)Lcom/google/android/gms/internal/measurement/X1$d;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/X1$d;->zza:Lcom/google/android/gms/internal/measurement/X1$d;

    :cond_0
    return-object v0
.end method

.method public final H()Lcom/google/android/gms/internal/measurement/X1$e;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/X1$a;->zzf:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/X1$e;->zza(I)Lcom/google/android/gms/internal/measurement/X1$e;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/X1$e;->zza:Lcom/google/android/gms/internal/measurement/X1$e;

    :cond_0
    return-object v0
.end method

.method protected final o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object p2, Lcom/google/android/gms/internal/measurement/i2;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/X1$a;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/X1$a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/X1$a;->zzd:Lcom/google/android/gms/internal/measurement/p5;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/D4$a;

    sget-object p3, Lcom/google/android/gms/internal/measurement/X1$a;->zzc:Lcom/google/android/gms/internal/measurement/X1$a;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/D4$a;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/X1$a;->zzd:Lcom/google/android/gms/internal/measurement/p5;

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
    sget-object p1, Lcom/google/android/gms/internal/measurement/X1$a;->zzc:Lcom/google/android/gms/internal/measurement/X1$a;

    return-object p1

    :pswitch_3
    const-string p1, "zze"

    const-string p2, "zzf"

    invoke-static {}, Lcom/google/android/gms/internal/measurement/X1$e;->zzb()Lcom/google/android/gms/internal/measurement/H4;

    move-result-object p3

    const-string v0, "zzg"

    invoke-static {}, Lcom/google/android/gms/internal/measurement/X1$d;->zzb()Lcom/google/android/gms/internal/measurement/H4;

    move-result-object v1

    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001"

    sget-object p3, Lcom/google/android/gms/internal/measurement/X1$a;->zzc:Lcom/google/android/gms/internal/measurement/X1$a;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/D4;->p(Lcom/google/android/gms/internal/measurement/h5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/measurement/X1$a$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/X1$a$a;-><init>(Lcom/google/android/gms/internal/measurement/l2;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/X1$a;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/X1$a;-><init>()V

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
