.class public final synthetic Lw9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmh/a;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Ls9/b;

.field public final synthetic f:Lw9/h;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lz/c$e;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/j;->b:Lmh/a;

    iput-boolean p3, p0, Lw9/j;->c:Z

    iput-boolean p4, p0, Lw9/j;->d:Z

    iput-object p5, p0, Lw9/j;->e:Ls9/b;

    iput-object p6, p0, Lw9/j;->f:Lw9/h;

    iput-object p7, p0, Lw9/j;->g:Ljava/lang/String;

    iput-object p8, p0, Lw9/j;->h:Lz/c$e;

    iput p9, p0, Lw9/j;->i:I

    iput p10, p0, Lw9/j;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lw9/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lw9/j;->b:Lmh/a;

    iget-boolean v2, p0, Lw9/j;->c:Z

    iget-boolean v3, p0, Lw9/j;->d:Z

    iget-object v4, p0, Lw9/j;->e:Ls9/b;

    iget-object v5, p0, Lw9/j;->f:Lw9/h;

    iget-object v6, p0, Lw9/j;->g:Ljava/lang/String;

    iget-object v7, p0, Lw9/j;->h:Lz/c$e;

    iget v8, p0, Lw9/j;->i:I

    iget v9, p0, Lw9/j;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lw9/k;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
