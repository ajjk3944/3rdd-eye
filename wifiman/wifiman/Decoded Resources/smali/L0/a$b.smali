.class final LL0/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/a;->n(Ll0/i;ILL0/J;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/J;


# direct methods
.method constructor <init>(LL0/J;)V
    .locals 0

    iput-object p1, p0, LL0/a$b;->a:LL0/J;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LL0/a$b;->a:LL0/J;

    invoke-static {p1}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object p1

    invoke-static {p2}, Lm0/b1;->f(Landroid/graphics/RectF;)Ll0/i;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LL0/J;->a(Ll0/i;Ll0/i;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/graphics/RectF;

    check-cast p2, Landroid/graphics/RectF;

    invoke-virtual {p0, p1, p2}, LL0/a$b;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
