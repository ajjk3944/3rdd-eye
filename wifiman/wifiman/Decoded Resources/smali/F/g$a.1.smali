.class final LF/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/g;->b(Ljava/lang/String;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILm0/y0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LL0/U;

.field final synthetic d:Lmh/l;

.field final synthetic e:I

.field final synthetic f:Z

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:Lm0/y0;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILm0/y0;II)V
    .locals 0

    iput-object p1, p0, LF/g$a;->a:Ljava/lang/String;

    iput-object p2, p0, LF/g$a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LF/g$a;->c:LL0/U;

    iput-object p4, p0, LF/g$a;->d:Lmh/l;

    iput p5, p0, LF/g$a;->e:I

    iput-boolean p6, p0, LF/g$a;->f:Z

    iput p7, p0, LF/g$a;->g:I

    iput p8, p0, LF/g$a;->h:I

    iput-object p9, p0, LF/g$a;->i:Lm0/y0;

    iput p10, p0, LF/g$a;->j:I

    iput p11, p0, LF/g$a;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    iget-object v0, p0, LF/g$a;->a:Ljava/lang/String;

    iget-object v1, p0, LF/g$a;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LF/g$a;->c:LL0/U;

    iget-object v3, p0, LF/g$a;->d:Lmh/l;

    iget v4, p0, LF/g$a;->e:I

    iget-boolean v5, p0, LF/g$a;->f:Z

    iget v6, p0, LF/g$a;->g:I

    iget v7, p0, LF/g$a;->h:I

    iget-object v8, p0, LF/g$a;->i:Lm0/y0;

    iget p2, p0, LF/g$a;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    iget v11, p0, LF/g$a;->k:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LF/g;->b(Ljava/lang/String;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILm0/y0;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/g$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
