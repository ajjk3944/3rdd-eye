.class public final LFh/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, LFh/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;)LFh/k;
    .locals 8

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFh/g;

    invoke-direct {v0, p1}, LFh/g;-><init>(Ljava/lang/ClassLoader;)V

    sget-object v1, LSh/k;->b:LSh/k$a;

    new-instance v3, LFh/g;

    const-class v2, LYg/J;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v4, "getClassLoader(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, LFh/g;-><init>(Ljava/lang/ClassLoader;)V

    new-instance v4, LFh/d;

    invoke-direct {v4, p1}, LFh/d;-><init>(Ljava/lang/ClassLoader;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "runtime module for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LFh/j;->b:LFh/j;

    sget-object v7, LFh/l;->a:LFh/l;

    move-object v2, v0

    invoke-virtual/range {v1 .. v7}, LSh/k$a;->a(LSh/v;LSh/v;LJh/u;Ljava/lang/String;Lli/w;LPh/b;)LSh/k$a$a;

    move-result-object p1

    new-instance v1, LFh/k;

    invoke-virtual {p1}, LSh/k$a$a;->a()LSh/k;

    move-result-object v2

    invoke-virtual {v2}, LSh/k;->a()Lli/n;

    move-result-object v2

    new-instance v3, LFh/a;

    invoke-virtual {p1}, LSh/k$a$a;->b()LSh/n;

    move-result-object p1

    invoke-direct {v3, p1, v0}, LFh/a;-><init>(LSh/n;LFh/g;)V

    const/4 p1, 0x0

    invoke-direct {v1, v2, v3, p1}, LFh/k;-><init>(Lli/n;LFh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
