.class final LMf/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf/n;->b(LMf/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMf/n$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$c;

    invoke-direct {v0}, LMf/n$c;-><init>()V

    sput-object v0, LMf/n$c;->a:LMf/n$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n$c;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade - Bluetooth speed MAX SUBSCRIBED"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LMf/n$c;->b(Lhg/c;)V

    return-void
.end method

.method public final b(Lhg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LMf/l;

    invoke-direct {p1}, LMf/l;-><init>()V

    invoke-static {p1}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
