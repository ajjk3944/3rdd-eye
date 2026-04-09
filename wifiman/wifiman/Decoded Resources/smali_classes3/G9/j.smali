.class public final synthetic LG9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LL0/d;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LL0/d;ZIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LG9/j;->b:LL0/d;

    iput-boolean p3, p0, LG9/j;->c:Z

    iput p4, p0, LG9/j;->d:I

    iput p5, p0, LG9/j;->e:I

    iput p6, p0, LG9/j;->f:I

    iput p7, p0, LG9/j;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LG9/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LG9/j;->b:LL0/d;

    iget-boolean v2, p0, LG9/j;->c:Z

    iget v3, p0, LG9/j;->d:I

    iget v4, p0, LG9/j;->e:I

    iget v5, p0, LG9/j;->f:I

    iget v6, p0, LG9/j;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LG9/k;->a(Landroidx/compose/ui/e;LL0/d;ZIIIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
