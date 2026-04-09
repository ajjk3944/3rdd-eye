.class public final Ltg/b;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/b$b;,
        Ltg/b$a;
    }
.end annotation


# instance fields
.field final a:[Lgg/v;

.field final b:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>([Lgg/v;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/b;->a:[Lgg/v;

    iput-object p2, p0, Ltg/b;->b:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 6

    iget-object v0, p0, Ltg/b;->a:[Lgg/v;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/16 v0, 0x8

    new-array v0, v0, [Lgg/v;

    :try_start_0
    iget-object v2, p0, Ltg/b;->b:Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgg/v;

    if-nez v4, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "One of the sources is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    array-length v5, v0

    if-ne v3, v5, :cond_1

    shr-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v3

    new-array v5, v5, [Lgg/v;

    invoke-static {v0, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v5

    :cond_1
    add-int/lit8 v5, v3, 0x1

    aput-object v4, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v5

    goto :goto_0

    :goto_1
    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return-void

    :cond_2
    array-length v3, v0

    :cond_3
    if-nez v3, :cond_4

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return-void

    :cond_4
    const/4 v2, 0x1

    if-ne v3, v2, :cond_5

    aget-object v0, v0, v1

    invoke-interface {v0, p1}, Lgg/v;->d(Lgg/x;)V

    return-void

    :cond_5
    new-instance v1, Ltg/b$a;

    invoke-direct {v1, p1, v3}, Ltg/b$a;-><init>(Lgg/x;I)V

    invoke-virtual {v1, v0}, Ltg/b$a;->a([Lgg/v;)V

    return-void
.end method
