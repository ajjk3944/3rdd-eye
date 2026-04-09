.class final Lcom/ui/sso/api/provider/d$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/sso/api/provider/d$f;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/d$f;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/d$f;->a:Lcom/ui/sso/api/provider/d$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LVi/b;
    .locals 10

    new-instance v6, LVi/k;

    const-class v0, Lcom/ui/sso/api/provider/d;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-class v0, Lcom/ui/sso/api/provider/d$a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-class v1, Lcom/ui/sso/api/provider/d$b;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-class v3, Lcom/ui/sso/api/provider/d$c;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-class v4, Lcom/ui/sso/api/provider/d$d;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v4

    const-class v5, Lcom/ui/sso/api/provider/d$e;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v5

    const/4 v7, 0x5

    new-array v8, v7, [Lth/d;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v1, v8, v0

    const/4 v1, 0x2

    aput-object v3, v8, v1

    const/4 v3, 0x3

    aput-object v4, v8, v3

    const/4 v4, 0x4

    aput-object v5, v8, v4

    new-array v5, v7, [LVi/b;

    sget-object v7, Lcom/ui/sso/api/provider/d$a$a;->a:Lcom/ui/sso/api/provider/d$a$a;

    aput-object v7, v5, v9

    sget-object v7, Lcom/ui/sso/api/provider/d$b$a;->a:Lcom/ui/sso/api/provider/d$b$a;

    aput-object v7, v5, v0

    sget-object v0, Lcom/ui/sso/api/provider/d$c$a;->a:Lcom/ui/sso/api/provider/d$c$a;

    aput-object v0, v5, v1

    sget-object v0, Lcom/ui/sso/api/provider/d$d$a;->a:Lcom/ui/sso/api/provider/d$d$a;

    aput-object v0, v5, v3

    sget-object v0, Lcom/ui/sso/api/provider/d$e$a;->a:Lcom/ui/sso/api/provider/d$e$a;

    aput-object v0, v5, v4

    new-array v7, v9, [Ljava/lang/annotation/Annotation;

    const-string/jumbo v1, "com.ui.sso.api.provider.UiAccountProviderRequest"

    move-object v0, v6

    move-object v3, v8

    move-object v4, v5

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/d$f;->a()LVi/b;

    move-result-object v0

    return-object v0
.end method
