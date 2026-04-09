.class public final Lcom/google/android/gms/internal/measurement/a2$a;
.super Lcom/google/android/gms/internal/measurement/D4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/j5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a2;->N()Lcom/google/android/gms/internal/measurement/a2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/D4$b;-><init>(Lcom/google/android/gms/internal/measurement/D4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/l2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/a2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/internal/measurement/a2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a2;->J(Lcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final D()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->S()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final E()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->T()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->I()I

    move-result v0

    return v0
.end method

.method public final w(I)Lcom/google/android/gms/internal/measurement/Z1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/a2;->F(I)Lcom/google/android/gms/internal/measurement/Z1;

    move-result-object p1

    return-object p1
.end method

.method public final x(ILcom/google/android/gms/internal/measurement/Z1$a;)Lcom/google/android/gms/internal/measurement/a2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/D4;

    check-cast p2, Lcom/google/android/gms/internal/measurement/Z1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/a2;->H(Lcom/google/android/gms/internal/measurement/a2;ILcom/google/android/gms/internal/measurement/Z1;)V

    return-object p0
.end method

.method public final z()Lcom/google/android/gms/internal/measurement/a2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/D4$b;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/D4$b;->b:Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/a2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/a2;->G(Lcom/google/android/gms/internal/measurement/a2;)V

    return-object p0
.end method
