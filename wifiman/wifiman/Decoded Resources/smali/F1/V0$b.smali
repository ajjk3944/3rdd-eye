.class abstract LF1/V0$b;
.super LF1/V0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/V0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Window;LF1/K;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF1/V0$a;-><init>(Landroid/view/Window;LF1/K;)V

    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 1

    const/16 v0, 0x2000

    if-eqz p1, :cond_0

    const/high16 p1, 0x4000000

    invoke-virtual {p0, p1}, LF1/V0$a;->h(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, LF1/V0$a;->e(I)V

    invoke-virtual {p0, v0}, LF1/V0$a;->d(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LF1/V0$a;->g(I)V

    :goto_0
    return-void
.end method
