.class final LF/h$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/d;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:LL0/U;

.field final synthetic d:Z

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:Lmh/l;

.field final synthetic h:Lmh/l;

.field final synthetic i:I

.field final synthetic j:I


# direct methods
.method constructor <init>(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;II)V
    .locals 0

    iput-object p1, p0, LF/h$c;->a:LL0/d;

    iput-object p2, p0, LF/h$c;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LF/h$c;->c:LL0/U;

    iput-boolean p4, p0, LF/h$c;->d:Z

    iput p5, p0, LF/h$c;->e:I

    iput p6, p0, LF/h$c;->f:I

    iput-object p7, p0, LF/h$c;->g:Lmh/l;

    iput-object p8, p0, LF/h$c;->h:Lmh/l;

    iput p9, p0, LF/h$c;->i:I

    iput p10, p0, LF/h$c;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-object v0, p0, LF/h$c;->a:LL0/d;

    iget-object v1, p0, LF/h$c;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LF/h$c;->c:LL0/U;

    iget-boolean v3, p0, LF/h$c;->d:Z

    iget v4, p0, LF/h$c;->e:I

    iget v5, p0, LF/h$c;->f:I

    iget-object v6, p0, LF/h$c;->g:Lmh/l;

    iget-object v7, p0, LF/h$c;->h:Lmh/l;

    iget p2, p0, LF/h$c;->i:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v9

    iget v10, p0, LF/h$c;->j:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/h$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
