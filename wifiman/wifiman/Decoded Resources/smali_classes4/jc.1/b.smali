.class public abstract Ljc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, Ljc/a;

    invoke-direct {v4}, Ljc/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Ljc/b;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Ljc/b;->b(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 4

    const-string v0, "$this$Module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/ui/wifiman/db/z;->Y()Lorg/kodein/di/DI$g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lfe/e;->i()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lmd/f;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lld/f;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lkc/w;->S()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LXc/u;->O()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lpd/p;->E()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LEd/e;->i()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LDc/d;->g()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LCc/i;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lcom/ui/wifiman/model/vendor/c;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lde/m;->s()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LZd/f;->k()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LBc/s;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lkd/c;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lhe/p;->E()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lwc/A;->A()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lnd/e;->i()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LFd/r;->I()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lsc/e;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, Lcom/ui/wifiman/model/wmw/a;->s()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    invoke-static {}, LLd/c;->e()Lorg/kodein/di/DI$g;

    move-result-object v0

    invoke-static {p0, v0, v1, v2, v3}, Lorg/kodein/di/DI$b$a;->a(Lorg/kodein/di/DI$b;Lorg/kodein/di/DI$g;ZILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final c()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, Ljc/b;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method
