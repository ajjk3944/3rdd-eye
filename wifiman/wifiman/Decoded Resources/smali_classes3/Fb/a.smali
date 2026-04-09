.class public final LFb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field private final a:I

.field private final b:Lmh/a;


# direct methods
.method public constructor <init>(ILmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LFb/a;->a:I

    iput-object p2, p0, LFb/a;->b:Lmh/a;

    return-void
.end method

.method public static final synthetic a(LFb/a;)Lmh/a;
    .locals 0

    iget-object p0, p0, LFb/a;->b:Lmh/a;

    return-object p0
.end method

.method public static final synthetic b(LFb/a;)I
    .locals 0

    iget p0, p0, LFb/a;->a:I

    return p0
.end method

.method public static final synthetic c(LFb/a;Ljava/lang/Throwable;)Z
    .locals 0

    invoke-direct {p0, p1}, LFb/a;->e(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method private final e(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_1

    check-cast p1, Lretrofit2/HttpException;

    invoke-virtual {p1}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x193

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lretrofit2/HttpException;->a()I

    move-result p1

    const/16 v0, 0x191

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LFb/a;->d(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public d(Lgg/i;)Lgg/i;
    .locals 2

    const-string/jumbo v0, "errorFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/L;

    invoke-direct {v0}, Lkotlin/jvm/internal/L;-><init>()V

    new-instance v1, LFb/a$a;

    invoke-direct {v1, v0, p0}, LFb/a$a;-><init>(Lkotlin/jvm/internal/L;LFb/a;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LFb/a$b;

    invoke-direct {v0, p0}, LFb/a$b;-><init>(LFb/a;)V

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
