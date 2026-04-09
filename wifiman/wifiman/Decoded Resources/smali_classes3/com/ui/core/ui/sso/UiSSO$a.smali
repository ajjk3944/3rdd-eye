.class public abstract Lcom/ui/core/ui/sso/UiSSO$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/UiSSO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/core/ui/sso/UiSSO$a$a;,
        Lcom/ui/core/ui/sso/UiSSO$a$b;,
        Lcom/ui/core/ui/sso/UiSSO$a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u001cB\t\u0008\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u0082\u0001\u0002\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ui/core/ui/sso/UiSSO$a;",
        "",
        "<init>",
        "()V",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(ILZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "f",
        "(Lcom/ui/core/ui/sso/UiSSO$a;LYi/d;LXi/f;)V",
        "Landroid/os/Bundle;",
        "bundle",
        "d",
        "(Landroid/os/Bundle;)V",
        "LEb/r;",
        "e",
        "()LEb/r;",
        "user",
        "Companion",
        "a",
        "b",
        "c",
        "Lcom/ui/core/ui/sso/UiSSO$a$b;",
        "Lcom/ui/core/ui/sso/UiSSO$a$c;",
        "core-ui-sso_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/ui/core/ui/sso/UiSSO$a$a;

.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/UiSSO$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$a;->Companion:Lcom/ui/core/ui/sso/UiSSO$a$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, LP9/m;

    invoke-direct {v1}, LP9/m;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$a;->a:LYg/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILZi/R0;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/core/ui/sso/UiSSO$a;-><init>()V

    return-void
.end method

.method public static synthetic a()LVi/b;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/UiSSO$a;->b()LVi/b;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic b()LVi/b;
    .locals 8

    new-instance v6, LVi/k;

    const-class v0, Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-class v0, Lcom/ui/core/ui/sso/UiSSO$a$b;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-class v1, Lcom/ui/core/ui/sso/UiSSO$a$c;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const/4 v3, 0x2

    new-array v4, v3, [Lth/d;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    new-array v7, v3, [LVi/b;

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$a$b$a;->a:Lcom/ui/core/ui/sso/UiSSO$a$b$a;

    aput-object v1, v7, v5

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$a$c$a;->a:Lcom/ui/core/ui/sso/UiSSO$a$c$a;

    aput-object v1, v7, v0

    new-array v5, v5, [Ljava/lang/annotation/Annotation;

    const-string/jumbo v1, "com.ui.core.ui.sso.UiSSO.AuthResponse"

    move-object v0, v6

    move-object v3, v4

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public static final synthetic c()LYg/m;
    .locals 1

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$a;->a:LYg/m;

    return-object v0
.end method

.method public static final synthetic f(Lcom/ui/core/ui/sso/UiSSO$a;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final d(Landroid/os/Bundle;)V
    .locals 2

    const-string/jumbo v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Laj/b;->d:Laj/b$a;

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$a;->Companion:Lcom/ui/core/ui/sso/UiSSO$a$a;

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/UiSSO$a$a;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "auth_response"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract e()LEb/r;
.end method
