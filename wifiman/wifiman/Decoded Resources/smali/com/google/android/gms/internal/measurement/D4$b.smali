.class public abstract Lcom/google/android/gms/internal/measurement/D4$b;
.super Lcom/google/android/gms/internal/measurement/O3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/D4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/D4;

.field protected b:Lcom/google/android/gms/internal/measurement/D4;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/D4;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/O3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/D4$b;->a:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/D4;->w()Lcom/google/android/gms/internal/measurement/D4;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static m(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/x5;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final t([BIILcom/google/android/gms/internal/measurement/p4;)Lcom/google/android/gms/internal/measurement/D4$b;
    .locals 7

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->r()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/u5;->a()Lcom/google/android/gms/internal/measurement/u5;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/u5;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/x5;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    new-instance v6, Lcom/google/android/gms/internal/measurement/U3;

    invoke-direct {v6, p4}, Lcom/google/android/gms/internal/measurement/U3;-><init>(Lcom/google/android/gms/internal/measurement/p4;)V

    const/4 v4, 0x0

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/x5;->e(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/U3;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzkq; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkq;->l()Lcom/google/android/gms/internal/measurement/zzkq;

    move-result-object p1

    throw p1

    :goto_1
    throw p1
.end method


# virtual methods
.method public synthetic C()Lcom/google/android/gms/internal/measurement/h5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->o()Lcom/google/android/gms/internal/measurement/D4;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->a:Lcom/google/android/gms/internal/measurement/D4;

    sget v1, Lcom/google/android/gms/internal/measurement/D4$c;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/D4;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4$b;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->C()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/D4;

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    return-object v0
.end method

.method public final synthetic f([BII)Lcom/google/android/gms/internal/measurement/O3;
    .locals 1

    const/4 p2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/measurement/p4;->c:Lcom/google/android/gms/internal/measurement/p4;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/measurement/D4$b;->t([BIILcom/google/android/gms/internal/measurement/p4;)Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic h([BIILcom/google/android/gms/internal/measurement/p4;)Lcom/google/android/gms/internal/measurement/O3;
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/D4$b;->t([BIILcom/google/android/gms/internal/measurement/p4;)Lcom/google/android/gms/internal/measurement/D4$b;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/google/android/gms/internal/measurement/D4;)Lcom/google/android/gms/internal/measurement/D4$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->a:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/D4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->r()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/D4$b;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final n()Lcom/google/android/gms/internal/measurement/D4;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->C()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzmw;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzmw;-><init>(Lcom/google/android/gms/internal/measurement/h5;)V

    throw v1
.end method

.method public o()Lcom/google/android/gms/internal/measurement/D4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->A()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    return-object v0
.end method

.method public synthetic p()Lcom/google/android/gms/internal/measurement/h5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->n()Lcom/google/android/gms/internal/measurement/D4;

    move-result-object v0

    return-object v0
.end method

.method protected final q()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->E()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->r()V

    :cond_0
    return-void
.end method

.method protected r()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->a:Lcom/google/android/gms/internal/measurement/D4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4;->w()Lcom/google/android/gms/internal/measurement/D4;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/D4$b;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    return-void
.end method
