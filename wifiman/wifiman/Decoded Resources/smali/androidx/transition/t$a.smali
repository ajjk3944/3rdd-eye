.class Landroidx/transition/t$a;
.super Landroidx/transition/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/t;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/transition/k;

.field final synthetic b:Landroidx/transition/t;


# direct methods
.method constructor <init>(Landroidx/transition/t;Landroidx/transition/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/t$a;->b:Landroidx/transition/t;

    iput-object p2, p0, Landroidx/transition/t$a;->a:Landroidx/transition/k;

    invoke-direct {p0}, Landroidx/transition/q;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroidx/transition/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/transition/t$a;->a:Landroidx/transition/k;

    invoke-virtual {v0}, Landroidx/transition/k;->f0()V

    invoke-virtual {p1, p0}, Landroidx/transition/k;->a0(Landroidx/transition/k$f;)Landroidx/transition/k;

    return-void
.end method
