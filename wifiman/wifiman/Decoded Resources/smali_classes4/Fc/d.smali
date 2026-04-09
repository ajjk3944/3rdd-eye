.class public final LFc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFc/d$a;
    }
.end annotation


# static fields
.field public static final c:LFc/d$a;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFc/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFc/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFc/d;->c:LFc/d$a;

    return-void
.end method

.method public constructor <init>(LFc/a$a;Lle/g;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScannerService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lle/g;->a()Lgg/i;

    move-result-object p2

    sget-object v0, LFc/d$c;->a:LFc/d$c;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string v0, "map(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LFc/d;->a:Lgg/i;

    invoke-virtual {p1}, LFc/a$a;->a()LDc/k;

    move-result-object p1

    invoke-interface {p1}, LDc/k;->a()Lgg/i;

    move-result-object p1

    sget-object v0, LFc/d$b;->a:LFc/d$b;

    invoke-static {p2, p1, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LFc/d;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LFc/d;->b:Lgg/i;

    return-object v0
.end method
