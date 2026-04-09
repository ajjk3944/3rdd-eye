.class final LF/m$v;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->p(Landroidx/compose/ui/e;LF/E;LM/G;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:LM/G;


# direct methods
.method constructor <init>(LF/E;LM/G;)V
    .locals 0

    iput-object p1, p0, LF/m$v;->a:LF/E;

    iput-object p2, p0, LF/m$v;->b:LM/G;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LF/m$v;->a:LF/E;

    invoke-virtual {v0}, LF/E;->d()LF/q;

    move-result-object v0

    sget-object v1, LF/q;->Selection:LF/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LF/w;->a(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LF/m$v;->b:LM/G;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LM/G;->u(LM/G;Ll0/g;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw0/b;

    invoke-virtual {p1}, Lw0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, LF/m$v;->a(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
