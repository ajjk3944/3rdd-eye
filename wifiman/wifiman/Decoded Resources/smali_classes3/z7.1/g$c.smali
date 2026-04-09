.class final Lz7/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/g;


# direct methods
.method constructor <init>(Lz7/g;)V
    .locals 0

    iput-object p1, p0, Lz7/g$c;->a:Lz7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lz7/g;Lz7/z;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz7/g$c;->d(Lz7/g;Lz7/z;Lgg/c;)V

    return-void
.end method

.method public static synthetic b(Lz7/g;)V
    .locals 0

    invoke-static {p0}, Lz7/g$c;->e(Lz7/g;)V

    return-void
.end method

.method private static final d(Lz7/g;Lz7/z;Lgg/c;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lz7/g;->h(Lz7/g;)Lz7/w;

    move-result-object v0

    invoke-virtual {p1}, Lz7/z;->a()Ljava/net/DatagramSocket;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz7/w;->c(Ljava/net/DatagramSocket;)V

    new-instance p1, Lz7/i;

    invoke-direct {p1, p0}, Lz7/i;-><init>(Lz7/g;)V

    invoke-interface {p2, p1}, Lgg/c;->d(Lkg/e;)V

    return-void
.end method

.method private static final e(Lz7/g;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lz7/g;->h(Lz7/g;)Lz7/w;

    move-result-object p0

    invoke-virtual {p0}, Lz7/w;->e()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz7/z;

    invoke-virtual {p0, p1}, Lz7/g$c;->c(Lz7/z;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lz7/z;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz7/z;->a()Ljava/net/DatagramSocket;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz7/g$c;->a:Lz7/g;

    new-instance v1, Lz7/h;

    invoke-direct {v1, v0, p1}, Lz7/h;-><init>(Lz7/g;Lz7/z;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
