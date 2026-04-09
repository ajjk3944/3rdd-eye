.class public final synthetic Lw9/q;
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

.field public final synthetic f:Lw9/p;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LL0/U;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/q;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/q;->b:Lmh/a;

    iput-boolean p3, p0, Lw9/q;->c:Z

    iput-boolean p4, p0, Lw9/q;->d:Z

    iput-object p5, p0, Lw9/q;->e:Ls9/b;

    iput-object p6, p0, Lw9/q;->f:Lw9/p;

    iput-object p7, p0, Lw9/q;->g:Ljava/lang/String;

    iput-object p8, p0, Lw9/q;->h:LL0/U;

    iput p9, p0, Lw9/q;->i:I

    iput p10, p0, Lw9/q;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lw9/q;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lw9/q;->b:Lmh/a;

    iget-boolean v2, p0, Lw9/q;->c:Z

    iget-boolean v3, p0, Lw9/q;->d:Z

    iget-object v4, p0, Lw9/q;->e:Ls9/b;

    iget-object v5, p0, Lw9/q;->f:Lw9/p;

    iget-object v6, p0, Lw9/q;->g:Ljava/lang/String;

    iget-object v7, p0, Lw9/q;->h:LL0/U;

    iget v8, p0, Lw9/q;->i:I

    iget v9, p0, Lw9/q;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lw9/r;->a(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
