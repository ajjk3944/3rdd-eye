.class public abstract LEb/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEb/w$a;,
        LEb/w$b;,
        LEb/w$c;,
        LEb/w$d;,
        LEb/w$e;,
        LEb/w$f;,
        LEb/w$g;,
        LEb/w$h;,
        LEb/w$i;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00192\u00020\u0001:\t\u001a\u001b\u0016\u001c\u000f\u001d\u001e\u001f\u0012B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u0082\u0001\u0007 !\"#$%&\u00a8\u0006\'"
    }
    d2 = {
        "LEb/w;",
        "Landroid/os/Parcelable;",
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
        "i",
        "(LEb/w;LYi/d;LXi/f;)V",
        "",
        "f",
        "()Ljava/lang/String;",
        "id",
        "LEb/w$f;",
        "g",
        "()LEb/w$f;",
        "status",
        "Companion",
        "c",
        "e",
        "d",
        "a",
        "h",
        "b",
        "LEb/w$a;",
        "LEb/w$c;",
        "LEb/w$d;",
        "LEb/w$e;",
        "LEb/w$g;",
        "LEb/w$h;",
        "LEb/w$i;",
        "SSO_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:LEb/w$b;

.field private static final a:Lcj/e;

.field private static final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/w$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEb/w$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEb/w;->Companion:LEb/w$b;

    new-instance v0, Lcj/f;

    invoke-direct {v0}, Lcj/f;-><init>()V

    const-class v2, LEb/w;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    new-instance v3, Lcj/b;

    invoke-direct {v3, v2, v1}, Lcj/b;-><init>(Lth/d;LVi/b;)V

    new-instance v1, LEb/u;

    invoke-direct {v1}, LEb/u;-><init>()V

    invoke-virtual {v3, v1}, Lcj/b;->b(Lmh/l;)V

    invoke-virtual {v3, v0}, Lcj/b;->a(Lcj/f;)V

    invoke-virtual {v0}, Lcj/f;->h()Lcj/e;

    move-result-object v0

    sput-object v0, LEb/w;->a:Lcj/e;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, LEb/v;

    invoke-direct {v1}, LEb/v;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, LEb/w;->b:LYg/m;

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
    invoke-direct {p0}, LEb/w;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LVi/a;
    .locals 0

    invoke-static {p0}, LEb/w;->h(Ljava/lang/String;)LVi/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LVi/b;
    .locals 1

    invoke-static {}, LEb/w;->c()LVi/b;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic c()LVi/b;
    .locals 12

    new-instance v6, LVi/k;

    const-class v0, LEb/w;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-class v0, LEb/w$a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-class v1, LEb/w$c;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-class v3, LEb/w$d;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-class v4, LEb/w$e;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v4

    const-class v5, LEb/w$g;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v5

    const-class v7, LEb/w$h;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v7

    const-class v8, LEb/w$i;

    invoke-static {v8}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v8

    const/4 v9, 0x7

    new-array v10, v9, [Lth/d;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v1, v10, v0

    const/4 v1, 0x2

    aput-object v3, v10, v1

    const/4 v3, 0x3

    aput-object v4, v10, v3

    const/4 v4, 0x4

    aput-object v5, v10, v4

    const/4 v5, 0x5

    aput-object v7, v10, v5

    const/4 v7, 0x6

    aput-object v8, v10, v7

    new-array v8, v9, [LVi/b;

    sget-object v9, LEb/w$a$a;->a:LEb/w$a$a;

    aput-object v9, v8, v11

    sget-object v9, LEb/w$c$a;->a:LEb/w$c$a;

    aput-object v9, v8, v0

    sget-object v0, LEb/w$d$a;->a:LEb/w$d$a;

    aput-object v0, v8, v1

    sget-object v0, LEb/w$e$a;->a:LEb/w$e$a;

    aput-object v0, v8, v3

    sget-object v0, LEb/w$g$a;->a:LEb/w$g$a;

    aput-object v0, v8, v4

    sget-object v0, LEb/w$h$a;->a:LEb/w$h$a;

    aput-object v0, v8, v5

    sget-object v0, LEb/w$i$a;->a:LEb/w$i$a;

    aput-object v0, v8, v7

    new-array v5, v11, [Ljava/lang/annotation/Annotation;

    const-string/jumbo v1, "com.ui.unifi.core.sso.models.TwoFaAuthenticator"

    move-object v0, v6

    move-object v3, v10

    move-object v4, v8

    invoke-direct/range {v0 .. v5}, LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public static final synthetic d()LYg/m;
    .locals 1

    sget-object v0, LEb/w;->b:LYg/m;

    return-object v0
.end method

.method public static final synthetic e()Lcj/e;
    .locals 1

    sget-object v0, LEb/w;->a:Lcj/e;

    return-object v0
.end method

.method private static final h(Ljava/lang/String;)LVi/a;
    .locals 0

    sget-object p0, LEb/w$h;->Companion:LEb/w$h$b;

    invoke-virtual {p0}, LEb/w$h$b;->serializer()LVi/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LEb/w;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()LEb/w$f;
.end method
