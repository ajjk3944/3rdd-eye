.class public final synthetic LK9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lmh/l;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK9/b;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LK9/b;->b:Z

    iput-boolean p3, p0, LK9/b;->c:Z

    iput-object p4, p0, LK9/b;->d:Lmh/l;

    iput-object p5, p0, LK9/b;->e:Lmh/l;

    iput p6, p0, LK9/b;->f:I

    iput p7, p0, LK9/b;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LK9/b;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LK9/b;->b:Z

    iget-boolean v2, p0, LK9/b;->c:Z

    iget-object v3, p0, LK9/b;->d:Lmh/l;

    iget-object v4, p0, LK9/b;->e:Lmh/l;

    iget v5, p0, LK9/b;->f:I

    iget v6, p0, LK9/b;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LK9/g;->c(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
