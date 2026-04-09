.class final LLd/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd/h;-><init>(Lorg/kodein/di/DI;Landroid/content/Context;Ldc/a;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;LQd/e;LZc/f;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field static final synthetic b:[Lth/l;


# instance fields
.field final synthetic a:LLd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#2>"

    const/4 v2, 0x0

    const-class v3, LLd/h;

    const-string v4, "ssoSession"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LLd/h$c;->b:[Lth/l;

    return-void
.end method

.method constructor <init>(LLd/h;)V
    .locals 0

    iput-object p1, p0, LLd/h$c;->a:LLd/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final b(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    return-object p0
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, LLd/h$c;->a:LLd/h;

    invoke-static {v1}, LLd/h;->d(LLd/h;)Lorg/kodein/di/DI;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v2

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, LLd/h$c$b;

    invoke-direct {v4}, LLd/h$c$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v4, Lorg/kodein/type/d;

    new-instance v6, LLd/h$c$c;

    invoke-direct {v6}, LLd/h$c$c;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v4, v6, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v5, LLd/h$c$d;

    invoke-direct {v5, v2}, LLd/h$c$d;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3, v4, v0, v5}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object v1

    sget-object v2, LLd/h$c;->b:[Lth/l;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, LLd/h$c;->b(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->g()Lgg/i;

    move-result-object v0

    new-instance v1, LLd/h$c$a;

    iget-object v2, p0, LLd/h$c;->a:LLd/h;

    invoke-direct {v1, v2, p1}, LLd/h$c$a;-><init>(LLd/h;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LLd/h$c;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
