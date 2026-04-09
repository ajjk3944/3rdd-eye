.class final LF/f$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->d(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LT/q0;

.field final synthetic c:LT/q0;


# direct methods
.method constructor <init>(Lmh/l;LT/q0;LT/q0;)V
    .locals 0

    iput-object p1, p0, LF/f$k;->a:Lmh/l;

    iput-object p2, p0, LF/f$k;->b:LT/q0;

    iput-object p3, p0, LF/f$k;->c:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/Q;)V
    .locals 3

    iget-object v0, p0, LF/f$k;->b:LT/q0;

    invoke-static {v0, p1}, LF/f;->o(LT/q0;LR0/Q;)V

    iget-object v0, p0, LF/f$k;->c:LT/q0;

    invoke-static {v0}, LF/f;->p(LT/q0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LF/f$k;->c:LT/q0;

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LF/f;->q(LT/q0;Ljava/lang/String;)V

    if-nez v0, :cond_0

    iget-object v0, p0, LF/f$k;->a:Lmh/l;

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/Q;

    invoke-virtual {p0, p1}, LF/f$k;->a(LR0/Q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
