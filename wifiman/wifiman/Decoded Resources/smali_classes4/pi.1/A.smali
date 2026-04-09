.class public abstract Lpi/A;
.super Lpi/d0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Lpi/r0;
    .locals 1

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->M0()Lpi/r0;

    move-result-object v0

    return-object v0
.end method

.method public N0()Lpi/v0;
    .locals 1

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->O0()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/A;->X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/A;->X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method protected abstract W0()Lpi/d0;
.end method

.method public X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    invoke-virtual {p0, p1}, Lpi/A;->Y0(Lpi/d0;)Lpi/A;

    move-result-object p1

    return-object p1
.end method

.method public abstract Y0(Lpi/d0;)Lpi/A;
.end method

.method public r()Lii/k;
    .locals 1

    invoke-virtual {p0}, Lpi/A;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->r()Lii/k;

    move-result-object v0

    return-object v0
.end method
