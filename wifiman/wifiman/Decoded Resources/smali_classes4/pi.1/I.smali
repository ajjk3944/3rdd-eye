.class public abstract Lpi/I;
.super Lpi/M0;
.source "SourceFile"

# interfaces
.implements Lri/g;


# instance fields
.field private final b:Lpi/d0;

.field private final c:Lpi/d0;


# direct methods
.method public constructor <init>(Lpi/d0;Lpi/d0;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lpi/M0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpi/I;->b:Lpi/d0;

    iput-object p2, p0, Lpi/I;->c:Lpi/d0;

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Lpi/r0;
    .locals 1

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->M0()Lpi/r0;

    move-result-object v0

    return-object v0
.end method

.method public N0()Lpi/v0;
    .locals 1

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->O0()Z

    move-result v0

    return v0
.end method

.method public abstract U0()Lpi/d0;
.end method

.method public final V0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/I;->b:Lpi/d0;

    return-object v0
.end method

.method public final W0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lpi/I;->c:Lpi/d0;

    return-object v0
.end method

.method public abstract X0(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/renderer/w;)Ljava/lang/String;
.end method

.method public r()Lii/k;
    .locals 1

    invoke-virtual {p0}, Lpi/I;->U0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->r()Lii/k;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/n;->k:Lkotlin/reflect/jvm/internal/impl/renderer/n;

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
