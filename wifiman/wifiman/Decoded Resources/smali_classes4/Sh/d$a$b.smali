.class public LSh/d$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:LSh/A;

.field private final b:Ljava/util/ArrayList;

.field final synthetic c:LSh/d$a;


# direct methods
.method public constructor <init>(LSh/d$a;LSh/A;)V
    .locals 1

    const-string v0, "signature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSh/d$a$b;->c:LSh/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LSh/d$a$b;->a:LSh/A;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LSh/d$a$b;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LSh/d$a$b;->b:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LSh/d$a$b;->c:LSh/d$a;

    iget-object v0, v0, LSh/d$a;->b:Ljava/util/HashMap;

    iget-object v1, p0, LSh/d$a$b;->a:LSh/A;

    iget-object v2, p0, LSh/d$a$b;->b:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public b(LZh/b;LBh/g0;)LSh/x$a;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/d$a$b;->c:LSh/d$a;

    iget-object v0, v0, LSh/d$a;->a:LSh/d;

    iget-object v1, p0, LSh/d$a$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2, v1}, LSh/e;->y(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p1

    return-object p1
.end method

.method protected final d()LSh/A;
    .locals 1

    iget-object v0, p0, LSh/d$a$b;->a:LSh/A;

    return-object v0
.end method
