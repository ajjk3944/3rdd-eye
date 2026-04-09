.class final LD8/v$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/v;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/v;


# direct methods
.method constructor <init>(LD8/v;)V
    .locals 0

    iput-object p1, p0, LD8/v$p;->a:LD8/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/a;

    check-cast p2, LWc/b;

    check-cast p3, LWc/b;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, LD8/v$p;->b(Ljd/a;LWc/b;LWc/b;Ljava/lang/Boolean;)Lcom/ui/wifiman/ui/component/network/N;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljd/a;LWc/b;LWc/b;Ljava/lang/Boolean;)Lcom/ui/wifiman/ui/component/network/N;
    .locals 5

    const-string/jumbo v0, "topology"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ispInfoFetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "publicIpStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vpnActive"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/v$p;->a:LD8/v;

    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    invoke-virtual {p3}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lkd/e;

    invoke-virtual {p1}, Ljd/a;->b()Lb8/a;

    move-result-object v1

    invoke-static {v0, p2, p3, v1}, LD8/v;->h(LD8/v;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;Lkd/e;Lb8/a;)Lcom/ui/wifiman/ui/component/network/M;

    move-result-object p2

    iget-object p3, p0, LD8/v$p;->a:LD8/v;

    invoke-virtual {p1}, Ljd/a;->b()Lb8/a;

    move-result-object v0

    invoke-static {p3, v0}, LD8/v;->f(LD8/v;Lb8/a;)Lcom/ui/wifiman/ui/component/network/L;

    move-result-object p3

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-virtual {p1}, Ljd/a;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LD8/v$p;->a:LD8/v;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v3, Ljd/a$b;

    invoke-static {v0, v3, v2}, LD8/v;->g(LD8/v;Ljd/a$b;I)Lcom/ui/wifiman/ui/component/network/M;

    move-result-object v2

    invoke-virtual {v3}, Ljd/a$b;->a()Ljd/a$a;

    move-result-object v3

    invoke-static {v0, v3}, LD8/v;->e(LD8/v;Ljd/a$a;)Lcom/ui/wifiman/ui/component/network/q$a;

    move-result-object v3

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/ui/wifiman/ui/component/network/N;

    invoke-direct {p1, p2, p3, p4, v1}, Lcom/ui/wifiman/ui/component/network/N;-><init>(Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;)V

    return-object p1
.end method
