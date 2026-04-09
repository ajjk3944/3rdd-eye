.class public final synthetic LL9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/layout/t;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Landroidx/compose/ui/layout/t;

.field public final synthetic e:I

.field public final synthetic f:Landroidx/compose/ui/layout/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/v;->a:Landroidx/compose/ui/layout/t;

    iput p2, p0, LL9/v;->b:I

    iput p3, p0, LL9/v;->c:I

    iput-object p4, p0, LL9/v;->d:Landroidx/compose/ui/layout/t;

    iput p5, p0, LL9/v;->e:I

    iput-object p6, p0, LL9/v;->f:Landroidx/compose/ui/layout/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LL9/v;->a:Landroidx/compose/ui/layout/t;

    iget v1, p0, LL9/v;->b:I

    iget v2, p0, LL9/v;->c:I

    iget-object v3, p0, LL9/v;->d:Landroidx/compose/ui/layout/t;

    iget v4, p0, LL9/v;->e:I

    iget-object v5, p0, LL9/v;->f:Landroidx/compose/ui/layout/t;

    move-object v6, p1

    check-cast v6, Landroidx/compose/ui/layout/t$a;

    invoke-static/range {v0 .. v6}, LL9/q$d$d;->a(Landroidx/compose/ui/layout/t;IILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
