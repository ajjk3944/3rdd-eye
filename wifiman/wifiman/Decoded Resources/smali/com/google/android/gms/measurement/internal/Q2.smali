.class final Lcom/google/android/gms/measurement/internal/Q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/R2;

.field private final b:I

.field private final c:Ljava/lang/Throwable;

.field private final d:[B

.field private final e:Ljava/lang/String;

.field private final f:Ljava/util/Map;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/R2;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/Q2;->a:Lcom/google/android/gms/measurement/internal/R2;

    .line 5
    iput p3, p0, Lcom/google/android/gms/measurement/internal/Q2;->b:I

    .line 6
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/Q2;->c:Ljava/lang/Throwable;

    .line 7
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/Q2;->d:[B

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/Q2;->e:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/Q2;->f:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/R2;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/S2;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/measurement/internal/Q2;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/R2;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Q2;->a:Lcom/google/android/gms/measurement/internal/R2;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Q2;->e:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/measurement/internal/Q2;->b:I

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/Q2;->c:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/Q2;->d:[B

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/Q2;->f:Ljava/util/Map;

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/R2;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
