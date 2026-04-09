.class final LN/V0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0$a;->a(FJJFLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(FLT/q0;)V
    .locals 0

    iput p1, p0, LN/V0$a$a;->a:F

    iput-object p2, p0, LN/V0$a$a;->b:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    invoke-static {p1, p2}, Ll0/m;->i(J)F

    move-result v0

    iget v1, p0, LN/V0$a$a;->a:F

    mul-float/2addr v0, v1

    invoke-static {p1, p2}, Ll0/m;->g(J)F

    move-result p1

    iget p2, p0, LN/V0$a$a;->a:F

    mul-float/2addr p1, p2

    iget-object p2, p0, LN/V0$a$a;->b:LT/q0;

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll0/m;

    invoke-virtual {p2}, Ll0/m;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_0

    iget-object p2, p0, LN/V0$a$a;->b:LT/q0;

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll0/m;

    invoke-virtual {p2}, Ll0/m;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result p2

    cmpg-float p2, p2, p1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, LN/V0$a$a;->b:LT/q0;

    invoke-static {v0, p1}, Ll0/n;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    invoke-interface {p2, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/m;

    invoke-virtual {p1}, Ll0/m;->m()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/V0$a$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
