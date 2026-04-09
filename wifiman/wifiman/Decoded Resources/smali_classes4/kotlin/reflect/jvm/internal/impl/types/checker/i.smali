.class public final Lkotlin/reflect/jvm/internal/impl/types/checker/i;
.super Lpi/d0;
.source "SourceFile"

# interfaces
.implements Lri/d;


# instance fields
.field private final b:Lri/b;

.field private final c:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

.field private final d:Lpi/M0;

.field private final e:Lpi/r0;

.field private final f:Z

.field private final g:Z


# direct methods
.method public constructor <init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lpi/d0;-><init>()V

    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b:Lri/b;

    .line 5
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    .line 6
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->d:Lpi/M0;

    .line 7
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->e:Lpi/r0;

    .line 8
    iput-boolean p5, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->f:Z

    .line 9
    iput-boolean p6, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    sget-object p4, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p4}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move v5, p8

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move v6, p8

    goto :goto_1

    :cond_2
    move v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 2
    invoke-direct/range {v0 .. v6}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZ)V

    return-void
.end method

.method public constructor <init>(Lri/b;Lpi/M0;Lpi/B0;LBh/l0;)V
    .locals 10

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;-><init>(Lpi/B0;Lmh/a;Lkotlin/reflect/jvm/internal/impl/types/checker/n;LBh/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v9}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->e:Lpi/r0;

    return-object v0
.end method

.method public bridge synthetic N0()Lpi/v0;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v0

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->f:Z

    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->a1(Z)Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U0(Z)Lpi/d0;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->a1(Z)Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    move-result-object p1

    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 8

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b:Lri/b;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v3

    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->d:Lpi/M0;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->O0()Z

    move-result v6

    iget-boolean v7, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->g:Z

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZ)V

    return-object v0
.end method

.method public final W0()Lri/b;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b:Lri/b;

    return-object v0
.end method

.method public X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    return-object v0
.end method

.method public final Y0()Lpi/M0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->d:Lpi/M0;

    return-object v0
.end method

.method public final Z0()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->g:Z

    return v0
.end method

.method public a1(Z)Lkotlin/reflect/jvm/internal/impl/types/checker/i;
    .locals 10

    new-instance v9, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b:Lri/b;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v2

    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->d:Lpi/M0;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->M0()Lpi/r0;

    move-result-object v4

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v5, p1

    invoke-direct/range {v0 .. v8}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public b1(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/checker/i;
    .locals 10

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->b:Lri/b;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;->p(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->d:Lpi/M0;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->M0()Lpi/r0;

    move-result-object v5

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->O0()Z

    move-result v6

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
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
