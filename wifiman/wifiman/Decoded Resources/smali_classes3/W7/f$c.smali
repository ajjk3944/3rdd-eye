.class final LW7/f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW7/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW7/f;


# direct methods
.method constructor <init>(LW7/f;)V
    .locals 0

    iput-object p1, p0, LW7/f$c;->a:LW7/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 3

    iget-object v0, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v0}, LW7/f;->d()I

    move-result v0

    iget-object v1, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v1}, LW7/f;->b()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v0}, LW7/f;->c()I

    move-result v0

    iget-object v1, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v1}, LW7/f;->b()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    iget-object v0, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v0}, LW7/f;->b()I

    move-result v0

    iget-object v1, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v1}, LW7/f;->d()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget-object v1, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v1}, LW7/f;->c()I

    move-result v1

    iget-object v2, p0, LW7/f$c;->a:LW7/f;

    invoke-virtual {v2}, LW7/f;->d()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW7/f$c;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
