.class final Lcom/ui/wmw/wifi/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/wifi/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/b$d;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/b$d;-><init>()V

    sput-object v0, Lcom/ui/wmw/wifi/b$d;->a:Lcom/ui/wmw/wifi/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b$d;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Scan results stream failed"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$d;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/wifi/d;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/d;-><init>()V

    invoke-static {v0, p1}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method
