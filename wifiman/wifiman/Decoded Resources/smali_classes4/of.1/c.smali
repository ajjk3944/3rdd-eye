.class public final synthetic Lof/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/c;

.field public final synthetic c:Ls9/a$b;

.field public final synthetic d:Z

.field public final synthetic e:F

.field public final synthetic f:Ls/g;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lof/c;->b:Ls9/c;

    iput-object p3, p0, Lof/c;->c:Ls9/a$b;

    iput-boolean p4, p0, Lof/c;->d:Z

    iput p5, p0, Lof/c;->e:F

    iput-object p6, p0, Lof/c;->f:Ls/g;

    iput p7, p0, Lof/c;->g:I

    iput p8, p0, Lof/c;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lof/c;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lof/c;->b:Ls9/c;

    iget-object v2, p0, Lof/c;->c:Ls9/a$b;

    iget-boolean v3, p0, Lof/c;->d:Z

    iget v4, p0, Lof/c;->e:F

    iget-object v5, p0, Lof/c;->f:Ls/g;

    iget v6, p0, Lof/c;->g:I

    iget v7, p0, Lof/c;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lof/f;->d(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
