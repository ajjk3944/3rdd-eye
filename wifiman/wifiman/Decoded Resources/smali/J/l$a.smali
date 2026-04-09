.class final LJ/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/l;->a(LJ/j;Lv/i;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv/i;

.field final synthetic b:LJ/j;


# direct methods
.method constructor <init>(Lv/i;LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/l$a;->a:Lv/i;

    iput-object p2, p0, LJ/l$a;->b:LJ/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv/g;)V
    .locals 11

    iget-object v0, p0, LJ/l$a;->a:Lv/i;

    sget-object v1, LF/Q;->Cut:LF/Q;

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    invoke-virtual {v2}, LJ/j;->A()Z

    move-result v6

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    new-instance v4, LF/l;

    invoke-direct {v4, v1}, LF/l;-><init>(LF/Q;)V

    new-instance v8, LJ/l$a$a;

    invoke-direct {v8, v0, v2}, LJ/l$a$a;-><init>(Lv/i;LJ/j;)V

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v10}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v0, p0, LJ/l$a;->a:Lv/i;

    sget-object v1, LF/Q;->Copy:LF/Q;

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    invoke-virtual {v2}, LJ/j;->z()Z

    move-result v6

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    new-instance v4, LF/l;

    invoke-direct {v4, v1}, LF/l;-><init>(LF/Q;)V

    new-instance v8, LJ/l$a$b;

    invoke-direct {v8, v0, v2}, LJ/l$a$b;-><init>(Lv/i;LJ/j;)V

    invoke-static/range {v3 .. v10}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v0, p0, LJ/l$a;->a:Lv/i;

    sget-object v1, LF/Q;->Paste:LF/Q;

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    invoke-virtual {v2}, LJ/j;->B()Z

    move-result v6

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    new-instance v4, LF/l;

    invoke-direct {v4, v1}, LF/l;-><init>(LF/Q;)V

    new-instance v8, LJ/l$a$c;

    invoke-direct {v8, v0, v2}, LJ/l$a$c;-><init>(Lv/i;LJ/j;)V

    invoke-static/range {v3 .. v10}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    iget-object v0, p0, LJ/l$a;->a:Lv/i;

    sget-object v1, LF/Q;->SelectAll:LF/Q;

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    invoke-virtual {v2}, LJ/j;->C()Z

    move-result v6

    iget-object v2, p0, LJ/l$a;->b:LJ/j;

    new-instance v4, LF/l;

    invoke-direct {v4, v1}, LF/l;-><init>(LF/Q;)V

    new-instance v8, LJ/l$a$d;

    invoke-direct {v8, v0, v2}, LJ/l$a$d;-><init>(Lv/i;LJ/j;)V

    invoke-static/range {v3 .. v10}, Lv/g;->d(Lv/g;Lmh/p;Landroidx/compose/ui/e;ZLmh/q;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/g;

    invoke-virtual {p0, p1}, LJ/l$a;->a(Lv/g;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
