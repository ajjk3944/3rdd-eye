.class final Landroidx/compose/ui/layout/s;
.super Landroidx/compose/ui/layout/t$a;
.source "SourceFile"


# instance fields
.field private final b:LE0/m0;


# direct methods
.method public constructor <init>(LE0/m0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/layout/t$a;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/s;->b:LE0/m0;

    return-void
.end method


# virtual methods
.method protected d()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/s;->b:LE0/m0;

    invoke-interface {v0}, LE0/m0;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/s;->b:LE0/m0;

    invoke-interface {v0}, LE0/m0;->getRoot()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->t0()I

    move-result v0

    return v0
.end method
