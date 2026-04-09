.class final LC/k$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/k;->a(LC/C;LC/A;Lr/z;Lr/i;FLT/l;II)Lw/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:LY0/t;

.field final synthetic c:F


# direct methods
.method constructor <init>(LC/C;LY0/t;F)V
    .locals 0

    iput-object p1, p0, LC/k$a;->a:LC/C;

    iput-object p2, p0, LC/k$a;->b:LY0/t;

    iput p3, p0, LC/k$a;->c:F

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FFF)Ljava/lang/Float;
    .locals 6

    iget-object v0, p0, LC/k$a;->a:LC/C;

    iget-object v1, p0, LC/k$a;->b:LY0/t;

    iget v2, p0, LC/k$a;->c:F

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lx/f;->d(LC/C;LY0/t;FFFF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LC/k$a;->a(FFF)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
