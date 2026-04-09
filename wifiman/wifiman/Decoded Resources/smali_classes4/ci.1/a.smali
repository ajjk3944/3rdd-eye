.class public final Lci/a;
.super Lpi/d0;
.source "SourceFile"

# interfaces
.implements Lri/d;


# instance fields
.field private final b:Lpi/B0;

.field private final c:Lci/b;

.field private final d:Z

.field private final e:Lpi/r0;


# direct methods
.method public constructor <init>(Lpi/B0;Lci/b;ZLpi/r0;)V
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lpi/d0;-><init>()V

    .line 5
    iput-object p1, p0, Lci/a;->b:Lpi/B0;

    .line 6
    iput-object p2, p0, Lci/a;->c:Lci/b;

    .line 7
    iput-boolean p3, p0, Lci/a;->d:Z

    .line 8
    iput-object p4, p0, Lci/a;->e:Lpi/r0;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/B0;Lci/b;ZLpi/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    new-instance p2, Lci/c;

    invoke-direct {p2, p1}, Lci/c;-><init>(Lpi/B0;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p4}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object p4

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lci/a;-><init>(Lpi/B0;Lci/b;ZLpi/r0;)V

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public M0()Lpi/r0;
    .locals 1

    iget-object v0, p0, Lci/a;->e:Lpi/r0;

    return-object v0
.end method

.method public bridge synthetic N0()Lpi/v0;
    .locals 1

    invoke-virtual {p0}, Lci/a;->W0()Lci/b;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lci/a;->d:Z

    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lci/a;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lci/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lci/a;->X0(Z)Lci/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lci/a;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lci/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lci/a;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U0(Z)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lci/a;->X0(Z)Lci/a;

    move-result-object p1

    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 4

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lci/a;

    iget-object v1, p0, Lci/a;->b:Lpi/B0;

    invoke-virtual {p0}, Lci/a;->W0()Lci/b;

    move-result-object v2

    invoke-virtual {p0}, Lci/a;->O0()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Lci/a;-><init>(Lpi/B0;Lci/b;ZLpi/r0;)V

    return-object v0
.end method

.method public W0()Lci/b;
    .locals 1

    iget-object v0, p0, Lci/a;->c:Lci/b;

    return-object v0
.end method

.method public X0(Z)Lci/a;
    .locals 4

    invoke-virtual {p0}, Lci/a;->O0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lci/a;

    iget-object v1, p0, Lci/a;->b:Lpi/B0;

    invoke-virtual {p0}, Lci/a;->W0()Lci/b;

    move-result-object v2

    invoke-virtual {p0}, Lci/a;->M0()Lpi/r0;

    move-result-object v3

    invoke-direct {v0, v1, v2, p1, v3}, Lci/a;-><init>(Lpi/B0;Lci/b;ZLpi/r0;)V

    return-object v0
.end method

.method public Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lci/a;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lci/a;

    iget-object v1, p0, Lci/a;->b:Lpi/B0;

    invoke-interface {v1, p1}, Lpi/B0;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/B0;

    move-result-object p1

    const-string v1, "refine(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lci/a;->W0()Lci/b;

    move-result-object v1

    invoke-virtual {p0}, Lci/a;->O0()Z

    move-result v2

    invoke-virtual {p0}, Lci/a;->M0()Lpi/r0;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lci/a;-><init>(Lpi/B0;Lci/b;ZLpi/r0;)V

    return-object v0
.end method

.method public r()Lii/k;
    .locals 3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/h;->CAPTURED_TYPE_SCOPE:Lkotlin/reflect/jvm/internal/impl/types/error/h;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->a(Lkotlin/reflect/jvm/internal/impl/types/error/h;Z[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/g;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Captured("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lci/a;->b:Lpi/B0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lci/a;->O0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "?"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
