.class public abstract LN4/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/F$e;,
        LN4/F$d;,
        LN4/F$b;,
        LN4/F$a;,
        LN4/F$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string/jumbo v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LN4/F;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, LN4/F;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static b()LN4/F$b;
    .locals 1

    new-instance v0, LN4/b$b;

    invoke-direct {v0}, LN4/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract c()LN4/F$a;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()LN4/F$d;
.end method

.method public abstract l()I
.end method

.method public abstract m()Ljava/lang/String;
.end method

.method public abstract n()LN4/F$e;
.end method

.method protected abstract o()LN4/F$b;
.end method

.method public p(Ljava/lang/String;)LN4/F;
    .locals 2

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$b;->c(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    invoke-virtual {v1, p1}, LN4/F$e;->p(Ljava/lang/String;)LN4/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$b;->m(LN4/F$e;)LN4/F$b;

    :cond_0
    invoke-virtual {v0}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method

.method public q(LN4/F$a;)LN4/F;
    .locals 1

    if-nez p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$b;->b(LN4/F$a;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public r(Ljava/util/List;)LN4/F;
    .locals 2

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    invoke-virtual {v1, p1}, LN4/F$e;->q(Ljava/util/List;)LN4/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$b;->m(LN4/F$e;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(Ljava/lang/String;)LN4/F;
    .locals 1

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$b;->f(Ljava/lang/String;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)LN4/F;
    .locals 1

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$b;->g(Ljava/lang/String;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method

.method public u(LN4/F$d;)LN4/F;
    .locals 2

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LN4/F$b;->m(LN4/F$e;)LN4/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$b;->j(LN4/F$d;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method

.method public v(JZLjava/lang/String;)LN4/F;
    .locals 2

    invoke-virtual {p0}, LN4/F;->o()LN4/F$b;

    move-result-object v0

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, LN4/F$e;->r(JZLjava/lang/String;)LN4/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$b;->m(LN4/F$e;)LN4/F$b;

    :cond_0
    invoke-virtual {v0}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method
