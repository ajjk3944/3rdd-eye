.class public abstract LN4/F$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/F$e$b;,
        LN4/F$e$a;,
        LN4/F$e$f;,
        LN4/F$e$d;,
        LN4/F$e$c;,
        LN4/F$e$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LN4/F$e$b;
    .locals 2

    new-instance v0, LN4/h$b;

    invoke-direct {v0}, LN4/h$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LN4/h$b;->d(Z)LN4/F$e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()LN4/F$e$a;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()LN4/F$e$c;
.end method

.method public abstract e()Ljava/lang/Long;
.end method

.method public abstract f()Ljava/util/List;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()I
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public j()[B
    .locals 2

    invoke-virtual {p0}, LN4/F$e;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LN4/F;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract k()LN4/F$e$e;
.end method

.method public abstract l()J
.end method

.method public abstract m()LN4/F$e$f;
.end method

.method public abstract n()Z
.end method

.method public abstract o()LN4/F$e$b;
.end method

.method p(Ljava/lang/String;)LN4/F$e;
    .locals 1

    invoke-virtual {p0}, LN4/F$e;->o()LN4/F$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$b;->c(Ljava/lang/String;)LN4/F$e$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$b;->a()LN4/F$e;

    move-result-object p1

    return-object p1
.end method

.method q(Ljava/util/List;)LN4/F$e;
    .locals 1

    invoke-virtual {p0}, LN4/F$e;->o()LN4/F$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$b;->g(Ljava/util/List;)LN4/F$e$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$b;->a()LN4/F$e;

    move-result-object p1

    return-object p1
.end method

.method r(JZLjava/lang/String;)LN4/F$e;
    .locals 1

    invoke-virtual {p0}, LN4/F$e;->o()LN4/F$e$b;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$e$b;->f(Ljava/lang/Long;)LN4/F$e$b;

    invoke-virtual {v0, p3}, LN4/F$e$b;->d(Z)LN4/F$e$b;

    if-eqz p4, :cond_0

    invoke-static {}, LN4/F$e$f;->a()LN4/F$e$f$a;

    move-result-object p1

    invoke-virtual {p1, p4}, LN4/F$e$f$a;->b(Ljava/lang/String;)LN4/F$e$f$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$f$a;->a()LN4/F$e$f;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$e$b;->n(LN4/F$e$f;)LN4/F$e$b;

    :cond_0
    invoke-virtual {v0}, LN4/F$e$b;->a()LN4/F$e;

    move-result-object p1

    return-object p1
.end method
