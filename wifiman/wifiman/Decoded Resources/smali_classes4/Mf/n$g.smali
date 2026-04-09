.class final LMf/n$g;
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
.field public static final a:LMf/n$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$g;

    invoke-direct {v0}, LMf/n$g;-><init>()V

    sput-object v0, LMf/n$g;->a:LMf/n$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LMf/n$g;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW FW Upgrade - Upload SUBSCRIBED"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, LMf/n$g;->b(LDj/c;)V

    return-void
.end method

.method public final b(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LMf/q;

    invoke-direct {p1}, LMf/q;-><init>()V

    invoke-static {p1}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
