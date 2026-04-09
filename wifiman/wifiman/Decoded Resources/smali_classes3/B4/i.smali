.class public final LB4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB4/i$b;,
        LB4/i$d;,
        LB4/i$c;,
        LB4/i$e;
    }
.end annotation


# static fields
.field public static final b:LB4/i;

.field public static final c:LB4/i;

.field public static final d:LB4/i;

.field public static final e:LB4/i;

.field public static final f:LB4/i;

.field public static final g:LB4/i;

.field public static final h:LB4/i;


# instance fields
.field private final a:LB4/i$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$a;

    invoke-direct {v1}, LB4/j$a;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->b:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$e;

    invoke-direct {v1}, LB4/j$e;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->c:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$g;

    invoke-direct {v1}, LB4/j$g;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->d:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$f;

    invoke-direct {v1}, LB4/j$f;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->e:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$b;

    invoke-direct {v1}, LB4/j$b;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->f:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$d;

    invoke-direct {v1}, LB4/j$d;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->g:LB4/i;

    new-instance v0, LB4/i;

    new-instance v1, LB4/j$c;

    invoke-direct {v1}, LB4/j$c;-><init>()V

    invoke-direct {v0, v1}, LB4/i;-><init>(LB4/j;)V

    sput-object v0, LB4/i;->h:LB4/i;

    return-void
.end method

.method public constructor <init>(LB4/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/config/internal/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LB4/i$d;

    invoke-direct {v0, p1, v1}, LB4/i$d;-><init>(LB4/j;LB4/i$a;)V

    iput-object v0, p0, LB4/i;->a:LB4/i$e;

    goto :goto_0

    :cond_0
    invoke-static {}, LB4/q;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LB4/i$b;

    invoke-direct {v0, p1, v1}, LB4/i$b;-><init>(LB4/j;LB4/i$a;)V

    iput-object v0, p0, LB4/i;->a:LB4/i$e;

    goto :goto_0

    :cond_1
    new-instance v0, LB4/i$c;

    invoke-direct {v0, p1, v1}, LB4/i$c;-><init>(LB4/j;LB4/i$a;)V

    iput-object v0, p0, LB4/i;->a:LB4/i$e;

    :goto_0
    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB4/i;->a:LB4/i$e;

    invoke-interface {v0, p1}, LB4/i$e;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
