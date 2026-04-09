.class public abstract Lcom/ui/sso/api/provider/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/e$a;,
        Lcom/ui/sso/api/provider/e$b;,
        Lcom/ui/sso/api/provider/e$d;,
        Lcom/ui/sso/api/provider/e$e;,
        Lcom/ui/sso/api/provider/e$f;,
        Lcom/ui/sso/api/provider/e$g;,
        Lcom/ui/sso/api/provider/e$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u000f\u0013\u0014\u0015\u0016\u0017B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u00c7\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ui/sso/api/provider/e;",
        "",
        "<init>",
        "()V",
        "",
        "seen1",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(ILZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "b",
        "(Lcom/ui/sso/api/provider/e;LYi/d;LXi/f;)V",
        "Companion",
        "a",
        "d",
        "e",
        "f",
        "g",
        "h",
        "Lcom/ui/sso/api/provider/e$a;",
        "Lcom/ui/sso/api/provider/e$b;",
        "Lcom/ui/sso/api/provider/e$e;",
        "Lcom/ui/sso/api/provider/e$g;",
        "Lcom/ui/sso/api/provider/e$h;",
        "account_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/ui/sso/api/provider/e$d;

.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/e$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/e$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/e;->Companion:Lcom/ui/sso/api/provider/e$d;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    sget-object v1, Lcom/ui/sso/api/provider/e$c;->a:Lcom/ui/sso/api/provider/e$c;

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lcom/ui/sso/api/provider/e;->a:LYg/m;

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
    invoke-direct {p0}, Lcom/ui/sso/api/provider/e;-><init>()V

    return-void
.end method

.method public static final synthetic a()LYg/m;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/e;->a:LYg/m;

    return-object v0
.end method

.method public static final synthetic b(Lcom/ui/sso/api/provider/e;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method
