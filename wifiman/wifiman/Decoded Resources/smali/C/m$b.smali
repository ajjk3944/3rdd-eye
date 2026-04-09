.class final LC/m$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m;->e(Landroidx/compose/ui/e;LC/C;ZLIi/N;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LC/C;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(ZLC/C;LIi/N;)V
    .locals 0

    iput-boolean p1, p0, LC/m$b;->a:Z

    iput-object p2, p0, LC/m$b;->b:LC/C;

    iput-object p3, p0, LC/m$b;->c:LIi/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 5

    iget-boolean v0, p0, LC/m$b;->a:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LC/m$b$a;

    iget-object v3, p0, LC/m$b;->b:LC/C;

    iget-object v4, p0, LC/m$b;->c:LIi/N;

    invoke-direct {v0, v3, v4}, LC/m$b$a;-><init>(LC/C;LIi/N;)V

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->M(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    new-instance v0, LC/m$b$b;

    iget-object v3, p0, LC/m$b;->b:LC/C;

    iget-object v4, p0, LC/m$b;->c:LIi/N;

    invoke-direct {v0, v3, v4}, LC/m$b$b;-><init>(LC/C;LIi/N;)V

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->G(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, LC/m$b$c;

    iget-object v3, p0, LC/m$b;->b:LC/C;

    iget-object v4, p0, LC/m$b;->c:LIi/N;

    invoke-direct {v0, v3, v4}, LC/m$b$c;-><init>(LC/C;LIi/N;)V

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->I(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    new-instance v0, LC/m$b$d;

    iget-object v3, p0, LC/m$b;->b:LC/C;

    iget-object v4, p0, LC/m$b;->c:LIi/N;

    invoke-direct {v0, v3, v4}, LC/m$b$d;-><init>(LC/C;LIi/N;)V

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->K(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LC/m$b;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
