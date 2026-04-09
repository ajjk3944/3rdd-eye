.class final LF/f$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->d(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/Q;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(LR0/Q;LT/q0;)V
    .locals 0

    iput-object p1, p0, LF/f$j;->a:LR0/Q;

    iput-object p2, p0, LF/f$j;->b:LT/q0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LF/f$j;->a:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    iget-object v2, p0, LF/f$j;->b:LT/q0;

    invoke-static {v2}, LF/f;->n(LT/q0;)LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LL0/S;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/f$j;->a:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->g()LL0/S;

    move-result-object v0

    iget-object v1, p0, LF/f$j;->b:LT/q0;

    invoke-static {v1}, LF/f;->n(LT/q0;)LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->g()LL0/S;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LF/f$j;->b:LT/q0;

    iget-object v1, p0, LF/f$j;->a:LR0/Q;

    invoke-static {v0, v1}, LF/f;->o(LT/q0;LR0/Q;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/f$j;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
