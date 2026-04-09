.class public final Ldi/s;
.super Ldi/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/s$a;,
        Ldi/s$b;
    }
.end annotation


# static fields
.field public static final b:Ldi/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldi/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldi/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldi/s;->b:Ldi/s$a;

    return-void
.end method

.method public constructor <init>(LZh/b;I)V
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Ldi/f;

    invoke-direct {v0, p1, p2}, Ldi/f;-><init>(LZh/b;I)V

    invoke-direct {p0, v0}, Ldi/s;-><init>(Ldi/f;)V

    return-void
.end method

.method public constructor <init>(Ldi/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ldi/s$b$b;

    invoke-direct {v0, p1}, Ldi/s$b$b;-><init>(Ldi/f;)V

    invoke-direct {p0, v0}, Ldi/s;-><init>(Ldi/s$b;)V

    return-void
.end method

.method public constructor <init>(Ldi/s$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Ldi/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LBh/G;)Lpi/S;
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v0

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->E()LBh/e;

    move-result-object v1

    const-string v2, "getKClass(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lpi/D0;

    invoke-virtual {p0, p1}, Ldi/s;->c(LBh/G;)Lpi/S;

    move-result-object p1

    invoke-direct {v2, p1}, Lpi/D0;-><init>(Lpi/S;)V

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public final c(LBh/G;)Lpi/S;
    .locals 5

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/s$b;

    instance-of v1, v0, Ldi/s$b$a;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldi/s$b$a;

    invoke-virtual {p1}, Ldi/s$b$a;->a()Lpi/S;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Ldi/s$b$b;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/s$b$b;

    invoke-virtual {v0}, Ldi/s$b$b;->c()Ldi/f;

    move-result-object v0

    invoke-virtual {v0}, Ldi/f;->a()LZh/b;

    move-result-object v1

    invoke-virtual {v0}, Ldi/f;->b()I

    move-result v0

    invoke-static {p1, v1}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNRESOLVED_KCLASS_CONSTANT_VALUE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {v1}, LZh/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v2}, LBh/e;->u()Lpi/d0;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lsi/d;->D(Lpi/S;)Lpi/S;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    sget-object v4, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v3, v4, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l(Lpi/N0;Lpi/S;)Lpi/d0;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
