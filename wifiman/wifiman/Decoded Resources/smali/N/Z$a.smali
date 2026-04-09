.class final LN/Z$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Ly/m;

.field final synthetic e:Lmh/p;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;II)V
    .locals 0

    iput-object p1, p0, LN/Z$a;->a:Lmh/a;

    iput-object p2, p0, LN/Z$a;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LN/Z$a;->c:Z

    iput-object p4, p0, LN/Z$a;->d:Ly/m;

    iput-object p5, p0, LN/Z$a;->e:Lmh/p;

    iput p6, p0, LN/Z$a;->f:I

    iput p7, p0, LN/Z$a;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, LN/Z$a;->a:Lmh/a;

    iget-object v1, p0, LN/Z$a;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LN/Z$a;->c:Z

    iget-object v3, p0, LN/Z$a;->d:Ly/m;

    iget-object v4, p0, LN/Z$a;->e:Lmh/p;

    iget p2, p0, LN/Z$a;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, LN/Z$a;->g:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/Z$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
