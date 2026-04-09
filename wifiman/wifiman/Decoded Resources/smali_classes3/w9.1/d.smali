.class public final synthetic Lw9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lw9/c;

.field public final synthetic c:Ls9/b;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lmh/a;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/d;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/d;->b:Lw9/c;

    iput-object p3, p0, Lw9/d;->c:Ls9/b;

    iput-object p4, p0, Lw9/d;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lw9/d;->e:Z

    iput-boolean p6, p0, Lw9/d;->f:Z

    iput-object p7, p0, Lw9/d;->g:Lmh/a;

    iput p8, p0, Lw9/d;->h:I

    iput p9, p0, Lw9/d;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lw9/d;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lw9/d;->b:Lw9/c;

    iget-object v2, p0, Lw9/d;->c:Ls9/b;

    iget-object v3, p0, Lw9/d;->d:Ljava/lang/String;

    iget-boolean v4, p0, Lw9/d;->e:Z

    iget-boolean v5, p0, Lw9/d;->f:Z

    iget-object v6, p0, Lw9/d;->g:Lmh/a;

    iget v7, p0, Lw9/d;->h:I

    iget v8, p0, Lw9/d;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lw9/e;->a(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
