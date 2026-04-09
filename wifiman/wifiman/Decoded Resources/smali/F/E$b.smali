.class final LF/E$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/E;-><init>(LF/S;LT/J0;Landroidx/compose/ui/platform/n1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;


# direct methods
.method constructor <init>(LF/E;)V
    .locals 0

    iput-object p1, p0, LF/E$b;->a:LF/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/Q;)V
    .locals 4

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LF/E$b;->a:LF/E;

    invoke-virtual {v1}, LF/E;->w()LL0/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF/E$b;->a:LF/E;

    sget-object v1, LF/q;->None:LF/q;

    invoke-virtual {v0, v1}, LF/E;->B(LF/q;)V

    :cond_1
    iget-object v0, p0, LF/E$b;->a:LF/E;

    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LF/E;->I(J)V

    iget-object v0, p0, LF/E$b;->a:LF/E;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF/E;->A(J)V

    iget-object v0, p0, LF/E$b;->a:LF/E;

    invoke-static {v0}, LF/E;->b(LF/E;)Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LF/E$b;->a:LF/E;

    invoke-virtual {p1}, LF/E;->o()LT/J0;

    move-result-object p1

    invoke-interface {p1}, LT/J0;->invalidate()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/Q;

    invoke-virtual {p0, p1}, LF/E$b;->a(LR0/Q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
