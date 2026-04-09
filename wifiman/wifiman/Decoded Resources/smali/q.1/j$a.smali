.class final Lq/j$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lr/H;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lmh/q;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, Lq/j$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lq/j$a;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Lq/j$a;->c:Lr/H;

    iput-object p4, p0, Lq/j$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lq/j$a;->e:Lmh/q;

    iput p6, p0, Lq/j$a;->f:I

    iput p7, p0, Lq/j$a;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, Lq/j$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lq/j$a;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lq/j$a;->c:Lr/H;

    iget-object v3, p0, Lq/j$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lq/j$a;->e:Lmh/q;

    iget p2, p0, Lq/j$a;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, Lq/j$a;->g:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq/j$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
