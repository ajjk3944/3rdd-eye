.class final LMd/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMd/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMd/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMd/f$a;

    invoke-direct {v0}, LMd/f$a;-><init>()V

    sput-object v0, LMd/f$a;->a:LMd/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Luj/b;Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object p2

    invoke-interface {p1}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, LMd/f$a$a;

    invoke-direct {v1}, LMd/f$a$a;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v3, LMd/f$a$b;

    invoke-direct {v3}, LMd/f$a$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v1, v3, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, v2, p2}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luj/b;

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->g()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, LMd/f$a;->a(Luj/b;Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    move-result-object p1

    return-object p1
.end method
