.class public final synthetic Lx9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/l;

.field public final synthetic d:Z

.field public final synthetic e:Ly/m;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/e;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, Lx9/e;->b:Z

    iput-object p3, p0, Lx9/e;->c:Lmh/l;

    iput-boolean p4, p0, Lx9/e;->d:Z

    iput-object p5, p0, Lx9/e;->e:Ly/m;

    iput p6, p0, Lx9/e;->f:I

    iput p7, p0, Lx9/e;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lx9/e;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, Lx9/e;->b:Z

    iget-object v2, p0, Lx9/e;->c:Lmh/l;

    iget-boolean v3, p0, Lx9/e;->d:Z

    iget-object v4, p0, Lx9/e;->e:Ly/m;

    iget v5, p0, Lx9/e;->f:I

    iget v6, p0, Lx9/e;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lx9/h;->b(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
