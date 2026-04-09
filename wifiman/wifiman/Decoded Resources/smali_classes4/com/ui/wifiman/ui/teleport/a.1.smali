.class public final Lcom/ui/wifiman/ui/teleport/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/teleport/a;

.field public static b:Lmh/q;

.field public static c:Lmh/p;

.field public static d:Lmh/p;

.field public static e:Lmh/p;

.field public static f:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/teleport/a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/teleport/a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->a:Lcom/ui/wifiman/ui/teleport/a;

    sget-object v0, Lcom/ui/wifiman/ui/teleport/a$a;->a:Lcom/ui/wifiman/ui/teleport/a$a;

    const v1, 0x30924056

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->b:Lmh/q;

    const v0, 0x70781d3f

    sget-object v1, Lcom/ui/wifiman/ui/teleport/a$b;->a:Lcom/ui/wifiman/ui/teleport/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->c:Lmh/p;

    const v0, -0x4c54fc49

    sget-object v1, Lcom/ui/wifiman/ui/teleport/a$c;->a:Lcom/ui/wifiman/ui/teleport/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->d:Lmh/p;

    const v0, 0x5fb47590

    sget-object v1, Lcom/ui/wifiman/ui/teleport/a$d;->a:Lcom/ui/wifiman/ui/teleport/a$d;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->e:Lmh/p;

    const v0, 0x1f895403

    sget-object v1, Lcom/ui/wifiman/ui/teleport/a$e;->a:Lcom/ui/wifiman/ui/teleport/a$e;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a;->f:Lmh/p;

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

    sget-object v0, Lcom/ui/wifiman/ui/teleport/a;->b:Lmh/q;

    return-object v0
.end method
