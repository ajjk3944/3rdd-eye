.class public final Lgb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/h$a;,
        Lgb/h$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0001\u0018\u0000 #2\u00020\u0001:\u0002\u0016\u001cB9\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u0012\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u0012\u0004\u0008\u001f\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010 \u0012\u0004\u0008\"\u0010\u001b\u001a\u0004\u0008\u0016\u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lgb/h;",
        "",
        "",
        "seen0",
        "Lgb/e;",
        "info",
        "Lgb/d;",
        "directRemoteConnectionState",
        "Lmb/m;",
        "deviceState",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILgb/e;Lgb/d;Lmb/m;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "d",
        "(Lgb/h;LYi/d;LXi/f;)V",
        "a",
        "Lgb/e;",
        "c",
        "()Lgb/e;",
        "getInfo$annotations",
        "()V",
        "b",
        "Lgb/d;",
        "()Lgb/d;",
        "getDirectRemoteConnectionState$annotations",
        "Lmb/m;",
        "()Lmb/m;",
        "getDeviceState$annotations",
        "Companion",
        "unificore_release"
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
.field public static final Companion:Lgb/h$b;


# instance fields
.field private final a:Lgb/e;

.field private final b:Lgb/d;

.field private final c:Lmb/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgb/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgb/h$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgb/h;->Companion:Lgb/h$b;

    return-void
.end method

.method public synthetic constructor <init>(ILgb/e;Lgb/d;Lmb/m;LZi/R0;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    sget-object p5, Lgb/h$a;->a:Lgb/h$a;

    invoke-virtual {p5}, Lgb/h$a;->a()LXi/f;

    move-result-object p5

    invoke-static {p1, v0, p5}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lgb/h;->a:Lgb/e;

    and-int/lit8 p2, p1, 0x2

    const/4 p5, 0x0

    if-nez p2, :cond_1

    iput-object p5, p0, Lgb/h;->b:Lgb/d;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lgb/h;->b:Lgb/d;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object p5, p0, Lgb/h;->c:Lmb/m;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lgb/h;->c:Lmb/m;

    :goto_1
    return-void
.end method

.method public static final synthetic d(Lgb/h;LYi/d;LXi/f;)V
    .locals 3

    sget-object v0, Lgb/e$a;->a:Lgb/e$a;

    iget-object v1, p0, Lgb/h;->a:Lgb/e;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lgb/h;->b:Lgb/d;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lgb/d$a;->a:Lgb/d$a;

    iget-object v2, p0, Lgb/h;->b:Lgb/d;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lgb/h;->c:Lmb/m;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lmb/m$b;->f:Lmb/m$b;

    iget-object p0, p0, Lgb/h;->c:Lmb/m;

    invoke-interface {p1, p2, v0, v1, p0}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Lmb/m;
    .locals 1

    iget-object v0, p0, Lgb/h;->c:Lmb/m;

    return-object v0
.end method

.method public final b()Lgb/d;
    .locals 1

    iget-object v0, p0, Lgb/h;->b:Lgb/d;

    return-object v0
.end method

.method public final c()Lgb/e;
    .locals 1

    iget-object v0, p0, Lgb/h;->a:Lgb/e;

    return-object v0
.end method
