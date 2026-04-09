.class final LI/e1$w$a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;

.field final synthetic b:LI/e1;


# direct methods
.method constructor <init>(LJ/j;LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$w$a$d;->a:LJ/j;

    iput-object p2, p0, LI/e1$w$a$d;->b:LI/e1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LI/e1$w$a$d;->a:LJ/j;

    invoke-virtual {v0}, LJ/j;->i0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LI/e1$w$a$d;->b:LI/e1;

    invoke-static {v0}, Landroidx/compose/ui/focus/q;->a(Lk0/k;)Z

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$w$a$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
