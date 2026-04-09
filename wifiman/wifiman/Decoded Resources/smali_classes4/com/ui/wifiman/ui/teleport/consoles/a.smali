.class public final Lcom/ui/wifiman/ui/teleport/consoles/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/teleport/consoles/a;

.field public static b:Lmh/q;

.field public static c:Lmh/q;

.field public static d:Lmh/p;

.field public static e:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/teleport/consoles/a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->a:Lcom/ui/wifiman/ui/teleport/consoles/a;

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a$a;->a:Lcom/ui/wifiman/ui/teleport/consoles/a$a;

    const v1, 0x16891d1f

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->b:Lmh/q;

    const v0, -0x22936938

    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/a$b;->a:Lcom/ui/wifiman/ui/teleport/consoles/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->c:Lmh/q;

    const v0, -0x5c5b56fa

    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/a$c;->a:Lcom/ui/wifiman/ui/teleport/consoles/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->d:Lmh/p;

    const v0, -0x3f8b3d38

    sget-object v1, Lcom/ui/wifiman/ui/teleport/consoles/a$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/a$d;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->e:Lmh/p;

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

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->c:Lmh/q;

    return-object v0
.end method

.method public final c()Lmh/p;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/a;->d:Lmh/p;

    return-object v0
.end method
