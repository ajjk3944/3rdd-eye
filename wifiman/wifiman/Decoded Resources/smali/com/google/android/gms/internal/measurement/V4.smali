.class final Lcom/google/android/gms/internal/measurement/V4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/w5;


# static fields
.field private static final b:Lcom/google/android/gms/internal/measurement/e5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/e5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/U4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/U4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/V4;->b:Lcom/google/android/gms/internal/measurement/e5;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/W4;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/E4;->a()Lcom/google/android/gms/internal/measurement/E4;

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/e5;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/measurement/V4;->b:Lcom/google/android/gms/internal/measurement/e5;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/W4;-><init>([Lcom/google/android/gms/internal/measurement/e5;)V

    .line 4
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/V4;-><init>(Lcom/google/android/gms/internal/measurement/e5;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/e5;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/F4;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/e5;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/V4;->a:Lcom/google/android/gms/internal/measurement/e5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/x5;
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/z5;->o(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/V4;->a:Lcom/google/android/gms/internal/measurement/e5;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/e5;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/f5;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/f5;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z5;->f()Lcom/google/android/gms/internal/measurement/L5;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s4;->a()Lcom/google/android/gms/internal/measurement/r4;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/f5;->zza()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/l5;->g(Lcom/google/android/gms/internal/measurement/L5;Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/h5;)Lcom/google/android/gms/internal/measurement/l5;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/q5;->a()Lcom/google/android/gms/internal/measurement/n5;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/T4;->a()Lcom/google/android/gms/internal/measurement/R4;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/z5;->f()Lcom/google/android/gms/internal/measurement/L5;

    move-result-object v5

    sget-object v0, Lcom/google/android/gms/internal/measurement/X4;->a:[I

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/f5;->zzb()Lcom/google/android/gms/internal/measurement/r5;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s4;->a()Lcom/google/android/gms/internal/measurement/r4;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/c5;->a()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/k5;->k(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/f5;Lcom/google/android/gms/internal/measurement/n5;Lcom/google/android/gms/internal/measurement/R4;Lcom/google/android/gms/internal/measurement/L5;Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/a5;)Lcom/google/android/gms/internal/measurement/k5;

    move-result-object p1

    return-object p1
.end method
