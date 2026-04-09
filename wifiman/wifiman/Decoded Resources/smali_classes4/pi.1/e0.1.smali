.class final Lpi/e0;
.super Lpi/d0;
.source "SourceFile"


# instance fields
.field private final b:Lpi/v0;

.field private final c:Ljava/util/List;

.field private final d:Z

.field private final e:Lii/k;

.field private final f:Lmh/l;


# direct methods
.method public constructor <init>(Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refinedTypeFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/d0;-><init>()V

    iput-object p1, p0, Lpi/e0;->b:Lpi/v0;

    iput-object p2, p0, Lpi/e0;->c:Ljava/util/List;

    iput-boolean p3, p0, Lpi/e0;->d:Z

    iput-object p4, p0, Lpi/e0;->e:Lii/k;

    iput-object p5, p0, Lpi/e0;->f:Lmh/l;

    invoke-virtual {p0}, Lpi/e0;->r()Lii/k;

    move-result-object p1

    instance-of p1, p1, Lkotlin/reflect/jvm/internal/impl/types/error/g;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lpi/e0;->r()Lii/k;

    move-result-object p1

    instance-of p1, p1, Lkotlin/reflect/jvm/internal/impl/types/error/m;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SimpleTypeImpl should not be created for error type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/e0;->r()Lii/k;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p3, 0xa

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/e0;->N0()Lpi/v0;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lpi/e0;->c:Ljava/util/List;

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

    iget-object v0, p0, Lpi/e0;->b:Lpi/v0;

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lpi/e0;->d:Z

    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/e0;->W0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R0(Z)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/e0;->U0(Z)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/e0;->W0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic T0(Lpi/r0;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/e0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public U0(Z)Lpi/d0;
    .locals 1

    invoke-virtual {p0}, Lpi/e0;->O0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, Lpi/b0;

    invoke-direct {p1, p0}, Lpi/b0;-><init>(Lpi/d0;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lpi/Z;

    invoke-direct {p1, p0}, Lpi/Z;-><init>(Lpi/d0;)V

    :goto_0
    return-object p1
.end method

.method public V0(Lpi/r0;)Lpi/d0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lpi/f0;

    invoke-direct {v0, p0, p1}, Lpi/f0;-><init>(Lpi/d0;Lpi/r0;)V

    :goto_0
    return-object v0
.end method

.method public W0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/e0;->f:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/d0;

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    return-object p1
.end method

.method public r()Lii/k;
    .locals 1

    iget-object v0, p0, Lpi/e0;->e:Lii/k;

    return-object v0
.end method
