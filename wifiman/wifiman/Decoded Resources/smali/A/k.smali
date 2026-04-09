.class public final LA/k;
.super LB/o;
.source "SourceFile"

# interfaces
.implements LA/y;


# instance fields
.field private final a:LB/J;

.field private b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 1

    invoke-direct {p0}, LB/o;-><init>()V

    new-instance v0, LB/J;

    invoke-direct {v0}, LB/J;-><init>()V

    iput-object v0, p0, LA/k;->a:LB/J;

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ILmh/l;Lmh/l;Lmh/r;)V
    .locals 2

    invoke-virtual {p0}, LA/k;->g()LB/J;

    move-result-object v0

    new-instance v1, LA/j;

    invoke-direct {v1, p2, p3, p4}, LA/j;-><init>(Lmh/l;Lmh/l;Lmh/r;)V

    invoke-virtual {v0, p1, v1}, LB/J;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c()LB/d;
    .locals 1

    invoke-virtual {p0}, LA/k;->g()LB/J;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LA/k;->b:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public g()LB/J;
    .locals 1

    iget-object v0, p0, LA/k;->a:LB/J;

    return-object v0
.end method
