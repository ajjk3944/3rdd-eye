.class final LI/e1$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;-><init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$l;->a:LI/e1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/f0;Landroidx/compose/ui/platform/g0;)Ljava/lang/Boolean;
    .locals 6

    iget-object p2, p0, LI/e1$l;->a:LI/e1;

    invoke-static {p2}, LI/e1;->J2(LI/e1;)V

    iget-object p2, p0, LI/e1$l;->a:LI/e1;

    invoke-virtual {p2}, LI/e1;->e3()LJ/j;

    move-result-object p2

    invoke-virtual {p2}, LJ/j;->D()V

    invoke-static {p1}, Lt/d;->a(Landroidx/compose/ui/platform/f0;)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, LI/e1$l;->a:LI/e1;

    invoke-static {p1}, Lu/b;->a(LD0/h;)Lu/a;

    if-eqz v1, :cond_0

    iget-object p1, p0, LI/e1$l;->a:LI/e1;

    invoke-virtual {p1}, LI/e1;->f3()LI/o1;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LI/o1;->u(LI/o1;Ljava/lang/CharSequence;ZLK/c;ILjava/lang/Object;)V

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/f0;

    check-cast p2, Landroidx/compose/ui/platform/g0;

    invoke-virtual {p0, p1, p2}, LI/e1$l;->a(Landroidx/compose/ui/platform/f0;Landroidx/compose/ui/platform/g0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
