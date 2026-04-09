.class public abstract Lr/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/platform/v0;->c0:Landroidx/compose/ui/platform/v0$a;

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-static {p0, p1}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
