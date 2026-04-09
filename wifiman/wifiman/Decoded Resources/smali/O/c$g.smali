.class final LO/c$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/c;->d(ZLO/g;Landroidx/compose/ui/e;JJZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LO/g;


# direct methods
.method constructor <init>(ZLO/g;)V
    .locals 0

    iput-boolean p1, p0, LO/c$g;->a:Z

    iput-object p2, p0, LO/c$g;->b:LO/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-boolean v0, p0, LO/c$g;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LO/c$g;->b:LO/g;

    invoke-virtual {v0}, LO/g;->i()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO/c$g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
