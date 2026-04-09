.class final LE0/L$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L$a;->R1(JFLmh/l;Lp0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/L;

.field final synthetic b:LE0/m0;

.field final synthetic c:J


# direct methods
.method constructor <init>(LE0/L;LE0/m0;J)V
    .locals 0

    iput-object p1, p0, LE0/L$a$c;->a:LE0/L;

    iput-object p2, p0, LE0/L$a$c;->b:LE0/m0;

    iput-wide p3, p0, LE0/L$a$c;->c:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, LE0/L$a$c;->a:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/M;->a(LE0/G;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/L$a$c;->a:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/L$a$c;->a:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    iget-object v0, p0, LE0/L$a$c;->b:LE0/m0;

    invoke-interface {v0}, LE0/m0;->getPlacementScope()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    :cond_2
    move-object v2, v1

    iget-object v0, p0, LE0/L$a$c;->a:LE0/L;

    iget-wide v4, p0, LE0/L$a$c;->c:J

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/L$a$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
