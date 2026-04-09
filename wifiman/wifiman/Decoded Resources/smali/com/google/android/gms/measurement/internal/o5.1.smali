.class public final synthetic Lcom/google/android/gms/measurement/internal/o5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/p5;

.field private synthetic b:I

.field private synthetic c:Ljava/lang/Exception;

.field private synthetic d:[B

.field private synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/p5;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/o5;->a:Lcom/google/android/gms/measurement/internal/p5;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/o5;->b:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/o5;->c:Ljava/lang/Exception;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/o5;->d:[B

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/o5;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/o5;->a:Lcom/google/android/gms/measurement/internal/p5;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/o5;->b:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/o5;->c:Ljava/lang/Exception;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/o5;->d:[B

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/o5;->e:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/p5;->b(Lcom/google/android/gms/measurement/internal/p5;ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
