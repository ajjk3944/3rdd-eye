.class final LO5/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO5/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO5/c;


# direct methods
.method constructor <init>(LO5/c;)V
    .locals 0

    iput-object p1, p0, LO5/c$b;->a:LO5/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 5

    iget-object v0, p0, LO5/c$b;->a:LO5/c;

    invoke-virtual {v0}, LO5/c;->i()F

    move-result v0

    add-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, p0, LO5/c$b;->a:LO5/c;

    invoke-virtual {v2}, LO5/c;->h()F

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ly6/g;->a(FF)Lsh/e;

    move-result-object v2

    invoke-static {v1, v2}, Lsh/m;->o(Ljava/lang/Comparable;Lsh/e;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, LO5/c$b;->a:LO5/c;

    invoke-virtual {v2}, LO5/c;->i()F

    move-result v2

    sub-float v2, v1, v2

    iget-object v3, p0, LO5/c$b;->a:LO5/c;

    invoke-virtual {v3}, LO5/c;->i()F

    move-result v4

    add-float/2addr v4, v2

    invoke-static {v3, v4}, LO5/c;->g(LO5/c;F)V

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LO5/c$b;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
