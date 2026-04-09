.class final LF/f$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->b(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/o1;

.field final synthetic b:LH/b;

.field final synthetic c:LJ/j;

.field final synthetic d:Lu0/a;

.field final synthetic e:Landroidx/compose/ui/platform/h0;

.field final synthetic f:Landroidx/compose/ui/platform/q1;

.field final synthetic g:LY0/d;

.field final synthetic h:Z

.field final synthetic i:Z

.field final synthetic j:Z


# direct methods
.method constructor <init>(LI/o1;LH/b;LJ/j;Lu0/a;Landroidx/compose/ui/platform/h0;Landroidx/compose/ui/platform/q1;LY0/d;ZZZ)V
    .locals 0

    iput-object p1, p0, LF/f$e;->a:LI/o1;

    iput-object p2, p0, LF/f$e;->b:LH/b;

    iput-object p3, p0, LF/f$e;->c:LJ/j;

    iput-object p4, p0, LF/f$e;->d:Lu0/a;

    iput-object p5, p0, LF/f$e;->e:Landroidx/compose/ui/platform/h0;

    iput-object p6, p0, LF/f$e;->f:Landroidx/compose/ui/platform/q1;

    iput-object p7, p0, LF/f$e;->g:LY0/d;

    iput-boolean p8, p0, LF/f$e;->h:Z

    iput-boolean p9, p0, LF/f$e;->i:Z

    iput-boolean p10, p0, LF/f$e;->j:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget-object v0, p0, LF/f$e;->a:LI/o1;

    iget-object v1, p0, LF/f$e;->b:LH/b;

    invoke-virtual {v0, v1}, LI/o1;->C(LH/b;)V

    iget-object v2, p0, LF/f$e;->c:LJ/j;

    iget-object v3, p0, LF/f$e;->d:Lu0/a;

    iget-object v4, p0, LF/f$e;->e:Landroidx/compose/ui/platform/h0;

    iget-object v5, p0, LF/f$e;->f:Landroidx/compose/ui/platform/q1;

    iget-object v6, p0, LF/f$e;->g:LY0/d;

    iget-boolean v7, p0, LF/f$e;->h:Z

    iget-boolean v8, p0, LF/f$e;->i:Z

    iget-boolean v9, p0, LF/f$e;->j:Z

    invoke-virtual/range {v2 .. v9}, LJ/j;->E0(Lu0/a;Landroidx/compose/ui/platform/h0;Landroidx/compose/ui/platform/q1;LY0/d;ZZZ)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/f$e;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
