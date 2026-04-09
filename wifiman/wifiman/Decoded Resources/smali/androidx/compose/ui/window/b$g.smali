.class final Landroidx/compose/ui/window/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;

.field final synthetic b:LY0/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$g;->a:Landroidx/compose/ui/window/k;

    iput-object p2, p0, Landroidx/compose/ui/window/b$g;->b:LY0/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 7

    iget-object p2, p0, Landroidx/compose/ui/window/b$g;->a:Landroidx/compose/ui/window/k;

    iget-object p3, p0, Landroidx/compose/ui/window/b$g;->b:LY0/t;

    invoke-virtual {p2, p3}, Landroidx/compose/ui/window/k;->setParentLayoutDirection(LY0/t;)V

    sget-object v4, Landroidx/compose/ui/window/b$g$a;->a:Landroidx/compose/ui/window/b$g$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p1

    return-object p1
.end method
