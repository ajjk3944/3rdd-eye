.class public final Ltb/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/q$a;,
        Ltb/q$b;
    }
.end annotation


# instance fields
.field private final a:Ltb/f;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>(Ltb/f;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "dataChannelObserverHub"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/q;->a:Ltb/f;

    iput-object p2, p0, Ltb/q;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Ltb/q;Ltb/i;Lgg/A;)Ltb/q$b;
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/q;->h(Ltb/q;Ltb/i;Lgg/A;)Ltb/q$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/q;Lmh/l;Ltb/i;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltb/q;->k(Ltb/q;Lmh/l;Ltb/i;Lgg/A;)V

    return-void
.end method

.method public static synthetic c(Ltb/q;)V
    .locals 0

    invoke-static {p0}, Ltb/q;->l(Ltb/q;)V

    return-void
.end method

.method private final g(Ltb/i;)Lgg/z;
    .locals 3

    new-instance v0, Ltb/n;

    invoke-direct {v0, p0, p1}, Ltb/n;-><init>(Ltb/q;Ltb/i;)V

    invoke-direct {p0, p1, v0}, Ltb/q;->j(Ltb/i;Lmh/l;)Lgg/z;

    move-result-object p1

    const-wide/16 v0, 0x1e

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "timeout(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final h(Ltb/q;Ltb/i;Lgg/A;)Ltb/q$b;
    .locals 1

    const-string/jumbo v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltb/q$a;

    invoke-direct {v0, p0, p1, p2}, Ltb/q$a;-><init>(Ltb/q;Ltb/i;Lgg/A;)V

    return-object v0
.end method

.method private final i()Lgg/b;
    .locals 1

    iget-object v0, p0, Ltb/q;->a:Ltb/f;

    invoke-virtual {v0}, Ltb/f;->u()Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method private final j(Ltb/i;Lmh/l;)Lgg/z;
    .locals 1

    new-instance v0, Ltb/o;

    invoke-direct {v0, p0, p2, p1}, Ltb/o;-><init>(Ltb/q;Lmh/l;Ltb/i;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final k(Ltb/q;Lmh/l;Ltb/i;Lgg/A;)V
    .locals 3

    const-string/jumbo v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltb/q;->d:Z

    iget-object v1, p0, Ltb/q;->a:Ltb/f;

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltb/f$b;

    invoke-virtual {v1, p1}, Ltb/f;->B(Ltb/f$b;)V

    new-instance p1, Ltb/p;

    invoke-direct {p1, p0}, Ltb/p;-><init>(Ltb/q;)V

    invoke-interface {p3, p1}, Lgg/A;->d(Lkg/e;)V

    invoke-virtual {p2}, Ltb/i;->a()Lkb/j;

    move-result-object p1

    invoke-virtual {p1}, Lkb/j;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p2

    const/16 p3, 0x2000

    if-gt p2, p3, :cond_0

    iget-object p0, p0, Ltb/q;->a:Ltb/f;

    new-instance p2, Lorg/webrtc/DataChannel$Buffer;

    invoke-direct {p2, p1, v0}, Lorg/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    invoke-virtual {p0, p2}, Ltb/f;->w(Lorg/webrtc/DataChannel$Buffer;)V

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-ge v1, p2, :cond_1

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, p3

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v1, p0, Ltb/q;->a:Ltb/f;

    new-instance v2, Lorg/webrtc/DataChannel$Buffer;

    invoke-direct {v2, p1, v0}, Lorg/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    invoke-virtual {v1, v2}, Ltb/f;->w(Lorg/webrtc/DataChannel$Buffer;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private static final l(Ltb/q;)V
    .locals 0

    iget-object p0, p0, Ltb/q;->a:Ltb/f;

    invoke-virtual {p0}, Ltb/f;->h()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltb/q;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ltb/q;->d:Z

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltb/q;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final m(Ltb/i;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ltb/q;->i()Lgg/b;

    move-result-object v0

    invoke-direct {p0, p1}, Ltb/q;->g(Ltb/i;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "andThen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Ltb/q;->d:Z

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltb/q;->c:Ljava/lang/String;

    return-void
.end method
