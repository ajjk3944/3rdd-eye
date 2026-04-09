.class public final synthetic LJ9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LJ9/j;

.field public final synthetic c:Z

.field public final synthetic d:LJ9/i;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ9/d;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LJ9/d;->b:LJ9/j;

    iput-boolean p3, p0, LJ9/d;->c:Z

    iput-object p4, p0, LJ9/d;->d:LJ9/i;

    iput-object p5, p0, LJ9/d;->e:Lmh/l;

    iput p6, p0, LJ9/d;->f:I

    iput p7, p0, LJ9/d;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LJ9/d;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LJ9/d;->b:LJ9/j;

    iget-boolean v2, p0, LJ9/d;->c:Z

    iget-object v3, p0, LJ9/d;->d:LJ9/i;

    iget-object v4, p0, LJ9/d;->e:Lmh/l;

    iget v5, p0, LJ9/d;->f:I

    iget v6, p0, LJ9/d;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LJ9/h;->c(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
