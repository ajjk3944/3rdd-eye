.class final LI/e1$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LI/e1$o;->a:LI/e1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 7

    iget-object v0, p0, LI/e1$o;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->g3()LI/l1;

    move-result-object v0

    invoke-static {v0, p1, p2}, LI/m1;->d(LI/l1;J)J

    move-result-wide p1

    iget-object v0, p0, LI/e1$o;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->g3()LI/l1;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide v2, p1

    invoke-static/range {v1 .. v6}, LI/l1;->i(LI/l1;JZILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LI/e1$o;->a:LI/e1;

    invoke-virtual {v1}, LI/e1;->f3()LI/o1;

    move-result-object v1

    invoke-static {v0}, LL0/T;->a(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LI/o1;->y(J)V

    iget-object v0, p0, LI/e1$o;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->e3()LJ/j;

    move-result-object v0

    sget-object v1, LF/p;->Cursor:LF/p;

    invoke-virtual {v0, v1, p1, p2}, LJ/j;->F0(LF/p;J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LI/e1$o;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
