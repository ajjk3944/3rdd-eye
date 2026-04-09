.class public abstract LCc/b$b;
.super LCc/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCc/b$b$a;,
        LCc/b$b$b;,
        LCc/b$b$c;,
        LCc/b$b$d;
    }
.end annotation


# instance fields
.field private final b:Lcom/ui/wifiman/model/vendor/d$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LCc/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    sget-object v0, Lcom/ui/wifiman/model/vendor/d$d;->APPLE:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$d;->asVendor()Lcom/ui/wifiman/model/vendor/d$c;

    move-result-object v0

    iput-object v0, p0, LCc/b$b;->b:Lcom/ui/wifiman/model/vendor/d$c;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LCc/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    invoke-virtual {p0}, LCc/b$b;->c()Lcom/ui/wifiman/model/vendor/d$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d$c;
    .locals 1

    iget-object v0, p0, LCc/b$b;->b:Lcom/ui/wifiman/model/vendor/d$c;

    return-object v0
.end method
