.class final LN/V0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0;->b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:LL0/U;

.field final synthetic c:Ljava/lang/Float;

.field final synthetic d:Lmh/p;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(JLL0/U;Ljava/lang/Float;Lmh/p;II)V
    .locals 0

    iput-wide p1, p0, LN/V0$d;->a:J

    iput-object p3, p0, LN/V0$d;->b:LL0/U;

    iput-object p4, p0, LN/V0$d;->c:Ljava/lang/Float;

    iput-object p5, p0, LN/V0$d;->d:Lmh/p;

    iput p6, p0, LN/V0$d;->e:I

    iput p7, p0, LN/V0$d;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-wide v0, p0, LN/V0$d;->a:J

    iget-object v2, p0, LN/V0$d;->b:LL0/U;

    iget-object v3, p0, LN/V0$d;->c:Ljava/lang/Float;

    iget-object v4, p0, LN/V0$d;->d:Lmh/p;

    iget p2, p0, LN/V0$d;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, LN/V0$d;->f:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LN/V0;->b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/V0$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
