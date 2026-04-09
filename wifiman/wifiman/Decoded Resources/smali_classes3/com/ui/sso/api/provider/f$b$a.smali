.class public final Lcom/ui/sso/api/provider/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ui/sso/api/provider/f$b$a;

.field private static final b:Lcom/ui/sso/api/provider/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/sso/api/provider/f$b$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/f$b$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/f$b$a;->a:Lcom/ui/sso/api/provider/f$b$a;

    new-instance v0, Lcom/ui/sso/api/provider/f$b$a$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/f$b$a$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/f$b$a;->b:Lcom/ui/sso/api/provider/f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/sso/api/provider/f$b;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/f$b$a;->b:Lcom/ui/sso/api/provider/f$b;

    return-object v0
.end method
