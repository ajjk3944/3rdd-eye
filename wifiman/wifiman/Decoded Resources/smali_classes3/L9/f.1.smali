.class public final synthetic LL9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Ly/m;

.field public final synthetic e:Ls/G;

.field public final synthetic f:Lmh/p;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/f;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LL9/f;->b:Z

    iput-object p3, p0, LL9/f;->c:Lmh/a;

    iput-object p4, p0, LL9/f;->d:Ly/m;

    iput-object p5, p0, LL9/f;->e:Ls/G;

    iput-object p6, p0, LL9/f;->f:Lmh/p;

    iput p7, p0, LL9/f;->g:I

    iput p8, p0, LL9/f;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LL9/f;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LL9/f;->b:Z

    iget-object v2, p0, LL9/f;->c:Lmh/a;

    iget-object v3, p0, LL9/f;->d:Ly/m;

    iget-object v4, p0, LL9/f;->e:Ls/G;

    iget-object v5, p0, LL9/f;->f:Lmh/p;

    iget v6, p0, LL9/f;->g:I

    iget v7, p0, LL9/f;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LL9/g;->b(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
