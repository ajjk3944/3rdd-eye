.class final Lwd/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/e;->a(Lwd/f$a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwd/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd/e$d;

    invoke-direct {v0}, Lwd/e$d;-><init>()V

    sput-object v0, Lwd/e$d;->a:Lwd/e$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Lwd/e$d;->b(Ll9/a;Ll9/a;Ll9/a;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ll9/a;Ll9/a;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "unifiResultId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "serverId"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p2}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p3}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    new-instance v0, Lwd/f$b;

    invoke-direct {v0, p3, p2}, Lwd/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
