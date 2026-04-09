.class final LI/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/a;->a(LR0/Q;LR0/s;Lmh/l;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/Q;

.field final synthetic b:LI/a;

.field final synthetic c:LR0/s;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/l;


# direct methods
.method constructor <init>(LR0/Q;LI/a;LR0/s;Lmh/l;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LI/a$a;->a:LR0/Q;

    iput-object p2, p0, LI/a$a;->b:LI/a;

    iput-object p3, p0, LI/a$a;->c:LR0/s;

    iput-object p4, p0, LI/a$a;->d:Lmh/l;

    iput-object p5, p0, LI/a$a;->e:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LI/P0;)V
    .locals 6

    iget-object v1, p0, LI/a$a;->a:LR0/Q;

    iget-object v0, p0, LI/a$a;->b:LI/a;

    invoke-virtual {v0}, LI/N0;->i()LI/N0$a;

    move-result-object v2

    iget-object v3, p0, LI/a$a;->c:LR0/s;

    iget-object v4, p0, LI/a$a;->d:Lmh/l;

    iget-object v5, p0, LI/a$a;->e:Lmh/l;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, LI/P0;->l(LR0/Q;LI/N0$a;LR0/s;Lmh/l;Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI/P0;

    invoke-virtual {p0, p1}, LI/a$a;->a(LI/P0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
