.class abstract LH8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/l$b$a;,
        LH8/l$b$b;,
        LH8/l$b$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH8/l$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public final b()Ls9/a;
    .locals 1

    invoke-virtual {p0}, LH8/l$b;->e()LH8/l$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH8/l$a;->a()Ls9/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public abstract c()Ls9/d;
.end method

.method protected final d()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LH8/l$b;->e()LH8/l$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH8/l$a;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method protected abstract e()LH8/l$a;
.end method

.method public final f()Ls9/d;
    .locals 2

    invoke-virtual {p0}, LH8/l$b;->e()LH8/l$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH8/l$a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public abstract g()Ls9/d;
.end method
