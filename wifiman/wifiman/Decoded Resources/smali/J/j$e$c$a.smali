.class final LJ/j$e$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j$e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;


# direct methods
.method constructor <init>(LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/j$e$c$a;->a:LJ/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    iget-object p1, p0, LJ/j$e$c$a;->a:LJ/j;

    invoke-static {p1}, LJ/j;->n(LJ/j;)LJ/n;

    move-result-object p2

    sget-object v0, LJ/n;->Cursor:LJ/n;

    if-ne p2, v0, :cond_0

    sget-object v0, LJ/n;->None:LJ/n;

    :cond_0
    invoke-static {p1, v0}, LJ/j;->w(LJ/j;LJ/n;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LJ/j$e$c$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
