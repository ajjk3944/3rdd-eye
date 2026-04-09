.class public final Lcom/ui/wifiman/ui/settings/preferences/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/settings/preferences/h;

.field public static b:Lmh/q;

.field public static c:Lmh/p;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/settings/preferences/h;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/settings/preferences/h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/h;->a:Lcom/ui/wifiman/ui/settings/preferences/h;

    sget-object v0, Lcom/ui/wifiman/ui/settings/preferences/h$a;->a:Lcom/ui/wifiman/ui/settings/preferences/h$a;

    const v1, 0x7c81870a

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/h;->b:Lmh/q;

    const v0, -0x5e70b28c

    sget-object v1, Lcom/ui/wifiman/ui/settings/preferences/h$b;->a:Lcom/ui/wifiman/ui/settings/preferences/h$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/h;->c:Lmh/p;

    const v0, -0x148e4920

    sget-object v1, Lcom/ui/wifiman/ui/settings/preferences/h$c;->a:Lcom/ui/wifiman/ui/settings/preferences/h$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/preferences/h;->d:Lmh/p;

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

    sget-object v0, Lcom/ui/wifiman/ui/settings/preferences/h;->b:Lmh/q;

    return-object v0
.end method
