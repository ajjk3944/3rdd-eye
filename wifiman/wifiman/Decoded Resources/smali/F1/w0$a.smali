.class public final LF1/w0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LF1/w0$e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LF1/w0$d;

    invoke-direct {v0}, LF1/w0$d;-><init>()V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LF1/w0$c;

    invoke-direct {v0}, LF1/w0$c;-><init>()V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, LF1/w0$b;

    invoke-direct {v0}, LF1/w0$b;-><init>()V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    :goto_0
    return-void
.end method

.method public constructor <init>(LF1/w0;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 8
    new-instance v0, LF1/w0$d;

    invoke-direct {v0, p1}, LF1/w0$d;-><init>(LF1/w0;)V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 9
    new-instance v0, LF1/w0$c;

    invoke-direct {v0, p1}, LF1/w0$c;-><init>(LF1/w0;)V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    goto :goto_0

    .line 10
    :cond_1
    new-instance v0, LF1/w0$b;

    invoke-direct {v0, p1}, LF1/w0$b;-><init>(LF1/w0;)V

    iput-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    invoke-virtual {v0}, LF1/w0$e;->b()LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method public b(ILw1/f;)LF1/w0$a;
    .locals 1

    iget-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    invoke-virtual {v0, p1, p2}, LF1/w0$e;->c(ILw1/f;)V

    return-object p0
.end method

.method public c(Lw1/f;)LF1/w0$a;
    .locals 1

    iget-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    invoke-virtual {v0, p1}, LF1/w0$e;->e(Lw1/f;)V

    return-object p0
.end method

.method public d(Lw1/f;)LF1/w0$a;
    .locals 1

    iget-object v0, p0, LF1/w0$a;->a:LF1/w0$e;

    invoke-virtual {v0, p1}, LF1/w0$e;->g(Lw1/f;)V

    return-object p0
.end method
