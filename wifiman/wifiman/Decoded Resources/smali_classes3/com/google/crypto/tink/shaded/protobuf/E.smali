.class final Lcom/google/crypto/tink/shaded/protobuf/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/E$b;
    }
.end annotation


# static fields
.field private static final b:Lcom/google/crypto/tink/shaded/protobuf/L;


# instance fields
.field private final a:Lcom/google/crypto/tink/shaded/protobuf/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/E$a;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/E$a;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->b:Lcom/google/crypto/tink/shaded/protobuf/L;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->b()Lcom/google/crypto/tink/shaded/protobuf/L;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/E;-><init>(Lcom/google/crypto/tink/shaded/protobuf/L;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/L;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string/jumbo v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/L;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/E;->a:Lcom/google/crypto/tink/shaded/protobuf/L;

    return-void
.end method

.method private static b()Lcom/google/crypto/tink/shaded/protobuf/L;
    .locals 5

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/E$b;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/v;->c()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/E;->c()Lcom/google/crypto/tink/shaded/protobuf/L;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/shaded/protobuf/L;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/crypto/tink/shaded/protobuf/E$b;-><init>([Lcom/google/crypto/tink/shaded/protobuf/L;)V

    return-object v0
.end method

.method private static c()Lcom/google/crypto/tink/shaded/protobuf/L;
    .locals 3

    :try_start_0
    const-string/jumbo v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string/jumbo v1, "getInstance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/L;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->b:Lcom/google/crypto/tink/shaded/protobuf/L;

    return-object v0
.end method

.method private static d(Lcom/google/crypto/tink/shaded/protobuf/K;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/K;->getSyntax()Lcom/google/crypto/tink/shaded/protobuf/X;

    move-result-object p0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/X;->PROTO2:Lcom/google/crypto/tink/shaded/protobuf/X;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;)Lcom/google/crypto/tink/shaded/protobuf/c0;
    .locals 8

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/E;->d(Lcom/google/crypto/tink/shaded/protobuf/K;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/U;->b()Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/C;->b()Lcom/google/crypto/tink/shaded/protobuf/C;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->L()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/r;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/J;->b()Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/P;->U(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;Lcom/google/crypto/tink/shaded/protobuf/S;Lcom/google/crypto/tink/shaded/protobuf/C;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/H;)Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/U;->b()Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/C;->b()Lcom/google/crypto/tink/shaded/protobuf/C;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->L()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/J;->b()Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/P;->U(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;Lcom/google/crypto/tink/shaded/protobuf/S;Lcom/google/crypto/tink/shaded/protobuf/C;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/H;)Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/E;->d(Lcom/google/crypto/tink/shaded/protobuf/K;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/U;->a()Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/C;->a()Lcom/google/crypto/tink/shaded/protobuf/C;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->G()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/r;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v6

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/J;->a()Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/P;->U(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;Lcom/google/crypto/tink/shaded/protobuf/S;Lcom/google/crypto/tink/shaded/protobuf/C;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/H;)Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/U;->a()Lcom/google/crypto/tink/shaded/protobuf/S;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/C;->a()Lcom/google/crypto/tink/shaded/protobuf/C;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->H()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/J;->a()Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/P;->U(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;Lcom/google/crypto/tink/shaded/protobuf/S;Lcom/google/crypto/tink/shaded/protobuf/C;Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/H;)Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/c0;
    .locals 2

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->I(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/E;->a:Lcom/google/crypto/tink/shaded/protobuf/L;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/L;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/K;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/K;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->L()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/r;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/K;->b()Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e0;->G()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/r;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/K;->b()Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/Q;->m(Lcom/google/crypto/tink/shaded/protobuf/h0;Lcom/google/crypto/tink/shaded/protobuf/p;Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/Q;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/E;->e(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/K;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p1

    return-object p1
.end method
