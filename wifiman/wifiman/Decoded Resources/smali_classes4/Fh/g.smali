.class public final LFh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/v;


# instance fields
.field private final a:Ljava/lang/ClassLoader;

.field private final b:Lmi/d;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFh/g;->a:Ljava/lang/ClassLoader;

    new-instance p1, Lmi/d;

    invoke-direct {p1}, Lmi/d;-><init>()V

    iput-object p1, p0, LFh/g;->b:Lmi/d;

    return-void
.end method

.method private final d(Ljava/lang/String;)LSh/v$a;
    .locals 3

    iget-object v0, p0, LFh/g;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, p1}, LFh/e;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, LFh/f;->c:LFh/f$a;

    invoke-virtual {v1, p1}, LFh/f$a;->a(Ljava/lang/Class;)LFh/f;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, LSh/v$a$a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v0, v2, v0}, LSh/v$a$a;-><init>(LSh/x;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(LZh/b;LYh/e;)LSh/v$a;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LFh/h;->a(LZh/b;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LFh/g;->d(Ljava/lang/String;)LSh/v$a;

    move-result-object p1

    return-object p1
.end method

.method public b(LQh/g;LYh/e;)LSh/v$a;
    .locals 1

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/g;->e()LZh/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZh/c;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LFh/g;->d(Ljava/lang/String;)LSh/v$a;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(LZh/c;)Ljava/io/InputStream;
    .locals 2

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->z:LZh/f;

    invoke-virtual {p1, v0}, LZh/c;->i(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LFh/g;->b:Lmi/d;

    sget-object v1, Lmi/a;->r:Lmi/a;

    invoke-virtual {v1, p1}, Lmi/a;->r(LZh/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lmi/d;->a(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
