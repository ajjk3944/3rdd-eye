.class LK6/l0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:LJ5/c;

.field final b:LJ5/c;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LJ5/c;->l1()LJ5/c;

    move-result-object v0

    iput-object v0, p0, LK6/l0$c;->a:LJ5/c;

    invoke-static {}, LJ5/c;->l1()LJ5/c;

    move-result-object v0

    iput-object v0, p0, LK6/l0$c;->b:LJ5/c;

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-object v0, p0, LK6/l0$c;->a:LJ5/c;

    invoke-virtual {v0}, LJ5/c;->i1()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LK6/l0$c;->b:LJ5/c;

    invoke-virtual {v0}, LJ5/c;->i1()Z

    move-result v0

    if-eqz v0, :cond_0

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
