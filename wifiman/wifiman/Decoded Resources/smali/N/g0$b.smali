.class final LN/g0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/g0;->a(LN/m;LN/c1;LN/F0;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/m;

.field final synthetic b:LN/c1;

.field final synthetic c:LN/F0;

.field final synthetic d:Lmh/p;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(LN/m;LN/c1;LN/F0;Lmh/p;II)V
    .locals 0

    iput-object p1, p0, LN/g0$b;->a:LN/m;

    iput-object p2, p0, LN/g0$b;->b:LN/c1;

    iput-object p3, p0, LN/g0$b;->c:LN/F0;

    iput-object p4, p0, LN/g0$b;->d:Lmh/p;

    iput p5, p0, LN/g0$b;->e:I

    iput p6, p0, LN/g0$b;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    iget-object v0, p0, LN/g0$b;->a:LN/m;

    iget-object v1, p0, LN/g0$b;->b:LN/c1;

    iget-object v2, p0, LN/g0$b;->c:LN/F0;

    iget-object v3, p0, LN/g0$b;->d:Lmh/p;

    iget p2, p0, LN/g0$b;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    iget v6, p0, LN/g0$b;->f:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LN/g0;->a(LN/m;LN/c1;LN/F0;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/g0$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
