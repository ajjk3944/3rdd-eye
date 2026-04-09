.class final LN/G$a$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LN/H;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(Ljava/lang/String;LN/H;LIi/N;)V
    .locals 0

    iput-object p1, p0, LN/G$a$e;->a:Ljava/lang/String;

    iput-object p2, p0, LN/G$a$e;->b:LN/H;

    iput-object p3, p0, LN/G$a$e;->c:LIi/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 3

    iget-object v0, p0, LN/G$a$e;->a:Ljava/lang/String;

    invoke-static {p1, v0}, LJ0/t;->g0(LJ0/w;Ljava/lang/String;)V

    iget-object v0, p0, LN/G$a$e;->b:LN/H;

    invoke-virtual {v0}, LN/H;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LN/G$a$e$a;

    iget-object v1, p0, LN/G$a$e;->b:LN/H;

    iget-object v2, p0, LN/G$a$e;->c:LIi/N;

    invoke-direct {v0, v1, v2}, LN/G$a$e$a;-><init>(LN/H;LIi/N;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->n(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/G$a$e;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
