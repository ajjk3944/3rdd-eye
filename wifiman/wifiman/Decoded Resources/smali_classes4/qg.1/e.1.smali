.class public final Lqg/e;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/e$c;,
        Lqg/e$b;,
        Lqg/e$a;
    }
.end annotation


# instance fields
.field final b:[LDj/a;

.field final c:Ljava/lang/Iterable;

.field final d:Lkg/n;

.field final e:I

.field final f:Z


# direct methods
.method public constructor <init>([LDj/a;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/e;->b:[LDj/a;

    const/4 p1, 0x0

    iput-object p1, p0, Lqg/e;->c:Ljava/lang/Iterable;

    iput-object p2, p0, Lqg/e;->d:Lkg/n;

    iput p3, p0, Lqg/e;->e:I

    iput-boolean p4, p0, Lqg/e;->f:Z

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 9

    iget-object v0, p0, Lqg/e;->b:[LDj/a;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/16 v0, 0x8

    new-array v0, v0, [LDj/a;

    :try_start_0
    iget-object v2, p0, Lqg/e;->c:Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LDj/a;

    array-length v5, v0

    if-ne v3, v5, :cond_0

    shr-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v3

    new-array v5, v5, [LDj/a;

    invoke-static {v0, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v5

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_1
    add-int/lit8 v5, v3, 0x1

    const-string v6, "The Iterator returned a null Publisher"

    invoke-static {v4, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v4, LDj/a;

    aput-object v4, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v5

    goto :goto_0

    :cond_1
    :goto_2
    move v8, v3

    goto :goto_4

    :goto_3
    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void

    :cond_2
    array-length v3, v0

    goto :goto_2

    :goto_4
    if-nez v8, :cond_3

    invoke-static {p1}, Lyg/d;->complete(LDj/b;)V

    return-void

    :cond_3
    const/4 v2, 0x1

    if-ne v8, v2, :cond_4

    aget-object v0, v0, v1

    new-instance v1, Lqg/O$b;

    new-instance v2, Lqg/e$c;

    invoke-direct {v2, p0}, Lqg/e$c;-><init>(Lqg/e;)V

    invoke-direct {v1, p1, v2}, Lqg/O$b;-><init>(LDj/b;Lkg/n;)V

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    return-void

    :cond_4
    new-instance v1, Lqg/e$a;

    iget-object v4, p0, Lqg/e;->d:Lkg/n;

    iget v6, p0, Lqg/e;->e:I

    iget-boolean v7, p0, Lqg/e;->f:Z

    move-object v2, v1

    move-object v3, p1

    move v5, v8

    invoke-direct/range {v2 .. v7}, Lqg/e$a;-><init>(LDj/b;Lkg/n;IIZ)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v1, v0, v8}, Lqg/e$a;->t([LDj/a;I)V

    return-void
.end method
