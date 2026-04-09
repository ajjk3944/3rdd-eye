.class public final Lcom/ui/wifiman/ui/discovery/prefs/lan/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b;

.field public static b:Lmh/q;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b;

    sget-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;

    const v1, 0x1c6b7b0b

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;->b:Lmh/q;

    const v0, -0x60cd07b6

    sget-object v1, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$b;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;->c:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b;->b:Lmh/q;

    return-object v0
.end method
