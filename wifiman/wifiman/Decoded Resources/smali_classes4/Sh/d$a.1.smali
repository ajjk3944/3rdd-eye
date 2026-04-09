.class public final LSh/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSh/d;->H(LSh/x;)LSh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/d$a$a;,
        LSh/d$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:LSh/d;

.field final synthetic b:Ljava/util/HashMap;

.field final synthetic c:LSh/x;

.field final synthetic d:Ljava/util/HashMap;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(LSh/d;Ljava/util/HashMap;LSh/x;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, LSh/d$a;->a:LSh/d;

    iput-object p2, p0, LSh/d$a;->b:Ljava/util/HashMap;

    iput-object p3, p0, LSh/d$a;->c:LSh/x;

    iput-object p4, p0, LSh/d$a;->d:Ljava/util/HashMap;

    iput-object p5, p0, LSh/d$a;->e:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZh/f;Ljava/lang/String;)LSh/x$e;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSh/d$a$a;

    sget-object v1, LSh/A;->b:LSh/A$a;

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "asString(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, LSh/A$a;->d(Ljava/lang/String;Ljava/lang/String;)LSh/A;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LSh/d$a$a;-><init>(LSh/d$a;LSh/A;)V

    return-object v0
.end method

.method public b(LZh/f;Ljava/lang/String;Ljava/lang/Object;)LSh/x$c;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/A;->b:LSh/A$a;

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "asString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, LSh/A$a;->a(Ljava/lang/String;Ljava/lang/String;)LSh/A;

    move-result-object p1

    if-eqz p3, :cond_0

    iget-object v0, p0, LSh/d$a;->a:LSh/d;

    invoke-virtual {v0, p2, p3}, LSh/d;->I(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p3, p0, LSh/d$a;->e:Ljava/util/HashMap;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p2, LSh/d$a$b;

    invoke-direct {p2, p0, p1}, LSh/d$a$b;-><init>(LSh/d$a;LSh/A;)V

    return-object p2
.end method
