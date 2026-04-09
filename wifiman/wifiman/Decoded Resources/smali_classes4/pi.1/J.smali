.class public final Lpi/J;
.super Lpi/I;
.source "SourceFile"

# interfaces
.implements Lpi/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/J$a;
    }
.end annotation


# static fields
.field public static final e:Lpi/J$a;

.field public static f:Z


# instance fields
.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/J$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/J;->e:Lpi/J$a;

    return-void
.end method

.method public constructor <init>(Lpi/d0;Lpi/d0;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lpi/I;-><init>(Lpi/d0;Lpi/d0;)V

    return-void
.end method

.method private final Z0()V
    .locals 3

    sget-boolean v0, Lpi/J;->f:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lpi/J;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpi/J;->d:Z

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/L;->b(Lpi/S;)Z

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/L;->b(Lpi/S;)Z

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/e;

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->c(Lpi/S;Lpi/S;)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public B0()Z
    .locals 2

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v0, v0, LBh/l0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/J;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/I;

    move-result-object p1

    return-object p1
.end method

.method public R0(Z)Lpi/M0;
    .locals 2

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/M0;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/J;->Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/I;

    move-result-object p1

    return-object p1
.end method

.method public T0(Lpi/r0;)Lpi/M0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lpi/d0;->V0(Lpi/r0;)Lpi/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method

.method public U0()Lpi/d0;
    .locals 1

    invoke-direct {p0}, Lpi/J;->Z0()V

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public X0(Lkotlin/reflect/jvm/internal/impl/renderer/n;Lkotlin/reflect/jvm/internal/impl/renderer/w;)Ljava/lang/String;
    .locals 2

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/renderer/w;->p()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x28

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->U(Lpi/S;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lsi/d;->n(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/n;->R(Ljava/lang/String;Ljava/lang/String;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public Y0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/I;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/J;

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpi/d0;

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v3

    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/d0;

    invoke-direct {v0, v1, p1}, Lpi/J;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public i0(Lpi/S;)Lpi/S;
    .locals 2

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    instance-of v0, p1, Lpi/I;

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lpi/d0;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lpi/d0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v1

    invoke-static {v0, v1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v0

    :goto_0
    invoke-static {v0, p1}, Lpi/L0;->b(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
