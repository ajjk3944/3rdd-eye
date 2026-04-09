.class public final LSh/d$a$a;
.super LSh/d$a$b;
.source "SourceFile"

# interfaces
.implements LSh/x$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic d:LSh/d$a;


# direct methods
.method public constructor <init>(LSh/d$a;LSh/A;)V
    .locals 1

    const-string v0, "signature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSh/d$a$a;->d:LSh/d$a;

    invoke-direct {p0, p1, p2}, LSh/d$a$b;-><init>(LSh/d$a;LSh/A;)V

    return-void
.end method


# virtual methods
.method public c(ILZh/b;LBh/g0;)LSh/x$a;
    .locals 2

    const-string v0, "classId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/A;->b:LSh/A$a;

    invoke-virtual {p0}, LSh/d$a$b;->d()LSh/A;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LSh/A$a;->e(LSh/A;I)LSh/A;

    move-result-object p1

    iget-object v0, p0, LSh/d$a$a;->d:LSh/d$a;

    iget-object v0, v0, LSh/d$a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LSh/d$a$a;->d:LSh/d$a;

    iget-object v1, v1, LSh/d$a;->b:Ljava/util/HashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, LSh/d$a$a;->d:LSh/d$a;

    iget-object p1, p1, LSh/d$a;->a:LSh/d;

    invoke-virtual {p1, p2, p3, v0}, LSh/e;->y(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p1

    return-object p1
.end method
