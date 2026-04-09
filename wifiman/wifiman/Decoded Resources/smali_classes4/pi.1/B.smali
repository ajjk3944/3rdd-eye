.class public abstract Lpi/B;
.super Lpi/A;
.source "SourceFile"


# instance fields
.field private final b:Lpi/d0;


# direct methods
.method public constructor <init>(Lpi/d0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/A;-><init>()V

    iput-object p1, p0, Lpi/B;->b:Lpi/d0;

    return-void
.end method


# virtual methods
.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/B;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/B;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 1

    invoke-virtual {p0}, Lpi/A;->O0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lpi/B;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    invoke-virtual {p0}, Lpi/A;->M0()Lpi/r0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/A;->M0()Lpi/r0;

    move-result-object v0

    if-eq p1, v0, :cond_0

    new-instance v0, Lpi/f0;

    invoke-direct {v0, p0, p1}, Lpi/f0;-><init>(Lpi/d0;Lpi/r0;)V

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method protected W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/B;->b:Lpi/d0;

    return-object v0
.end method
