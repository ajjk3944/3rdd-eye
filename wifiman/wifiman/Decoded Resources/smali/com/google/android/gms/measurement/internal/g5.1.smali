.class final Lcom/google/android/gms/measurement/internal/g5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/e4;

.field private final synthetic b:J

.field private final synthetic c:Z

.field private final synthetic d:Lcom/google/android/gms/measurement/internal/r4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/r4;Lcom/google/android/gms/measurement/internal/e4;JZ)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/e4;

    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/g5;->b:J

    iput-boolean p5, p0, Lcom/google/android/gms/measurement/internal/g5;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g5;->d:Lcom/google/android/gms/measurement/internal/r4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g5;->d:Lcom/google/android/gms/measurement/internal/r4;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/e4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/r4;->N(Lcom/google/android/gms/measurement/internal/e4;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/g5;->d:Lcom/google/android/gms/measurement/internal/r4;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/g5;->a:Lcom/google/android/gms/measurement/internal/e4;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/g5;->b:J

    const/4 v6, 0x1

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/g5;->c:Z

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/r4;->V(Lcom/google/android/gms/measurement/internal/r4;Lcom/google/android/gms/measurement/internal/e4;JZZ)V

    return-void
.end method
