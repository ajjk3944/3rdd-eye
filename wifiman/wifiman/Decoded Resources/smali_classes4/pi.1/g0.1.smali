.class public final Lpi/g0;
.super Lpi/A;
.source "SourceFile"

# interfaces
.implements Lpi/K0;


# instance fields
.field private final b:Lpi/d0;

.field private final c:Lpi/S;


# direct methods
.method public constructor <init>(Lpi/d0;Lpi/S;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/A;-><init>()V

    iput-object p1, p0, Lpi/g0;->b:Lpi/d0;

    iput-object p2, p0, Lpi/g0;->c:Lpi/S;

    return-void
.end method


# virtual methods
.method public bridge synthetic G0()Lpi/M0;
    .locals 1

    invoke-virtual {p0}, Lpi/g0;->Z0()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public I()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/g0;->c:Lpi/S;

    return-object v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->a1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->a1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lpi/g0;->Z0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/g0;->I()Lpi/S;

    move-result-object v1

    invoke-virtual {v1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/M0;->R0(Z)Lpi/M0;

    move-result-object p1

    invoke-static {v0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/g0;->Z0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    invoke-virtual {p0}, Lpi/g0;->I()Lpi/S;

    move-result-object v0

    invoke-static {p1, v0}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    return-object p1
.end method

.method protected W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/g0;->b:Lpi/d0;

    return-object v0
.end method

.method public bridge synthetic X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->a1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/g0;->b1(Lpi/d0;)Lpi/g0;

    move-result-object p1

    return-object p1
.end method

.method public Z0()Lpi/d0;
    .locals 1

    invoke-virtual {p0}, Lpi/g0;->W0()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public a1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/g0;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/g0;

    invoke-virtual {p0}, Lpi/g0;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpi/d0;

    invoke-virtual {p0}, Lpi/g0;->I()Lpi/S;

    move-result-object v2

    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpi/g0;-><init>(Lpi/d0;Lpi/S;)V

    return-object v0
.end method

.method public b1(Lpi/d0;)Lpi/g0;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/g0;

    invoke-virtual {p0}, Lpi/g0;->I()Lpi/S;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lpi/g0;-><init>(Lpi/d0;Lpi/S;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[@EnhancedForWarnings("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/g0;->I()Lpi/S;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/g0;->Z0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
