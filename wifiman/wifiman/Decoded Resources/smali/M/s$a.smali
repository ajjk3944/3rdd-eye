.class final LM/s$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/s;->l(LM/x;LM/k;LM/l$a;)LM/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/k;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:LM/x;

.field final synthetic e:LYg/m;


# direct methods
.method constructor <init>(LM/k;IILM/x;LYg/m;)V
    .locals 0

    iput-object p1, p0, LM/s$a;->a:LM/k;

    iput p2, p0, LM/s$a;->b:I

    iput p3, p0, LM/s$a;->c:I

    iput-object p4, p0, LM/s$a;->d:LM/x;

    iput-object p5, p0, LM/s$a;->e:LYg/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LM/l$a;
    .locals 7

    iget-object v0, p0, LM/s$a;->a:LM/k;

    iget-object v1, p0, LM/s$a;->e:LYg/m;

    invoke-static {v1}, LM/s;->d(LYg/m;)I

    move-result v1

    iget v2, p0, LM/s$a;->b:I

    iget v3, p0, LM/s$a;->c:I

    iget-object v4, p0, LM/s$a;->d:LM/x;

    invoke-interface {v4}, LM/x;->b()Z

    move-result v4

    iget-object v5, p0, LM/s$a;->d:LM/x;

    invoke-interface {v5}, LM/x;->i()LM/e;

    move-result-object v5

    sget-object v6, LM/e;->CROSSED:LM/e;

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-static/range {v0 .. v5}, LM/s;->b(LM/k;IIIZZ)LM/l$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM/s$a;->a()LM/l$a;

    move-result-object v0

    return-object v0
.end method
