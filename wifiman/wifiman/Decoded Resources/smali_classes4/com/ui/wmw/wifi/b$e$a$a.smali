.class final Lcom/ui/wmw/wifi/b$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b$e$a;->a(Ljava/lang/Throwable;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/wifi/b$e$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/wifi/b$e$a$a;

    invoke-direct {v0}, Lcom/ui/wmw/wifi/b$e$a$a;-><init>()V

    sput-object v0, Lcom/ui/wmw/wifi/b$e$a$a;->a:Lcom/ui/wmw/wifi/b$e$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "Failed to stop WiFi scan"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wmw/wifi/b$e$a$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
