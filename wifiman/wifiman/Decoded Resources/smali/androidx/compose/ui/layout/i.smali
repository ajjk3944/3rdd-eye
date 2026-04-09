.class final Landroidx/compose/ui/layout/i;
.super Landroidx/compose/ui/layout/t$a;
.source "SourceFile"


# instance fields
.field private final b:LE0/P;


# direct methods
.method public constructor <init>(LE0/P;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/layout/t$a;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/i;->b:LE0/P;

    return-void
.end method


# virtual methods
.method protected d()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/i;->b:LE0/P;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method protected e()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/i;->b:LE0/P;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v0

    return v0
.end method
