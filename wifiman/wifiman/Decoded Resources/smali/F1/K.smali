.class public final LF1/K;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF1/K$b;,
        LF1/K$c;,
        LF1/K$a;
    }
.end annotation


# instance fields
.field private final a:LF1/K$c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LF1/K$b;

    invoke-direct {v0, p1}, LF1/K$b;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LF1/K;->a:LF1/K$c;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, LF1/K$a;

    invoke-direct {v0, p1}, LF1/K$a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LF1/K;->a:LF1/K$c;

    :goto_0
    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LF1/K$b;

    invoke-direct {v0, p1}, LF1/K$b;-><init>(Landroid/view/WindowInsetsController;)V

    iput-object v0, p0, LF1/K;->a:LF1/K$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LF1/K;->a:LF1/K$c;

    invoke-virtual {v0}, LF1/K$c;->a()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LF1/K;->a:LF1/K$c;

    invoke-virtual {v0}, LF1/K$c;->b()V

    return-void
.end method
