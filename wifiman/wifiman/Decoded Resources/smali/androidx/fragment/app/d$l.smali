.class abstract Landroidx/fragment/app/d$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/K$e;

.field private final b:LA1/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/K$e;LA1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/d$l;->a:Landroidx/fragment/app/K$e;

    iput-object p2, p0, Landroidx/fragment/app/d$l;->b:LA1/e;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d$l;->a:Landroidx/fragment/app/K$e;

    iget-object v1, p0, Landroidx/fragment/app/d$l;->b:LA1/e;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/K$e;->d(LA1/e;)V

    return-void
.end method

.method b()Landroidx/fragment/app/K$e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d$l;->a:Landroidx/fragment/app/K$e;

    return-object v0
.end method

.method c()LA1/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d$l;->b:LA1/e;

    return-object v0
.end method

.method d()Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d$l;->a:Landroidx/fragment/app/K$e;

    invoke-virtual {v0}, Landroidx/fragment/app/K$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-static {v0}, Landroidx/fragment/app/K$e$c;->from(Landroid/view/View;)Landroidx/fragment/app/K$e$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/d$l;->a:Landroidx/fragment/app/K$e;

    invoke-virtual {v1}, Landroidx/fragment/app/K$e;->e()Landroidx/fragment/app/K$e$c;

    move-result-object v1

    if-eq v0, v1, :cond_1

    sget-object v2, Landroidx/fragment/app/K$e$c;->VISIBLE:Landroidx/fragment/app/K$e$c;

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
