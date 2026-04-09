.class final Ltd/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/a;->b(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ltd/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/a$e;

    invoke-direct {v0}, Ltd/a$e;-><init>()V

    sput-object v0, Ltd/a$e;->a:Ltd/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ltd/a$e;->a(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    return-object p1
.end method
