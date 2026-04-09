.class final Landroidx/compose/ui/platform/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/g;


# instance fields
.field private final a:LT/m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/G0;->a:LT/m0;

    return-void
.end method


# virtual methods
.method public b(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->a:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lf0/g$a;->a(Lf0/g;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->b(Lf0/g;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->c(Lf0/g;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->d(Lf0/g;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public v()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/G0;->a:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method
