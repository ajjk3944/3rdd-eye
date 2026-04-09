.class public final LV6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/S0;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LV6/b;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LV6/b;Z)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/x;->a:Landroid/content/Context;

    iput-object p2, p0, LV6/x;->b:LV6/b;

    iput-boolean p3, p0, LV6/x;->c:Z

    return-void
.end method


# virtual methods
.method public final a()LV6/b;
    .locals 1

    iget-object v0, p0, LV6/x;->b:LV6/b;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, LV6/x;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LV6/x;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object v0

    iget-object v1, p0, LV6/x;->b:LV6/b;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->p(LT2/d;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, LV6/x;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LV6/x;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object v0

    iget-object v1, p0, LV6/x;->b:LV6/b;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->p(LT2/d;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
