.class public final synthetic Lw9/m;
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

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/m;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/m;->b:Lmh/a;

    iput-boolean p3, p0, Lw9/m;->c:Z

    iput-boolean p4, p0, Lw9/m;->d:Z

    iput-object p5, p0, Lw9/m;->e:Ls9/b;

    iput-object p6, p0, Lw9/m;->f:Ljava/lang/String;

    iput p7, p0, Lw9/m;->g:I

    iput p8, p0, Lw9/m;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lw9/m;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lw9/m;->b:Lmh/a;

    iget-boolean v2, p0, Lw9/m;->c:Z

    iget-boolean v3, p0, Lw9/m;->d:Z

    iget-object v4, p0, Lw9/m;->e:Ls9/b;

    iget-object v5, p0, Lw9/m;->f:Ljava/lang/String;

    iget v6, p0, Lw9/m;->g:I

    iget v7, p0, Lw9/m;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lw9/o;->a(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
