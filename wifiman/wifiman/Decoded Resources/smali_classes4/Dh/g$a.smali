.class public final LDh/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/g;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;LBh/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/g;


# direct methods
.method constructor <init>(LDh/g;)V
    .locals 0

    iput-object p1, p0, LDh/g$a;->a:LDh/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 2

    invoke-virtual {p0}, LDh/g$a;->f()LBh/k0;

    move-result-object v0

    invoke-interface {v0}, LBh/k0;->f0()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic c()LBh/h;
    .locals 1

    invoke-virtual {p0}, LDh/g$a;->f()LBh/k0;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()LBh/k0;
    .locals 1

    iget-object v0, p0, LDh/g$a;->a:LDh/g;

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LDh/g$a;->a:LDh/g;

    invoke-virtual {v0}, LDh/g;->R0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    invoke-virtual {p0}, LDh/g$a;->f()LBh/k0;

    move-result-object v0

    invoke-static {v0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[typealias "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LDh/g$a;->f()LBh/k0;

    move-result-object v1

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
