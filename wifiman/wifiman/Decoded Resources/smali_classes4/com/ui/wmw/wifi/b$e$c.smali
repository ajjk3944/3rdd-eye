.class final Lcom/ui/wmw/wifi/b$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b$e;->e(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/wifi/b$e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/b$e$c;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/b$e$c;-><init>()V

    sput-object v0, Lcom/ui/wmw/wifi/b$e$c;->a:Lcom/ui/wmw/wifi/b$e$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b$e$c;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Wifi Scan is about to be TURNED ON"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$e$c;->b(Lhg/c;)V

    return-void
.end method

.method public final b(Lhg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/wmw/wifi/j;

    invoke-direct {p1}, Lcom/ui/wmw/wifi/j;-><init>()V

    invoke-static {p1}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
