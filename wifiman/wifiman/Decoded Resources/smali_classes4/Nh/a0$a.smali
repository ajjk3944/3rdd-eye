.class public final LNh/a0$a;
.super Lxi/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNh/a0;->p0(LBh/e;Ljava/util/Set;Lmh/l;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBh/e;

.field final synthetic b:Ljava/util/Set;

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(LBh/e;Ljava/util/Set;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LNh/a0$a;->a:LBh/e;

    iput-object p2, p0, LNh/a0$a;->b:Ljava/util/Set;

    iput-object p3, p0, LNh/a0$a;->c:Lmh/l;

    invoke-direct {p0}, Lxi/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LNh/a0$a;->e()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LBh/e;

    invoke-virtual {p0, p1}, LNh/a0$a;->d(LBh/e;)Z

    move-result p1

    return p1
.end method

.method public d(LBh/e;)Z
    .locals 2

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNh/a0$a;->a:LBh/e;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/e;->Q()Lii/k;

    move-result-object p1

    const-string v0, "getStaticScope(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LNh/b0;

    if-eqz v0, :cond_1

    iget-object v0, p0, LNh/a0$a;->b:Ljava/util/Set;

    iget-object v1, p0, LNh/a0$a;->c:Lmh/l;

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public e()V
    .locals 0

    return-void
.end method
