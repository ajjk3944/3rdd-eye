.class public interface abstract LA/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 2

    if-nez p4, :cond_1

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    sget-object p2, LY0/n;->b:LY0/n$a;

    invoke-static {p2}, Lr/I0;->c(LY0/n$a;)J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/n;->b(J)LY0/n;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1, p2, p4, p3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p2

    :cond_0
    invoke-interface {p0, p1, p2}, LA/c;->a(Landroidx/compose/ui/e;Lr/H;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: animateItemPlacement"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Landroidx/compose/ui/e;Lr/H;)Landroidx/compose/ui/e;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2, v0}, LA/c;->c(Landroidx/compose/ui/e;Lr/H;Lr/H;Lr/H;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Landroidx/compose/ui/e;Lr/H;Lr/H;Lr/H;)Landroidx/compose/ui/e;
.end method
