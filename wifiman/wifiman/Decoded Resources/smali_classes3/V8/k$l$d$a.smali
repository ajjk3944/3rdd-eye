.class final LV8/k$l$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$l$d;->a(LYg/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;

.field final synthetic b:LV8/a;

.field final synthetic c:LV8/b;

.field final synthetic d:LG6/N;


# direct methods
.method constructor <init>(LV8/k;LV8/a;LV8/b;LG6/N;)V
    .locals 0

    iput-object p1, p0, LV8/k$l$d$a;->a:LV8/k;

    iput-object p2, p0, LV8/k$l$d$a;->b:LV8/a;

    iput-object p3, p0, LV8/k$l$d$a;->c:LV8/b;

    iput-object p4, p0, LV8/k$l$d$a;->d:LG6/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc9/a;)Lgg/D;
    .locals 10

    const-string/jumbo v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/k$l$d$a;->a:LV8/k;

    iget-object v1, p0, LV8/k$l$d$a;->b:LV8/a;

    const-string/jumbo v2, "frameReader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LV8/k$l$d$a;->a:LV8/k;

    invoke-static {v2}, LV8/k;->s(LV8/k;)Lgg/y;

    move-result-object v2

    iget-object v3, p0, LV8/k$l$d$a;->a:LV8/k;

    invoke-static {v3}, LV8/k;->u(LV8/k;)Lgg/y;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LV8/k;->B(LV8/k;Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$a;

    move-result-object v6

    iget-object v0, p0, LV8/k$l$d$a;->a:LV8/k;

    iget-object v1, p0, LV8/k$l$d$a;->c:LV8/b;

    const-string/jumbo v2, "frameWriter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LV8/k$l$d$a;->a:LV8/k;

    invoke-static {v2}, LV8/k;->t(LV8/k;)Lgg/y;

    move-result-object v2

    iget-object v3, p0, LV8/k$l$d$a;->a:LV8/k;

    invoke-static {v3}, LV8/k;->u(LV8/k;)Lgg/y;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LV8/k;->C(LV8/k;Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$b;

    move-result-object v7

    iget-object v0, p0, LV8/k$l$d$a;->a:LV8/k;

    invoke-virtual {v0}, LV8/k;->J()LZ8/a$a;

    move-result-object v1

    invoke-static {v0, v1, v6, v7, p1}, LV8/k;->n(LV8/k;LZ8/a$a;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$l$d$a$a;

    iget-object v5, p0, LV8/k$l$d$a;->a:LV8/k;

    iget-object v9, p0, LV8/k$l$d$a;->d:LG6/N;

    move-object v4, v1

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, LV8/k$l$d$a$a;-><init>(LV8/k;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LG6/N;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc9/a;

    invoke-virtual {p0, p1}, LV8/k$l$d$a;->a(Lc9/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
