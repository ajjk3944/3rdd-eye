.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;-><init>(Lorg/kodein/di/DI;LLb/b;LNd/c;Llc/e;)V
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

    const-string v1, "<v#1>"

    const/4 v2, 0x0

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    const-string v4, "session"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->b:[Lth/l;

    return-void
.end method

.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final b(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    return-object p0
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->g()Ljava/util/UUID;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    new-instance v1, Ll9/a;

    if-eqz p1, :cond_1

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->h(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;)Lorg/kodein/di/DI;

    move-result-object v2

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object p1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$a;

    invoke-direct {v4}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$a;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v4, Lorg/kodein/type/d;

    new-instance v6, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$b;

    invoke-direct {v6}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$b;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    invoke-direct {v4, v6, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$c;

    invoke-direct {v5, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m$c;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, v3, v4, v0, v5}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->b:[Lth/l;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {p1, v0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->b(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    move-result-object v0

    :cond_1
    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$m;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
