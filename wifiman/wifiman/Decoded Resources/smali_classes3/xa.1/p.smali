.class public final Lxa/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa/o;


# instance fields
.field private final b:Lxa/a;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(Lxa/a;)V
    .locals 2

    const-string/jumbo v0, "coroutinesCatalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/p;->b:Lxa/a;

    invoke-interface {p1}, Lcom/ui/product/catalog/UiProductCatalog;->b()LLi/g;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxa/p;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lxa/p;)Lxa/a;
    .locals 0

    iget-object p0, p0, Lxa/p;->b:Lxa/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 3

    new-instance v0, Lxa/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lxa/p$a;-><init>(Lxa/p;Ldh/e;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lxa/p;->c:Lgg/i;

    return-object v0
.end method
