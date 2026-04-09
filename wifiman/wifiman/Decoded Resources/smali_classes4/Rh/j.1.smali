.class public final LRh/j;
.super Lpi/A;
.source "SourceFile"

# interfaces
.implements Lpi/a0;


# instance fields
.field private final b:Lpi/d0;


# direct methods
.method public constructor <init>(Lpi/d0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/A;-><init>()V

    iput-object p1, p0, LRh/j;->b:Lpi/d0;

    return-void
.end method

.method private final Z0(Lpi/d0;)Lpi/d0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v0

    invoke-static {p1}, Lsi/d;->y(Lpi/S;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, LRh/j;

    invoke-direct {p1, v0}, LRh/j;-><init>(Lpi/d0;)V

    return-object p1
.end method


# virtual methods
.method public B0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public O0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, LRh/j;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, LRh/j;->a1(Lpi/r0;)LRh/j;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LRh/j;->W0()Lpi/d0;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic V0(Lpi/r0;)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, LRh/j;->a1(Lpi/r0;)LRh/j;

    move-result-object p1

    return-object p1
.end method

.method protected W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, LRh/j;->b:Lpi/d0;

    return-object v0
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, LRh/j;->b1(Lpi/d0;)LRh/j;

    move-result-object p1

    return-object p1
.end method

.method public a1(Lpi/r0;)LRh/j;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LRh/j;

    invoke-virtual {p0}, LRh/j;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    invoke-direct {v0, p1}, LRh/j;-><init>(Lpi/d0;)V

    return-object v0
.end method

.method public b1(Lpi/d0;)LRh/j;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LRh/j;

    invoke-direct {v0, p1}, LRh/j;-><init>(Lpi/d0;)V

    return-object v0
.end method

.method public i0(Lpi/S;)Lpi/S;
    .locals 3

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    invoke-static {p1}, Lsi/d;->y(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lpi/J0;->l(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Lpi/d0;

    if-eqz v0, :cond_1

    check-cast p1, Lpi/d0;

    invoke-direct {p0, p1}, LRh/j;->Z0(Lpi/d0;)Lpi/d0;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lpi/I;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lpi/I;

    invoke-virtual {v0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-direct {p0, v1}, LRh/j;->Z0(Lpi/d0;)Lpi/d0;

    move-result-object v1

    invoke-virtual {v0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    invoke-direct {p0, v0}, LRh/j;->Z0(Lpi/d0;)Lpi/d0;

    move-result-object v0

    invoke-static {v1, v0}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v0

    invoke-static {p1}, Lpi/L0;->a(Lpi/S;)Lpi/S;

    move-result-object p1

    invoke-static {v0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
