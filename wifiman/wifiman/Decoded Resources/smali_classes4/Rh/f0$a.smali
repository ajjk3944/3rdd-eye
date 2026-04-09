.class public final LRh/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRh/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRh/f0$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field final synthetic b:LRh/f0;


# direct methods
.method public constructor <init>(LRh/f0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "className"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LRh/f0$a;->b:LRh/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LRh/f0$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(LRh/f0$a;Ljava/lang/String;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LRh/f0$a;->a(Ljava/lang/String;Ljava/lang/String;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lmh/l;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRh/f0$a;->b:LRh/f0;

    invoke-static {v0}, LRh/f0;->a(LRh/f0;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, LRh/f0$a$a;

    invoke-direct {v1, p0, p1, p2}, LRh/f0$a$a;-><init>(LRh/f0$a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LRh/f0$a$a;->a()LYg/s;

    move-result-object p1

    invoke-virtual {p1}, LYg/s;->h()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRh/f0$a;->a:Ljava/lang/String;

    return-object v0
.end method
