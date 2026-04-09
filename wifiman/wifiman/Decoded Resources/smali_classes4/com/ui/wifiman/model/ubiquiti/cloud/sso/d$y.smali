.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->w()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field static final synthetic b:[Lth/l;


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#0>"

    const/4 v2, 0x0

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    const-string v4, "session"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->b:[Lth/l;

    return-void
.end method

.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->c(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->b(Ljava/util/List;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Lgg/D;
    .locals 9

    const-string v0, "accounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->h(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)Lorg/kodein/di/DI;

    move-result-object v3

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v4

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$c;

    invoke-direct {v6}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$c;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v5, v6, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v6, Lorg/kodein/type/d;

    new-instance v8, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$d;

    invoke-direct {v8}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$d;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v6, v8, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v7, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$e;

    invoke-direct {v7, v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$e;-><init>(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-static {v3, v5, v6, v4, v7}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object v3

    sget-object v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->b:[Lth/l;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    invoke-interface {v3, v4, v5}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v3

    invoke-static {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y;->c(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->b()Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->o0()Lgg/z;

    move-result-object v4

    new-instance v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;

    invoke-direct {v5, v3, v0, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$a;-><init>(LYg/m;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-virtual {v4, v5}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$b;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$y$b;

    invoke-static {v1, p1}, Lgg/z;->f0(Ljava/lang/Iterable;Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
