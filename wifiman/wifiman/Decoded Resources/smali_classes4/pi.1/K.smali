.class public final Lpi/K;
.super Lpi/I;
.source "SourceFile"

# interfaces
.implements Lpi/K0;


# instance fields
.field private final d:Lpi/I;

.field private final e:Lpi/S;


# direct methods
.method public constructor <init>(Lpi/I;Lpi/S;)V
    .locals 2

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p1}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lpi/I;-><init>(Lpi/d0;Lpi/d0;)V

    iput-object p1, p0, Lpi/K;->d:Lpi/I;

    iput-object p2, p0, Lpi/K;->e:Lpi/S;

    return-void
.end method


# virtual methods
.method public bridge synthetic G0()Lpi/M0;
    .locals 1

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v0

    return-object v0
.end method

.method public I()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/K;->e:Lpi/S;

    return-object v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/K;->Z0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/K;

    move-result-object p1

    return-object p1
.end method

.method public R0(Z)Lpi/M0;
    .locals 2

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/M0;->R0(Z)Lpi/M0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/K;->I()Lpi/S;

    move-result-object v1

    invoke-virtual {v1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/M0;->R0(Z)Lpi/M0;

    move-result-object p1

    invoke-static {v0, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/K;->Z0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/K;

    move-result-object p1

    return-object p1
.end method

.method public T0(Lpi/r0;)Lpi/M0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/M0;->T0(Lpi/r0;)Lpi/M0;

    move-result-object p1

    invoke-virtual {p0}, Lpi/K;->I()Lpi/S;

    move-result-object v0

    invoke-static {p1, v0}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public U0()Lpi/d0;
    .locals 1

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v0

    invoke-virtual {v0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public X0(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/renderer/w;)Ljava/lang/String;
    .locals 1

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/renderer/w;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpi/K;->I()Lpi/S;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpi/I;->X0(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/renderer/w;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public Y0()Lpi/I;
    .locals 1

    iget-object v0, p0, Lpi/K;->d:Lpi/I;

    return-object v0
.end method

.method public Z0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/K;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/K;

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpi/I;

    invoke-virtual {p0}, Lpi/K;->I()Lpi/S;

    move-result-object v2

    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpi/K;-><init>(Lpi/I;Lpi/S;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[@EnhancedForWarnings("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/K;->I()Lpi/S;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/K;->Y0()Lpi/I;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
