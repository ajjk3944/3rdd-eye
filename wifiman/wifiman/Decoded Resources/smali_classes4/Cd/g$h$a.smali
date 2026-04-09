.class final LCd/g$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g$h;->c(LCd/g$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCd/g$h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCd/g$h$a;

    invoke-direct {v0}, LCd/g$h$a;-><init>()V

    sput-object v0, LCd/g$h$a;->a:LCd/g$h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKa/c;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltd/h;->a(LKa/c;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKa/c;

    invoke-virtual {p0, p1}, LCd/g$h$a;->a(LKa/c;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    move-result-object p1

    return-object p1
.end method
