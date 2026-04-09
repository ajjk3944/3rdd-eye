.class public final synthetic Lq9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/c;

.field public final synthetic c:Ls9/a$b;

.field public final synthetic d:F

.field public final synthetic e:Ls/g;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/e;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lq9/e;->b:Ls9/c;

    iput-object p3, p0, Lq9/e;->c:Ls9/a$b;

    iput p4, p0, Lq9/e;->d:F

    iput-object p5, p0, Lq9/e;->e:Ls/g;

    iput p6, p0, Lq9/e;->f:I

    iput p7, p0, Lq9/e;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lq9/e;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lq9/e;->b:Ls9/c;

    iget-object v2, p0, Lq9/e;->c:Ls9/a$b;

    iget v3, p0, Lq9/e;->d:F

    iget-object v4, p0, Lq9/e;->e:Ls/g;

    iget v5, p0, Lq9/e;->f:I

    iget v6, p0, Lq9/e;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lq9/f;->a(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;FLs/g;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
