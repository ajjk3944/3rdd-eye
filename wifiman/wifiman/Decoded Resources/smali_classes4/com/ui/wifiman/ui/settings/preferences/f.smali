.class public final Lcom/ui/wifiman/ui/settings/preferences/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/settings/preferences/f;

.field public static b:Lmh/p;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/f;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/settings/preferences/f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/f;->a:Lcom/ui/wifiman/ui/settings/preferences/f;

    sget-object v0, Lcom/ui/wifiman/ui/settings/preferences/f$a;->a:Lcom/ui/wifiman/ui/settings/preferences/f$a;

    const v1, -0x89e0b95

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/f;->b:Lmh/p;

    const v0, 0x6d1d06bb

    sget-object v1, Lcom/ui/wifiman/ui/settings/preferences/f$b;->a:Lcom/ui/wifiman/ui/settings/preferences/f$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/f;->c:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/settings/preferences/f;->b:Lmh/p;

    return-object v0
.end method
