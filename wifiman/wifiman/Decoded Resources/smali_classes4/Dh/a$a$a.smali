.class LDh/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/a$a;->a()Lpi/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/a$a;


# direct methods
.method constructor <init>(LDh/a$a;)V
    .locals 0

    iput-object p1, p0, LDh/a$a$a;->a:LDh/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 2

    iget-object v0, p0, LDh/a$a$a;->a:LDh/a$a;

    iget-object v0, v0, LDh/a$a;->a:LDh/a;

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->f(LBh/m;)LBh/h;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, LDh/a$a$a;->a:LDh/a$a;

    iget-object p1, p1, LDh/a$a;->a:LDh/a;

    iget-object p1, p1, LDh/a;->c:Loi/i;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/d0;

    return-object p1

    :cond_0
    instance-of v1, v0, LBh/k0;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, LBh/k0;

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lpi/J0;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lpi/V;->c(LBh/k0;Ljava/util/List;)Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, LDh/z;

    if-eqz v1, :cond_2

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v1

    invoke-interface {v1, p1}, Lpi/v0;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;

    move-result-object v1

    check-cast v0, LDh/z;

    invoke-virtual {v0, p1}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    invoke-static {v1, p1, p0}, Lpi/J0;->v(Lpi/v0;Lii/k;Lmh/l;)Lpi/d0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {v0}, LBh/h;->u()Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-virtual {p0, p1}, LDh/a$a$a;->a(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
