.class public final Lkotlin/reflect/jvm/internal/impl/types/error/i;
.super Lpi/d0;
.source "SourceFile"


# instance fields
.field private final b:Lpi/v0;

.field private final c:Lii/k;

.field private final d:Lkotlin/reflect/jvm/internal/impl/types/error/k;

.field private final e:Ljava/util/List;

.field private final f:Z

.field private final g:[Ljava/lang/String;

.field private final h:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lpi/d0;-><init>()V

    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->b:Lpi/v0;

    .line 5
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->c:Lii/k;

    .line 6
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->d:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    .line 7
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->e:Ljava/util/List;

    .line 8
    iput-boolean p5, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->f:Z

    .line 9
    iput-object p6, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->g:[Ljava/lang/String;

    .line 10
    sget-object p1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-virtual {p3}, Lkotlin/reflect/jvm/internal/impl/types/error/k;->getDebugMessage()Ljava/lang/String;

    move-result-object p1

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->h:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/impl/types/error/i;-><init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->e:Ljava/util/List;

    return-object v0
.end method

.method public M0()Lpi/r0;
    .locals 1

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v0

    return-object v0
.end method

.method public N0()Lpi/v0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->b:Lpi/v0;

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->f:Z

    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 8

    new-instance v7, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->N0()Lpi/v0;

    move-result-object v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->r()Lii/k;

    move-result-object v2

    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->d:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->L0()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->g:[Ljava/lang/String;

    array-length v5, v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ljava/lang/String;

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/impl/types/error/i;-><init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v7
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final W0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final X0()Lkotlin/reflect/jvm/internal/impl/types/error/k;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->d:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    return-object v0
.end method

.method public Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final Z0(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/types/error/i;
    .locals 8

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/error/i;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->N0()Lpi/v0;

    move-result-object v2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->r()Lii/k;

    move-result-object v3

    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->d:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/i;->O0()Z

    move-result v6

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->g:[Ljava/lang/String;

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, [Ljava/lang/String;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/types/error/i;-><init>(Lpi/v0;Lii/k;Lkotlin/reflect/jvm/internal/impl/types/error/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public r()Lii/k;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/error/i;->c:Lii/k;

    return-object v0
.end method
