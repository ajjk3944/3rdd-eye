.class public final synthetic Lrf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/u;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, Lrf/u;->b:Z

    iput-object p3, p0, Lrf/u;->c:Ls9/d;

    iput-object p4, p0, Lrf/u;->d:Ls9/d;

    iput-object p5, p0, Lrf/u;->e:Lmh/l;

    iput p6, p0, Lrf/u;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lrf/u;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, Lrf/u;->b:Z

    iget-object v2, p0, Lrf/u;->c:Ls9/d;

    iget-object v3, p0, Lrf/u;->d:Ls9/d;

    iget-object v4, p0, Lrf/u;->e:Lmh/l;

    iget v5, p0, Lrf/u;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lrf/v;->i(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
