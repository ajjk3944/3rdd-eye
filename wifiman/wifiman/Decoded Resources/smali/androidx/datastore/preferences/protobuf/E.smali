.class final Landroidx/datastore/preferences/protobuf/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/E$b;
    }
.end annotation


# static fields
.field private static final b:Landroidx/datastore/preferences/protobuf/L;


# instance fields
.field private final a:Landroidx/datastore/preferences/protobuf/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/E$a;

    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/E$a;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/E;->b:Landroidx/datastore/preferences/protobuf/L;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/E;->b()Landroidx/datastore/preferences/protobuf/L;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/E;-><init>(Landroidx/datastore/preferences/protobuf/L;)V

    return-void
.end method

.method private constructor <init>(Landroidx/datastore/preferences/protobuf/L;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/x;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/L;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/E;->a:Landroidx/datastore/preferences/protobuf/L;

    return-void
.end method

.method private static b()Landroidx/datastore/preferences/protobuf/L;
    .locals 5

    new-instance v0, Landroidx/datastore/preferences/protobuf/E$b;

    invoke-static {}, Landroidx/datastore/preferences/protobuf/u;->c()Landroidx/datastore/preferences/protobuf/u;

    move-result-object v1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/E;->c()Landroidx/datastore/preferences/protobuf/L;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Landroidx/datastore/preferences/protobuf/L;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Landroidx/datastore/preferences/protobuf/E$b;-><init>([Landroidx/datastore/preferences/protobuf/L;)V

    return-object v0
.end method

.method private static c()Landroidx/datastore/preferences/protobuf/L;
    .locals 3

    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/L;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/E;->b:Landroidx/datastore/preferences/protobuf/L;

    return-object v0
.end method

.method private static d(Landroidx/datastore/preferences/protobuf/K;)Z
    .locals 1

    invoke-interface {p0}, Landroidx/datastore/preferences/protobuf/K;->getSyntax()Landroidx/datastore/preferences/protobuf/X;

    move-result-object p0

    sget-object v0, Landroidx/datastore/preferences/protobuf/X;->PROTO2:Landroidx/datastore/preferences/protobuf/X;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static e(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;)Landroidx/datastore/preferences/protobuf/c0;
    .locals 8

    const-class v0, Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/E;->d(Landroidx/datastore/preferences/protobuf/K;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/U;->b()Landroidx/datastore/preferences/protobuf/S;

    move-result-object v3

    invoke-static {}, Landroidx/datastore/preferences/protobuf/C;->b()Landroidx/datastore/preferences/protobuf/C;

    move-result-object v4

    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->L()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object v5

    invoke-static {}, Landroidx/datastore/preferences/protobuf/q;->b()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v6

    invoke-static {}, Landroidx/datastore/preferences/protobuf/J;->b()Landroidx/datastore/preferences/protobuf/H;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Landroidx/datastore/preferences/protobuf/P;->M(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;Landroidx/datastore/preferences/protobuf/S;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/H;)Landroidx/datastore/preferences/protobuf/P;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/U;->b()Landroidx/datastore/preferences/protobuf/S;

    move-result-object v2

    invoke-static {}, Landroidx/datastore/preferences/protobuf/C;->b()Landroidx/datastore/preferences/protobuf/C;

    move-result-object v3

    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->L()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/J;->b()Landroidx/datastore/preferences/protobuf/H;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Landroidx/datastore/preferences/protobuf/P;->M(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;Landroidx/datastore/preferences/protobuf/S;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/H;)Landroidx/datastore/preferences/protobuf/P;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/E;->d(Landroidx/datastore/preferences/protobuf/K;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/datastore/preferences/protobuf/U;->a()Landroidx/datastore/preferences/protobuf/S;

    move-result-object v3

    invoke-static {}, Landroidx/datastore/preferences/protobuf/C;->a()Landroidx/datastore/preferences/protobuf/C;

    move-result-object v4

    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->G()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object v5

    invoke-static {}, Landroidx/datastore/preferences/protobuf/q;->a()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v6

    invoke-static {}, Landroidx/datastore/preferences/protobuf/J;->a()Landroidx/datastore/preferences/protobuf/H;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Landroidx/datastore/preferences/protobuf/P;->M(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;Landroidx/datastore/preferences/protobuf/S;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/H;)Landroidx/datastore/preferences/protobuf/P;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/U;->a()Landroidx/datastore/preferences/protobuf/S;

    move-result-object v2

    invoke-static {}, Landroidx/datastore/preferences/protobuf/C;->a()Landroidx/datastore/preferences/protobuf/C;

    move-result-object v3

    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->H()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/J;->a()Landroidx/datastore/preferences/protobuf/H;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Landroidx/datastore/preferences/protobuf/P;->M(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;Landroidx/datastore/preferences/protobuf/S;Landroidx/datastore/preferences/protobuf/C;Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/H;)Landroidx/datastore/preferences/protobuf/P;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/c0;
    .locals 2

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/e0;->I(Ljava/lang/Class;)V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/E;->a:Landroidx/datastore/preferences/protobuf/L;

    invoke-interface {v0, p1}, Landroidx/datastore/preferences/protobuf/L;->a(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/K;

    move-result-object v0

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/K;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->L()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object p1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/q;->b()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/K;->b()Landroidx/datastore/preferences/protobuf/M;

    move-result-object v0

    invoke-static {p1, v1, v0}, Landroidx/datastore/preferences/protobuf/Q;->l(Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/e0;->G()Landroidx/datastore/preferences/protobuf/i0;

    move-result-object p1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/q;->a()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/K;->b()Landroidx/datastore/preferences/protobuf/M;

    move-result-object v0

    invoke-static {p1, v1, v0}, Landroidx/datastore/preferences/protobuf/Q;->l(Landroidx/datastore/preferences/protobuf/i0;Landroidx/datastore/preferences/protobuf/o;Landroidx/datastore/preferences/protobuf/M;)Landroidx/datastore/preferences/protobuf/Q;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/E;->e(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/K;)Landroidx/datastore/preferences/protobuf/c0;

    move-result-object p1

    return-object p1
.end method
