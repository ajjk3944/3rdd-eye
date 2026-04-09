.class final LN/T0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/T0;->a(ZZLy/k;LN/S0;Lm0/i1;FFLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/T0;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Ly/k;

.field final synthetic e:LN/S0;

.field final synthetic f:Lm0/i1;

.field final synthetic g:F

.field final synthetic h:F

.field final synthetic i:I

.field final synthetic j:I


# direct methods
.method constructor <init>(LN/T0;ZZLy/k;LN/S0;Lm0/i1;FFII)V
    .locals 0

    iput-object p1, p0, LN/T0$a;->a:LN/T0;

    iput-boolean p2, p0, LN/T0$a;->b:Z

    iput-boolean p3, p0, LN/T0$a;->c:Z

    iput-object p4, p0, LN/T0$a;->d:Ly/k;

    iput-object p5, p0, LN/T0$a;->e:LN/S0;

    iput-object p6, p0, LN/T0$a;->f:Lm0/i1;

    iput p7, p0, LN/T0$a;->g:F

    iput p8, p0, LN/T0$a;->h:F

    iput p9, p0, LN/T0$a;->i:I

    iput p10, p0, LN/T0$a;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-object v0, p0, LN/T0$a;->a:LN/T0;

    iget-boolean v1, p0, LN/T0$a;->b:Z

    iget-boolean v2, p0, LN/T0$a;->c:Z

    iget-object v3, p0, LN/T0$a;->d:Ly/k;

    iget-object v4, p0, LN/T0$a;->e:LN/S0;

    iget-object v5, p0, LN/T0$a;->f:Lm0/i1;

    iget v6, p0, LN/T0$a;->g:F

    iget v7, p0, LN/T0$a;->h:F

    iget p2, p0, LN/T0$a;->i:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v9

    iget v10, p0, LN/T0$a;->j:I

    move-object v8, p1

    invoke-virtual/range {v0 .. v10}, LN/T0;->a(ZZLy/k;LN/S0;Lm0/i1;FFLT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/T0$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
