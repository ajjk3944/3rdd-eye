.class final Ljj/e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/e;->a(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljj/i;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Z

.field final synthetic f:Ljava/lang/Integer;

.field final synthetic g:Lmh/r;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;II)V
    .locals 0

    iput-object p1, p0, Ljj/e$a;->a:Ljj/i;

    iput-object p2, p0, Ljj/e$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Ljj/e$a;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Ljj/e$a;->d:Landroidx/compose/ui/e;

    iput-boolean p5, p0, Ljj/e$a;->e:Z

    iput-object p6, p0, Ljj/e$a;->f:Ljava/lang/Integer;

    iput-object p7, p0, Ljj/e$a;->g:Lmh/r;

    iput p8, p0, Ljj/e$a;->h:I

    iput p9, p0, Ljj/e$a;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, Ljj/e$a;->a:Ljj/i;

    iget-object v1, p0, Ljj/e$a;->b:Ljava/lang/Object;

    iget-object v2, p0, Ljj/e$a;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Ljj/e$a;->d:Landroidx/compose/ui/e;

    iget-boolean v4, p0, Ljj/e$a;->e:Z

    iget-object v5, p0, Ljj/e$a;->f:Ljava/lang/Integer;

    iget-object v6, p0, Ljj/e$a;->g:Lmh/r;

    iget p2, p0, Ljj/e$a;->h:I

    or-int/lit8 v8, p2, 0x1

    iget v9, p0, Ljj/e$a;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Ljj/e;->a(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ljj/e$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
