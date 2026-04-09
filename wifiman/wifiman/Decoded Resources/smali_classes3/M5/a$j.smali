.class final LM5/a$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->e(LT/q0;Lmh/a;Lmh/l;Landroid/graphics/RectF;LT/l;I)Lmh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroid/graphics/RectF;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(LT/q0;Lmh/a;Landroid/graphics/RectF;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LM5/a$j;->a:LT/q0;

    iput-object p2, p0, LM5/a$j;->b:Lmh/a;

    iput-object p3, p0, LM5/a$j;->c:Landroid/graphics/RectF;

    iput-object p4, p0, LM5/a$j;->d:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JF)V
    .locals 2

    iget-object v0, p0, LM5/a$j;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    mul-float/2addr v0, p3

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float v1, v1, v0

    if-gtz v1, :cond_0

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    iget-object v1, p0, LM5/a$j;->b:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    add-float/2addr v1, p1

    iget-object p1, p0, LM5/a$j;->c:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, p1

    mul-float/2addr p3, v1

    iget-object p1, p0, LM5/a$j;->a:LT/q0;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, LM5/a$j;->d:Lmh/l;

    sub-float/2addr p3, v1

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, LM5/a$j;->a(JF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
