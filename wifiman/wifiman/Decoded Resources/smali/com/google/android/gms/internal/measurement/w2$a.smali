.class public final Lcom/google/android/gms/internal/measurement/w2$a;
.super Lcom/google/android/gms/internal/measurement/D4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/w2;->O()Lcom/google/android/gms/internal/measurement/w2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/D4$b;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/O2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/w2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->K(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B(I)Lcom/google/android/gms/internal/measurement/x2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->G(I)Lcom/google/android/gms/internal/measurement/x2;

    move-result-object p1

    return-object p1
.end method

.method public final D()Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/w2;->M(Lcom/google/android/gms/internal/measurement/w2;)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->N(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w2;->j()I

    move-result v0

    return v0
.end method

.method public final w(ILcom/google/android/gms/internal/measurement/x2$a;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/D4;

    check-cast p2, Lcom/google/android/gms/internal/measurement/x2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/w2;->H(Lcom/google/android/gms/internal/measurement/w2;ILcom/google/android/gms/internal/measurement/x2;)V

    return-object p0
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/x2$a;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/D4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/x2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->I(Lcom/google/android/gms/internal/measurement/w2;Lcom/google/android/gms/internal/measurement/x2;)V

    return-object p0
.end method

.method public final z(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/w2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/w2;->J(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/Iterable;)V

    return-object p0
.end method
