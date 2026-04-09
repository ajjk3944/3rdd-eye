.class public final LNh/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LNh/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/c$a;

    invoke-direct {v0}, LNh/c$a;-><init>()V

    sput-object v0, LNh/c$a;->a:LNh/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(LZh/f;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LNh/c$a;->g(LZh/f;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c(LZh/f;)LQh/n;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/Set;
    .locals 1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f(LZh/f;)LQh/w;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(LZh/f;)Ljava/util/List;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
