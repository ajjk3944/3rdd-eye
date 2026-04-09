.class public abstract LNg/a;
.super LMg/a;
.source "SourceFile"


# static fields
.field private static c:LEj/b;


# instance fields
.field protected b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LNg/a;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LNg/a;->c:LEj/b;

    return-void
.end method

.method public constructor <init>(LLg/l;)V
    .locals 0

    invoke-direct {p0, p1}, LMg/a;-><init>(LLg/l;)V

    const/4 p1, 0x0

    iput p1, p0, LNg/a;->b:I

    return-void
.end method


# virtual methods
.method protected abstract g(LLg/f;)LLg/f;
.end method

.method protected abstract h(LLg/f;)LLg/f;
.end method

.method protected abstract i()Ljava/lang/String;
.end method

.method public j(Ljava/util/Timer;)V
    .locals 7

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->W0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->V0()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v3, 0xe1

    const-wide/16 v5, 0xe1

    move-object v1, p1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->W0()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->V0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, LNg/a;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LNg/a;->b:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    sget-object v0, LNg/a;->c:LEj/b;

    const-string v1, "{}.run() JmDNS {}"

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LNg/a;->i()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, LLg/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLg/f;-><init>(I)V

    invoke-virtual {p0, v0}, LNg/a;->h(LLg/f;)LLg/f;

    move-result-object v0

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1}, LLg/l;->T0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LNg/a;->g(LLg/f;)LLg/f;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {v0}, LLg/e;->n()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v1

    invoke-virtual {v1, v0}, LLg/l;->m1(LLg/f;)V

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v1, LNg/a;->c:LEj/b;

    const-string v2, "{}.run() exception "

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LMg/a;->e()LLg/l;

    move-result-object v0

    invoke-virtual {v0}, LLg/l;->c1()V

    :cond_4
    :goto_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LMg/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LNg/a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
