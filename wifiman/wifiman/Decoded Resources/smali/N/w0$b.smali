.class final LN/w0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/w0;->a(ZLmh/a;Landroidx/compose/ui/e;ZLy/m;LN/u0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Z

.field final synthetic e:Ly/m;

.field final synthetic f:LN/u0;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(ZLmh/a;Landroidx/compose/ui/e;ZLy/m;LN/u0;II)V
    .locals 0

    iput-boolean p1, p0, LN/w0$b;->a:Z

    iput-object p2, p0, LN/w0$b;->b:Lmh/a;

    iput-object p3, p0, LN/w0$b;->c:Landroidx/compose/ui/e;

    iput-boolean p4, p0, LN/w0$b;->d:Z

    iput-object p5, p0, LN/w0$b;->e:Ly/m;

    iput-object p6, p0, LN/w0$b;->f:LN/u0;

    iput p7, p0, LN/w0$b;->g:I

    iput p8, p0, LN/w0$b;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-boolean v0, p0, LN/w0$b;->a:Z

    iget-object v1, p0, LN/w0$b;->b:Lmh/a;

    iget-object v2, p0, LN/w0$b;->c:Landroidx/compose/ui/e;

    iget-boolean v3, p0, LN/w0$b;->d:Z

    iget-object v4, p0, LN/w0$b;->e:Ly/m;

    iget-object v5, p0, LN/w0$b;->f:LN/u0;

    iget p2, p0, LN/w0$b;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, LN/w0$b;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LN/w0;->a(ZLmh/a;Landroidx/compose/ui/e;ZLy/m;LN/u0;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/w0$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
