.class public final synthetic LJf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:Ls9/d;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Ls9/d;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJf/h;->a:Landroidx/compose/ui/e;

    iput p2, p0, LJf/h;->b:F

    iput-object p3, p0, LJf/h;->c:Ls9/d;

    iput-object p4, p0, LJf/h;->d:Ls9/d;

    iput-object p5, p0, LJf/h;->e:Ls9/d;

    iput p6, p0, LJf/h;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LJf/h;->a:Landroidx/compose/ui/e;

    iget v1, p0, LJf/h;->b:F

    iget-object v2, p0, LJf/h;->c:Ls9/d;

    iget-object v3, p0, LJf/h;->d:Ls9/d;

    iget-object v4, p0, LJf/h;->e:Ls9/d;

    iget v5, p0, LJf/h;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LJf/i;->a(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
