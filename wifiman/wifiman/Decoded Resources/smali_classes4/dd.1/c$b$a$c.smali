.class final Ldd/c$b$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/c$b$a;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/LinkedList;

.field final synthetic b:Ldd/c;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/util/LinkedList;

.field final synthetic e:I


# direct methods
.method constructor <init>(Ljava/util/LinkedList;Ldd/c;Ljava/lang/String;Ljava/util/LinkedList;I)V
    .locals 0

    iput-object p1, p0, Ldd/c$b$a$c;->a:Ljava/util/LinkedList;

    iput-object p2, p0, Ldd/c$b$a$c;->b:Ldd/c;

    iput-object p3, p0, Ldd/c$b$a$c;->c:Ljava/lang/String;

    iput-object p4, p0, Ldd/c$b$a$c;->d:Ljava/util/LinkedList;

    iput p5, p0, Ldd/c$b$a$c;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ldd/i;
    .locals 14

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcd/a$d;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object p1, p0, Ldd/c$b$a$c;->a:Ljava/util/LinkedList;

    iget-object v1, p0, Ldd/c$b$a$c;->b:Ldd/c;

    iget-object v2, p0, Ldd/c$b$a$c;->c:Ljava/lang/String;

    iget-object v5, p0, Ldd/c$b$a$c;->d:Ljava/util/LinkedList;

    iget v6, p0, Ldd/c$b$a$c;->e:I

    monitor-enter p1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const v8, 0x88b8

    int-to-long v8, v8

    sub-long/2addr v3, v8

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-string v9, "iterator(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LWc/c;

    invoke-virtual {v9}, LWc/c;->c()J

    move-result-wide v9

    cmp-long v9, v9, v3

    if-gez v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v3, LWc/c;

    invoke-virtual {v0}, Lcd/a$d;->d()Lcd/a$c;

    move-result-object v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    const-wide/16 v9, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, LWc/c;-><init>(JLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcd/a$d;->c()Linet/ipaddr/g;

    move-result-object v3

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Ldd/c;->e(Ldd/c;Ljava/lang/String;Linet/ipaddr/g;Ljava/util/List;Ljava/util/LinkedList;IZ)Ldd/i;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Ldd/c$b$a$c;->a(LYg/s;)Ldd/i;

    move-result-object p1

    return-object p1
.end method
