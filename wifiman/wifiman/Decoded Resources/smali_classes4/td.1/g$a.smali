.class final Ltd/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/g;->a(LLi/g;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ltd/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/g$a;

    invoke-direct {v0}, Ltd/g$a;-><init>()V

    sput-object v0, Ltd/g$a;->a:Ltd/g$a;

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

    invoke-virtual {p0, p1}, Ltd/g$a;->a(LKa/c;)Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    move-result-object p1

    return-object p1
.end method
