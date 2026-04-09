.class final Lcom/google/android/gms/measurement/internal/q7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lcom/google/android/gms/internal/measurement/w2;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;

.field private e:Lcom/google/android/gms/measurement/internal/s5;

.field private f:J

.field private g:J

.field private h:J

.field private i:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/measurement/internal/n7;
    .locals 17

    move-object/from16 v0, p0

    new-instance v16, Lcom/google/android/gms/measurement/internal/n7;

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/q7;->a:J

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/q7;->b:Lcom/google/android/gms/internal/measurement/w2;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/q7;->c:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/q7;->d:Ljava/util/Map;

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/q7;->e:Lcom/google/android/gms/measurement/internal/s5;

    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/q7;->f:J

    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/q7;->g:J

    iget-wide v12, v0, Lcom/google/android/gms/measurement/internal/q7;->h:J

    iget v14, v0, Lcom/google/android/gms/measurement/internal/q7;->i:I

    const/4 v15, 0x0

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v15}, Lcom/google/android/gms/measurement/internal/n7;-><init>(JLcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/s5;JJJILcom/google/android/gms/measurement/internal/p7;)V

    return-object v16
.end method

.method public final b(I)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/measurement/internal/q7;->i:I

    return-object p0
.end method

.method public final c(J)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/q7;->g:J

    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/measurement/w2;)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/q7;->b:Lcom/google/android/gms/internal/measurement/w2;

    return-object p0
.end method

.method public final e(Lcom/google/android/gms/measurement/internal/s5;)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/q7;->e:Lcom/google/android/gms/measurement/internal/s5;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/q7;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final g(Ljava/util/Map;)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/q7;->d:Ljava/util/Map;

    return-object p0
.end method

.method public final h(J)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/q7;->f:J

    return-object p0
.end method

.method public final i(J)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/q7;->h:J

    return-object p0
.end method

.method public final j(J)Lcom/google/android/gms/measurement/internal/q7;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/q7;->a:J

    return-object p0
.end method
