.class public final Lpi/a;
.super Lpi/A;
.source "SourceFile"


# instance fields
.field private final b:Lpi/d0;

.field private final c:Lpi/d0;


# direct methods
.method public constructor <init>(Lpi/d0;Lpi/d0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/A;-><init>()V

    iput-object p1, p0, Lpi/a;->b:Lpi/d0;

    iput-object p2, p0, Lpi/a;->c:Lpi/d0;

    return-void
.end method


# virtual methods
.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->a1(Z)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public final U()Lpi/d0;
    .locals 1

    invoke-virtual {p0}, Lpi/a;->W0()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic U0(Z)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->a1(Z)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/a;

    invoke-virtual {p0}, Lpi/a;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    iget-object v1, p0, Lpi/a;->c:Lpi/d0;

    invoke-direct {v0, p1, v1}, Lpi/a;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method protected W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/a;->b:Lpi/d0;

    return-object v0
.end method

.method public bridge synthetic X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/a;->c1(Lpi/d0;)Lpi/a;

    move-result-object p1

    return-object p1
.end method

.method public final Z0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/a;->c:Lpi/d0;

    return-object v0
.end method

.method public a1(Z)Lpi/a;
    .locals 3

    new-instance v0, Lpi/a;

    invoke-virtual {p0}, Lpi/a;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v1

    iget-object v2, p0, Lpi/a;->c:Lpi/d0;

    invoke-virtual {v2, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpi/a;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/a;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/a;

    invoke-virtual {p0}, Lpi/a;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpi/d0;

    iget-object v3, p0, Lpi/a;->c:Lpi/d0;

    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    invoke-direct {v0, v1, p1}, Lpi/a;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public c1(Lpi/d0;)Lpi/a;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/a;

    iget-object v1, p0, Lpi/a;->c:Lpi/d0;

    invoke-direct {v0, p1, v1}, Lpi/a;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method
