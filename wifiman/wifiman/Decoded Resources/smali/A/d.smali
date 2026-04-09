.class public final LA/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/c;


# instance fields
.field private a:LT/n0;

.field private b:LT/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    invoke-static {v0}, LT/f1;->a(I)LT/n0;

    move-result-object v1

    iput-object v1, p0, LA/d;->a:LT/n0;

    invoke-static {v0}, LT/f1;->a(I)LT/n0;

    move-result-object v0

    iput-object v0, p0, LA/d;->b:LT/n0;

    return-void
.end method


# virtual methods
.method public c(Landroidx/compose/ui/e;Lr/H;Lr/H;Lr/H;)Landroidx/compose/ui/e;
    .locals 1

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;

    invoke-direct {v0, p2, p3, p4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;-><init>(Lr/H;Lr/H;Lr/H;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final d(II)V
    .locals 1

    iget-object v0, p0, LA/d;->a:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    iget-object p1, p0, LA/d;->b:LT/n0;

    invoke-interface {p1, p2}, LT/n0;->l(I)V

    return-void
.end method
