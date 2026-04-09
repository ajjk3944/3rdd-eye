.class final Lcom/ui/wifiman/model/wmw/h$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->b(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/h$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$z;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/h$z;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$z;->a:Lcom/ui/wifiman/model/wmw/h$z;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$z;->a(Lcom/ui/wifiman/model/wmw/g$c;)Z

    move-result p1

    return p1
.end method
