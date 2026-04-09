.class final LG8/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b;->s(Lq9/g;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field static final synthetic e:[Lth/l;


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:LG8/b;

.field final synthetic d:Lq9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#0>"

    const/4 v2, 0x0

    const-class v3, LG8/b;

    const-string/jumbo v4, "session"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LG8/b$c;->e:[Lth/l;

    return-void
.end method

.method constructor <init>(LG8/b;Lq9/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LG8/b$c;->c:LG8/b;

    iput-object p2, p0, LG8/b$c;->d:Lq9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final o(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LG8/b$c;

    iget-object v0, p0, LG8/b$c;->c:LG8/b;

    iget-object v1, p0, LG8/b$c;->d:Lq9/g;

    invoke-direct {p1, v0, v1, p2}, LG8/b$c;-><init>(LG8/b;Lq9/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LG8/b$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, LG8/b$c;->b:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v1, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v3, p0, LG8/b$c;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG8/b$c;->c:LG8/b;

    iget-object v3, p0, LG8/b$c;->d:Lq9/g;

    invoke-virtual {v3}, Lq9/g;->d()I

    move-result v3

    iput v1, p0, LG8/b$c;->b:I

    invoke-static {p1, v3, p0}, LG8/b;->p0(LG8/b;ILdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    return-object v2

    :cond_5
    :goto_0
    move-object v3, p1

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz v3, :cond_6

    iget-object p1, p0, LG8/b$c;->c:LG8/b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v9

    invoke-static {v9}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v9

    new-instance v10, Lorg/kodein/type/d;

    new-instance v11, LG8/b$c$a;

    invoke-direct {v11}, LG8/b$c$a;-><init>()V

    invoke-virtual {v11}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-static {v11}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v11

    const-string/jumbo v12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v13, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v10, v11, v13}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v11, Lorg/kodein/type/d;

    new-instance v13, LG8/b$c$b;

    invoke-direct {v13}, LG8/b$c$b;-><init>()V

    invoke-virtual {v13}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v13

    invoke-static {v13}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v13

    invoke-static {v13, v12}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v12, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    invoke-direct {v11, v13, v12}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v12, LG8/b$c$c;

    invoke-direct {v12, v9}, LG8/b$c$c;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, v10, v11, v8, v12}, Lorg/kodein/di/d;->b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;

    move-result-object p1

    sget-object v9, LG8/b$c;->e:[Lth/l;

    aget-object v9, v9, v0

    invoke-interface {p1, v8, v9}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    invoke-static {p1}, LG8/b$c;->o(LYg/m;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;->b()Lgg/i;

    move-result-object p1

    invoke-static {p1}, LPi/e;->a(LDj/a;)LLi/g;

    move-result-object p1

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LLi/i;->B(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    :goto_1
    if-nez v3, :cond_7

    iget-object p1, p0, LG8/b$c;->d:Lq9/g;

    invoke-virtual {p1}, Lq9/g;->d()I

    move-result p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Account "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not found."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v8, v7, v8}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->m()Z

    move-result v9

    if-nez v9, :cond_8

    iget-object p1, p0, LG8/b$c;->c:LG8/b;

    invoke-static {p1}, LG8/b;->q0(LG8/b;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object p1

    invoke-interface {p1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->b(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)Lgg/b;

    move-result-object p1

    iput v7, p0, LG8/b$c;->b:I

    invoke-static {p1, p0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    return-object v2

    :cond_8
    iput-object v3, p0, LG8/b$c;->a:Ljava/lang/Object;

    iput v6, p0, LG8/b$c;->b:I

    invoke-static {p1, p0}, LLi/i;->x(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    return-object v2

    :cond_9
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, LG8/b$c;->c:LG8/b;

    invoke-static {p1}, LG8/b;->s0(LG8/b;)Li8/a;

    move-result-object p1

    new-instance v6, Li8/a$b$t;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->k()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3}, Li8/a$b$t;-><init>(Ljava/lang/String;)V

    new-array v3, v1, [Li8/a$b;

    aput-object v6, v3, v0

    invoke-interface {p1, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    iput-object v8, p0, LG8/b$c;->a:Ljava/lang/Object;

    iput v5, p0, LG8/b$c;->b:I

    invoke-static {p1, p0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    return-object v2

    :cond_a
    :goto_3
    iget-object p1, p0, LG8/b$c;->c:LG8/b;

    invoke-static {p1}, LG8/b;->s0(LG8/b;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v3, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v3, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    iput-object v8, p0, LG8/b$c;->a:Ljava/lang/Object;

    iput v4, p0, LG8/b$c;->b:I

    invoke-static {p1, p0}, LQi/b;->b(Lgg/f;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_b

    return-object v2

    :cond_b
    :goto_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG8/b$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LG8/b$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LG8/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
