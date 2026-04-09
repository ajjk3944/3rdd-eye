.class final LF/g$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/g;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/d;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LL0/U;

.field final synthetic d:Lmh/l;

.field final synthetic e:I

.field final synthetic f:Z

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:Ljava/util/Map;

.field final synthetic j:Lm0/y0;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;II)V
    .locals 0

    iput-object p1, p0, LF/g$c;->a:LL0/d;

    iput-object p2, p0, LF/g$c;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LF/g$c;->c:LL0/U;

    iput-object p4, p0, LF/g$c;->d:Lmh/l;

    iput p5, p0, LF/g$c;->e:I

    iput-boolean p6, p0, LF/g$c;->f:Z

    iput p7, p0, LF/g$c;->g:I

    iput p8, p0, LF/g$c;->h:I

    iput-object p9, p0, LF/g$c;->i:Ljava/util/Map;

    iput-object p10, p0, LF/g$c;->j:Lm0/y0;

    iput p11, p0, LF/g$c;->k:I

    iput p12, p0, LF/g$c;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

    iget-object v0, p0, LF/g$c;->a:LL0/d;

    iget-object v1, p0, LF/g$c;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LF/g$c;->c:LL0/U;

    iget-object v3, p0, LF/g$c;->d:Lmh/l;

    iget v4, p0, LF/g$c;->e:I

    iget-boolean v5, p0, LF/g$c;->f:Z

    iget v6, p0, LF/g$c;->g:I

    iget v7, p0, LF/g$c;->h:I

    iget-object v8, p0, LF/g$c;->i:Ljava/util/Map;

    iget-object v9, p0, LF/g$c;->j:Lm0/y0;

    iget p2, p0, LF/g$c;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v11

    iget v12, p0, LF/g$c;->l:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LF/g;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/g$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
