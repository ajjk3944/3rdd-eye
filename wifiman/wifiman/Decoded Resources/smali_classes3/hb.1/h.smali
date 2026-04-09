.class public final Lhb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/h$b;
    }
.end annotation


# instance fields
.field private final a:Ltb/f;

.field private final b:Leb/k;

.field private final c:Z

.field private final d:Lkb/s;


# direct methods
.method public constructor <init>(Ltb/f;Leb/k;Z)V
    .locals 1

    const-string/jumbo v0, "hub"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/h;->a:Ltb/f;

    iput-object p2, p0, Lhb/h;->b:Leb/k;

    iput-boolean p3, p0, Lhb/h;->c:Z

    new-instance p2, Lhb/f;

    invoke-direct {p2, p0}, Lhb/f;-><init>(Lhb/h;)V

    invoke-virtual {p1, p2}, Ltb/f;->g(Ltb/f$c;)V

    new-instance p2, Lhb/h$a;

    invoke-direct {p2, p0}, Lhb/h$a;-><init>(Lhb/h;)V

    invoke-virtual {p1, p2}, Ltb/f;->B(Ltb/f$b;)V

    new-instance p1, Lkb/s;

    new-instance p2, Lhb/g;

    invoke-direct {p2, p0}, Lhb/g;-><init>(Lhb/h;)V

    invoke-direct {p1, p2}, Lkb/s;-><init>(Lmh/l;)V

    iput-object p1, p0, Lhb/h;->d:Lkb/s;

    return-void
.end method

.method public static synthetic a(Lhb/h;Lkb/t;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lhb/h;->f(Lhb/h;Lkb/t;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhb/h;Lorg/webrtc/DataChannel$State;)V
    .locals 0

    invoke-static {p0, p1}, Lhb/h;->c(Lhb/h;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method private static final c(Lhb/h;Lorg/webrtc/DataChannel$State;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhb/h$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lhb/h;->b:Leb/k;

    invoke-interface {p0}, Leb/k;->d()V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lhb/h;->b:Leb/k;

    invoke-interface {p0}, Leb/k;->c()V

    :goto_0
    return-void
.end method

.method public static final synthetic d(Lhb/h;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1}, Lhb/h;->e(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private final e(Ljava/nio/ByteBuffer;)V
    .locals 1

    iget-boolean v0, p0, Lhb/h;->c:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lhb/h;->g(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhb/h;->b:Leb/k;

    invoke-interface {v0, p1}, Leb/k;->b(Ljava/nio/ByteBuffer;)V

    :goto_0
    return-void
.end method

.method private static final f(Lhb/h;Lkb/t;)LYg/J;
    .locals 1

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lhb/h;->b:Leb/k;

    invoke-virtual {p1}, Lkb/m;->b()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string/jumbo v0, "wrap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Leb/k;->b(Ljava/nio/ByteBuffer;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final g(Ljava/nio/ByteBuffer;)V
    .locals 1

    iget-object v0, p0, Lhb/h;->d:Lkb/s;

    invoke-virtual {v0, p1}, Lkb/r;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lhb/h;->a:Ltb/f;

    invoke-virtual {v0}, Ltb/f;->i()V

    return-void
.end method
