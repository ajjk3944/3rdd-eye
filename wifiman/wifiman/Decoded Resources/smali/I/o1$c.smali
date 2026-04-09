.class final LI/o1$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/o1;-><init>(LH/l;LH/b;LI/o;LH/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/o1;

.field final synthetic b:LI/o;


# direct methods
.method constructor <init>(LI/o1;LI/o;)V
    .locals 0

    iput-object p1, p0, LI/o1$c;->a:LI/o1;

    iput-object p2, p0, LI/o1$c;->b:LI/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LI/o1$b;
    .locals 4

    invoke-static {}, LI/o1;->a()LI/o1$a;

    move-result-object v0

    iget-object v1, p0, LI/o1$c;->a:LI/o1;

    invoke-static {v1}, LI/o1;->c(LI/o1;)LT/z1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI/o1$b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LI/o1$b;->b()LH/h;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, LI/o1$c;->a:LI/o1;

    invoke-static {v1}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v1

    invoke-virtual {v1}, LH/l;->l()LH/h;

    move-result-object v1

    :cond_1
    iget-object v2, p0, LI/o1$c;->b:LI/o;

    iget-object v3, p0, LI/o1$c;->a:LI/o1;

    invoke-virtual {v3}, LI/o1;->j()LI/X0;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LI/o1$a;->a(LI/o1$a;LH/h;LI/o;LI/X0;)LI/o1$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/o1$c;->a()LI/o1$b;

    move-result-object v0

    return-object v0
.end method
