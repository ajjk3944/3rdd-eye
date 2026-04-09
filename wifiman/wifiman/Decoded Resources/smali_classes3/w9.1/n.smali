.class public final synthetic Lw9/n;
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

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lw9/l;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;Lw9/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/n;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/n;->b:Lmh/a;

    iput-boolean p3, p0, Lw9/n;->c:Z

    iput-boolean p4, p0, Lw9/n;->d:Z

    iput-object p5, p0, Lw9/n;->e:Ls9/b;

    iput-object p6, p0, Lw9/n;->f:Ljava/lang/String;

    iput-object p7, p0, Lw9/n;->g:Lw9/l;

    iput p8, p0, Lw9/n;->h:I

    iput p9, p0, Lw9/n;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lw9/n;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lw9/n;->b:Lmh/a;

    iget-boolean v2, p0, Lw9/n;->c:Z

    iget-boolean v3, p0, Lw9/n;->d:Z

    iget-object v4, p0, Lw9/n;->e:Ls9/b;

    iget-object v5, p0, Lw9/n;->f:Ljava/lang/String;

    iget-object v6, p0, Lw9/n;->g:Lw9/l;

    iget v7, p0, Lw9/n;->h:I

    iget v8, p0, Lw9/n;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lw9/o;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;Lw9/l;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
