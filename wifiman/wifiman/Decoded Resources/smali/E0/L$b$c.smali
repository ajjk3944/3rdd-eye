.class final LE0/L$b$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L$b;-><init>(LE0/L;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/L;

.field final synthetic b:LE0/L$b;


# direct methods
.method constructor <init>(LE0/L;LE0/L$b;)V
    .locals 0

    iput-object p1, p0, LE0/L$b$c;->a:LE0/L;

    iput-object p2, p0, LE0/L$b$c;->b:LE0/L$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, LE0/L$b$c;->a:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, LE0/L$b$c;->a:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getPlacementScope()Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    goto :goto_0

    :goto_2
    iget-object v0, p0, LE0/L$b$c;->b:LE0/L$b;

    iget-object v2, p0, LE0/L$b$c;->a:LE0/L;

    invoke-static {v0}, LE0/L$b;->W0(LE0/L$b;)Lmh/l;

    move-result-object v6

    invoke-static {v0}, LE0/L$b;->V0(LE0/L$b;)Lp0/c;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v2}, LE0/L;->K()LE0/c0;

    move-result-object v2

    invoke-static {v0}, LE0/L$b;->Y0(LE0/L$b;)J

    move-result-wide v3

    invoke-static {v0}, LE0/L$b;->Z0(LE0/L$b;)F

    move-result v6

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/layout/t$a;->x(Landroidx/compose/ui/layout/t;JLp0/c;F)V

    goto :goto_3

    :cond_2
    if-nez v6, :cond_3

    invoke-virtual {v2}, LE0/L;->K()LE0/c0;

    move-result-object v2

    invoke-static {v0}, LE0/L$b;->Y0(LE0/L$b;)J

    move-result-wide v3

    invoke-static {v0}, LE0/L$b;->Z0(LE0/L$b;)F

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroidx/compose/ui/layout/t$a;->i(Landroidx/compose/ui/layout/t;JF)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, LE0/L;->K()LE0/c0;

    move-result-object v2

    invoke-static {v0}, LE0/L$b;->Y0(LE0/L$b;)J

    move-result-wide v3

    invoke-static {v0}, LE0/L$b;->Z0(LE0/L$b;)F

    move-result v5

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/layout/t$a;->w(Landroidx/compose/ui/layout/t;JFLmh/l;)V

    :goto_3
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/L$b$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
