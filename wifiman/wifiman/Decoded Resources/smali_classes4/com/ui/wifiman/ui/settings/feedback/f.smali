.class public final Lcom/ui/wifiman/ui/settings/feedback/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/ui/wifiman/ui/settings/feedback/f;

.field public static b:Lmh/q;

.field public static c:Lmh/p;

.field public static d:Lmh/p;

.field public static e:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/ui/settings/feedback/f;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/settings/feedback/f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->a:Lcom/ui/wifiman/ui/settings/feedback/f;

    sget-object v0, Lcom/ui/wifiman/ui/settings/feedback/f$a;->a:Lcom/ui/wifiman/ui/settings/feedback/f$a;

    const v1, -0x4ab56e76

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->b:Lmh/q;

    const v0, -0x25389484

    sget-object v1, Lcom/ui/wifiman/ui/settings/feedback/f$b;->a:Lcom/ui/wifiman/ui/settings/feedback/f$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->c:Lmh/p;

    const v0, 0x1f9dd105

    sget-object v1, Lcom/ui/wifiman/ui/settings/feedback/f$c;->a:Lcom/ui/wifiman/ui/settings/feedback/f$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->d:Lmh/p;

    const v0, -0x50c9337

    sget-object v1, Lcom/ui/wifiman/ui/settings/feedback/f$d;->a:Lcom/ui/wifiman/ui/settings/feedback/f$d;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->e:Lmh/p;

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

    sget-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/p;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->c:Lmh/p;

    return-object v0
.end method

.method public final c()Lmh/p;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/settings/feedback/f;->d:Lmh/p;

    return-object v0
.end method
